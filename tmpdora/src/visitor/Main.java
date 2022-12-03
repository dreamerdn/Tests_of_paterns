package visitor;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();

        Developer jun = new JuniorDev();
        Developer sen = new SeniorDev();

        System.out.println("Jun");
        project.beWritten(jun);
        System.out.println();
        System.out.println("Sen");
        project.beWritten(sen);
    }
}
