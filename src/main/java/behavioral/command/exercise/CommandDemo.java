package behavioral.command.exercise;

// client
public class CommandDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Switch lightSwitcher = new Switch();

        Command toggleCommand = new ToggleCommand(light);

        lightSwitcher.storeAndExecute(toggleCommand);
        lightSwitcher.storeAndExecute(toggleCommand);
        lightSwitcher.storeAndExecute(toggleCommand);
    }
}
