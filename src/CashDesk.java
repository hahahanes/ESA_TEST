
public class CashDesk {

	public final double TAX = 0.19;
	
	public double addTax(double price) {
		if (price<0) throw new IllegalArgumentException();
		return price+price*TAX;
	}
	
	public double removeDiscount(double discount, double price) {
		if(discount <0 || discount >1 || price<0) throw new IllegalArgumentException();
	
		return price-price*discount;
	}
	
	public static void main(String[] args) {
		CashDesk Kasse = new CashDesk();
		System.out.println(Kasse.removeDiscount(0.2,2));
	}
	
}
