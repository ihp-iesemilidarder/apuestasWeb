package apuestasWeb;

import java.time.LocalDate;
import java.util.Objects;

public class Match {
	private int id;
	private String location;
	private LocalDate dateStart;
	private Team local;
	private Team guest;
	
	public Match(int id, String location, LocalDate dateStart, Team local, Team guest) {
		this.id = id;
		this.location = location;
		this.dateStart = dateStart;
		this.local = local;
		this.guest = guest;
	}
	
	public Match() {
		
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getDateStart() {
		return dateStart;
	}

	public void setDateStart(LocalDate dateStart) {
		this.dateStart = dateStart;
	}

	public Team getLocal() {
		return local;
	}

	public void setLocal(Team local) {
		this.local = local;
	}

	public Team getGuest() {
		return guest;
	}

	public void setGuest(Team guest) {
		this.guest = guest;
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
		Match other = (Match) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Match [id=" + id + ", location=" + location + ", dateStart=" + dateStart + ", local=" + local
				+ ", guest=" + guest + "]";
	}
}
