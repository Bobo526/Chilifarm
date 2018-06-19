package utility;

import chili.*;

public abstract class Element {
	
	public abstract Node addNode(Chili c);
	public abstract Element removeNode(Chili c);
	
	public abstract String getContentString();
	
	public abstract int getCount();
	
	public abstract Chili getChili(String n);
}