package dollar;

public class Model implements Bank {

	@Override
	public double rateOfDollar() {
		// TODO Auto-generated method stub
		return  balance * dollar;
	}

}
class HongKong extends Model {  
public double rateOfDollar(){
	return dollarRateHongKong * balance;
	}  
}
class beijing extends Model{  
public double rateOfDollar(){
	return dollarRateBeijing * balance;
	}  
} 

class london extends Model{  
public double rateOfDollar(){
	return dollarRateLondon * balance;
	}  
} 