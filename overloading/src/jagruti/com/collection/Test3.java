package jagruti.com.collection;
//
public class Test3 extends Thread {
	
		 
		public void run()
		{
			 for(int k=10;k<=20;k++)
			 {
				 System.out.println("number:"+k);
			 }
			 try
			 {
				 Thread.sleep(1000);
			 }
			 catch(InterruptedException e)
			 {
				 e.printStackTrace();
			 }
		}

	

}
