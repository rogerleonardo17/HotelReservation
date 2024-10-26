package state;

import model.Receptionist;

public class BookingState extends State {

	public BookingState(Receptionist receptionist) {
		super(receptionist);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		System.out.println(this.receptionist.getId() + " - " + this.receptionist.getName() + " is checking customer booking ID");
		this.receptionist.setState(new PaymentState(this.receptionist));
	}

}
