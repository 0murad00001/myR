package src.day16;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    static String separator = File.separator;

    public static void main(String[] args) {

        try {
            PrintWriter pw1 = new PrintWriter("C:" + separator + "Lessons" + separator + "untitled" + separator + "src" + separator + "resources" + separator + "file1.txt");
            PrintWriter pw2 = new PrintWriter("C:" + separator + "Lessons" + separator + "untitled" + separator + "src" + separator + "resources" + separator + "file2.txt");
            Random random = new Random();
            double sum = 0;

            for (int i = 1; i <= 1000; i++) {
                String line = (random.nextInt(0, 100) + " ");
                pw1.println(line);
                String[] massiv = line.split(" ");
                double numb = Double.parseDouble(massiv[0]);
                sum = numb + sum;
                //System.out.println(sum + " " + numb + " ");
                if ((i % 20 == 0)) {
                    sum = sum / 20;
                    pw2.println(sum);
                    sum = 0;
                }
            }
            pw1.close();
            pw2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл для записи");
        }

        printResult();

    }


    public static void printResult() {
        File file = new File("C:" + separator + "Lessons" + separator + "untitled" + separator + "src" + separator + "resources" + separator + "file2.txt");
        double sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] massiv = line.split(" ");
                Double numb = Double.parseDouble(massiv[0]);
                sum += numb;
            }
            int x = (int) sum;
            System.out.println("Сумма второго файла = "+ x);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        }
    }
}
