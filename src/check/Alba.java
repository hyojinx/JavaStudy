package check;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Alba {
	//급여 계산
	//시급,일한 시간을 입력
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("시급을 입력하세여: ");
		int time_price = input.nextInt();
		System.out.print("일한 시간을 입력하세여: ");
		int time = input.nextInt();
		input.close();
		

		money(time_price,time);
	}


public static void money(int time_price,int time) {
	int total = time*time_price;
	DecimalFormat df  = new DecimalFormat("#");
	df = new DecimalFormat("###,###,###");
	System.out.println("총 급여: "+df.format(total)+"원");
	
	}

}