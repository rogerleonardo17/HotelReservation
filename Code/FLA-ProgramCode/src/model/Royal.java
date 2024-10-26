package model;

public class Royal extends Room{

	public Royal(Integer roomNumber) {
		super(roomNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepareFacility() {
		System.out.println("This room consists of: ");
		System.out.println("- Private Jacuzzi");
		System.out.println("- Private Pool");
		System.out.println("- Free breakfast for 4");
		System.out.println("- Eligible to request menu (all day serve)");
	}



}
