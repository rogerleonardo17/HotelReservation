package state;

import model.Receptionist;

public class CheckInState extends State {

	public CheckInState(Receptionist receptionist) {
		super(receptionist);
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		System.out.println(
				this.receptionist.getId() + " - " + this.receptionist.getName() + " is processing customer check-in");
		this.receptionist.setState(new EndState(this.receptionist));
	}

}
