import java.util.Random;

public class DiceGame{
    public static void main(String[] args){
        Random dice = new Random();
        int num1 = dice.newInt(6)+1;
        int num2 = dice.newInt(6)+1;
        int sum = num1 + num2;

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