package lecture1.chapter3;

import java.util.Scanner;

public class converttofrom {
     public static void main(String[] args) {
        double numberA = 5.0;
        int numberB = 10;

        //int to double
         numberA = numberB;
         IO.println(numberA);

         numberA = 5.2;
         numberB = (int)numberA;
         IO.println(numberB);

         byte numberC;
         numberB = 128;//byte geht nur von -128 bis 127, bei mehr geht es "von vorne" los

         numberC = (byte)numberB;
         IO.println(numberB);
         IO.println(numberC);
     }
}
