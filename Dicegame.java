import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random dice = new Random();

        int num1 = dice.newInt(6)+1;
        int num2 = dice.newInt(6)+1;
        int sum = num1 + num2;

        Syatem.out.println("What is your name?");
        Syatem.out.print(">");
        String name = scanner.next();
        Syatem.out.println("Hello, " + name + "!");

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + num1);
        System.out.println("Die 2: " + num2);
        System.out.println("Total value: " + sum);

        if(sum > 7){
            System.out.println("you won!");
        }else{
            System.out.println("you lose!");
        }
    }
}