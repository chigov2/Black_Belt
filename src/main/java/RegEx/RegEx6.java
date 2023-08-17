package main.java.RegEx;

import java.util.regex.Pattern;

public class RegEx6 {

    void checkIP(String ip){
        String regex = "(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)" +
                "\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?){3}";
        //\ b25[0-5]|\b ---------------- 250-255
        // |
        // \b2[0-4][0-9]---------------- 200-249
        // |
        // \b[01]?[0-9][0-9]?----------- 0-199

        // .(25[0-5]|2[0-4][0-9]--------- 255..249
        // |
        // [01]?[0-9][0-9]?-------------0-199
        // {3 } ------------------------3 times
        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        String ip1 = "192.198.4.5";
        String ip2 = "392.198.4.5";
        RegEx6 r6 = new RegEx6();
        r6.checkIP(ip1);
        r6.checkIP(ip2);
    }
}
