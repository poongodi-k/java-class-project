package generic;

public class Pen <E> extends Necessaries implements StationaryItems{
	E e;
	
	
	
	

	public void getAllItems() {
		System.out.println("Pen Item");
		
	}

	public void printDetail() {
		System.out.println("This is a Pen");
	}
	
}
