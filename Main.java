
import java.util.Scanner;// библ для ввода с клавиатуры


public class Main {
    public static int pythagoreanTriple(int[] triple){

        int a = triple[0];
        int b = triple[1];
        int c = triple[2];
        if (c*c==a*a+b*b){return 1;}
        if (a*a==b*b+c*c){return 1;}
        if (b*b==a*a+c*c){return 1;}
    return 0;
    }

    private static Scanner inn = new Scanner(System.in);// метод для ввода с клавиатуры

    public static <string> void main(String[] args) {




    }
}
