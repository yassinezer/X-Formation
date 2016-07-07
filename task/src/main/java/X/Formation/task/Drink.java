package X.Formation.task;

public abstract class Drink implements Item {
	String iceCubes;
	String Lemon;
	
	Drink(String iceCubes, String Lemon){
		this.iceCubes=iceCubes;
		this.Lemon=Lemon;
	}

	@Override
	public abstract String getName() ;

	@Override
	public abstract float getPrice() ;

	
}
