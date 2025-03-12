package web.dao;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getAllCars() {
        List<Car> allCars = Arrays.asList(new Car[]{
                new Car("BMW", "Black", 2017),
                new Car("Mercedes", "White", 2021),
                new Car("Toyota", "Silver", 2023),
                new Car("Ford", "Blue", 2016),
                new Car("KIA", "Orange", 2025)
        });
        return allCars;
    }
}
