package jswing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DigDa extends JFrame implements ActionListener{
	ImageIcon i20= new ImageIcon("Images/200.jpg");
	JButton j1[] = new JButton[12];
	JButton start = new JButton("시작");
	JButton end = new JButton ("종료");
	JLabel l1 = new JLabel("점수 : 0 ");
	JLabel time1 = new JLabel ("시간 >> 0:10");
	BorderLayout bl = new BorderLayout(20,20);
	JPanel p1 = new JPanel();
	GridLayout g1 = new GridLayout(3,4);
	JPanel p2 = new JPanel();
	GridLayout g2 = new GridLayout(1,2);
	JPanel p3 = new JPanel();
	FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT);
	int random = 0;
	int count = 10;
	
	public DigDa() {
		super("두더지게임");
		hard();
		start();
		setSize(400,300);
		int x = (int)(super.getWidth()/2-super.getWidth()/2);
		int y = (int)(super.getHeight()/2-super.getHeight()/2);
		setLocation(x, y);
		setResizable(false);
		setVisible(true);
	}
	
	public void hard() {
		Container c = getContentPane();
		c.setLayout(bl);
		c.add("North", time1);
		c.add("Center", p1);
		p1.setLayout(g1);
		for(int i=0; i<12; ++i) {
			j1[i]=new JButton();
			p1.add(j1[i]);
		}
		off_button();
		c.add("South", p2);
		p2.setLayout(g2);
		p2.add(p3);
		p3.setLayout(f1);
		p3.add(start);
		p3.add(end);
	}
	
	public void start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==start) {
					l1.setText("점수 : 50");
					for(; count>=0; count--) {
						try {
							time1.setText("시간 >> " + count);
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
					on_button();
					random(0);
				}
			}});
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==end) {
					System.exit(0);
				}
			}});
		for(int i=0; i<12; i++) {
			j1[i].addActionListener(this);
		}
	}//start
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start) {
			time1.setText("시간 >> 0:10");
			l1.setText("점수 : 0");
			count=-1;
			Thread th = new Thread();
			th.start();
			on_button();
			random(0);
		}else if(e.getSource()==end) {
			System.exit(0);
		}
		for(int i =0; i<12; i++) {
			if(e.getSource()==j1[i]) {
				random(i);
			}
		}
	}//action
	public void on_button() {
		for (int i=0; i<12; i++) {
			j1[i].setEnabled(true);
		}
	}//on_button
	public void off_button() {
		for (int i=0; i<12; i++) {
			j1[i].setEnabled(false);
		}
	}//off_button
	public void random(int i) {
		if (i!=random) return;
		count++;
		j1[random].setIcon(null);
		random = (int)(Math.random()*12);
		j1[random].setIcon(i20);
		l1.setText("점수 : " +count);
	}//random
	
	public void run() {
		int time =10;
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			for(int i=0; i<=9; i++) {
				time--;
			}
			if(time==0) {
				time1.setText("게임이 끝났습니다 .");
				off_button();
				break;
			}
			time1.setText("시간 >> 0 : 0" + time);
			
		}
	}//run
	
	public static void main(String[] args) {
		new DigDa();
	}
	
}
