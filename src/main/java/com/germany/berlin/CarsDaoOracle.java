package com.germany.berlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by iushakova on 05/10/15.
 */
public class CarsDaoOracle implements CarsDao {

    @Override
    public List<Car> getAllCars() {
        Map<Integer, String> carsDB = CarDb.cars;
        List<Car> cars = new ArrayList<>();

        for (Map.Entry<Integer, String> carDb : carsDB.entrySet()) {
            cars.add(new Car(carDb.getKey(), carDb.getValue()));
        }

        return cars;
    }

}
