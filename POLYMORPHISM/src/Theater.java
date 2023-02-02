
public class Theater extends Movie{
	private int theaterNo;
	public Theater() {
		super();
		this.theaterNo =0;
	}
	
	public Theater(String id,String name ,Director director,int theaterNo) {
		super();
		this.theaterNo = theaterNo;
	}
	public String getTheaterName() {
		if(theaterNo>=1&&theaterNo<=11)
		{
			return "Basic Theater";
		}
		else if(theaterNo>=12&&theaterNo<=14)
		{
			return "Sweet Theater";
		}
		else if(theaterNo==15)
		{
			return "Premium Theater";
		}
		else 
		{
			return "null";
		}
	}
	public String toString() {
		return ""+getTheaterName()+":"+super.toString();//
	}
	
}
