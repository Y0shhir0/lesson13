import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practicum3 {
    // Пример списка пассажиров (на самом деле их больше)
    private static List<String> passengerNames = List.of(
            "Василий Петров",
            "Анна Ягирская",
            "Виктория Сотова",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }

    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
Map<String,Integer> seatAssignment =new HashMap<>();
int seatNumber = 1;
for (String name: passengerNames){
    seatAssignment.put(name, seatNumber);
    seatNumber++;
}
return  seatAssignment;
    }
}