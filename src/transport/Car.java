package transport;

public class Car extends Transport <LicenseCategoryB> {
    public Car(String brand,
               String model,
               double engineVolume,
               LicenseCategoryB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль марки" + getBrand() + "начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль марки" + getBrand() + "начал движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга");

    }

    @Override
    public void maxSpeed() {
        int minBound = 150;
        int maxBound = 300;
        int maxSpeed = ((int) (minBound + (maxBound - minBound)* Math.random()));
        System.out.println("Максимальная скорость у автомобиля " + maxSpeed);


    }
}