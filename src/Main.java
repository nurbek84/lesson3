import java.io.PrintStream;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100);
        int d = r.nextInt(50);
        int c = r.nextInt(85);
        int m = r.nextInt(35);
        System.out.println(a+ " "+d+" "+c+" "+m);
        int max = Math.max(a,d);
        int max1 =  Math.max(c,m);
        int max2 = Math.max(max1,max);
        System.out.println(max2);



    }
}