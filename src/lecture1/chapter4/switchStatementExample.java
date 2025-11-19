void main () {
    int grade = 4;
    //bei switch kann man nur spezifische Fälle, keine >< etc. machen
    switch(grade) {
        //wenn kein brake, dann wird alles ausgeführt ab dem der case war, also bei grade = 1 alles ab case 1, bei grade = 5 nur default (fall through logik)
        case 1:
            IO.println("Sehr gut!");
            break;
        case 2:
            IO.println("Gut!");
            break;
        case 3:
            IO.println("Schlecht!");
            break;
        default:
            IO.println("Wir reden nicht darüber");
            break;
    };
    //switch ohne fall through logik
    switch (grade) {
        case 1 -> IO.println("Sehr gut!");
        case 2 -> IO.println("Gut!");
        case 3,4,5 -> IO.println("Schlecht!");
        default -> IO.println("Wir reden nicht darüber");
    };
    //switch mit rückgabe braucht zwingend ein default argument
    String Evaluation = switch (grade) {
        case 1 -> "Sehr gut!";
        case 2 -> "Gut!";
        case 3,4,5 -> "Schlecht!";
        default -> "Wir reden nicht darüber";
    };
    // man kann in einem switch statement eine {methode} deefinieren und als rückgabe yield benutzen statt return
}