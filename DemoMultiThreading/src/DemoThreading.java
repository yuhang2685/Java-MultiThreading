/**
 *  Yuhang Zhao:
 *  
 *  One way to implement thread is to extend the class "Thread" 
 *  and it has to contain a method "run()".
 *  The method name must be "run()" which does some work.
 *  The thread uses "start()" to invoke, which implicitly calls run().
 *  
 *  The other way is to implement interface "Runnable",
 *  which has to contain a method "run()".
 *  The Runnable object is used as the parameter for a thread object.
 *  Then the thread uses "start()" to invoke, which implicitly calls Runnable method run().
 *  
 *  Note that "main()" is also a thread in this program.
 *  
 *  Other features of thread including name, priority, isAlive, sleep, join.
 *  
 */

class Hi1 extends Thread{

	public void run() {
		
		for (int i=1; i<=5; i++ )
		{
			System.out.println("ERIC");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}	
}

class Hello1 extends Thread{
	
	public void run() {
		
		for (int i=1; i<=5; i++ )
		{
			System.out.println("SOPHIA");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}

class Hi2 implements Runnable{
	
	public void run() {
	
		for (int i=1; i<=5; i++ )
		{
			System.out.println("ERIC");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}

class Hello2 implements Runnable{
	
	public void run() {
		
		for (int i=1; i<=5; i++ )
		{
			System.out.println("SOPHIA");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}


public class DemoThreading {

	public static void main(String[] args) {
		/* Example threading using Thread class
		Hi1 obj1 = new Hi1();
		Hello1 obj2 = new Hello1();
		
		obj1.start();
		// If we add delay between them, they have order in scheduler?
		//try{Thread.sleep(10);}catch(Exception e){}
		obj2.start();
		*/
		
		// Example threading using Runnable interface
		Hi2 obj1 = new Hi2();
		Hello2 obj2 = new Hello2();
		
		// There is no start() in Runnable interface
		//obj1.start();
		//obj2.start();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.setName("Hi2");
		System.out.println(t2.getName());
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.setPriority(3);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		//try{Thread.sleep(10);}catch(Exception e){}
		t2.start();
		
		try 
		{
			// Will pause thread main() until they finish
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{}
		
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");

	}
}
