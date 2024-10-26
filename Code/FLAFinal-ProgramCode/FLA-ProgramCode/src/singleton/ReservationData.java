package singleton;

import java.util.ArrayList;

import model.Reservation;

public class ReservationData {
	
	private ArrayList<Reservation> rvList;
	private static ReservationData rd;

	public ReservationData() {
		rvList = new ArrayList<>();
	}
	
	public static ReservationData getReservationData() {

		if (rd == null) {
			rd = new ReservationData();
		}

		return rd;
	}

	public ArrayList<Reservation> getRvList() {
		return rvList;
	}

	public void addReservation(Reservation rv) {
		rvList.add(rv);
	}

}
