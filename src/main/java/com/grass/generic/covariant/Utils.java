package com.grass.generic.covariant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baidu on 16/6/30.
 */
public class Utils<T> {
    public T get(List<? extends T> list, int i) {
        return list.get(i);
    }

    public void put(List<? super T> list, T item) {
        list.add(item);
    }

    public void copy(List<? super T> to, List<? extends T> from) {
        for (T t : from) {
            to.add(t);
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList();
        List<Benz> benzs = new ArrayList();
        Utils<Car> carUtils = new Utils();

        carUtils.put(vehicles, new Car());
        Car car = carUtils.get(benzs, 0);
        carUtils.copy(vehicles, benzs);
    }
}
