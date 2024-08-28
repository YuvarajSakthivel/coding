package coding.binarysearch;

public class SearchTargetInArray {

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right) {
            int mid = left + (right-left)/2;
            if (arr[mid]==target) return mid;
            if(target > arr[mid])
                left = mid+1;
            else
                right = mid-1;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,7,8,9,11,13,17},11));
    }
}
