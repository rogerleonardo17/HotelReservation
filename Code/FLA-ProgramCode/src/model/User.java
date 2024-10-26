package model;

import java.util.ArrayList;

import mediator.Email;

public class User {

	private Email email;
	private String emailAddress;
	private ArrayList<User> blockedEmailAddresses;

	public User(Email email, String emailAddress) {
		super();
		this.email = email;
		this.emailAddress = emailAddress;
		this.blockedEmailAddresses = new ArrayList<>();
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void sendEmail(String content, User receiver) {
		email.sendEmail(this, receiver, content);
	}

	public void receiveEmail(String content, User sender) {
		System.out.println(emailAddress + " received email from " + sender.emailAddress + ": " + content);
	}
	
	public void blockedEmail(User user) {
		blockedEmailAddresses.add(user);
	}

	public ArrayList<User> getBlockedEmails() {
		return blockedEmailAddresses;
	}

}
