package dollar;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  // Assemble all the pieces of the MVC
		Model m = new Model();
		Model HK= new HongKong();//we use this to access the method of hongkong dollar rate
		 Model lN= new london();
		 Model beiJ= new beijing();
		View v = new View("Display Balance In Different Cities");
		Controller c = new Controller(m,HK,lN, v);
		c.initController();

	}

}
