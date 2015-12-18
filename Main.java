package myPack;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Cart<Computer> desk = new Cart<Computer>(new ArrayList<Computer>());
		desk.add(new Desktop(400, 1024, "Asus", "Asus", "NEC"));
		desk.add(new Laptop(200, 2048, "Acer", "AMD", "Bag"));
		desk.add(new Tablet(80, 512, "Samsung","Mali", "Stilus"));
		
		for(int i = 0; i<desk.list.size(); i++){
			System.out.println(desk.list.get(i));
		}
		
		System.out.println("---------------------------------------------------------------");
		
		desk.rem(desk);
		
		for(int i = 0; i<desk.list.size(); i++){
			System.out.println(desk.list.get(i));
		}
		
	}

}
