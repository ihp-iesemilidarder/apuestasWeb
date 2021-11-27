package apuestasWeb;

import java.time.LocalDate;
import java.util.Objects;

public class League {
	private int id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public League(int id, String name, LocalDate startDate, LocalDate endDate) {
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
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
		League other = (League) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "League [id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate;
	}
}
