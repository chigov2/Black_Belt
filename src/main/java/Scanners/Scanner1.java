package main.java.Scanners;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
//        Scanner scanner  = new Scanner(System.in);
//        System.out.println("snter number");
//        int i  = scanner.nextInt();
//        System.out.println("Entered value: " + i);

//        System.out.println("Enter two numbers: ");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Частное: " + x /y);
//        System.out.println("Остаток: " + x % y);

//        System.out.println("Введите пару слов");
//        String s  = scanner.nextLine();
//        System.out.println("Вы ввели: " + s);

//        System.out.println("Напишите две строки");
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        System.out.println("Вы ввели "  + s1 + " " + s2);

//        System.out.println("Введите дробное число");
//        double d  = scanner.nextDouble();
//        System.out.println("Entered value: " + d);

        Scanner scanner = new Scanner("Hello my friend\nSecond line \nThird line");
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        String s3 = scanner.nextLine();
//        System.out.println(s1 + " " + s2+ " " + s3);

//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());

        System.out.println(scanner.next().charAt(2));

        scanner.close();

    }
}
