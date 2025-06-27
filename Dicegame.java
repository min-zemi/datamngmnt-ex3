import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random dice = new Random();

        int num1 = dice.nextInt(6)+1;
        int num2 = dice.nextInt(6)+1;
        int sum = num1 + num2;

        System.out.println("What is your name?");
        System.out.print(">");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + num1);
        System.out.println("Die 2: " + num2);
        System.out.println("Total value: " + sum);

        if(sum > 7){
            System.out.println( name + " won!");
        }else{
            System.out.println(name + " lose!");
        }
    }
}