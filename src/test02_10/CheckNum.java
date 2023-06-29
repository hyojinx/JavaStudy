package test02_10;

public class CheckNum {
	public static void main(String[] args) {
		
	
	int num[] = {9,12,14,21,16,13};
	int even=0;
	int odd=0;
	int index1 = 0;
	int index2 =0;
	int total = 0;
	for(int i =0; i<num.length;i++) {
		if(num[i]%2==0) {
			even++;		
		}
		else {
			odd++;
	
		}
	}
	int evenNum[]=new int [even];
	int oddNum[]=new int [odd];
	for(int i = 0;i<num.length;i++) {
		if(num[i]%2==0) {
			evenNum[index1]=num[i];
			index1++;
		}
		else {
			oddNum[index2]=num[i];
			index2++;
		}
	}
	for(int i:evenNum) {
		total+=i;
		System.out.print(i+" ");
	}
	System.out.println("짝수 합:"+total);
	System.out.println();
	total=0;
	for(int i:oddNum) {
		System.out.print(i+" ");
		total+=i;
	}
	System.out.println("홀수 합:"+total);
	
	
	}
}
