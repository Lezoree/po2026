package agh.po.lab3;
import java.util.Map;
import java.util.HashMap;
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

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")){
            String value_A = map.get("a");
            String value_B = map.get("b");

            if (value_A.length() > value_B.length()){
                map.put("c", value_A);
            }
            else if (value_A.length() < value_B.length()){
                map.put("c", value_B);
            }
            else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < strings.length; i++){
        String s = strings[i];

        String first = String.valueOf(s.charAt(0));
        String last = String.valueOf(s.charAt(s.length() - 1));

        map.put(first, last);
        }
    return map;
    }




}
