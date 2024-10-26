package state;

import model.Receptionist;

public class EndState extends State{

	public EndState(Receptionist receptionist) {
		super(receptionist);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		System.out.println(this.receptionist.getId() + " - " + this.receptionist.getName() + " gives the key card to the customer");
		this.receptionist.setState(new BookingState(this.receptionist));
	}

	
}
