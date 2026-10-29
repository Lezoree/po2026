package agh.po.lab3;

public class CodingBat {

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.println(cb.sleepIn(true, false));
        System.out.println(cb.intMax(1, 5, 7));
        System.out.println(cb.countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.print(cb.helloName("Bob"));
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }


    public int intMax(int a, int b, int c) {
        int max;
        if(a > b){
            max = a;
        }
        else{
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public String helloName(String name) {
        return("Hello " + name + "!");
    }




}
