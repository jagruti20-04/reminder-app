package jagruti.com.collection;

public class Join {

	public static void main(String[] args) throws InterruptedException {
		try
		{
		Test t1=new Test();
		Thread t2=new Thread(t1);
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.setName("happy go lucky");
		t2.join();
		System.out.println(t2.getName());
		}
		catch(Exception e)
		{
			System.out.println("better luck");
//			System.out.println(t2.getName());
		}
		
//	       Thread c=tg.getName();
//        System.out.println(t2.getName());
		Test3 t3=new Test3();
		t3.start();
		t3.setName("hello ");
		t3.join();
		System.out.println(t3.getName());
		
      
	}

}
