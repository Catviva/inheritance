package transport;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        LicenseCategoryB driverB = new LicenseCategoryB("Вася", true, 15);
        LicenseCategoryC driverC = new LicenseCategoryC("Федя", true, 20);
        LicenseCategoryD driverD = new LicenseCategoryD("Петя", true, 30);

        Car car1 = new Car("Lada", "Granta", 1.7, driverB);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro",  3.0, driverB);
        Car car3 = new Car("BMW", "", 3.0, driverB);
        Car car4 = new Car(null, "Sportage 4-го поколения", 2.4, driverB);
        Bus bus1 = new Bus("Mercedes", "Sprinter", 3.0, driverD);
        Bus bus2 = new Bus("ПАЗ", "672", 4.75, driverD);
        Bus bus3 = new Bus("Setra", "S217", 11.94, driverD);
        Bus bus4 = new Bus("Neoplan", "N1216", 11.94, driverD);
        Truck truck1 = new Truck("MAN", "TGM", 6.9, driverC);
        Truck truck2 = new Truck("Volvo", "FL", 7.2, driverC);
        Truck truck3 = new Truck("КамАЗ", "65115", 11.8, driverC);
        Truck truck4 = new Truck("DAF", "LF 45", 6.7, driverC);

        truck1.pitStop();
        bus3.bestLapTime();
        car2.maxSpeed();
        printInfo(car3);
        printInfo(bus4);
        printInfo(truck1);
    }

    private static void printInfo(Transport transport) {
        System.out.println("Водитель " + transport.getDriver().getName()+
                " управляет " + transport.getBrand() +
                " и будет участвовать в заезде.");
    }

}
