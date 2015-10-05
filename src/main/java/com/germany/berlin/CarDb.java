package com.germany.berlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by iushakova on 05/10/15.
 */
public class CarDb {

    public static Map<Integer, String> cars = createCarTable();

    private static Map<Integer, String> createCarTable() {
        Map<Integer, String> result = new HashMap<>();
        result.put(1, "VW");
        result.put(2, "Traband");
        result.put(3, "Audi");
        result.put(4, "Zhiguli");
        result.put(5, "Wolga");
        return result;
    }
}
