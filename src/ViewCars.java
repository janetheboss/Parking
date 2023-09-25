public class ViewCars {
    Parking parking = Parking.getInstance();

    public void viewCars() {
        for (Car parkedCar : parking.getParkedCars()) {
            System.out.println(parkedCar.getLicensNumber());
        }
    }

    public void filterCarByColor(CarColors colorToFilter) {
        for (Car car : parking.getParkedCars()) {
            CarColors carColor = CarColors.valueOf(car.getCarColor());
            switch (carColor) {
                case RED -> {
                    System.out.println("The color of the car is Red and the licens plate is " + car.getLicensNumber());
                }
                case BLACK -> {
                    System.out.println("The color of the car is Black and the licens plate is " + car.getLicensNumber());
                }
                case GREEN -> {
                    System.out.println("The car color is Green and the licens plate is " + car.getLicensNumber());
                }
                case BLUE -> {
                    System.out.println("The car color is Blue and the licens plate is " + car.getLicensNumber());
                }
            }
        }
    }
    public void filterCarByLicensePlate(String desiredLicensePlate) {
        for (Car car : parking.getParkedCars()) {
            if (car.getLicensNumber().equalsIgnoreCase(desiredLicensePlate)) {
                System.out.println("Found a car with license plate: " + car.getLicensNumber());
            }
        }
    }
}

