package lab4.task;

import lab4.model.Book;
import lab4.model.Visitor;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {
    public static void run(List<Visitor> visitors) {
        System.out.println("\nЗадание 2: Уникальные книги в избранном");
        Set<Book> uniqueBooks = visitors.stream()
                .flatMap(v -> v.getFavoriteBooks().stream())
                .collect(Collectors.toSet());

        uniqueBooks.forEach(b -> System.out.println(b.getName() + " — " + b.getAuthor()));
        System.out.println("Всего уникальных книг: " + uniqueBooks.size());
    }
}