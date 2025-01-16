package com.example.todolistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    private final ArrayList<Task> tasks;
    private final OnTaskActionListener listener;

    public TaskAdapter(ArrayList<Task> tasks, OnTaskActionListener listener) {
        this.tasks = tasks;
        this.listener = listener;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = tasks.get(position);

        holder.taskName.setText(task.getTaskName());
        holder.taskDateTime.setText(task.getDateTime());
        holder.checkBox.setChecked(task.isCompleted());

        holder.checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            task.setCompleted(isChecked);
            listener.onTaskUpdated();
        });

        holder.btnDelete.setOnClickListener(v -> {
            listener.onTaskDeleted(holder.getAdapterPosition());
        });
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        private final CheckBox checkBox;
        private final TextView taskName;
        private final TextView taskDateTime;
        private final Button btnDelete;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            checkBox = itemView.findViewById(R.id.cbComplete);
            taskName = itemView.findViewById(R.id.tvTaskName);
            taskDateTime = itemView.findViewById(R.id.tvTaskDateTime);
            btnDelete = itemView.findViewById(R.id.btnDelete);
        }
    }

    public interface OnTaskActionListener {
        void onTaskUpdated();

        void onTaskDeleted(int position);
    }
}
