void main() {

    int numberA = 10, numberB = 15, numberC = 13; //...

    int[] numbers = new int[10]; // in dekleration kann man [] hinschreiben wo man will, die angabe der länge [10] ist syntax und kann nicht geändert werden,
    // arrays sind semidynamisch
    numbers[0] = numberA;
    numbers[1] = numberB;
    numbers[2] = numberC;
    numbers[3] = 40;

    IO.println(numbers[0]);

    String[] words = {"Hallo", "Baum"};

    char[][] ticTacToe = new char[3][3]; //liste von listen, eine liste(char) mit drei listen([3][) mit jeweils drei elementen(][3]) in der liste
    String[][][] book = new String[5][][];

    book[0] = new String[8][];
    book[0][0] = new String[32];
    book[0][0][0] = "Heyo";
    book[0][0][1] = "Baum";

    String[][][] secondBook = {{{"Test", "Manchmal", "aber nur manchmal"},{}},{}};

}
