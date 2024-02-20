package study.exArray;
import java.util.Arrays;
import java.util.Scanner;
//3x4 행렬의 각 요소에 대해 홀수인지 짝수인지 
//판별하는 프로그램을 작성하세요
public class test3 {
    public static void main(String[] args) {

    	int[][] row = {
    			{1,2,3,4},
    			{5,6,7,8},
    			{9,10,11,12}	
    	};
    	
    	//System.out.println(row[0][1]);
    	for(int i=0;i<row.length;i++) {
    		for(int j=0; j<row[i].length;j++) {
    			String result = (row[i][j] % 2==0)?"짝수":"홀수";
    			 System.out.println("row[" + i + "][" + j + "]은(는) " +row[i][j]+"이며, "+ result + "입니다.");
    			 //System.out.println("해당위치의 값은: "+row[i][j]+" ");
    		}
    	}
    	
    }
}