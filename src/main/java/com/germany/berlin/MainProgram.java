package com.germany.berlin;

import java.util.List;

/**
 * Created by iushakova on 05/10/15.
 */
public class MainProgram {

    //should be taken from config file
    private static final String DATABASE = "oracle";
    private static final String EXPORT_TARGET = "csv";


    public static void main(String[] args) {

        CarService service = init();

        List<Car> cars = service.getCars();
        System.out.println(cars);
        service.export(cars);
    }

    private static CarService init() {
        CarService carService = new CarService();
        carService.setCarsDao(getCarsDaoImpl());
        carService.setCarsExport(getCarsExportImpl());
        return carService;
    }


    private static CarsDao getCarsDaoImpl() {
        switch (DATABASE) {
            case "oracle": {
                return new CarsDaoOracle();
            }
            case "mongodb": {
                return new CarsDaoMongoDb();
            }
            default: {
                throw new RuntimeException("Unknown DB");
            }
        }
    }


    private static CarsExport getCarsExportImpl() {
        switch (EXPORT_TARGET) {
            case "csv": {
                return new CarsExportCsv();
            }
            case "json": {
                return new CarsExportJson();
            }
            default: {
                throw new RuntimeException("Unsupported file format");
            }
        }
    }
}
