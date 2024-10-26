package model;

public abstract class Room {

	Integer roomNumber;

	public Room(Integer roomNumber) {
		super();
		this.roomNumber = roomNumber;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	// template method

	public void cleanRoom() {
		System.out.println("The housekeeper is cleaning room " + this.roomNumber);
	}

	public void addStuff() {
		System.out.println(
				"The housekeeper supplies room " + this.roomNumber + " with soap, shampoo, and other toiletries");
	}

	public abstract void prepareFacility();

	public void prepareRoom() {
		prepareFacility();
		cleanRoom();
		addStuff();
	}

}
