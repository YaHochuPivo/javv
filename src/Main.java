import java.util.ArrayList;
import java.util.List;

public class Main {
    // список для хранения могил
    private static List<String> graves = new ArrayList<>();

    // обычные функции
    public void addGrave(String name) {
        graves.add(name);
    }

    public void removeGrave(String name) {
        graves.remove(name);
    }

    public String findGrave(String name) {
        return graves.contains(name) ? name : "Могила не найдена";
    }

    // статические функции
    public static int countGraves() { // счетчик могил
        return graves.size();
    }

    public static boolean hasGrave(String name) { // есть ли могила на кладбище
        return graves.contains(name);
    }

    public static void listGraves() { // список всех могил
        for (String grave : graves) {
            System.out.println(grave);
        }
    }

    // функции, относящиеся к ответвлению от стандартных функций
    public void addGraveWithExceptionHandling(String name) { // обработка при добавлении могилы
        try {
            addGrave(name);
        } catch (Exception e) {
            System.out.println("Ошибка при добавлении могилы: " + e.getMessage());
        }
    }

    public void removeGraveWithExceptionHandling(String name) { // обработка при исключении могилы
        try {
            removeGrave(name);
        } catch (Exception e) {
            System.out.println("Ошибка при удалении могилы: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.addGrave("Иванов Иван");
        main.addGraveWithExceptionHandling("Петров Петр");
        System.out.println("Количество могил: " + countGraves());
        System.out.println("Список могил:");
        listGraves();
        main.removeGraveWithExceptionHandling("Иванов Иван");
        System.out.println("После удаления:");
        listGraves();
    }
}