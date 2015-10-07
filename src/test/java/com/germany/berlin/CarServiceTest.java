package com.germany.berlin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class CarServiceTest {

    private CarService carService;
    private List<Car> expectedCars;
    private CarsExport carsExportMocked;
    private CarsDao carsDaoMocked;

    @Before
    public void before() {

        expectedCars = new ArrayList<>();
        expectedCars.add(new Car(1, "Moskvich"));

        carsExportMocked = mock(CarsExport.class);
        carsDaoMocked = mock(CarsDao.class);

        carService = new CarService();
        carService.setCarsDao(carsDaoMocked);
        carService.setCarsExport(carsExportMocked);

        when(carsDaoMocked.getAllCars()).thenReturn(expectedCars);
    }

    @Test
    public void testGetCars() throws Exception {

        List<Car> actualCars = carService.getCars();
        assertEquals(expectedCars, actualCars);
    }

    @Test
    public void testExport() throws Exception {
        carService.export();
        verify(carsDaoMocked).getAllCars();
        verify(carsExportMocked).export(expectedCars);
    }
}