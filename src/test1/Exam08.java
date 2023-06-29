package test1;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator{
		int value;
		Calculator(){
			this.value=0;
		}
		void add(int val) {
			this.value+=val;
		}
		int getValue() {
			return value;
		}
		boolean isEven(int num) {
			return num%2!=0||num==0?false:true;
//			if(num%2!=0 || num==0) {
//				return false;
//			}
//			else {
//				return true;
//			}
		}
		double avg(int[]num) {
			double sum = 0;
			for(int i =0; i<num.length;i++) {
				sum+=num[i];
			}
			return sum/num.length;
		}
		double avg(ArrayList<Integer> num ) {
			double sum = 0;
			for(int i =0; i<num.size();i++) {
				sum+=num.get(i);
			}
			return sum/num.size();
		}
	}
	class UpgradeCalculator extends Calculator{
		void minus(int val) {
			value-=val;
		}
		
	}
	class MaxLimitCalculator extends Calculator{
		int max;
		MaxLimitCalculator(int max) {
			this.max = max;
		}
		 @Override
		 void add(int val) {
			 value+=val;
			 if(value>max) {
				 value=max	;
			 }
		 }
	}
	public class Exam08 {
		public static void main(String[] args) {
			Calculator cal = new Calculator();
			cal.add(10);
			System.out.println(cal.getValue());
			UpgradeCalculator cal2 = new UpgradeCalculator();
			cal2.add(10);
			cal2.minus(7);
			System.out.println(cal2.getValue()); //3
			
			MaxLimitCalculator cal3 = new MaxLimitCalculator(100);
			cal3.add(50);
			cal3.add(60);
			System.out.println(cal3.getValue()); // 100
			
			Calculator cal4 = new Calculator();
			System.out.println(cal4.isEven(3));
			System.out.println(cal4.isEven(4));
			System.out.println(cal4.isEven(0));   //0은 false
			
			Calculator cal5 = new Calculator();
			
			int[] data1 = {1,3,5,7,9};
			System.out.println(cal5.avg(data1));	//5
			
			ArrayList<Integer> data2 = new ArrayList<>(
					Arrays.asList(5,10,15,20,25));
			System.out.println(cal5.avg(data2));	//5
 	}
}
