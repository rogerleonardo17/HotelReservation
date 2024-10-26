package main;

import java.util.ArrayList;
import java.util.Scanner;
import iterator.FIFO;
import iterator.LIFO;
import mediator.Email;
import model.Family;
import model.File;
import model.Receptionist;
import model.Reguler;
import model.Reservation;
import model.Room;
import model.Royal;
import model.User;
import proxy.FileGeneratorProxy;
import singleton.ReservationData;

public class Main {

	private Scanner scan;

	public Main() {
		
//		//design pattern extra: singleton
//		ReservationData rd = ReservationData.getReservationData();
		
//		//Keterangan: Insert new reservation
//		String room = null;
//		Reservation re = (Reservation) new Reservation("RV001", "Sakura", "Reguler", 1000000);

//		//1. iterator
//		ArrayList<String> reservationId = new ArrayList<>();
//
//		reservationId.add("RV002");
//		reservationId.add("RV028");
//		reservationId.add("RV017");
//		reservationId.add("RV078");
//		
//		System.out.println("\nFIFO");
//		iterateFIFO(reservationId);
//		System.out.println("");
//		System.out.println("\nLIFO");
//		iterateLIFO(reservationId);
		
//		//2. state
//		Receptionist receptionist = new Receptionist("RE008", "Shen Xiao Ting");
//		
//		receptionist.checkInProcess();

//		//3. template method
//		Royal royal = new Royal(602);
//		royal.prepareRoom();
//		
//		System.out.println("");
//		
//		Family family = new Family(402);
//		family.prepareRoom();
//		
//		System.out.println("");
//		
//		Reguler reguler = new Reguler(202);
//		reguler.prepareRoom();
		
//		//4. Proxy (Virtual Proxy)
//		FileGeneratorProxy gen = new FileGeneratorProxy();
//		gen.generate(new File("[RESERVATION CANCELLATION] - BO002.pdf"));
//		gen.generate(new File("[RESERVATION UPGRADE] - BO028.pdf"));
		
//		//5. Mediator
//		Email email = new Email();
//		User somi, sana, jisoo, hotelAdmin;
//		
//		somi = new User(email,"somi@mail.com");
//		jisoo = new User(email,"jisoo@mail.com");
//		sana = new User(email, "sana@mail.com");
//		hotelAdmin = new User(email,"admin@hotelindahberseri.ac.id");
//		
//		email.saveEmail(somi);
//		email.saveEmail(jisoo);
//		email.saveEmail(sana);
//		email.saveEmail(hotelAdmin);
//		
//		//email somi diblock oleh hotelAdmin sehingga ketika hotelAdmin mengirim email kepada somi, email tersebut tidak dapat terkirim
//		hotelAdmin.blockedEmail(somi);
//		hotelAdmin.sendEmail("\nDear customer, here is your attached reservation cancellation file", somi);
//		
//		//email hotelAdmin diblock oleh jisoo sehingga jisoo tidak dapat menerima email dari hotelAdmin
//		jisoo.blockedEmail(hotelAdmin);
//		hotelAdmin.sendEmail("\nDear customer, here is your attached reservation upgrade file", jisoo);
//		
//		hotelAdmin.sendEmail("\nDear customer, here is your attached reservation upgrade file", sana);
	}

	private <T> void iterateFIFO(ArrayList<T> list) {
		// TODO Auto-generated method stub
		FIFO<T> fifo = new FIFO<>(list);
		if (list.isEmpty()) {
			System.out.println("belum ada reservasi");
			scan.nextLine();
		}
		
		while (fifo.hasNext()) {
			System.out.println(fifo.getNext());
		}

	}
	
	private <T> void iterateLIFO(ArrayList<T> list) {
		// TODO Auto-generated method stub
		LIFO<T> lifo = new LIFO<>(list);
		if (list.isEmpty()) {
			System.out.println("belum ada reservasi");
			scan.nextLine();
		}
	
		while (lifo.hasNext()) {
			System.out.println(lifo.getNext());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
