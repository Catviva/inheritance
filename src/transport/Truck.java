package transport;

public class Truck extends Transport <LicenseCategoryC> {

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 LicenseCategoryC driver) {
        super(brand, model, engineVolume, driver);
    }



    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль марки" + getBrand() + "начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовой автомобиль марки" + getBrand() + "закончил движение");

    }

    @Override
    public void pitStop () {
        System.out.println("Пит-стоп у грузового автомобиля");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Мксимальная скорость");
    }
}
