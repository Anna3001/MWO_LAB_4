package App;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<String> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void markTaskCompleted(int index) {
        if (index >= 1 && index <= tasks.size()) {
            String completedTask = tasks.remove(index - 1);
            System.out.println("Task completed: " + completedTask);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void clearTasks() {
        tasks.clear();
        System.out.println("All tasks cleared.");
    }

}
