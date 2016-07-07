package X.Formation.task;

import java.util.HashSet;
import java.util.Set;

public class PolishCuisine implements Cuisine {

	    private Set<Item> items=new HashSet<Item>();

		@Override
		public Set<Item> getMenu() {
		
			return items;
			
		}
		
		public float getCost(){  
	          
	        float cost=0.0f;  
	            for (Item item : items) {  
	                cost+=item.getPrice();  
	             }  
	        return cost;  
	    }

		@Override
		public void addItem(Item item) {
	        items.add(item);  
		}

		@Override
		public void deleteAllItem() {
			items.clear();
		} 

}
