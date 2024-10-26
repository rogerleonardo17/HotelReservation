package state;

import model.Receptionist;

public abstract class State {

	Receptionist receptionist;

	public State(Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	public abstract void changeState();

}
