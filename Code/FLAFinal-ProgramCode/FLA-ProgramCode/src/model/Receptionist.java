package model;

import state.BookingState;
import state.State;

public class Receptionist {

	private String id;
	private String name;
	private State state;

	public Receptionist(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.state = new BookingState(this);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void checkInProcess() {
		do {
			this.state.changeState();
		} while (this.state instanceof BookingState == false);
	}

}
