package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static Car unserialize(String json) {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(json);
        Car car = null;
        try {
            car = mapper.readValue(json, Car.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return car;
    }
    // END
}
