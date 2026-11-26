import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> dices = new ArrayList<>();
        int dice1 = Integer.parseInt(st.nextToken());
        int dice2 = Integer.parseInt(st.nextToken());
        int dice3 = Integer.parseInt(st.nextToken());
        dices.add(dice1);
        dices.add(dice2);
        dices.add(dice3);

        int price = 0;

        if (dice1 == dice2 && dice2 == dice3) {
            price += 10000+dice1*1000;
        } else if (dice1 == dice2 || dice1 == dice3) {
            price += 1000+dice1*100;
        } else if (dice2 == dice3) {
            price += 1000+dice2*100;
        } else {
            price += Collections.max(dices)*100;
//            price += Math.max(dice1, Math.max(dice2, dice3));
        }
        
        System.out.println(price);
    }
}