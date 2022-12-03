package Fabric;

//определяет общий интерфейс для создания объектов в суперклассе,
//позволяя подклассам изменять тип создаваемых объектов.

//объекты создаются через вызов особого фабричного метода
public class Main {
    public static void main(String[] args){
        CarFactory myLuxFactory = new LuxFactory();
        CarFactory myBasicFactory = new DefFactory();

        Car myLuxCar = myLuxFactory.createCar();
        Car myBasicCar = myBasicFactory.createCar();

        System.out.println(myLuxCar);
        System.out.println(myBasicCar);
    }
}