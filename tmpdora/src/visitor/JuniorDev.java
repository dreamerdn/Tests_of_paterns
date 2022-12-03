package visitor;

public class JuniorDev implements Developer{
    @Override
    public void Create(ProjectClass projectClass) {
        System.out.print("Writing bad class ");
    }

    @Override
    public void Create(Database database) {
        System.out.print("Writing strange DB ");
    }

    @Override
    public void Create(Test test) {
        System.out.print("Writing wrong test ");
    }
}
