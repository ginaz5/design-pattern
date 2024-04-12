package behavioral.command.exercise;

import java.util.ArrayList;
import java.util.List;

// client
public class CommandDemo {
    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitcher = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);

        lightSwitcher.storeAndExecute(toggleCommand);
//        lightSwitcher.storeAndExecute(toggleCommand);
//        lightSwitcher.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);
        Command allLightCommand = new AllLightCommand(lights);

        lightSwitcher.storeAndExecute(allLightCommand);
    }
}
