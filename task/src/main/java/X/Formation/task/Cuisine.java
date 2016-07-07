package X.Formation.task;

import java.util.Set;

public interface Cuisine {

	Set<Item> getMenu();
	void addItem(Item item);
	void deleteAllItem();
	
}
