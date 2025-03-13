package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCarsByCount(int count) {
        List<Car> cars = new CarDaoImp().getAllCars();
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
