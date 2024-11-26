public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку автомобиля");
    }

    @Override
    public void checkVehicle() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}
