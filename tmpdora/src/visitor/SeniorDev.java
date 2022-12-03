package visitor;

public class SeniorDev implements Developer {
    @Override
    public void Create(ProjectClass projectClass) {
        System.out.print("INCREDIBLE CLASS ");
    }

    @Override
    public void Create(Database database) {
        System.out.print("Fix DB ");
    }

    @Override
    public void Create(Test test) {
        System.out.print("Wonderful test ");
    }
}
