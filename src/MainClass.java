import java.awt.*; //��������� * ���������� ��� ���������� ������ �����������
import javax.swing.*;
import java.awt.event.*;


public class MainClass
{
	public static void main(String args[])
	{
		First frame1 = new First();
		Second frame2 = new Second();
		Third frame3 = new Third();
		Fourth frame4 = new Fourth();
		Fifth frame5 = new Fifth();
		
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��������� ��������, ������� ����� ����������� ��� �������� ����.
		frame1.setVisible(true); //������ ���� �������	
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��������� ��������, ������� ����� ����������� ��� �������� ����.
		frame2.setVisible(true);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��������� ��������, ������� ����� ����������� ��� �������� ����.
		frame3.setVisible(true);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��������� ��������, ������� ����� ����������� ��� �������� ����.
		frame4.setVisible(true);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��������� ��������, ������� ����� ����������� ��� �������� ����.
		frame5.setVisible(true);
	}
}

