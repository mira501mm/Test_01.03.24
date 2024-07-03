import java.util.ArrayList;
import java.util.List;

public class Methods {

    //  Преобразование массива строк в массив последовательности чисел
    public List<List<Integer>> splitIndexes(String[] indexes) {

        List<List<Integer>> result = new ArrayList<>();

        //  Разделение последовательности на отдельные числа
        for (String index : indexes) {
            List<Integer> numbers = new ArrayList<>();
            String[] parts = index.split(",");
            //  Проверка пунктуации последовательностей
            for (String part : parts) {
                if (part.contains("-")) {
                    String[] range = part.split("-");
                    int start = Integer.parseInt(range[0]);
                    int end = Integer.parseInt(range[1]);
                    for (int i = start; i <= end; i++) {
                        numbers.add(i);
                    }
                }
                else {
                    numbers.add(Integer.parseInt(part));
                }
            }
            result.add(numbers);
        }
        return result;
    }

    //  Составление всех упорядоченных пар элементов из чисел
    public List<List<Integer>> pairsNum(List<List<Integer>> sequences) {

        List<List<Integer>> pairs = new ArrayList<>();

        //  Цикл перебора существующтх чисел и составление всех возможных упорядоченных пар чисел
        for (int i = 0; i < sequences.size(); i++) {
            for (int j = 0; j < sequences.size(); j++) {
                if (i != j) {
                    for (int num1 : sequences.get(i)) {
                        for (int num2 : sequences.get(j)) {
                            List<Integer> pair = new ArrayList<>();
                            pair.add(num1);
                            pair.add(num2);
                            pairs.add(pair);
                        }
                    }
                }
            }
        }
        return pairs;
    }

}
