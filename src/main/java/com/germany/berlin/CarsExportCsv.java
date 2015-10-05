package com.germany.berlin;

import java.util.List;
import java.util.Map;

/**
 * Created by iushakova on 05/10/15.
 */
public class CarsExportCsv implements CarsExport{
    @Override
    public void export(List<Car> cars) {
        for(Car car: cars) {
            System.out.println(car.getId() + "," + car.getName());
        }
    }
}
