package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        CarService carService = new CarServiceImp();
        model.addAttribute("cars", carService.getCarsByCount(count));
        return "cars";
    }
}
