package visitor;

public class ProjectClass implements ProjEl {
    @Override
    public void beWritten(Developer developer) {
        developer.Create(this);
    }
}

