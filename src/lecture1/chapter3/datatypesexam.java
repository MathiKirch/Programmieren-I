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

        final double PI = 3.149;

        int literalExample = 011; //octal literal --> 011 -> 9
        System.out.println(literalExample);

        literalExample = 0b11; //binary literal
        System.out.println(literalExample);

        literalExample = 0x111; // hexadecimal literal
        System.out.println(literalExample);

        long longNumber = 3_000_000_000L; //suffix L/l ist wichtig wenn man long als var type nimmt

        //float / double literal
        double literalexample = 5.0;

        literalexample = .567;
        literalexample = -0.5e-2; // e steht für mal 10 hoch und dann die zahl, also exponent
        // hier also mal zehn hoch minus 2
        System.out.println(literalexample);

        float literalExampleC = 0.5f; //für float ist ein f am ende zwingend erforderlich, ansonstemn wird als double interpretiert

        char literalexampled = 'a';//einfache hochkomma und exakt ein zeichen
        System.out.println(literalexampled);

        String literalexampletext = "Test \"scheiss Appel\" Text";//wichtig ist doppeltes hochkomma, mehrere zeichen
        // Backslash lässt das nächste zeichen als einfaches zeichen, nicht als anweisung interpretieren, nennt man escape sequenz
        System.out.println(literalexampletext);
    }
}
