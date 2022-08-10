package Day7Association;

public class Person {
	String name;
	Adress addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adress getAddr() {
		return addr;
	}
	public void setAddr(Adress addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + "]";
	}
	public Person(String name, Adress addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

}
