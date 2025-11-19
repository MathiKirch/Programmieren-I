void main(){

    int count = 0;

    IO.println("While_Schleife: ");
    while (count < 10){
        IO.println(count + ((count++ == 9) ? "" : " - "));
    };
    count = 0;
    while (count < 10){
        IO.print(count);
        if  (count != 9){
            IO.print(" - ");
        }
        count++;
    }
    IO.println("Do-while-Schleife:");
    do {
        IO.print(count);
        if  (count != 9){
            IO.println(" - ");
        }
        count++;
    } while (count < 10);

    IO.println("For-Schleife:");
    for (int i = 0; i < 10; i++){
        IO.print(i);
        if (i != 9){
            IO.print(" - ");
        }
    }

    String[] words = {"Hallo", "das", "ist", "ein", "test", "!"};
    IO.println("Array mit int For-Schleife:");
    for (int i =0; i < words.length; i++){
        IO.println(words[i]);
    }
    IO.println("Array direkt in for-Schleife:");
    for(String word : words){

        if (word.equals("ist")){
            IO.println("Wort Übersprungen");
            continue;//skip zum nächsten Schleifendurchlauf
            //break; bricht schleife ab
        }

        IO.println(word);
    }

    IO.println("Scheiß Schleife:");
    //in for-schleifen ist alles optional, so kann man endlosschleifen erstellen-----------NICHT DURCHLAUFEN LASSEN
    for(;;){
        IO.println("il nomine de patri de fili i de spiritus sanktur");
    }

}