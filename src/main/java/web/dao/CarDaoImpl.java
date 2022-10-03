package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDAO {
    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            cars.add(new Car("CustomBrand" + i, "NewModel" + i, 10000 * i));
        }
        return cars;
    }

    @Override
    public Car getCar(int count) {
        return null;
    }
}
