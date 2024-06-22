package overloading.com.jagruti;

public class Call {

	public static void main(String[] args) {
		Over s1=new Over();
		s1.sum(10,20);
		s1.sum(10.20,20.20);
		s1.sum("a","b");
		s1.sum(10,20);

	}

}
