import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

public class DopTask {	
	public DopTask() {
        Timer timer = new Timer();
        timer.schedule(new MyTask(), 0);        
    }
}

