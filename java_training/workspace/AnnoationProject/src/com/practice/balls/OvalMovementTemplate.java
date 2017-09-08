package com.practice.balls;

import java.awt.*;
import java.awt.event.*;
import java.io.Console;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@SuppressWarnings("serial")
public class OvalMovementTemplate extends Frame implements Runnable{

	int y1 = 400, y2 = 400, y3 = 400;
	int flag1=1,flag2=1,flag3=1;
	volatile boolean balls=false;
	volatile boolean bottomballs=false;
	Thread t1,t2,t3;
	
	public OvalMovementTemplate() {
		super("Oval Game");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		t1=new Thread(this);
		t1.setName("redball");
		t1.start();
		t2=new Thread(this);
		t2.setName("greenball");
		t2.start();
		t3=new Thread(this);
		t3.setName("blueball");
		
		t3.start();
		
	}
	
	
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}
	
	public void run()
	{
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("redball"))
		{
			for(;;)
			{
			   
			    if(flag1==1)
			    	y1=y1-10;
			    if(y1==0)
			    {
			    	flag1=0;
			    	ballStop();
			    }
			    if(flag1==0)
			    	y1=y1+10;
			    if(y1==400)
			    {
			    	flag1=1;
			    	ballStopBottom();
			    }
			    
				
				try
				{
					Thread.sleep(50);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				super.repaint();
			}
		}
		else if(currentThread.getName().equals("greenball"))
		{
			for(;;)
			{
				if(flag2==1)
			    	y2=y2-10;
			    if(y2==0)
			    {
			    	flag2=0;
			    	ballStop();
			    }
			    if(flag2==0)
			    	y2=y2+10;
			    if(y2==400)
			    {
			    	flag2=1;
			    	ballStopBottom();
			    }
				
				try
				{
					Thread.sleep(75);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				super.repaint();
			}
		}
		
		else if(currentThread.getName().equals("blueball"))
		{
			for(;;)
			{
				if(flag3==1)
			    	y3=y3-10;
			    if(y3==0)
			    {
			    	flag3=0;
			    	balls=true;
			    	ballStop();
			    }
			    if(flag3==0)
			    	y3=y3+10;
			    if(y3==400)
			    {
			    	flag3=1;
			    	bottomballs=true;
			    	ballStopBottom();
			    }
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				super.repaint();
			}
		}
	}
	
	ReentrantLock lock = new ReentrantLock();
	Condition cond=lock.newCondition();
	public void ballStopBottom()
	{
		lock.lock(); 
		try {
			
			if(!bottomballs)
				cond.await();
			if(bottomballs)
			{
				bottomballs=false;
				cond.signalAll();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			lock.unlock();
			}

	}
	
	
	public void ballStop()
	{
		lock.lock(); 
		try {
			
			if(!balls)
				cond.await();
			if(balls)
			{
				balls=false;
				cond.signalAll();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			lock.unlock();
			}
	}
	
	public static void main(String args[]) {
		Frame om = new OvalMovementTemplate();
		om.setSize(600, 600);
		om.setBackground(Color.CYAN);
		om.setVisible(true);
	}
}