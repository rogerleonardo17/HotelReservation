package model;

public class Reservation {

	private String reservationId;
	private String name;
	private String roomType;
	private Integer price;

	public Reservation(String reservationId, String name, String roomType, Integer price) {
		super();
		this.reservationId = reservationId;
		this.name = name;
		this.roomType = roomType;
		this.price = price;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
