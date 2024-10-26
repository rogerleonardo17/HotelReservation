package model;

public class Reguler extends Room {

	public Reguler(Integer roomNumber) {
		super(roomNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepareFacility() {
		// TODO Auto-generated method stub
		System.out.println("This room consists of: ");
		System.out.println("- Mini Fridge inside Bedroom");
		System.out.println("- Free breakfast for 2");
	}

}
