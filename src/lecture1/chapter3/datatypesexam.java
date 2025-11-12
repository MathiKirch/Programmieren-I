package lecture1.chapter3;

public class datatypesexam {
    public static void main(String[] args) {
        int numberA;

        //initialisation of numberA
        numberA = 123;

        long  numbB = 123;

        int numberC, numberD = 10, numberE;
        numberC = 100;
        System.out.println(numberC);

        final double PI = 3.14;

        int literalExample = 011; //octal literal --> 011 -> 9
        System.out.println(literalExample);

        literalExample = 0b11; //binary literal
        System.out.println(literalExample);

        literalExample = 0x111; // hexadecimal literal
        System.out.println(literalExample);

        long longNumber = 3_000_000_000L; //suffix L/l ist wichtig wenn man long als var type nimmt
    }
}
