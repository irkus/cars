package com.germany.berlin;

import java.util.List;

/**
 * Created by iushakova on 05/10/15.
 */
public class MainProgram {


    public static void main(String[] args) {

        CarsDao carsDao = new CarsDaoOracle();
        List<Car> cars = carsDao.getAllCars();
        System.out.println(cars);

        CarsExport export = new CarsExportCsv();
        export.export(cars);

    }
}
