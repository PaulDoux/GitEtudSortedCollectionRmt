package pCompar;

import java.util.Comparator;

public class PlayerAgeComparator implements Comparator<Player>{

	public int compare(Player firstPlayer, Player secondPlayer){
		return (firstPlayer.getAge()-secondPlayer.getAge());
	}
}
