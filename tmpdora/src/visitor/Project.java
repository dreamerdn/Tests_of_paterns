package visitor;

public class Project implements ProjEl{
    ProjEl[] projectElements;
    public Project(){
        this.projectElements = new ProjEl[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }



    @Override
    public void beWritten(Developer developer) {
        for(ProjEl el: projectElements){
            el.beWritten(developer);
        }
    }
}
