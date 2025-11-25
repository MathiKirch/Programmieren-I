package lecture1.chapter5;

public class CarRun {
    public static void main(String[] args) {

        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.color = "Blau";
        myCar.licencePlate = "SGH MK 202";
        myCar.currentSpeed = 203;
        myCar.brand = "Volkswagen";

        yourCar.color = "Rot";
        yourCar.licencePlate = "HZ AB 187";
        yourCar.currentSpeed = 911;
        yourCar.brand = "Porsché";

        IO.println("Mein Auto hat die Farbe " + myCar.color + "und ist ein " + myCar.brand);
        IO.println("Dein Auto hat die Farbe " + yourCar.color + "und ist ein " + yourCar.brand);

        // guck dir einfach bergneels github an, wenns sein muss, hab keine Lust mehr mitzuschreiben
    }
}
