package bai3_array_method_in_java.thuchanh;

public class Find_Min_Value_In_Array {
    public static void main(String[] args) {
        int[] numberlist = {4,5,2,2,3,4,5,1,0,6,9};
        System.out.println("The min value in array is : " +minValue(numberlist));

    }

    public static int minValue(int[] array){
        int min = array[0];
        for (int i = 0 ; i<array.length;i++){
            if (min > array[i]){
                min = array[i];
            }
        }   return min ;
    }
}
