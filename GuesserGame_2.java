import java.util.Scanner;

class Guesser2{
	int key;
	public int GuesserKey(){
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();
		return key;
	}
}
class Player2{
	int playerNum;
	public int playerAns() {
		Scanner sc = new Scanner(System.in);
		playerNum = sc.nextInt();
		return playerNum;
	}
}

class Umpire2{
	int guesserKey;
	int[] player;
	Guesser2 gr = new Guesser2();
	public void guesserCall() {
		System.out.println("Enter guesser key Value");
		guesserKey = gr.GuesserKey();
	}
	
	Player2 pl = new Player2();
	public void playersCall(int len) {
		System.out.println("Enter Player answers");
		player = new int[len];
		for(int i = 0 ; i < player.length ;i ++) {
			player[i] = pl.playerAns();
		}
	}
	public void compare() {
		
		int flag = 0,n =1,everyplayer=0;
		for(int i : player) {
			if(i == guesserKey) {
				everyplayer++;
			}
		}
		if(everyplayer == player.length) {
			System.out.println("Every player guessed correct answer");
			return ;
		}
		for(int i : player) {
			if(i == guesserKey) {
				System.out.println("Player :" + n + " guessed correct answer" );
				flag = 1;
			}
			n++;
		}
		if(flag == 0) {System.out.println("no player guessed correct answer"); }
	}
}


public class GuesserGame_2 {
	public static void main(String[] args) {		
		Umpire2 ump = new Umpire2();
		ump.guesserCall();
		System.out.println("Enter total number of players :");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		ump.playersCall(len);
		ump.compare();
	}
}
