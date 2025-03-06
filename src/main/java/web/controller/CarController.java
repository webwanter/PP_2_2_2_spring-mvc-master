package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {

        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("BMW", "Black", 2017));
        allCars.add(new Car("Mercedes", "White", 2021));
        allCars.add(new Car("Toyota", "Silver", 2023));
        allCars.add(new Car("Ford", "Blue", 2016));
        allCars.add(new Car("KIA", "Orange", 2025));

        if (count == null || count >= 5) {
            model.addAttribute("cars", allCars);
        } else {
            List<Car> carsToDisplay = allCars.stream().limit(count).collect(Collectors.toList());
            model.addAttribute("cars", carsToDisplay);
        }
        return "cars";
    }
}
