import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Module Desc:
 * User: empcl
 * DateTime: 2020/1/27 16:58
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList bList = new ArrayList();
        bList.add(1);
        bList.add(4);
        bList.add(3);
        bList.add(5);
        bList.add(5);
        bList.add(8);
        bList.add(7);
        bList.add(5);
        bList.add(5);
        bList.add(4);
        bList.add(7);
        bList.add(6);
        System.out.println(getAttentionEffectiveSmoothness(bList, 2, 3));
    }

    // 每组平均训练值
    private static double getAttentionAveValue(List<Integer> list) {
        int size = list.size();
        int sum = 0;
        for (int ele : list) {
            sum = sum + ele;
        }
        return sum * 1.0 / size;
    }

    // 平均值上升幅度
    private static double getAttentionAveRise(List<Integer> bList, List<Integer> aList) {
        double bAve = getAttentionAveValue(bList);
        double aAve = getAttentionAveValue(aList);
        return aAve / bAve;
    }

    // 注意力有效平稳度,其中，deviation表示注意力值与平均值的规定偏差，duration表示连续的次数要求。
    private static double getAttentionEffectiveSmoothness(ArrayList<Integer> list, int deviation, int duration) {
        double ave = getAttentionAveValue(list);
        int size = list.size();
        int t_total = 0;
        int total = 0;
        for (int i = 0; i < size; ) {
            if (isBiggerAveInDeviation(list.get(i), ave, deviation)) {
                t_total++;
            } else {
                if (t_total >= duration) {
                    total = total + t_total;
                }
                t_total = 0;
            }
            i = i + 1;
        }
        return total * 1.0 / size;
    }

    private static boolean isBiggerAveInDeviation(int num, double ave, int deviation) {
        if (num > ave && Math.abs(num - ave) < deviation)
            return true;
        return false;
    }


    // 极大值的平均数以及次数
    private static HashMap<String, Number> getAttentionMaximumAveAndCount(ArrayList<Integer> list) {
        int count = 0;
        double maximum = 0;
        int len = list.size();
        for (int i = 1; i < len - 1; i++) {
            int current = list.get(i);
            if (current > list.get(i - 1) && current > list.get(i + 1)) {
                count++;
                maximum = maximum + current;
            }
        }
        HashMap map = new HashMap<String, Number>();
        map.put("max", maximum * 1.0 / count);
        map.put("count", count);

        return map;
    }

}
