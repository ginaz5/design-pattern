package creational.factory_method.exercise;

import creational.factory_method.exercise.elements.AboutPage;
import creational.factory_method.exercise.elements.CommentPage;
import creational.factory_method.exercise.elements.ContactPage;
import creational.factory_method.exercise.elements.PostPage;

public class Blog extends Website{
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
