import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int minute_plus = Integer.parseInt(st.nextToken());

        minute += hour * 60 + minute_plus;
        hour = minute / 60;
        minute = minute % 60;
        hour %= 24;

        System.out.println(hour+" "+minute);
    }
}