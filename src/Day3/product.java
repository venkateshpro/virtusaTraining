package Day3;

public class product {
	
	int pd_Id;
	String pd_type;
	int pd_price;
	
	
	product(){
		pd_Id=0;
		pd_type=null;
		pd_price=0;
	}


	public product(int pd_Id, String pd_type, int pd_price) {
		this.pd_Id = pd_Id;
		this.pd_type = pd_type;
		this.pd_price = pd_price;
	}


	@Override
	public String toString() {
		return "product [pd_Id=" + pd_Id + ", pd_type=" + pd_type + ", pd_price=" + pd_price + "]";
	}
	
	
}
