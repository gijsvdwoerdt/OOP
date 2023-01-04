
public class Product {

	private String name;
	
	private boolean soldOut; // default = false
	
	private int storage; // default = 0
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; // this. omdat argument name hetzelfde is als een property name
	}
	
	public boolean isSoldOut() {
		return soldOut;
	}

	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public Product() {
		System.out.println("In constructor");
		
		name = "";
		soldOut = false;
		storage = 0;
	}
	
	public Product(String newName) {
		name = newName;
	}
	
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public int decreaseStorage(int decrease) {
		storage = storage - decrease;
		
		return storage;
	}

}
