package Fabric;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LuxCarTest {
    LuxCar car = new LuxCar();

    @Test
    public void testLuxCar(){
        List<String> accessories = new ArrayList();
        accessories.add("Leather salon");
        accessories.add("Air condition");
        accessories.add("GPS");
        accessories.add("Heated steering wheel");
        assertEquals("Luxury Car", car.name);
        assertEquals(accessories, car.accessories);
        System.out.println("Test is passed");

    }
}