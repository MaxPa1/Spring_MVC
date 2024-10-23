package web.service;

import web.model.Car;

import java.util.List;

@org.springframework.stereotype.Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = List.of((new Car("BMW","red", "X5")),
        (new Car("Audi","blue", "Q5")),
        (new Car("Nissan","white", "X-Trail")),
        (new Car("BMW","purple", "X6")),
        (new Car("Ford","black", "E-series")));

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count < 1) {
            return cars.stream().limit(0).toList();
        }
        else return cars.stream().limit(count).toList();
    }
}
