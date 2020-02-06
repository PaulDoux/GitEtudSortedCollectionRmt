package pCompar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//https://www.baeldung.com/java-comparator-comparable

public class MainCompJ8 {

	
	public static void main(String[] args) {
//		public static void main_2(String[] args) {
		// TODO Auto-generated method stub

		//modif03 A B
		
		List<Player> footballTeam = new ArrayList<>();
		 Player player1 = new Player(59, "John", 24);
		    Player player2 = new Player(67, "Roger", 32);
		    Player player3 = new Player(45, "Steven", 20);
		    Player player4 = new Player(63, "boby", 14);
//		    footballTeam.add(player1);
		    
		    
		    footballTeam.add(player1);
		    footballTeam.add(player2);
		    footballTeam.add(player3);
		    footballTeam.add(player4);
		    
		    System.out.println("Before Sorting : " + footballTeam);
		    
//		    Comparator<Player> byRanking =(Player player1x, Player player2x) -> (player1x.getRanking()-player2x.getRanking());
		  
//		    Comparator<Player> byRanking =(Player player1x, Player player2x) -> (player1x.getRanking()-player2x.getRanking())*(-1);
			
		    
//		    Comparator<Player> byRanking =(x,y) -> (x.getRanking()-y.getRanking());
//		    Comparator<Player> byRanking =(x,y) -> (x.getRanking()-y.getRanking())*(-1);
		    
		    Comparator<Player> byRanking =Comparator.comparing(Player::getAge);
		    
//		    Collections.sort(footballTeam,byRanking);
		    Collections.sort(footballTeam,byRanking.reversed());
//		    Collections.sort(footballTeam);
//		    Collections.sort(footballTeam,new PlayerAgeComparator());
		    System.out.println("after Sorting  : " + footballTeam);   		    
		    
	}
		
	

	
	
//	public static void main(String[] args) {
		public static void main_1(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Player> footballTeam = new ArrayList<>();
		 Player player1 = new Player(59, "John", 20);
		    Player player2 = new Player(67, "Roger", 22);
		    Player player3 = new Player(45, "Steven", 24);
		    Player player4 = new Player(63, "boby", 24);
//		    footballTeam.add(player1);
		    
		    
		    footballTeam.add(player1);
		    footballTeam.add(player2);
		    footballTeam.add(player3);
		    footballTeam.add(player4);
		    
		    System.out.println("Before Sorting : " + footballTeam);
		    
		    Collections.sort(footballTeam);
		    
		    System.out.println("after Sorting  : " + footballTeam);
		    
	}

}
