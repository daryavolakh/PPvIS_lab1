import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {
	    public void run() {
	    	 First frame1 = new First();
		     try {
		         Thread.sleep(1000); 
		         frame1.Close();
		       } catch (Exception ex) {}
		    // frame1.Close();
		     Second frame2 = new Second();
		     try {
		         Thread.sleep(1000); 
		         frame2.Close();
		       } catch (Exception ex) {}
		     Third frame3 = new Third();
		     try {
		         Thread.sleep(1000); 
		         frame3.Close();
		       } catch (Exception ex) {}
		     Fourth frame4 = new Fourth();
		     try {
		         Thread.sleep(1000);
		         frame4.Close();
		       } catch (Exception ex) {}
		     Fifth frame5 = new Fifth();
		     try {
		         Thread.sleep(1000);
		         frame5.Close();
		       } catch (Exception ex) {}
		     
	    }
	}
