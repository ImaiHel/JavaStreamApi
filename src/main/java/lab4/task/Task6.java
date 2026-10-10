package lab4.task;

import lab4.model.SmsMessage;
import lab4.model.Visitor;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void run(List<Visitor> visitors) {
        System.out.println("\nЗадание 6: SMS-рассылка");

        // Среднее количество книг по ВСЕМ посетителям
        double average = visitors.stream()
                .mapToInt(v -> v.getFavoriteBooks().size())
                .average()
                .orElse(0);

        System.out.println("Среднее число книг: " + average);

        // Оставляем только подписанных
        List<SmsMessage> messages = visitors.stream()
                .filter(Visitor::isSubscribed)
                .map(v -> {
                    int count = v.getFavoriteBooks().size();
                    String text;
                    if (count > average) {
                        text = "you are a bookworm";
                    } else if (count < average) {
                        text = "read more";
                    } else {
                        text = "fine";
                    }
                    return new SmsMessage(v.getPhone(), text);
                })
                .collect(Collectors.toList());

        messages.forEach(System.out::println);
    }
}