package main.java.Kata.Practeice.Test.Level7;

public class StringToASCII {

    public static void main(String[] args) {
        String txt = "KnowProgram";
        String txt2 = "aaaaaaaaaaaaaaaabzbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyzm";
        printerError(txt2);
    }

    public static String printerError(String s) {
        int sum = 0;
        int errors = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            //append1 = sb.append((int) s.charAt(i));
            //append1.append(" ");
            sum += 1;
            if (s.charAt(i) > 109){
                errors +=1;
            }
        }

//        String ascii = sb.toString();
//        System.out.println("ASCII: " + ascii);
//
        sb.append(errors);
        sb.append("/");
        sb.append(sum);
//        System.out.println("sum: " + sum);
//        System.out.println();
//        System.out.println("errors: " + errors);
//        System.out.println();
        System.out.println(sb.toString());

        return sb.toString();
    }
}
////////////////////////////////////////////////////////////////////

//    public static String printerError(String s) {
//        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
//    }
//
//
//
//    public static String printerError(String s) {
//        long errs = s.chars().filter( ch -> ch > 'm').count();
//        return errs+"/"+s.length();
//    }
//
//
//
//    public static String printerError(String s) {
//        int c=0;
//        for(char item:s.toCharArray())
//            if(item>'m'||item<'a')c++;
//        return c+"/"+s.length();
//    }
//
//
//    public static String printerError(String s) {
//        return s.chars().filter(c -> c > 'm').count() + "/" + s.length();
//    }



