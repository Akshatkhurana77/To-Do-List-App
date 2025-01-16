To-Do List App

This To-Do List App is a simple Android application that allows users to manage their tasks by adding, marking them as complete, and removing them. It also includes the functionality to auto-remove completed tasks at midnight.

Features

Add tasks with a title and optional deadline.

Mark tasks as complete.

Auto-remove completed tasks at midnight.

Persistent storage of tasks using SharedPreferences.

Technology Stack

Programming Language: Java

Framework: Android

Data Storage: SharedPreferences

UI: RecyclerView, EditText, Button

Folder Structure

- MainActivity.java: Core app logic.
- TaskAdapter.java: Adapter for RecyclerView to display tasks.
- Task.java: Model class for task representation.
- MidnightTaskReceiver.java: Handles scheduled midnight task cleanup.
- res/
  - layout/
    - activity_main.xml: Main UI layout.
    - item_task.xml: UI layout for a task item.
  - drawable/: Icons and graphics.

Installation

Clone the repository:

git clone <repository_url>

Open the project in Android Studio.

Build and run the app on an emulator or physical device.

Code Overview

MainActivity.java

This is the main entry point of the app. It initializes the RecyclerView, handles user input for adding tasks, and sets up the midnight alarm.

TaskAdapter.java

This class acts as the bridge between the task data and the RecyclerView. It handles displaying tasks and user interactions like marking a task complete or deleting a task.

Task.java

This is the model class that represents a task with properties like:

Task name

Completion status

Optional deadline

MidnightTaskReceiver.java

A BroadcastReceiver that is triggered at midnight to remove completed tasks. This uses SharedPreferences to persistently store tasks.

How to Use

Add a Task:

Enter a task name in the input field.

(Optional) Set a deadline.

Click the "Add Task" button.

Mark a Task as Complete:

Check the checkbox next to the task.

Auto-Removal at Midnight:

Completed tasks are automatically removed at midnight.

Delete a Task:

Click the delete button next to a task to remove it manually.

Screenshots

Main Screen

Display of tasks with options to add, complete, and delete tasks.

Add Task

Interface to add a new task with a deadline.

Future Enhancements

Add categories/tags for tasks.

Integrate notifications/reminders for deadlines.

Sync tasks with an online database for multi-device access.

Contributing

Contributions are welcome! Follow these steps:

Fork the repository.

Create a new branch for your feature (git checkout -b feature-branch).

Commit your changes (git commit -m 'Add some feature').

Push to the branch (git push origin feature-branch).

Open a pull request.

License

This project is licensed under the MIT License. See the LICENSE file for details.

Contact

For any questions or suggestions, please contact:

Email: your-email@example.com

GitHub: your-username

To-Do List App

This To-Do List App is a simple Android application that allows users to manage their tasks by adding, marking them as complete, and removing them. It also includes the functionality to auto-remove completed tasks at midnight.

Features

Add tasks with a title and optional deadline.

Mark tasks as complete.

Auto-remove completed tasks at midnight.

Persistent storage of tasks using SharedPreferences.

Technology Stack

Programming Language: Java

Framework: Android

Data Storage: SharedPreferences

UI: RecyclerView, EditText, Button

Folder Structure

- MainActivity.java: Core app logic.
- TaskAdapter.java: Adapter for RecyclerView to display tasks.
- Task.java: Model class for task representation.
- MidnightTaskReceiver.java: Handles scheduled midnight task cleanup.
- res/
  - layout/
    - activity_main.xml: Main UI layout.
    - item_task.xml: UI layout for a task item.
  - drawable/: Icons and graphics.

Installation

Clone the repository:

git clone <repository_url>

Open the project in Android Studio.

Build and run the app on an emulator or physical device.

Code Overview

MainActivity.java

This is the main entry point of the app. It initializes the RecyclerView, handles user input for adding tasks, and sets up the midnight alarm.

TaskAdapter.java

This class acts as the bridge between the task data and the RecyclerView. It handles displaying tasks and user interactions like marking a task complete or deleting a task.

