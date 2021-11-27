package apuestasWeb;

import java.util.List;
import java.util.Objects;

import apuestasWeb.collections.Gender;

public class Person {
	private int id;
	private String dni;
	private String name;
	private List<String> surnames;
	private String telephone;
	private int age;
	private Gender gender;
	
	public Person(int id, String dni, String name, List<String> surnames, String telephone, int age, Gender gender) {
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.surnames = surnames;
		this.telephone = telephone;
		this.age = age;
		this.gender = gender;
	}
	
	public Person() {}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSurnames() {
		return surnames;
	}

	public void setSurnames(List<String> surnames) {
		this.surnames = surnames;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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
		Person other = (Person) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", dni=" + dni + ", name=" + name + ", surnames=" + surnames + ", telephone="
				+ telephone + ", age=" + age + ", gender=" + gender + "]";
	}
}
