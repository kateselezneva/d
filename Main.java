//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напиши число в десятичной СС");

        int a = scanner.nextInt();
        String b = "";
        while (a>0){
            b = Integer.toString(a%2)+b;
            a/=2;
        }
        System.out.println(b);



    }

}