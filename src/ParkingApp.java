import java.time.LocalDateTime;

public class ParkingApp {
    public static void startApp()
    {
        Car car1 = new Car("EU696969",2000,"Ford","Red");
        Car car2 = new Car("NA717171",1500,"Tesla","Black");
        Car car3 = new Car("CN838383",2500,"Honda","Green");
        Car car4 = new Car("AU989898",3000,"Mecedes","Blue");

        ParkCar parkCar = new ParkCar();
        ViewCars viewCars = new ViewCars();
        RemoveCar removeCar = new RemoveCar();

        System.out.println(parkCar.parkCar(30,car1));
        System.out.println(parkCar.parkCar(15,car2));
        System.out.println(parkCar.parkCar(5,car3));
        System.out.println(parkCar.parkCar(15,car4));
        viewCars.viewCars();
        viewCars.filterCarByColor(CarColors.BLACK);
        viewCars.filterCarByLicensePlate("NA717171");
        System.out.println(removeCar.removeCar(car1,car1.getDueTime()));
        System.out.println(removeCar.removeCar(car2,car2.getDueTime()));
        viewCars.viewCars();
    }
}
