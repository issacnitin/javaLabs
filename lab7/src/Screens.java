import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Screens {

	BankAccount ba1 = new BankAccount(3225, "Nitin");

	public void screen1() {
		final JFrame frame = new JFrame("Screen_1");
		frame.setSize(350, 170);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final Container c = frame.getContentPane();
		BoxLayout layout = new BoxLayout(c, 1);
		c.setLayout(layout);
		final JTextField text1 = new JTextField();
		final JPasswordField pass1 = new JPasswordField();
		JButton submit = new JButton("Submit");
		final JLabel username = new JLabel("Username");
		final JLabel password = new JLabel("Password");
		final JLabel tryagain = new JLabel("Submit Now");
		c.add(username);
		c.add(text1);
		c.add(password);
		c.add(pass1);
		c.add(submit);
		c.add(tryagain);
		submit.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (text1.getText().equals("user123")
						&& pass1.getText().equals("pass123")) {
					screen2();
					frame.dispose();
				} else
					tryagain.setText("Try Again");

			}

		});
		frame.setVisible(true);
	}

	public void screen2() {
		final JFrame frame = new JFrame("Screen_2");
		frame.setSize(300, 175);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2, 2));
		c.add(p1, BorderLayout.CENTER);
		JButton withdrawal = new JButton("Withdrawal");
		JButton transfer = new JButton("Transfer");
		JButton showbalance = new JButton("Show Balance");
		JButton quickwithdraw = new JButton("Quick Withdraw");
		JButton help = new JButton("Help");
		help.setSize(175, 100);
		p1.add(withdrawal);
		p1.add(transfer);
		p1.add(showbalance);
		p1.add(quickwithdraw);
		c.add(help, BorderLayout.SOUTH);

		withdrawal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				screen3();
				frame.dispose();
			}

		});

		help.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				screen4();
				frame.dispose();
			}

		});
		frame.setVisible(true);
	}

	public void screen3() {
		final JFrame frame = new JFrame("Screen_3");
		frame.setSize(300, 120);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		BoxLayout layout = new BoxLayout(c, BoxLayout.Y_AXIS);
		c.setLayout(layout);
		JLabel balance = new JLabel("Balance: ");

		final JTextField amtWithdraw = new JTextField();

		JButton submit = new JButton("Submit");
		JButton goback = new JButton("Go Back");
		final JLabel label2 = new JLabel("Withdrawal Pending");

		c.add(balance);
		c.add(amtWithdraw);
		JPanel p1 = new JPanel(new GridLayout(1, 2));
		p1.add(submit);
		p1.add(goback);
		c.add(p1);
		c.add(label2);

		goback.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				screen2();
				frame.dispose();
			}

		});
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (ba1.balance > Integer.valueOf(amtWithdraw.getText())) {
					ba1.balance = ba1.balance
							- Integer.valueOf(amtWithdraw.getText());
					label2.setText("Withdrawal Successful: "
							+ Integer.valueOf(amtWithdraw.getText()));
					amtWithdraw.setText("");
				} else
					label2.setText("Withdrawal Failure");
			}

		});

		frame.setVisible(true);
	}

	public void screen4() {
		final JFrame frame = new JFrame("Screen_3");
		frame.setSize(300, 175);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2, 2));
		c.add(p1, BorderLayout.CENTER);
		JButton withdrawal = new JButton("Withdrawal Help");
		JButton transfer = new JButton("Transfer Help");
		JButton showbalance = new JButton("Show Balance Help");
		JButton quickwithdraw = new JButton("Quick Withdrawal Help");
		JButton help = new JButton("Exit Help");

		
		withdrawal.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				screen5();
				frame.dispose();
			}
			
		});
		JPanel p2 = new JPanel();
		p2.add(help);

		p1.add(withdrawal);
		p1.add(transfer);
		p1.add(showbalance);
		p1.add(quickwithdraw);
		c.add(p2, BorderLayout.SOUTH);
		frame.setVisible(true);
	}

	public void screen5() {
		final JFrame frame = new JFrame();
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();

		c.setLayout(new BorderLayout());
		final JTextArea area1 = new JTextArea("");
		area1.setEditable(false);
		JMenuBar menubar = new JMenuBar();
		JMenu topic1 = new JMenu("Help");
		JMenu topic2 = new JMenu("Help2");
		JMenu file = new JMenu("File");
		JMenuItem Goback = new JMenuItem("Go Back");
		JMenuItem howtowithdraw = new JMenuItem("How to withdraw");
		JMenuItem howtoexit = new JMenuItem("How to Exit");
		c.add(area1, BorderLayout.CENTER);
		file.add(Goback);
		menubar.add(file);
		menubar.add(topic1);
		menubar.add(topic2);
		final String howtoedit = "How to edit \n\n\n Data on how to edit balh blah";
		final String howtoexits ="How to exit \n\n\n Data on how to exit blahg blah";
		
		
		Goback.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				screen4();
				frame.dispose();
			}
			
		});
		
		howtowithdraw.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				area1.setText(howtoedit);
			}
			
		});
		
		howtoexit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				area1.setText(howtoexits);
			}
			
		});
		
		topic1.add(howtowithdraw);
		topic1.add(howtoexit);
		frame.setJMenuBar(menubar);
		frame.setVisible(true);
	}
}
