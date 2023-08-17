package main.java.RegEx;

public class RegEx4 {
    public static void main(String[] args) {
        String s1 = "Hello,  my    friend!  How      is your    Java lessons     ?";
        System.out.println(s1);
        s1 = s1.replace("Java","SQL");
        System.out.println(s1);
        s1 = s1.replaceAll(" {2,}"," ");
        System.out.println(s1);
//        s1 = s1.replaceAll("\\bH\\w+","777");
//        System.out.println(s1);
        s1 = s1.replaceFirst("\\bH\\w+","777");
        System.out.println(s1);

    }
}
