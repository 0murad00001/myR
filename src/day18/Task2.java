package src.day18;

public class Task2 {
    public static void main(String [] erf){
        System.out.println(count7(717771237));
    }



    static int count= 0;
    public static int count7(int n){
        if(n%10==7){
            ++count;
        }

        if(n!=0) {
            count7(n / 10);
        }else return 0;



        return count;
    }
}
