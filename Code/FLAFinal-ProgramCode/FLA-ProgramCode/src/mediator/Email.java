package mediator;

import java.util.ArrayList;

import model.User;

public class Email {

	private ArrayList<User> users;

	public Email() {
		users = new ArrayList<>();
	}

	public void saveEmail(User user) {
		users.add(user);
	}

	public void sendEmail(User sender, User receiver, String content) {
		for (User user : users) {
			if (user == receiver && !user.equals(sender) && !user.getBlockedEmails().contains(sender)
					&& !sender.getBlockedEmails().contains(user)) {
				user.receiveEmail(content, sender);
			}
		}
	}

}
