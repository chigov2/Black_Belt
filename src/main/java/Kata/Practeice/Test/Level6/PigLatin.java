package main.java.Kata.Practeice.Test.Level6;


//Move the first letter of each word to the
// end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
//
//        Examples
//        ppigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//        pigIt('Hello world !');     // elloHay orldway !
public class PigLatin {
    public static void main(String[] args) {
//        pigIt("Hello world !");
        pigIt("Quis custodiet ipsos custodes ?");
    }

    public static String pigIt(String str) {

        StringBuilder builder = new StringBuilder();
        String[] split = str.split((" "));

        for (int j = 0; j < split.length; j++) {
            char c = split[j].charAt(0);

            String substring = split[j].substring(1);
            if (split[j].length() >= 1 && !split[j].equals("!") && !split[j].equals("?")) {
                builder.append(substring).append(c).append("ay").append(" ");
            } else if (split[j].equals("!")) {
                builder.append("!");
            }else if (split[j].equals("?")) {
                builder.append("?");
            }
        }
        System.out.println(builder);
        return builder.toString().trim();
    }
}


/////////////////////////////
//public static String pigIt(String str) {
//    return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
//}
//
//    public static String pigIt(String str) {
//        return Arrays.stream(str.trim().split(" "))
//                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
//                .collect(Collectors.joining(" "));
//    }
//
//public class PigLatin {
//    private static final Pattern regex = Pattern.compile("(\\w)(\\w*)");
//
//    public static String pigIt(String str) {
//        return regex.matcher(str).replaceAll("$2$1ay");
//    }
//}