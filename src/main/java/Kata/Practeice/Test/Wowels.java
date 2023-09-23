package main.java.Kata.Practeice.Test;

public class Wowels {
    public static void main(String[] args) {
        String one = "abracadabra";
        String two = "pear tree";
        String three = "";
        String four = "o a kak ushakov lil vo kashu kakao";
        String five = "tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty";

        getCount(one);
        getCount(two);
        getCount(three);
        getCount(four);
        getCount(five);


    }
    public static int getCount(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
//            System.out.print(chars[i] + " ");
            if (chars[i] == 'a' || chars[i] =='e' || chars[i] == 'i' ||chars[i] == 'o' || chars[i] =='u')
                {count++; }
                }
        System.out.println();
        System.out.println("count : " + count);
        return count;
            }

    }

