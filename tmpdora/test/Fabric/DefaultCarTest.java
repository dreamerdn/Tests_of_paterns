package Fabric;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DefaultCarTest {
    DefaultCar car = new DefaultCar();

    @Test
    public void testDefaultCar(){
        //создаем список accessories
        List <String> accessories = new ArrayList();
        //добавляем accessories
        accessories.add("Just salon");
        accessories.add("Air condition");
        //сравнимаем свойства имени
        assertEquals("Usual Car", car.name);
        //сравнимаем свойства accessories
        assertEquals(accessories, car.accessories);
        System.out.println("Test is passed");

    }

}