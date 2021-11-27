package apuestasWeb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import apuestasWeb.collections.Gender;

public class App {

	public static void main(String[] args) {
		
		//JHON
		List<String> surnamesJhon = new ArrayList<String>();
		surnamesJhon.add("Sebas");
		surnamesJhon.add("");
		Person Jhon = new Person(1,"12345678A","Jhon",surnamesJhon,"1234567890",18,Gender.MALE);
		Jhon = new Player(Jhon,"jhontheripper","1");
		System.out.println(Jhon);
		
		//IVAN
		List<String> surnamesIvan = new ArrayList<String>();
		surnamesIvan.add("Heredia");
		surnamesIvan.add("Planas");
		Person Ivan = new Person(2,"12345678A","Ivan",surnamesIvan,"1234567890",18,Gender.MALE);
		Ivan = new Player(Ivan,"jhontheripper","1");
		System.out.println(Ivan);
		
		//League
		League league = new League(1, "IvanJhon", LocalDate.of(2021, 2, 21),LocalDate.of(2021, 4, 10));
		System.out.println(league);
		
		//Teams
			Team team1 = new Team(1, league ,"super equipo", 100);
			Team team2 = new Team(2,league,"super equipo 2",100);
			
		//Matches
			Match match1 = new Match(1,"España", LocalDate.of(2021, 10, 5), team1, team2);
			Match match2 = new Match(2,"Brasil",LocalDate.of(2021, 12, 4),team2,team1);
		
		// Bet
			Bet bet1 = new Bet(1, team1, Jhon, match1, 1000.0);
			
		
	}

}
