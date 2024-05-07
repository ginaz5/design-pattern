package structural.decorator.exercise;

public class MeatDecorator extends SandwichDecorator {
    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat(); // same as super.make()
    }

    private String addMeat() {
        return " + turkey";
    }
}
