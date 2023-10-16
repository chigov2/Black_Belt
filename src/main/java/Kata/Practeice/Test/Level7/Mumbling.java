package main.java.Kata.Practeice.Test.Level7;

public class Mumbling {
    public static void main(String[] args) {
//        String s = "abcdefgh";
        String s = "ZpglnRxqenU";
        accum(s);
    }
    public static String accum(String s) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();
        String s4 = s.toLowerCase();
        String[] split = s4.split("");
        for (int i = 0; i < split.length; i++) {
            builder.append(split[i]);
//            builder.setCharAt(i,Character.toUpperCase(builder.charAt(i)));
            for (int j = 0; j < i; j++) {
                    builder.append(split[i]);
            }
            if (i < split.length - 1) {
                builder.append("-");
            }
        }
        String s1 = builder.toString();
        String[] split2 = s1.split("-");

        for (int q = 0; q < split2.length; q++) {
            String res = split2[q].substring(0, 1).toUpperCase() + split2[q].substring(1);
            builder1.append(res);
            if (q < split2.length - 1) {
                builder1.append("-");
            }
        }System.out.print(builder1);
        //leatherkitten
        return builder1.toString();
    }
}


///////////////////////////////////

//
//    public static String accum(String s) {
//        String[] letters = s.toUpperCase().split("");
//        for(int i = 0; i < letters.length; ++i){
//            letters[i] += letters[i].toLowerCase().repeat(i);
//        }
//        return String.join("-", letters);
//    }
//
//
//    public static String accum(String s) {
//        var chars = s.split("");
//
//        return IntStream.range(0, chars.length)
//                .mapToObj(i -> chars[i].toUpperCase() + chars[i].toLowerCase().repeat(i))
//                .collect(Collectors.joining("-"));
//    }










