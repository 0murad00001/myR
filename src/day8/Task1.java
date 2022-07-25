package src.day8;

public class Task1 {
    public static void main(String[] args) {
        String string = new String("");

        long start = System.currentTimeMillis();
        for(int i = 0; i<=20000; i++){
            string +=  i + " ";

        }
        long stop = System.currentTimeMillis();
        System.out.println("Время выполнения Стринг " + (stop - start));
        System.out.print(string);



        System.out.println();System.out.println();

        StringBuilder sb = new StringBuilder("");
        start = System.currentTimeMillis();
        for (int i =0; i<=20000; i++){
            sb.append(i).append(" ");
        }
        stop = System.currentTimeMillis();
        System.out.println(sb);
        System.out.println("Время выполнения Стринг Билдер " + (stop - start));




    }

}



