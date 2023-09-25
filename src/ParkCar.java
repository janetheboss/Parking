import java.time.LocalDateTime;

public class ParkCar  {
    Parking parking = Parking.getInstance();
    public String parkCar(double price, Car car) {
        if (parking.getParkedCars().size() == 40) {
            return"The parking is full";
        }
        if (price != 15) {
            return"PLS pay the tax";
        }
        if (car.getWeight() >= 2500) {
            return"You're car is too heavy for the parking pls remove parts to make weight !!!";
        }
        car.setDueTime(LocalDateTime.now().plusHours(3));
        parking.getParkedCars().add(car);
        return "Car is parked";
    }
}
