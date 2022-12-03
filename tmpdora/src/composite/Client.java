package composite;

public class Client {

    public static void main(String[] args) {
        CPU CPU1 = new CPU(1);
        CPU CPU2 = new CPU(2);
        CPU CPU3 = new CPU(3);
        CPU CPU4 = new CPU(4);

        Box box = new Box();
        Box box1 = new Box();
        Box box2 = new Box();

        box1.add(CPU1);
        box1.add(CPU2);
        box1.add(CPU3);

        box2.add(CPU4);

        box.add(box1);
        box.add(box2);

        box.print();
    }

}

