import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ATMGUI {
	
ATMGUI() {
	
	JFrame f1 = new JFrame("ATM GUI");
	f1.setSize(500, 500);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = f1.getContentPane();

	c.setLayout(new BorderLayout());

	
	 JPanel p1 = new JPanel();
	
 Icon SBIsymbol = new ImageIcon(getClass().getResource( "download.gif" ));
    

	
	 c.add(p1, BorderLayout.NORTH);
	 JLabel header=new JLabel (SBIsymbol,SwingConstants.CENTER);
	
		
		p1.add(header);
	Label footer=new Label (" ThankYou for using the ATM");
	
	footer.setAlignment(Label.CENTER);
	
	
	c.add(footer,BorderLayout.SOUTH);
	p1.setBackground(Color.BLUE);
	 
 String p="Enter your password";

   TextArea ta1=new TextArea(p);
   ta1.setBackground(Color.yellow);
   c.add ( ta1,BorderLayout.CENTER);
   JButton jibz=new JButton("Fast WithDrawal");
   JButton jibz1=new JButton("Withdrawal");
   JButton jibz2=new JButton("Deposit");
   JButton jibz3=new JButton("checkbalance");
   JButton jibz4=new JButton("PinChange");
   JButton jibz5=new JButton("Transfer");
   JPanel l = new JPanel();
   l.add(jibz);
   l.add(jibz1);
   l.add(jibz2);
   l.setBackground(Color.blue);
   jibz.setBackground(Color.cyan);
   jibz1.setBackground(Color.cyan);
   jibz2.setBackground(Color.cyan);
   jibz3.setBackground(Color.cyan);
   jibz4.setBackground(Color.cyan);
   jibz5.setBackground(Color.cyan);
   c.add(l, BorderLayout.EAST);
   JPanel j = new JPanel();
   j.add(jibz3);
   j.add(jibz4);
   j.add(jibz5);
   j.setBackground(Color.blue);
   c.add(j, BorderLayout.WEST);
   l.setLayout (new GridLayout(3, 1,  10, 20 ));
   j.setLayout (new GridLayout(3, 1,  10, 20 ));
   
   
   
   

   JMenuBar mb = new JMenuBar();  	
   JMenu fileMenu = new JMenu ("File");
   mb.add( fileMenu );
   f1.setJMenuBar(mb);
   f1.setVisible(true);
   fileMenu.setMnemonic( KeyEvent.VK_F ); 
   JMenuItem help = new JMenuItem( "Help", KeyEvent.VK_H );
   fileMenu.add( help ); 

   
}

public static void main(String args[]){
	SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			new ATMGUI();
		}});
		
	}	
		}
