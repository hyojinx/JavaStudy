package test02_10;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int num[]= {9,12,14,21,16,13};
		
		for(int i =0;i<num.length;i++) {
			for(int j=i+1; j<num.length;j++) {
				if(num[i]<num[j]) {
					int temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(num));	
	}
}

