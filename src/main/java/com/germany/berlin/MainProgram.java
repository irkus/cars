package com.germany.berlin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by iushakova on 05/10/15.
 */
public class MainProgram {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-cars-beans.xml");

        CarService service = (CarService) context.getBean("CarService");
        List<Car> cars = service.getCars();
        System.out.println(cars);
        service.export();
    }

}
