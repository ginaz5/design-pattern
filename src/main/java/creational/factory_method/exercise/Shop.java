package creational.factory_method.exercise;

import creational.factory_method.exercise.elements.CartPage;
import creational.factory_method.exercise.elements.ItemPage;
import creational.factory_method.exercise.elements.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
