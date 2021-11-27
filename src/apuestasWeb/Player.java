package apuestasWeb;

import java.util.List;
import java.util.Objects;

import apuestasWeb.collections.Gender;

public class Player extends Person{
	private int id;
	private String nick;
	private String position;
	
	public Player(Person person,String nick, String position) {
		super(person.getId(),person.getDni(),person.getName(),person.getSurnames(),person.getTelephone(),person.getAge(),person.getGender());
		this.id = person.getId();
		this.nick = nick;
		this.position = position;
	}
	public Player(int id, String nick, String position) {
		this.id = id;
		this.nick = nick;
		this.position = position;
	}
	public Player() {
		
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", nick=" + nick + ", position=" + position + "]";
	}
	
}
