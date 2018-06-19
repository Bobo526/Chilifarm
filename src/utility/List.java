package utility;

import chili.*;

public class List {
	
	Element first;
	
	public List() {
		
		first = new End();
	}
	
	public void addPlant(Chili c) {
		
		first.addNode(c);
	}
	
	public void removePlant(Chili c) {
		
		first = first.removeNode(c);
	}
	
	public String getListContent() {
		
		return first.getContentString();
	}
	
	public int getElementNumber () {
		
		return first.getCount();
	}
}