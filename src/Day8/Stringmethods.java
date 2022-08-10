package Day8;

public class Stringmethods {
	public static void main(String[] args) {
		
		String s= "venkat";
		
		System.out.println(s.charAt(2));
		System.out.println(s.compareTo("venk"));
		System.out.println(s.concat("hello"));
		System.out.println(s.indexOf('e'));
		System.out.println(s.endsWith("at"));
		System.out.println(s.hashCode());
		System.out.println(s.length());
		System.out.println(s.replace('k','c' ));
		System.out.println(s.repeat(2));
		System.out.println(s.isEmpty());
		System.out.println(s.substring(3,5));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}

}
