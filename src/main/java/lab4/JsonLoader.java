package lab4;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lab4.model.Visitor;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class JsonLoader {

    public static List<Visitor> loadVisitors() {
        try (InputStream is = JsonLoader.class.getClassLoader().getResourceAsStream("books.json")) {
            if (is == null) {
                throw new RuntimeException("Файл books.json не найден в resources");
            }
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Visitor>>() {}.getType();
            return gson.fromJson(new InputStreamReader(is, StandardCharsets.UTF_8), listType);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при чтении books.json", e);
        }
    }
}