package composite;

public class CPU implements IPrintable {
    private int num = 0;
    public CPU(int num){
        this.num = num;
    }
    public void print() {
        System.out.print("CPU" + num);
    }
}