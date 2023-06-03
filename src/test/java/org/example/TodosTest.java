package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodosTest {

    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

    String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
    Epic epic = new Epic(55, subtasks);

    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка родителям",
            "Во вторник после обеда"
    );

    Todos todos = new Todos();

    @BeforeEach
    public void setup() {

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
    }




    @Test
    public void makeAllTasks() {

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }



        @Test
    public void addOneTaskEpic() {

        Task[] expected = {epic};
        Task[] actual = todos.search("Хлеб");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void NoTasksAtAll() {

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.search("");
        Assertions.assertArrayEquals(expected, actual);
    }


}


