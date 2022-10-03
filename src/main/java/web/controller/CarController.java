package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String showPartCars(@RequestParam(defaultValue = "0") int count, Model model) {
        List<Car> cars;
        int size = carService.getAllCars().size();
        if (count < 1 || count > size) {
            cars = carService.getAllCars();
        } else {
            cars = carService.getAllCars().subList(0, count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
