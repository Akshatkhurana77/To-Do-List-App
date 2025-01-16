<h2 align="center">📝 To-Do List App</h2>
<p>This To-Do List App is a simple Android application that allows users to manage their tasks by adding, marking them as complete, and removing them. It also includes the functionality to auto-remove completed tasks at midnight.</p>

✨ **Features**
- ➕ Add tasks with a title and optional deadline.
- ✅ Mark tasks as complete.
- 🕛 Auto-remove completed tasks at midnight.
- 💾 Persistent storage of tasks using SharedPreferences.

🛠️ **Technology Stack**
- Programming Language: Java
- Framework: Android
- Data Storage: SharedPreferences
- UI Components: RecyclerView, EditText, Button

📂 **Folder Structure**
- **MainActivity.java**: Core app logic.
- **TaskAdapter.java**: Adapter for RecyclerView to display tasks.
- **Task.java**: Model class for task representation.
- **MidnightTaskReceiver.java**: Handles scheduled midnight task cleanup.

