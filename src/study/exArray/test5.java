package study.exArray;
import java.util.Arrays;
import java.util.Scanner;
//1. 정수 배열 5개를 할당하고
//Arrays.sort 사용하지 않고 최소값과 최대값을 얻으세요
public class test5 {
    public static void main(String[] args) {

    	int[] arr = {5,9,1,12,4};
    	
    	int max = arr[0];
    	int min = arr[0];
    	
    	for(int i= 1;i<arr.length;i++){    		
    		if(arr[i]< min) {
    			min = arr[i];
    		}
    		if(arr[i]> max) {
    			max = arr[i];
    		}
    	}
    	System.out.println("최소값: "+min+", 최대값: "+max);
    	

    }
}