package builder;

public class VisitCardBuilder extends WebSiteBuilder {

    @Override
    void buildName() {
        website.setName("VisitCard");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.wordpress1);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}