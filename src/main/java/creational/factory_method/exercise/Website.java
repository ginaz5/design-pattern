package creational.factory_method.exercise;

import creational.factory_method.exercise.elements.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public Website() {this.createWebsite();
    }

    public abstract void createWebsite();
}
