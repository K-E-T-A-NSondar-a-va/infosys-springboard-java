package integratedasssignment;

import java.util.HashMap;
import java.util.Map;

public class Resources {
    public static int getMonth(String month) {
        Map<String, Integer> monthMap = new HashMap<>();
        monthMap.put("Jan", 1);
        monthMap.put("Feb", 2);
        monthMap.put("Mar", 3);
        monthMap.put("Apr", 4);
        monthMap.put("May", 5);
        monthMap.put("Jun", 6);
        monthMap.put("Jul", 7);
        monthMap.put("Aug", 8);
        monthMap.put("Sep", 9);
        monthMap.put("Oct", 10);
        monthMap.put("Nov", 11);
        monthMap.put("Dec", 12);

        return monthMap.getOrDefault(month, 0);
    }
}
