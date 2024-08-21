package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarsByCount(List<Car> listOfCars, int count) {
        return listOfCars.stream().limit(count).toList();
    }
}
