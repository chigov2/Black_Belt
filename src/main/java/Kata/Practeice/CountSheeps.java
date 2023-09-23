package main.java.Kata.Practeice;

public class CountSheeps {
    public static void main(String[] args) {
        Boolean [] sheeps = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  null,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
        countSheeps(sheeps);
    }


    public static  int countSheeps(Boolean[] arrayOfSheeps) {
        int ok = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i] == (null)){
                continue;
            }else if (arrayOfSheeps[i].equals(true)){
                ok +=1;
            }

        }
        System.out.println(ok);
        // TODO May the force be with you
    return ok;
    }
}
