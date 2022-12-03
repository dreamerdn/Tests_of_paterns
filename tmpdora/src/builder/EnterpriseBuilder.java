package builder;

public class EnterpriseBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprise");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.wordpress2);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
