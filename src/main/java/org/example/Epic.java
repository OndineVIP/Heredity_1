package org.example;


public class Epic extends Task {
    private String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public Epic(int id, String Молоко, String Яйца, String Хлеб) {
        super(id);
    }

    public String[] getSubtasks() {
        return subtasks;
    }


    @Override
    public boolean matches(String query) {
        for (String subtask : subtasks) {
            if (subtask.contains(query)) {
                return true;
            }
        }
        return false;
    }

  }

