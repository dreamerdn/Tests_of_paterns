package visitor;

public interface Developer {
    public void Create(ProjectClass projectClass);
    public void Create(Database database);
    public void Create(Test test);
}
