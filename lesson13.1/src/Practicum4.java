import java.util.HashMap;
import java.util.Map;

public class Practicum4 {

    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Practicum4 pizzeria = new Practicum4();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {

        if (orders.containsKey(clientName)) {

            orders.put(clientName, orders.get(clientName) + 1);
        } else {

            orders.put(clientName, 1);
        }
    }

    private void printStatistics() {
        int totalOrders = 0;


        for (Map.Entry<String, Integer> entry : orders.entrySet()) {
            String clientName = entry.getKey();
            int orderCount = entry.getValue();
            System.out.println("Заказов от " + clientName + ": " + orderCount);
            totalOrders += orderCount;
        }

        // Выводим общее количество заказов
        System.out.println("Всего заказов: " + totalOrders);
    }
}

