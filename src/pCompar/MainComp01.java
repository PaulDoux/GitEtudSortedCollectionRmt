package pCompar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComp01 {

	
	public static void main(String[] args) {
//		public static void main_2(String[] args) {
		// TODO Auto-generated method stub

		
		
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
		    
//		    Collections.sort(footballTeam);
//		    Collections.sort(footballTeam,new PlayerAgeComparator());
//		    System.out.println("after Sorting  : " + footballTeam);
		    
		    
		  Player maxPlayer =   Collections.max(footballTeam,new PlayerAgeComparator());
		  System.out.println("maxPlayer  : " + maxPlayer);
		   		    
		    
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
