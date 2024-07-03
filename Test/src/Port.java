import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Port {

    public static void main(String[] args) {

        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество последовательностей: ");
        int k = scanner.nextInt();
        scanner.nextLine();

        if (k == 0)
        {
            System.out.println("Вы не можете продолжить, введя 0 последовательностей.");
        }
        else
        {
            String[] indexes = new String[k];
            for (int i = 0; i < k; i++) {
                System.out.println("Введите последовательность " + (i + 1) + ": ");
                indexes[i] = scanner.nextLine();
            }
            System.out.println("Ваша последовательность в изначальном виде: " + Arrays.toString(indexes));
            List<List<Integer>> split = methods.splitIndexes(indexes);
            System.out.println("Последовательность чисел после преобразования массива строк: " + split);
            List<List<Integer>> pairs = methods.pairsNum(split);
            if (k < 2)
            {
                System.out.println("Невозможно составить пары последовательностей чисел.");
            }
            else
            {
                System.out.println("Все возможные пары представленной последовательности чисел: " + pairs);
            }
        }
    }
}