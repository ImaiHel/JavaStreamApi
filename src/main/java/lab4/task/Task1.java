package lab4.task;

import lab4.model.Visitor;

import java.util.List;

public class Task1 {
    public static void run(List<Visitor> visitors) {
        System.out.println("Задание 1: Список посетителей и их количество");
        visitors.stream()
                .map(v -> v.getName() + " " + v.getSurname())
                .forEach(System.out::println);
        System.out.println("Всего посетителей: " + visitors.size());
    }
}