import java.util.HashMap;
import java.util.Map;

public class Practicum2 {
    public static void main(String[] args) {
        // ключ — название задачи, значение — выполнена эта задача или ещё нет
        Map<String, Boolean> todos = new HashMap<>();

        todos.put("Выучить Java", true);
        todos.put("Найти классную работу", false);


todos.clear();
        System.out.println("Todo-список пуст? Ответ: "+todos.isEmpty());// дополните кодом, который даст верный ответ
    }
}