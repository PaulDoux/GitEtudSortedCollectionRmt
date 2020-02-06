package pCompar;

import java.util.Comparator;

public class PlayerRankingComparator implements Comparator<Player>{

	public int compare(Player firstPlayer, Player secondPlayer){
		return (firstPlayer.getRanking()-secondPlayer.getRanking());
	}
	//modif02
}
