package src.day19.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {


    public static void main(String [] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, Sort> map = new HashMap<>();
        String separator = File.separator;
        File path = new File("C:" + separator + "Lessons" + separator + "untitled" + separator + "src" + separator + "resources" + separator + "soul2.txt");

        try {
            Scanner scanner = new Scanner(path);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            int x = 0;
            while (scanner.hasNext()) {
                String line = scanner.next();
                map1.put(x, line);
                ++x;
            }

            scanner.close();

            HashSet<String> dictionary = new HashSet(map1.values());
            int chicloCiklov = 0;
            int poSlovam = 0;
            int count =0;
            int count2 =0;
            int countCm =0;

            for (String hashSet : dictionary) {
                while (chicloCiklov < map1.size()) {
                    if (map1.get(poSlovam).contentEquals(hashSet)) {
                        count++;
                        count2 = count;
                    }

                    poSlovam++;
                    if (poSlovam >= map1.size()) {
                        break;
                    }
                }
                count = 0;
                poSlovam = 0;
                chicloCiklov++;
                map.put(countCm, new Sort(countCm, count2, hashSet));
                countCm++;
            }

            LinkedHashMap<Sort, Integer> reverseSortedMap = new LinkedHashMap<>();             //производим сортировку
            map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(xx -> reverseSortedMap.put(new Sort(xx.getValue().sss, xx.getValue().count, xx.getValue().world), null));



           for(int i=0; i<100; i++){                //Циклы выводит на печать 100 MAX уже отсортированных значений из LinkedHashMap
                     System.out.println(reverseSortedMap.keySet().toArray()[i]);
                     continue;
           }


        }catch (FileNotFoundException e){
            System.out.println("файл не найден");
        }
    }
}
