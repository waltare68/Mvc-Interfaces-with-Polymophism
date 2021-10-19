package dollar;

import javax.swing.JOptionPane;

public class Controller {
	 private Model model;
	 private View view;
	 
	 Model HK= new HongKong();//we use this to access the method of hongkong dollar rate
	 Model lN= new london();
	 Model beiJ= new beijing();
	 
	 public Controller(Model m,Model hk,Model ln, View v) {
		  model = m;
		  view = v;
		  initView();
		 }


	private void initView() {
		// TODO Auto-generated method stub
		
		//view.getBeijingButton().setText(model.getFirstname());
		 // view.getHongKongButton().setText(model.getLastname());
		
	}
	public void initController() {
		  view.getBeijingButton().addActionListener(e -> displayBeijing());
		  view.getHongKongButton().addActionListener(e -> displayHongKong());
		  view.getLondonButton().addActionListener(e -> displayLondon());
		  view.getExit().addActionListener(e -> ExitApp());
		 }


	private void ExitApp() {
		// TODO Auto-generated method stub	
		System.exit(0);
	
	}


	private void displayLondon() {
		// TODO Auto-generated method stub
		//double answer= model.rateOfDollar();
		JOptionPane.showMessageDialog(null, " your balance is : " + lN.rateOfDollar(), "Info", JOptionPane.INFORMATION_MESSAGE);
	}


	private void displayHongKong() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " your balance is : " + HK.rateOfDollar(), "Info", JOptionPane.INFORMATION_MESSAGE);
	}


	private void displayBeijing() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " your balance is : " + beiJ.rateOfDollar(), "Info", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
