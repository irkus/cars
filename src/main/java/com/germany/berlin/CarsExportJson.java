package com.germany.berlin;

import java.util.List;

/**
 * Created by iushakova on 05/10/15.
 */
public class CarsExportJson implements CarsExport {
    @Override
    public void export(List<Car> cars) {

        for(Car car: cars) {
            System.out.println("cars = [" + car + "]");
        }
    }
}
