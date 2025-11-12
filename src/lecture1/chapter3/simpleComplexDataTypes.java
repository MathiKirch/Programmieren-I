void main() {

    //simple data types
    int numberA = 10;
    int numberB;

    //call by value --> referenz auf einen aktuellen wert, nicht variable an sich
    numberB = numberA;

    IO.println("numberA: " + numberA);
    IO.println("numberB: " + numberB);

    //Reference datatypes
    String[] test1 = {"heyo", "Baum", "test"};
    String[] test2;

    test2 = test1;

    //call by reference, nimmt refferenz, nicht aktuelle werte, zeigen beide auf den selben speicherplatz
    test2 = test1;

    IO.println("test1");
    for (String word : test1){
        IO.println(word);
    }
    IO.println("test2");
    for (String word : test2){
        IO.println(word);
    }

    test2[1] = "Moin";

    //kopiert die aktuellen daten, neue zuweisung
    test2 = test1.clone();
    test2[0] = "Moin";

    //String false friend
    String firstString = "Moin";
    String secondString = "Moin";
    String thirdString = new String("Moin");
    IO.println(secondString == firstString);
    IO.println(secondString == thirdString);

    IO.println(secondString.equals(thirdString));
}
