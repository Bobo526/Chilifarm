package utility;

import chili.*;

public class Node extends Element {
	
	Chili content;
	Element next;
	
	public Node(Chili c, Element n) {
		
		content = c;
		next = n;
	}
	
	public Node addNode(Chili c) {
		
		next = next.addNode(c);
		
		return this;
	}
	
	public Element removeNode(Chili c) {
		
		if (this.content.getPlantName().compareToIgnoreCase(c.getPlantName()) == 0) {
			
			return next;
		}
		
		else {
			
			next = next.removeNode(c);
			
			return this;
		}
	}
	
	public String getContentString() {
		
		return " " + this.content.getPlantName();
	}
	
	public int getCount() {
		
		return 1 + next.getCount();
	}
	
	public Chili getChili(String n){
		if (content.getPlantName().equalsIgnoreCase(n)){
			return content;
		}
		else{
			return next.getChili(n);
		}
	}
}