Task.java

This is the model class that represents a task with properties like:

Task name

Completion status

Optional deadline

MidnightTaskReceiver.java

A BroadcastReceiver that is triggered at midnight to remove completed tasks. This uses SharedPreferences to persistently store tasks.

How to Use

Add a Task:

Enter a task name in the input field.

(Optional) Set a deadline.

Click the "Add Task" button.

Mark a Task as Complete:

Check the checkbox next to the task.

Auto-Removal at Midnight:

Completed tasks are automatically removed at midnight.

Delete a Task:

Click the delete button next to a task to remove it manually.

Screenshots

Main Screen

Display of tasks with options to add, complete, and delete tasks.

Add Task

Interface to add a new task with a deadline.

Future Enhancements

Add categories/tags for tasks.

Integrate notifications/reminders for deadlines.

Sync tasks with an online database for multi-device access.

Contributing

Contributions are welcome! Follow these steps:

Fork the repository.

Create a new branch for your feature (git checkout -b feature-branch).

Commit your changes (git commit -m 'Add some feature').

Push to the branch (git push origin feature-branch).

Open a pull request.

License

This project is licensed under the MIT License. See the LICENSE file for details.

Contact

For any questions or suggestions, please contact:

Email: your-email@example.com

GitHub: your-username

To-Do List App

This To-Do List App is a simple Android application that allows users to manage their tasks by adding, marking them as complete, and removing them. It also includes the functionality to auto-remove completed tasks at midnight.

Features

Add tasks with a title and optional deadline.

Mark tasks as complete.

Auto-remove completed tasks at midnight.

Persistent storage of tasks using SharedPreferences.

Technology Stack

Programming Language: Java

Framework: Android

Data Storage: SharedPreferences

UI: RecyclerView, EditText, Button

Folder Structure

- MainActivity.java: Core app logic.
- TaskAdapter.java: Adapter for RecyclerView to display tasks.
- Task.java: Model class for task representation.
- MidnightTaskReceiver.java: Handles scheduled midnight task cleanup.
- res/
  - layout/
    - activity_main.xml: Main UI layout.
    - item_task.xml: UI layout for a task item.
  - drawable/: Icons and graphics.

Installation

Clone the repository:

git clone <repository_url>

Open the project in Android Studio.

Build and run the app on an emulator or physical device.

Code Overview

MainActivity.java

This is the main entry point of the app. It initializes the RecyclerView, handles user input for adding tasks, and sets up the midnight alarm.

TaskAdapter.java

This class acts as the bridge between the task data and the RecyclerView. It handles displaying tasks and user interactions like marking a task complete or deleting a task.

Task.java

This is the model class that represents a task with properties like:

Task name

Completion status

Optional deadline

MidnightTaskReceiver.java

A BroadcastReceiver that is triggered at midnight to remove completed tasks. This uses SharedPreferences to persistently store tasks.

How to Use

Add a Task:

Enter a task name in the input field.

(Optional) Set a deadline.

Click the "Add Task" button.

Mark a Task as Complete:

Check the checkbox next to the task.

Auto-Removal at Midnight:

Completed tasks are automatically removed at midnight.

Delete a Task:

Click the delete button next to a task to remove it manually.

Screenshots

Main Screen

Display of tasks with options to add, complete, and delete tasks.

Add Task

Interface to add a new task with a deadline.

Future Enhancements

Add categories/tags for tasks.

Integrate notifications/reminders for deadlines.

Sync tasks with an online database for multi-device access.

Contributing

Contributions are welcome! Follow these steps:

Fork the repository.

Create a new branch for your feature (git checkout -b feature-branch).

Commit your changes (git commit -m 'Add some feature').

Push to the branch (git push origin feature-branch).

Open a pull request.

License

This project is licensed under the MIT License. See the LICENSE file for details.

Contact

For any questions or suggestions, please contact:

Email: akshatkhurana77@gmail.com

GitHub: Akshatkhurana77

