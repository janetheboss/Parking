import java.util.ArrayList;

public class Parking {
    private static Parking instance = null;
    private ArrayList<Car> parkedCars = new ArrayList<>();
    private Parking() {
    }
    public static Parking getInstance() {
        if (instance == null) {
            instance = new Parking();
        }
        return instance;
    }
    public ArrayList<Car> getParkedCars() {
        return parkedCars;
    }
    public void addCar(Car car) {
        parkedCars.add(car);
    }
}
