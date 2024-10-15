package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam("count") int count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW","red", "X5"));
        cars.add(new Car("Audi","blue", "Q5"));
        cars.add(new Car("Nissan","white", "X-Trail"));
        cars.add(new Car("BMW","purple", "X6"));
        cars.add(new Car("Ford","black", "E-series"));

        List<Car> cars1 = service.getCars(cars,count);
        model.addAttribute("cars", cars1);
        return "cars";
    }
}
