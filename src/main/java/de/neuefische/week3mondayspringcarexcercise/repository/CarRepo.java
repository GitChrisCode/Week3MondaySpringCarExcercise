package de.neuefische.week3mondayspringcarexcercise.Repositories;

import de.neuefische.week3mondayspringcarexcercise.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarRepo {
    private Map<String, Car> car;

    public void listCars() {
        for (car.Entry<String, Car> entry : map.entrySet()) {
            String key = entry.getKey();
            Car value = entry.getValue();
            System.out.println("UUID: " + key + ", Wert: " + value);
        }

    public void addCar(UUID uuid, Car newCar)
    }
}
