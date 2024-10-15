package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String brand;
    private String color;
    private String serial;

    public Car() {}

    public Car(String brand, String color, String serial) {
        this.brand = brand;
        this.color = color;
        this.serial = serial;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
