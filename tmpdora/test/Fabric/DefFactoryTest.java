package Fabric;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DefFactoryTest {
    DefFactory fact = new DefFactory();
    Car car = fact.createCar();
    @Test
    public void DefFactoryTest(){
        List<String> accessories = new ArrayList();
        accessories.add("Just salon");
        accessories.add("Air condition");
        assertEquals("Usual Car", car.name);
        assertEquals(accessories, car.accessories);
    }
}