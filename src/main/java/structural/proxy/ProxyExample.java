package structural.proxy;

import java.lang.reflect.Proxy;

public class ProxyExample {
    public static void main(String[] args) {
        CustomService customService = new CustomServiceImpl();

        CustomInvocationHandler<CustomService> customInvocationHandler = new CustomInvocationHandler<>(customService);

        // Proxy pattern - enable us to add dynamic functionality w/o changing the existing code (customServiceImpl).
        // Usage: Cache, Security
        CustomService customServiceProxy = (CustomService) Proxy.newProxyInstance(
                CustomService.class.getClassLoader(),
                new Class[]{CustomService.class},
                customInvocationHandler);

        customServiceProxy.doServiceCall();


        // directly call
        customService.doServiceCall();
    }
}
