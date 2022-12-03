package visitor;

public class Database implements ProjEl {
    @Override
    public void beWritten(Developer developer) {
        developer.Create(this);
    }
}

