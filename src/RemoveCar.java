import java.time.LocalDateTime;

public class RemoveCar {
    Parking parking = Parking.getInstance();
    public String removeCar(Car car, LocalDateTime dueTime)
    {
        if(!parking.getParkedCars().contains(car)){
            return "The car can not be removed";
        }
        if(LocalDateTime.now().isAfter(dueTime))
        {
            parking.getParkedCars().remove(car);
            return  "Car has been removed";
        }
        return "The time of the car has not passes yet";
    }
}
