package main.java.Kata.Practeice.Test;

public class MakeComplement {
    public static void main(String[] args) {
        String dna1 = "ATTGC";
        String dna2 = "TTTTT";
        String dna3 = "CATA";

//        "ATTGC" --> "TAACG"
//        "GTAT" --> "CATA"
        makeComplement(dna3);

    }
    public static String makeComplement(String dna) {
//        char[] charsDNA = dna.toCharArray();
//        StringBuilder builder = new StringBuilder();
//        for (char c: charsDNA) {
//            System.out.print(c + " ") ;
//            if (c == 'A'){builder.append('T');}
//            else if(c == 'T'){builder.append('A');}
//            else if(c == 'G'){builder.append('C');}
//            else if(c == 'C'){builder.append('G');}
//        }
//        System.out.println();
//        System.out.println("-----------");
////        System.out.println(builder);
//        System.out.println(builder.toString());
//
//        return builder.toString();

        return dna.replace("A","B")
                .replace("C","D")
                .replace("T","A")
                .replace("G","C")
                .replace("B","T")
                .replace("D","G");
    }
}
