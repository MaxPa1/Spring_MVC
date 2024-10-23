package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam("count") int count, ModelMap model) {
        List<Car> cars1 = service.getCarsByCount(count);
        model.addAttribute("cars", cars1);
        return "cars";
    }
}
