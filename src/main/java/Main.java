import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите размер списка: ");
        Integer listSize = Integer.valueOf(reader.readLine());
        System.out.print("Введите верхнюю границу для значений: ");
        Integer maxValue = Integer.valueOf(reader.readLine());

        List<Integer> randomArray = fillList(listSize, maxValue);
        System.out.println("Вот случайный список: " + randomArray);

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.print("Введите порог для фильтра: ");
        Integer treshold = Integer.valueOf(reader.readLine());

        Filter filter = new Filter(treshold);

        List<Integer> resultArray = filter.filterOut(randomArray);

        System.out.println("Отфильтрованный список: " + resultArray);
        logger.log("Завершаем программу");
    }

    public static List<Integer> fillList(int size, int maxValue) {

        Logger logger = Logger.getInstance();
        Random random = new Random();
        List<Integer> listArray = new ArrayList<>();

        logger.log("Создаём и наполняем список");
        for (int i = 0; i < size; i++) {
            listArray.add(random.nextInt(maxValue));
        }
        return listArray;
    }

}