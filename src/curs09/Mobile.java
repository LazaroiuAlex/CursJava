package curs09;

public class Mobile extends Product{
	
	private int buyPrice;
	private int vat;
	private int adaos;
	

	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
		return  buyPrice + vat + adaos;
	}
	
	public Mobile(int buyPrice, int vat, int adaos) {
		this.buyPrice = buyPrice;
		this.vat = vat;
		this.adaos = adaos;
	}
	

}
