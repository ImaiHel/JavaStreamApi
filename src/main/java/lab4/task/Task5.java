package lab4.task;

import lab4.model.Visitor;

import java.util.List;

public class Task5 {
    public static void run(List<Visitor> visitors) {
        System.out.println("\nЗадание 5: Максимальное число книг в избранном");
        int max = visitors.stream()
                .mapToInt(v -> v.getFavoriteBooks().size())
                .max()
                .orElse(0);

        System.out.println("Максимум книг в избранном: " + max);
    }
}