package structural.composite;

import java.util.HashMap;
import java.util.Map;

public class CompositeExample {

    public static void main(String[] args) {
        Map<String, String> personAttributes = new HashMap<>();
        personAttributes.put("site_role", "person");
        personAttributes.put("access_role", "limited");

        Map<String, String> groupAttributes = new HashMap<>();
        groupAttributes.put("site_role", "claims");

        Map<String, String> securityAttributes = new HashMap<>();
        securityAttributes.putAll(personAttributes);
        securityAttributes.putAll(groupAttributes);

        System.out.println(securityAttributes);
    }

}
