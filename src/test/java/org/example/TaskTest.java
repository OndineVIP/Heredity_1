package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class TaskTest {
    @Test
    public void shouldFoundSimpleTasks() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("родителям");
        boolean expected = true;
        Assertions.assertTrue(actual);

    }

    @Test
    public void shouldNotFoundSimpleTasks() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("подруге");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }




    @Test
    public void shouldFindTrueOrFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Assertions.assertTrue(meeting.matches("приложения"));
        Assertions.assertFalse(meeting.matches("прилажение"));
        Assertions.assertTrue(meeting.matches("НетоБанка"));
        Assertions.assertFalse(meeting.matches("Нетабанка"));
        Assertions.assertFalse(meeting.matches("вторник"));
        Assertions.assertTrue(meeting.matches("Выкатка"));
        Assertions.assertFalse(meeting.matches("выкатика"));


    }

    @Test
    public void shouldFindTrueOrFalse1() {
        String[] subtasks = {"Молоко", "Яйца", "Яйца"};
        Epic epic = new Epic(55, subtasks);
        Epic epicEmpty = new Epic(55, new String[]{});


        Assertions.assertTrue(epic.matches("Молоко"));
        Assertions.assertTrue(epic.matches("Яйца"));
        Assertions.assertFalse(epic.matches("Хлеб"));
        Assertions.assertFalse(epic.matches("Хлеба"));
        Assertions.assertFalse(epic.matches("сметана"));
        Assertions.assertFalse(epic.matches("Малака"));
    }


}


