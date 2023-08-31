package main.java.Reflections_examples;

import java.lang.invoke.ConstantCallSite;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class   Ex2 {
    public static void main(String[] args) throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {
        Employee employee1 = new Employee();
        Class employeeClass = Employee.class;

        /////////////////////////////
        Constructor <Employee> constructor1 = employeeClass.getConstructor();

//        Object obj1 = constructor1.newInstance();
        Employee obj1 = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);

        Object obj2  = constructor2.newInstance(5,"Mike","IT");
        System.out.println(obj2);
        /////////////////
        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800,0);
        System.out.println("-----------------");
        System.out.println(obj2);

    }

}
