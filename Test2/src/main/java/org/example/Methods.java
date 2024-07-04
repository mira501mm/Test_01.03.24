package org.example;
import java.util.ArrayList;
import java.util.List;

class Methods {
    public List<List<Integer>> splitIndexes(String[] indexes) {
        List<List<Integer>> result = new ArrayList<>();
        for (String index : indexes) {
            List<Integer> numbers = new ArrayList<>();
            String[] parts = index.substring(1, index.length() - 1).split(",");
            for (String part : parts) {
                part = part.trim();
                if (part.contains("-")) {
                    String[] range = part.split("-");
                    int start = Integer.parseInt(range[0].trim());
                    int end = Integer.parseInt(range[1].trim());
                    for (int i = start; i <= end; i++) {
                        numbers.add(i);
                    }
                } else {
                    numbers.add(Integer.parseInt(part.trim()));
                }
            }
            result.add(numbers);
        }
        return result;
    }

    public List<List<Integer>> pairsNum(List<List<Integer>> lists) {
        List<List<Integer>> result = new ArrayList<>();
        numComb(lists, 0, new ArrayList<>(), result);
        return result;
    }

    private void numComb(List<List<Integer>> lists, int depth, List<Integer> current, List<List<Integer>> result) {
        if (depth == lists.size()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < lists.get(depth).size(); i++) {
            current.add(lists.get(depth).get(i));
            numComb(lists, depth + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}