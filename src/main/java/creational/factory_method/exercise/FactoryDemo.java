package creational.factory_method.exercise;

public class FactoryDemo {

    public static void main (String[] args) {
        System.out.println("Factory Demo");
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println("=== Blog ===");
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println("=== Shops ===");
        System.out.println(site.getPages());
    }
}
