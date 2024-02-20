package study.exArray;
import java.util.Arrays;
import java.util.Scanner;
//1. 정수 배열 5개를 할당하고
//Arrays.sort를 활용해서 최소값과 최대값을 얻으세요
public class test4 {
    public static void main(String[] args) {

    	int[] arr = {5,9,1,12,4};
    	
    	Arrays.sort(arr);
    	//System.out.println("정렬된 배열: ");
    	
    	int min = arr[0];
    	int max = arr[4];
    	System.out.println("최소값: "+min+", 최대값: "+max);
    	
    }
}