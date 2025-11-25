package lecture1.chapter5;

public class Car {

    // Atribute
    String color;
    int hp;
    String licencePlate;
    int currentSpeed;
    String brand;

    //Methoden
    //Aufbau einer Methode [Modifier] Rückgabetyp Methodenname(Parameteerliste)

    void accelerate(double deltaSpeed){
        currentSpeed += deltaSpeed;
    }

    void brake(){
        currentSpeed -= 5;
    }

}
