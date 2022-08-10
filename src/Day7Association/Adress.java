package Day7Association;

public class Adress {
	String city;
	int pinCode;
	public Adress(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Adress [city=" + city + ", pinCode=" + pinCode + "]";
	}

}
