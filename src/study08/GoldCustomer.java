package study08;

public class GoldCustomer extends Customer{
	private double saleRatio; //할인율
	
	public GoldCustomer(String customerName) {
		super(customerName);  //자동으로 써짐
		customerGrade ="GOLD";
		bonusRatio = 0.03;
		saleRatio = 0.05;
		
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price-(int)(price*saleRatio);
	}

}
