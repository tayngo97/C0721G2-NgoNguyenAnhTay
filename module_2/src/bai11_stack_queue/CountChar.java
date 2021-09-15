package bai11_stack_queue;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class CountChar {

    public static void charCount(String input){
        String inputStr = input.toLowerCase();
        String[] inputStr1 = inputStr.split(" ");

        Map<String,Integer> charHashMap = new TreeMap<String, Integer>();
            //Key,Value

        for (String element : inputStr1){
            if (!charHashMap.containsKey(element)){ // nếu chưa có
                charHashMap.put(element,1);     // key = tay ; value = 1;
            }else { // nếu phần tử đã có
                charHashMap.put(element,charHashMap.get(element)+ 1);
            }
        }

        for (Map.Entry<String,Integer> entry : charHashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue() + "times");
        }
    }

    public static void main(String[] args) {
        String str = "tay tay lan lan hoa tien ";
        charCount(str);

    }
}
