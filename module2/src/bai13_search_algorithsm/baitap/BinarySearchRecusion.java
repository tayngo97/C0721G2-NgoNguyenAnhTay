package bai13_search_algorithsm.baitap;

public  class BinarySearchRecusion {
   static   int binarySearch(int array[], int x, int low, int high) {

        if (high >= low) {
            int mid =  (high + low) / 2;

            if (array[mid] == x)
                return mid;

            if (array[mid] > x) {
                return binarySearch(array, x, low, mid - 1);
            } else return binarySearch(array, x, mid + 1, high);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr,4,0,arr.length-1));
    }

}
