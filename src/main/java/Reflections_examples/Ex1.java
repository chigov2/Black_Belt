package main.java.Reflections_examples;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws
            ClassNotFoundException,
            NoSuchFieldException,
            NoSuchMethodException {
        // 1
//        Class employeeClass = Class.forName("Reflections_examples.Employee");

//        // 2
//        Class employeeClass2 = Employee.class;
//
//        // 3
        Employee employee = new Employee();
        Class employeeClass = employee.getClass();

        Field someField = employeeClass.getField("id");
        System.out.println("Type of ID field: " + someField.getType());
        System.out.println("-------getFields---------------- ");

        Field[] fields = employeeClass.getFields();
        for (Field f : fields){
            System.out.println("Type of " + f.getName() + " = " + f.getType());
        }
        System.out.println("----getDeclaredFields--------------");
        Field[] privateFields = employeeClass.getDeclaredFields();
        for (Field pf: privateFields){
            System.out.println("Type of " + pf.getName() + " = " + pf.getType());
        }

        System.out.println("----method--------------");
        Method method1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary: "
                + method1.getReturnType() + ", parameter types: "
                + Arrays.toString(method1.getParameterTypes()));

        System.out.println("----method2--------------");
        Method method2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary: "
                + method2.getReturnType() + ", parameter types: "
                + Arrays.toString(method2.getParameterTypes()));

        System.out.println("----all methods--------------");
        Method [] allMethods = employeeClass.getMethods();
        for (Method m : allMethods){
            System.out.println("Name of method: " + m.getName() + ", "
                    + " Renurn type: " + m.getReturnType()
                    + " Parameter types: " + Arrays.toString(m.getParameterTypes()));

        }

        System.out.println("----private methods--------------");
        Method [] privateMethods = employeeClass.getDeclaredMethods();
        for (Method pm : privateMethods){
            System.out.println("Name of method: " + pm.getName() + ", "
                    + " Renurn type: " + pm.getReturnType()
                    + " Parameter types: " + Arrays.toString(pm.getParameterTypes()));

        }
    }

}


//changeDepartment