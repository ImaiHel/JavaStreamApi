package lab4;

import lab4.model.Visitor;
import lab4.task.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Visitor> visitors = JsonLoader.loadVisitors();

        Task1.run(visitors);
        Task2.run(visitors);
        Task3.run(visitors);
        Task4.run(visitors);
        Task5.run(visitors);
        Task6.run(visitors);
    }
}