import javax.swing.*;
public class SimpleSwing {

	SimpleSwing(){
	JFrame f1 = new JFrame("A Simple SWing");
	f1.setSize(275, 100);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel jibz = new JLabel (" medium pace Swing");
	f1.add(jibz);
	f1.setVisible(true);
	}
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new SimpleSwing();
			}});
			
		}	
			
		
	}
	
	

