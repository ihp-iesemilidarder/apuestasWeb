package apuestasWeb;

import java.util.Objects;

public class Team {
	private int id;
	private League league;
	private String name;
	private int players;
	
	public Team(int id, League league ,String name, int players) {
		this.id = id;
		this.league = league;
		this.name = name;
		this.players = players;
	}
	
	public Team() {
		
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayers() {
		return players;
	}

	public void setPlayers(int players) {
		this.players = players;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", league=" + league + ", name=" + name + ", players=" + players + "]";
	}
	
}
