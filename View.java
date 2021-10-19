package dollar;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Container;  
import static javax.swing.GroupLayout.Alignment.*;  

public class View {
	 private JFrame frame;
	 
	 private JLabel AppLabel,lastnameLabel;
	 private JButton HongKong;
	 private JButton Beijing;
	 private JButton London;
	 private JButton Exit;
	 private JTextField firstnameTextfield;
	 private JTextField lastnameTextfield;
	 
	 
	 public View(String title) {
		  frame = new JFrame(title);
		  frame.getContentPane().setLayout(new BorderLayout());
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(500, 700);
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);
	//adding the elements to ui
		  
		  
		  AppLabel = new JLabel("This app prints dollar rate in different cities");
		 
		  HongKong = new JButton("HongKong");
		  Beijing = new JButton("Beijing");
		  London= new JButton("London");
		  Exit = new JButton("Exit");
		  
		  //lets add these to the frame
		  
		// Add UI element to frame
		  GroupLayout layout = new GroupLayout(frame.getContentPane());
		  layout.setAutoCreateGaps(true);
		  layout.setAutoCreateContainerGaps(true);
		  
		  layout.setHorizontalGroup(layout.createSequentialGroup()
			         
			         .addGroup(layout.createSequentialGroup()
			         .addGroup(layout.createParallelGroup(
			         GroupLayout.Alignment.LEADING)
			        .addComponent(AppLabel)
			         .addComponent(HongKong)
			         .addComponent(Beijing)
			         .addComponent(London))));
			   
			      layout.setVerticalGroup(layout.createSequentialGroup()
			    		 .addComponent(AppLabel)
				         .addComponent(HongKong)
				         .addComponent(Beijing)
				         .addComponent(London));
	  
			      frame.getContentPane().setLayout(layout);
		  
	 }
	 public JFrame getFrame() {
		  return frame;
		 }
	 public void setFrame(JFrame frame) {
		  this.frame = frame;
		 }
	 public JLabel getAppLabel() {
		  return AppLabel;
		 }
	public void setAppLabel(JLabel AppLabel) {
		  this.AppLabel = AppLabel;
		 }
	 public JButton getBeijingButton() {
		  return Beijing;
		 }
	 public void setBeijingButton(JButton Beijing) {
		  this.Beijing = Beijing;
		 }
	 public JButton getHongKongButton() {
		  return HongKong;
		 }
	 public void setHongKongButton(JButton HongKong) {
		  this.HongKong = HongKong;
		 }
	 public JButton getLondonButton() {
		  return London;
		 }
	 public void setLondonButton(JButton London) {
		  this.London = London;
		 }
	 public JButton getExit() {
		  return Exit;
		 }
	 public void setExit(JButton Exit) {
		  this.Exit = Exit;
		 }
	 
	 

}
