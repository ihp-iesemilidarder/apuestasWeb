package apuestasWeb;

import java.util.Objects;

public class Bet {
	private int id;
	private Team team;
	private Player player;
	private Match match;
	private double money;
	
	public Bet(int id, Team team, Person player, Match match, double money) {
		this.id = id;
		this.team = team;
		this.player = (Player) player;
		this.match = match;
		this.money = money;
	}
	
	public Bet() {
		
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
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
		Bet other = (Bet) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Bet [id=" + id + ", team=" + team + ", player=" + player + ", match=" + match + ", money=" + money
				+ "]";
	}
	
}
