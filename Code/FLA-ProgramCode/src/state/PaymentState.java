package state;

import model.Receptionist;

public class PaymentState extends State {

	public PaymentState(Receptionist receptionist) {
		super(receptionist);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		System.out.println(this.receptionist.getId() + " - " + this.receptionist.getName() + " is checking customer booking payment");
		this.receptionist.setState(new CheckInState(this.receptionist));
	}

}
