package web.service;

import web.model.Car;

import java.util.List;

@org.springframework.stereotype.Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        if (count < 1) {
            return List.of();
        }
        else return cars.stream().limit(count).toList();
    }
}
