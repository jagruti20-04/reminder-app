package jagruti.com.datastructures;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Ramya");
		ar.add("Ram");
		ar.add("Rajani");
		ar.add("Ravi");
		Iterator it=ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		}
		
		ArrayList<String> ap=new ArrayList<String>();
		ap.add("ramya");
		ap.add("ram");
		ap.add("rajani");
		ap.add("ravi");
		Iterator its=ap.iterator();
		while(its.hasNext())
		{
			System.out.println(its.next()); 
		}
		

	}

}
