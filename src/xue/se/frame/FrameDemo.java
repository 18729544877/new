package xue.se.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameDemo extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FrameDemo(){
		setLayout(new BorderLayout(5,5)); 

	     setFont(new Font("Helvetica", Font.PLAIN, 14));

	     getContentPane().add("North", new JButton("North"));     //将按钮添加到窗口中

	     getContentPane().add("South", new JButton("South"));

	     getContentPane().add("East",  new JButton("East"));

	     getContentPane().add("West",  new JButton("West"));

	    // getContentPane().add("Center",new JButton("Center"));

	  }  
	public static void main(String[] args) {
		FrameDemo demo = new FrameDemo();
		
		Component component =  new JPanel();
		component.setName("new wall");
		component.setBounds(0, 0, 100, 80);
		component.setVisible(true);
		component.setName("ninnn");
		component.isVisible();
		component.setBackground(Color.BLUE);
		demo.add(component);
		
		/**
		 * 上面的组件可以替换构造方法里面的center部分
		 */
		demo.setVisible(true);
		//demo.pack();
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close 
		demo.setBounds(0, 0, 400, 200);
	    demo.setLocationRelativeTo(null);   
	}
}
