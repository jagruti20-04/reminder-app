package jagruti.com.collection;
//

public class Test extends MyJava  implements Runnable {
	
   public void run() 
	{
		 dis();
		
	}
    void dis()
   {
	 for(int i=0;i<=10;i++)
	 {
		 System.out.println("number:"+i);
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
}
