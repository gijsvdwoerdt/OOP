
public class House {

	public int area;
	
	public int price;
	
	public int rooms;
	
	public boolean garden;
	
	public String city;
	
	public House() {
		System.out.println("In Constructor");
	}
	
	public House(String newCity) {
		city = newCity;
	}
	
	public House(int newPrice) {
		price = newPrice;
	}
	
	public void printCity() {
		System.out.println("Dit huis staat in " + city);
	}
	
	public void printPrice() {
		System.out.println("Dit huis kost $" + price);
	}
	
	public void printGarden() {
		System.out.println("Dit huis heeft een tuin: " + garden);
	}
	
	public int increasePrice(int increase) {
		price = price + increase;
		
		return price;
	}
	
	public int addRooms(int extraRooms) {
		rooms = rooms + extraRooms;
		
		return rooms;
	}
	
}
