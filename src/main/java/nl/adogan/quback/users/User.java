package nl.adogan.quback.users;

import java.util.List;

import nl.adogan.quback.activity.Taken;

public class User {
	
	private boolean activated, blocked;
	private String username;
	private List<Taken> takenQuizes;
	
	public List<Taken> getTakenQuizes() {
		return takenQuizes;
	}
	public void setTakenQuizes(List<Taken> takenQuizes) {
		this.takenQuizes = takenQuizes;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

}
