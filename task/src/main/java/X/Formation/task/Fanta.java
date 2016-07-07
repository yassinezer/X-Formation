package X.Formation.task;

public class Fanta extends Drink {
	
	Fanta(String iceCubes, String Lemon) {
		super(iceCubes, Lemon);
	}

	@Override
	public String getName() {
		return "Fanta";
	}

	@Override
	public float getPrice() {
		if(iceCubes=="icecubes" && Lemon == "lemon")
		return 32.5f;
		else if(iceCubes=="icecubes" || Lemon == "lemon")
			return 31.5f;
		return 30.5f;
		
	}  
    
} 