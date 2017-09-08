package com.practice.multithreading;

class PingPongMain implements Runnable
{
	Thread t1,t2,t3;
	 
	public PingPongMain()
	{
		t1=new Thread(this);
		t1.setName("PING");
		t1.start();
		t2=new Thread(this);
		t2.setName("PONG");
		t2.start();
		t3=new Thread(this);
		t3.setName("TONG");
		t3.setDaemon(true);
		t3.start();
	}
	
	@Override
	public void run()
	{
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("PING"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("PING");
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		else if(currentThread.getName().equals("PONG"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("PONG");
				try
				{
					Thread.sleep(800);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		
		else if(currentThread.getName().equals("TONG"))
		{
			for(;;)
			{
				System.out.println("TONG");
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		
		}
	}


public class TestMultithread {

	public static void main(String[] args) {
		
		new PingPongMain();
	}

}
