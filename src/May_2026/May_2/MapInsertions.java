package May_2026.May_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapInsertions
{
    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();
        map.put("Test1", new ArrayList<>());
        System.out.println(map);
        map.get("Test1").add(0, "Sharma");
        map.get("Test1").add(1, "Amit");
        System.out.println(map.get("Test1"));

    }
}
