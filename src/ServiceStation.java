public class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
        vehicle.checkVehicle();

        if (vehicle instanceof Truck) {
            ((Truck) vehicle).checkTrailer();
        }
    }

    public void check(Vehicle vehicle1, Vehicle vehicle2) {
        check(vehicle1);
        check(vehicle2);
    }
}
