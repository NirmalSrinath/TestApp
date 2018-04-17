package com.app.thread;

import java.util.UUID;

class GFG
{
    public static void main(String[] args)
    {
        // Object of Line class that is shared
        // among the threads.
        Line obj = new Line();
 
        // creating the threads that are
        // sharing the same Object.
        Train train1 = new Train(obj);
        Train train2 = new Train(obj);
        Train train3 = new Train(obj);
        Train train4 = new Train(obj);
        Train train5 = new Train(obj);
        Train train6 = new Train(obj);
        Train train7 = new Train(obj);
        Train train8 = new Train(obj);
        Train train9 = new Train(obj);
        Train train0 = new Train(obj);
 
        // threads start their execution.
        for(int i = 0; i<1;i++){
        	train1.start();
        	train2.start();
        	train3.start();
        	train4.start();
        	train5.start();
        	train6.start();
        	train7.start();
        	train8.start();
        	train9.start();
        	train0.start();
        }
        
    }
}
class Line
{
    // if multiple threads(trains) will try to
    // access this unsynchronized method,
    // they all will get it. So there is chance
    // that Object's  state will be corrupted.
    public void getLine()
    {
        /*for (int i = 0; i < 10; i++)
        {*/
        	UUID uuid = UUID.randomUUID();
           
            try
            {
            	 System.out.println(uuid);
                Thread.sleep(10);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        //}
    }
}
 
class Train extends Thread
{
    // reference to Line's Object.
    Line line;
 
    Train(Line line)
    {
        this.line = line;
    }
 
    @Override
    public void run()
    {
        line.getLine();
    }
}