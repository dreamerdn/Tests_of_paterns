package builder;

public class BuildMain {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardBuilder());
        Website website = director.buildWeb();
        System.out.print(website);

        director.setBuilder(new EnterpriseBuilder());
        website = director.buildWeb();
        System.out.print(website);

    }
}