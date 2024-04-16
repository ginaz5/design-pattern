package creational.builder;

public class BuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("This example of builder pattern. ");
        builder.append("It has methods to append");
        builder.append("almost anything you want to a String w/o plus sign to concatenating them.");
        builder.append("For example: number ");
        builder.append(123);
        builder.append("====").append("test");
        System.out.println(builder);
    }
}
