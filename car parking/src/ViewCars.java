public class ViewCars extends Parking{
    public void viewCars()
    {
        for(Car parkedCar : parkedCars)
        {
            System.out.println(parkedCar.getLicensNumber());
        }
    }
    public void filterCarByColor(CarColors colorToFilter) {
        for (Car car : parkedCars) {
            CarColors carColor = CarColors.valueOf(car.getCarColor());
            switch (carColor) {
                case Red -> {
                    if (colorToFilter == CarColors.Red) {
                        System.out.println("The color of the car is Red");
                    }
                }
                case Black -> {
                    if (colorToFilter == CarColors.Black) {
                        System.out.println("The color of the car is Black");
                    }
                }
                case Blue -> {
                    if (colorToFilter == CarColors.Green) {
                        System.out.println("The car color is Green");
                    }
                }
            }
        }
    }
    public void filterCarByLicensPlate(CarLicensPlate licensPlateTOFilter)
    {
        for(Car car : parkedCars)
        {
            CarLicensPlate carLicensPlate = CarLicensPlate.valueOf(car.getLicensNumber());
            switch (carLicensPlate) {
                case EU696969 -> {
                    if (licensPlateTOFilter == CarLicensPlate.EU696969) {
                        System.out.println("The licens plate of the car is CN838383");
                    }
                }
                case NA717171 -> {
                    if (licensPlateTOFilter == CarLicensPlate.NA717171) {
                        System.out.println("The licens plate of the car is NA717171");
                    }
                }
                case AU989898 -> {
                    if (licensPlateTOFilter == CarLicensPlate.AU989898) {
                        System.out.println("The licens plate of the car is AU989898");
                    }
                }
                case CN838383 -> {
                    if (licensPlateTOFilter == CarLicensPlate.CN838383) {
                        System.out.println("The licens plate of the car is CN838383");
                    }
                }
            }
        }
    }
}