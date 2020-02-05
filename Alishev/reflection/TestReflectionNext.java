package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflectionNext {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        // class_name1 class_name2 method_name
        Class clazz1 = Class.forName(scanner.next());
        Class clazz2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method m = clazz1.getMethod(methodName, clazz2);

        Object o1 = clazz1.newInstance();
        Object o2 = clazz2.getConstructor(String.class).newInstance("String value");

        m.invoke(o1, o2);

        System.out.println(o1);

    }
}
