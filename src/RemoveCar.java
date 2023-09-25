import java.time.LocalDateTime;

public class RemoveCar extends Parking{
    public String removeCar(Car car, LocalDateTime dueTime)
    {
        if(!parkedCars.contains(car)){
            return "The car can not be removed";
        }
        if(LocalDateTime.now().isAfter(dueTime))
        {
            parkedCars.remove(car);
            return  "Car has been removed";
        }
        return "The time of the car has not passes yet";
    }
}
