import java.time.LocalDate;
import java.time.LocalDateTime;

public class Car {
    private String licensNumber;
    private double weight;
    private String model;
    private String carColor;
    private LocalDateTime dueTime;


    public Car(String licensNumber, double weight, String model, String carColor) {
        this.licensNumber = licensNumber;
        this.weight = weight;
        this.model = model;
        this.carColor = carColor;
    }

    public String getLicensNumber() {
        return licensNumber;
    }

    public void setLicensNumber(String licensNumber) {
        this.licensNumber = licensNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public LocalDateTime getDueTime() {
        return dueTime;
    }

    public void setDueTime(LocalDateTime dueTime) {
        this.dueTime = dueTime;
    }
}
