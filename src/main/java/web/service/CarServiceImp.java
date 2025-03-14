package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        List<Car> cars = carDao.getAllCars();
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
