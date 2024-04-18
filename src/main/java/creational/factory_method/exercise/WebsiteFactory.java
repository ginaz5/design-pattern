package creational.factory_method.exercise;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType websiteType) {

        switch (websiteType)
        {
            case WebsiteType.BLOG -> {
                return new Blog();
            }
            case WebsiteType.SHOP -> {
                return new Shop();
            }
            default -> {
                return null;
            }
        }
    }
}
