package Model;

import java.util.Scanner;

public class GetNumbers implements Numbers{
    Scanner scan = new Scanner(System.in);

    @Override
    public float getNumber1() {
        System.out.println("Введите число a: ");
        int number = scan.nextInt();
        return number;
    }

    @Override
    public float getNumber2() {
        System.out.println("Введите число b: ");
        int number = scan.nextInt();
        return number;
    }

    @Override
    public float getNumber3() {
        System.out.println("Введите число c: ");
        int number = scan.nextInt();
        return number;
    }

    @Override
    public float getNumber4() {
        System.out.println("Введите число d: ");
        int number = scan.nextInt();
        return number;
    }

    
    
    
}
