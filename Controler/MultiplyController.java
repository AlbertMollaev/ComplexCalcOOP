package Controler;

import java.util.logging.Logger;

import Model.GetNumbers;
import Service.Complex;
import View.Multiply;

public class MultiplyController implements Multiply {
    Complex complex1;
    Complex complex2;
    Complex complex3;
    Logger logger = Logger.getLogger(MultiplyController.class.getName());

    @Override
    public void doMultiply() {
        System.out.println("\nWhere i = (-1)^1/2,\n");
        System.out.println("(a + bi)(c + di)\n");
        GetNumbers numbers = new GetNumbers();
        complex1 = new Complex(numbers.getNumber1(), numbers.getNumber2());
        complex2 = new Complex(numbers.getNumber3(), numbers.getNumber4());
        complex3 = complex1.multiply(complex2);
        logger.info("Результат: " + complex3);
    }
}
