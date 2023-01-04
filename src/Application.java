
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Applicatie is gestart");
		
		Product p = new Product();
		p.name = "TV";
		p.printName();
		
		Product p2 = new Product();
		p2.name = "Wasmachine";
		p2.storage = 12;
		int newStorage = p2.decreaseStorage(2);
		System.out.println("New storage = " + newStorage);
		
		Product p3 = new Product();
		Product p4 = new Product("PC");
		
		House n = new House();
		n.area = 64;
		n.city = "Ede";
		n.garden = false;
		n.price = 400000;
		n.rooms = 2;
		n.printCity();
		n.printPrice();
		n.printGarden();
		
		House n2 = new House();
		n2.area = 50;
		n2.city = "Amsterdam";
		n2.garden = true;
		n2.price = 350000;
		n2.rooms = 1;
		int newPrice = n2.increasePrice(45321);
		System.out.println("De nieuwe prijs is $" + newPrice);
		int newRooms = n2.addRooms(2);
		System.out.println("Dit huis heeft nu " + newRooms + " kamers.");
		
		House n3 = new House();
		House n4 = new House("Utrecht");
		House n5 = new House(250000);
		
	}

}
