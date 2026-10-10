package lab4.task;

import lab4.model.Visitor;

import java.util.List;

public class Task4 {
    public static void run(List<Visitor> visitors) {
        System.out.println("\nЗадание 4: Есть ли книга Jane Austen?");
        boolean hasAusten = visitors.stream()
                .flatMap(v -> v.getFavoriteBooks().stream())
                .anyMatch(b -> "Jane Austen".equals(b.getAuthor()));

        System.out.println(hasAusten
                ? "Да, у кого-то в избранном есть книга Jane Austen"
                : "Нет, книг Jane Austen в избранном нет");
    }
}