package composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements IPrintable {

    private List<IPrintable> mChildGraphics = new ArrayList<IPrintable>();

    public void print() {
        for (IPrintable graphic : mChildGraphics) {
            graphic.print();
        }
    }

    public void add(IPrintable graphic) {
        mChildGraphics.add(graphic);
    }

    public void remove(IPrintable graphic) {
        mChildGraphics.remove(graphic);
    }
}