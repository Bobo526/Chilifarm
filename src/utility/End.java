package utility;

import chili.Chili;

public class End extends Element {
	
	public End() {
		
	}

	public Node addNode(Chili c) {
		
		Node n = new Node(c, this);
		
		return n;
	}
	
	public Element removeNode(Chili c) {
		
		return this;
	}
	
	public String getContentString() {
		
		return null;
	}
	
	public int getCount() {
		
		return 0;
	}
	
	public Chili getChili(String n){
		System.err.println("Die Chili wurde nicht in der LIste gefunden!");
		return null;
	}
}