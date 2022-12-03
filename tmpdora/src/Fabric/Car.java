package Fabric;
import java.util.ArrayList;
import java.util.List;
abstract class Car{
    String name;
    List <String> accessories = new ArrayList();

    public String toString(){
        return "Model car: " + name + "\n" + accessories;
    }
}