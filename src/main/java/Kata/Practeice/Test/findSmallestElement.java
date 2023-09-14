package main.java.Kata.Practeice.Test;

public class findSmallestElement {
    public static void main(String[] args) {
        int [] test1 = new int[]{1,2,5,-7};
        int [] test3 = new int[]{0};
        int [] test2 = new int[]{1,1,1};
        int [] test4 = new int[]{-1,-11,-191};
findSmallestElement(test1);
findSmallestElement(test3);
findSmallestElement(test2);
findSmallestElement(test4);
    }
    public static int findSmallestElement(int[] nums) {
        // WRITE YOUR CODE BELOW THIS LINE
        int smallest = nums[0];
        for(int i = 1; i < nums.length; i++){
            if (nums[i] < smallest){
                smallest = nums[i];
            }
        }
        System.out.println("smallest element: " + smallest);
        return smallest;

        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
