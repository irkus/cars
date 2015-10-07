package com.germany.berlin;

import java.util.List;

/**
 * Created by iushakova on 05/10/15.
 */
public class CarService {

    private CarsDao carsDao;
    private CarsExport carsExport;

    public List<Car> getCars() {
        return carsDao.getAllCars();
    }

    public void export() {
        List<Car> cars = carsDao.getAllCars();
        carsExport.export(cars);
    }

    public void setCarsDao(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    public void setCarsExport(CarsExport carsExport) {
        this.carsExport = carsExport;
    }
}
