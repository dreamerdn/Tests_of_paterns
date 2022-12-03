package visitor;

public class Test implements ProjEl {
    @Override
    public void beWritten(Developer developer) {
        developer.Create(this);
    }
}
