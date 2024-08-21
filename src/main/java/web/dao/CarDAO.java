package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAO {

    private final List<Car> cars;

    @Autowired
    private CarService carService;

    {
        cars = new ArrayList<>();

        cars.add(new Car("A", 100, 50));
        cars.add(new Car("B", 200, 100));
        cars.add(new Car("C", 300, 150));
        cars.add(new Car("D", 400, 200));
        cars.add(new Car("E", 500, 250));
    }

    public List<Car> getCurrentCars(int count) {
        return carService.getCarsByCount(cars, count);
    }
}
