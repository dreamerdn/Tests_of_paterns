package Fabric;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LuxFactoryTest {
    LuxFactory fact = new LuxFactory();
    Car car = fact.createCar();
    @Test
    public void LuxFactoryTest(){
        List<String> accessories = new ArrayList();
        accessories.add("Leather salon");
        accessories.add("Air condition");
        accessories.add("GPS");
        accessories.add("Heated steering wheel");
        assertEquals("Luxury Car", car.name);
        assertEquals(accessories, car.accessories);
    }
}