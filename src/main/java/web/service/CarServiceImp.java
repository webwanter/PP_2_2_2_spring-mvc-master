package web.service;

import web.dao.CarDaoImp;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCarsByCount(int count) {
        List<Car> cars = new CarDaoImp().getAllCars();
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
