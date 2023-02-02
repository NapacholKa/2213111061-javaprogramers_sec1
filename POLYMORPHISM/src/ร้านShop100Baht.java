
public class √È“πShop100Baht extends Product{
	private int payUnit() {
		return super.getUnit();
	}

	private int freeUnit() {
		return super.getUnit() - this.payUnit();
	}
	public int getTotalprice() {
		return this.payUnit()*100;
	}
	public String toString() {
		return "you buy "+payUnit()+" units,get free "+freeUnit()+" units ("+getTotalprice()+").";
	}

}
