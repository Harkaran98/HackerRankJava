import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorJava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }


}
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

}

class Checker implements Comparator<Player> {

    //Descending Order by score, if equal then sort using name alphabetically

    @Override
    public int compare(Player o1, Player o2) {
        int ScoreComp;
        if(o1.score>o2.score)ScoreComp=-1;
        else if (o1.score<o2.score)ScoreComp=1;
        else ScoreComp=0;

        int NameComp= o1.name.compareTo(o2.name);


        return (ScoreComp!=0? ScoreComp:NameComp);
    }
}
