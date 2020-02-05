package Test_Exercise.src.com.luk_d.DynamicProxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Man bob = new Man("Bob", 30, "Ternopil", "Ukraine");

        // Get class loader
        ClassLoader loader = bob.getClass().getClassLoader();

        // Get all interfaces
        Class[] interfaces = bob.getClass().getInterfaces();

        // Create proxy for bob
        Person proxyBob = (Person) Proxy.newProxyInstance(loader, interfaces, new PersonInvocationHandler(bob));

        proxyBob.introduce(bob.getName());
    }
}
