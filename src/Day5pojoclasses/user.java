package Day5pojoclasses;

/**
 * @author Venkatesh
 */

public class user {
	private int user_Id;
	private int user_psw;
	int user_phone;
	String user_name;
	
	
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public int getUser_psw() {
		return user_psw;
	}
	public void setUser_psw(int user_psw) {
		this.user_psw = user_psw;
	}
	public int getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(int user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Override
	public String toString() {
		return "user [user_Id=" + user_Id + ", user_psw=" + user_psw + ", user_phone=" + user_phone + ", user_name="
				+ user_name + "]";
	}
	public user(int user_Id, int user_psw, int user_phone, String user_name) {
		super();
		this.user_Id = user_Id;
		this.user_psw = user_psw;
		this.user_phone = user_phone;
		this.user_name = user_name;
	}
	
	
	
	
}

