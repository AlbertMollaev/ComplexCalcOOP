package Controler;

import java.util.Scanner;
import Model.GetNumbers;
import View.View;

public class Controler extends GetNumbers implements View {
    @Override
    public void start() {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        while (choice != 5) {
            System.out.println("\nЧто вы хотите сделать?: \n");
            System.out.println("1: Сложение");
            System.out.println("2: Вычитание");
            System.out.println("3: Умножение");
            System.out.println("4: Деление");
            System.out.println("5: Выход\n");
            choice = input.nextInt();
            if (choice == 1) {
                AddController plus = new AddController();
                plus.doAddition();
            }
            if (choice == 2) {
                DevideController minus = new DevideController();
                minus.doDevide();
            }
            if (choice == 3) {
                MultiplyController mult = new MultiplyController();
                mult.doMultiply();
            }
            if (choice == 4) {
                SubstractionController subs = new SubstractionController();
                subs.doSubstract();
            }
            if (choice == 5) {
                System.out.println("До скорой встречи!");
                break;
            }
        }
        input.close();
    }
}
