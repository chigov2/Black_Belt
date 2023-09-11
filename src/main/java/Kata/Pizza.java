package main.java.Kata;

public class Pizza {
    public static void main(String[] args) {
        String[] etst = {"dough","2"};
        doughIsEnough(etst);

    }

    public static boolean doughIsEnough(String[] ingredients) {
        //Write code below this line
        int count = 0;
        for(String i : ingredients){
            if (i.equals("dough")){
                count++;
            }
        }
        if(count >=2){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;

        //Write code above this line
    }
}
