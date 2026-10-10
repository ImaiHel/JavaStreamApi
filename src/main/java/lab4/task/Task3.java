package lab4.task;

import lab4.model.Book;
import lab4.model.Visitor;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task3 {
    public static void run(List<Visitor> visitors) {
        System.out.println("\nЗадание 3: Книги, отсортированные по году издания");
        List<Book> sorted = visitors.stream()
                .flatMap(v -> v.getFavoriteBooks().stream())
                .distinct()
                .sorted(Comparator.comparingInt(Book::getPublishingYear))
                .collect(Collectors.toList());

        sorted.forEach(b -> System.out.println(b.getPublishingYear() + " — " + b.getName()));
    }
}