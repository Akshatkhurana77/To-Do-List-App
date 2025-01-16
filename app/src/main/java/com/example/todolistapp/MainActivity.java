package com.example.todolistapp;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements TaskAdapter.OnTaskActionListener {

    private ArrayList<Task> tasks;
    private TaskAdapter adapter;
    private String selectedDateTime = "";

    private static final String TASKS_PREFS = "tasks_prefs";
    private static final String TASKS_KEY = "tasks_list";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load tasks from SharedPreferences
        tasks = loadTasks();
        adapter = new TaskAdapter(tasks, this);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        EditText etTaskName = findViewById(R.id.etTaskName);
        Button btnAddTask = findViewById(R.id.btnAddTask);

        btnAddTask.setOnClickListener(v -> {
            String taskName = etTaskName.getText().toString().trim();

            if (TextUtils.isEmpty(taskName)) {
                Toast.makeText(this, "Please enter a task name", Toast.LENGTH_SHORT).show();
                return;
            }

            showDateTimePicker(taskName, etTaskName);
        });
    }

    private void showDateTimePicker(String taskName, EditText etTaskName) {
        Calendar calendar = Calendar.getInstance();

        // DatePickerDialog
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view, year, month, dayOfMonth) -> {
            // Update calendar with selected date
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

            // TimePickerDialog
            TimePickerDialog timePickerDialog = new TimePickerDialog(this, (timeView, hourOfDay, minute) -> {
                // Update calendar with selected time
                calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
                calendar.set(Calendar.MINUTE, minute);

                // Format the selected date and time
                selectedDateTime = String.format("%02d/%02d/%04d %02d:%02d",
                        calendar.get(Calendar.DAY_OF_MONTH),
                        calendar.get(Calendar.MONTH) + 1,
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.HOUR_OF_DAY),
                        calendar.get(Calendar.MINUTE));

                // Add task to the list
                addTask(taskName, selectedDateTime);
                etTaskName.setText(""); // Clear the input field
            }, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), false);

            timePickerDialog.show();
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void addTask(String taskName, String dateTime) {
        Task task = new Task(taskName, dateTime);
        tasks.add(task);
        adapter.notifyItemInserted(tasks.size() - 1);
        saveTasks();  // Save tasks to SharedPreferences
        Toast.makeText(this, "Task added with deadline!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTaskUpdated() {
        adapter.notifyDataSetChanged();
        saveTasks();  // Save tasks to SharedPreferences after update
    }

    @Override
    public void onTaskDeleted(int position) {
        tasks.remove(position);
        adapter.notifyItemRemoved(position);
        saveTasks();  // Save tasks to SharedPreferences after deletion
        Toast.makeText(this, "Task deleted!", Toast.LENGTH_SHORT).show();
    }

    // Save tasks as a list of strings in SharedPreferences
    private void saveTasks() {
        SharedPreferences sharedPreferences = getSharedPreferences(TASKS_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        // Save tasks as individual strings, each task in its own SharedPreferences key
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            editor.putString(TASKS_KEY + "_" + i, task.getTaskName() + " | " + task.getDateTime());
        }
        editor.apply();
    }

    // Load tasks from SharedPreferences
    private ArrayList<Task> loadTasks() {
        SharedPreferences sharedPreferences = getSharedPreferences(TASKS_PREFS, MODE_PRIVATE);
        ArrayList<Task> loadedTasks = new ArrayList<>();

        int i = 0;
        while (true) {
            String taskString = sharedPreferences.getString(TASKS_KEY + "_" + i, null);
            if (taskString == null) break;

            // Split the task string into task name and deadline
            String[] taskData = taskString.split(" \\| ");
            if (taskData.length == 2) {
                loadedTasks.add(new Task(taskData[0], taskData[1]));
            }
            i++;
        }

        return loadedTasks;
    }
}
