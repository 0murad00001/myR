package src.day19.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] args) {

        HashMap<String, Integer> wordMap = new HashMap<>(); // ВОТ ТУТ ЕСТЬ ВОПРОС В ЧЕМ РАЗНИЦА ЕСЛИ ВНАЧАЛЕ НАПИСАТЬ MAP или HASHMAP
        String separator = File.separator;
        File file = new File("C:" + separator + "Lessons" + separator + "untitled" + separator + "src" + separator + "resources" + separator + "soul.txt");
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase(); //считываемые слова - регистр делаем нижним

                Integer wordCount = wordMap.get(word);      //Запрашивает слово в HashMap и результат присваивает переменной wordCount, если значения нет-то null, если значение есть- то  1
                if (wordCount == null)
                    wordMap.put(word, 1); //если в wordCount = null - то в HashMap добавляется данное слово, а значение задается 1
                else
                    wordMap.replace(word, wordCount + 1); //Иначе если wordCount != null. то перезаписывется слово, а значение как счетчик на один увеливается
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Map<String, Integer> topTen = wordMap  // тут мы создали МАПУ и присвоили ей значение мапы wordMap
                .entrySet() // метод для работы с HashMap
                .stream() //подключаем потоки
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) //сортируем / сравниваем по значению / включаем компаратор и обратную сортировка от большего к меньшему
                .limit(100) //устанавливаем лимит слов равный 100
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        for (Map.Entry<String, Integer> m : topTen.entrySet()) {
            System.out.println(m.getKey() + " = " + m.getValue());
        }
    }
}
