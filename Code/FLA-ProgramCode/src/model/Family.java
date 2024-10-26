package model;

public class Family extends Room {

	public Family(Integer roomNumber) {
		super(roomNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepareFacility() {
		System.out.println("This room consists of: ");
		System.out.println("- Private Jacuzzi");
		System.out.println("- Free breakfast for 3");
		System.out.println("- Eligible to request menu (dinner only)");
	}

}
