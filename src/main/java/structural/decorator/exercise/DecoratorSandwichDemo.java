package structural.decorator.exercise;

public class DecoratorSandwichDemo {
    public static void main(String[] args) {
        Sandwich whiteSandwich = new MeatDecorator(new SimpleSandwich());
        Sandwich wheatSandwich = new DressingDecorator(new MeatDecorator(new WheatSandwich()));

        System.out.println("=== Decorator Sandwich Demo ===");
        System.out.println(whiteSandwich.make());
        System.out.println(wheatSandwich.make());
    }
}
