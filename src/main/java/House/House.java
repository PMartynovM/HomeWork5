package House;

import java.util.*;

public class House {
    public static void main(String[] args) {
        Map<String, Integer> nameAndAge = new HashMap<>();

        nameAndAge.put("Тихомирова Мирослава Ивановна", 25);
        nameAndAge.put("Агафонов Олег Богданович", 33);
        nameAndAge.put("Кузин Александр Маркович", 7);
        nameAndAge.put("Гусев Арсений Кириллович", 18);
        nameAndAge.put("Козлова Кира Артемьевна", 57);
        nameAndAge.put("Дмитриева София Тимофеевна", 14);
        nameAndAge.put("Соловьев Филипп Дмитриевич", 17);
        nameAndAge.put("Пантелеева Арина Дмитриевна", 45);
        nameAndAge.put("Мельников Егор Глебович", 41);
        nameAndAge.put("Петров Антон Тимурович", 13);
        nameAndAge.put("Данилов Александр Матвеевич", 30);
        nameAndAge.put("Кузнецова Дарья Сергеевна", 16);
        nameAndAge.put("Филиппов Михаил Маркович", 29);



        List<String> listOldHuman = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : nameAndAge.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value >= 18) {
                listOldHuman.add(key);
                String lastElement = listOldHuman.get(listOldHuman.size() - 1);

            }
        }
        Collections.sort(listOldHuman);
        System.out.println(listOldHuman);
        System.out.println("Количество жильцов старше 17: " + listOldHuman.size() + " человек");
    }
}


