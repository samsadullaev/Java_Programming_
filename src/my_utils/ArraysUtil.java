package my_utils;

public class ArraysUtil {
    public static int min(int... arr){

    int min = arr[0];

    for( int each : arr){
        if(each< min){
            min = each;
        }
    }
    return min;
}

public static int max(int[] arr){
    int max = arr[0];
    for( int each : arr){
        if(each > max){
            max = each;
        }
    }
    return max;
}

public static boolean contains(int [] arr, int num){

        for(int each : arr){
            if( each == num){
                return true;
            }
        }
        return false;
}



}
