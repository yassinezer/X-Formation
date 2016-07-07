package X.Formation.task;

public class Pepsi extends Drink {

	
	Pepsi(String iceCubes, String Lemon) {
		super(iceCubes, Lemon);
	}

	@Override
	public String getName() {
		return "Pepsi";
	}

	@Override
	public float getPrice() {
		if(iceCubes=="iceCubes" && Lemon == "Lemon")
		return 32.5f;
		else if(iceCubes=="iceCubes" || Lemon == "Lemon")
			return 31.5f;
		return 30.5f;
		
	}  
     
    
     
      
} 