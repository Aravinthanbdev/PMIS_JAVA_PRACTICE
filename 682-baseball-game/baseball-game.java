
import java.util.ArrayList;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> record = new ArrayList<>();

        for (String op : operations) {
            switch (op) {
                case "C":
                    record.remove(record.size() - 1);
                    break;

                case "D":
                    int last = record.get(record.size() - 1);
                    record.add(last * 2);
                    break;

                case "+":
                    int n = record.size();
                    record.add(record.get(n - 1) + record.get(n - 2));
                    break;

                default:
                    record.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : record) {
            sum += score;
        }

        return sum;
    }
}
