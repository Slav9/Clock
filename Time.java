package Clock;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд, пройденных с начала дня");
        int time = scanner.nextInt();
        int hours = (time%(24*60*60))/(60*60);
        int minutes = ((time%(24*60*60)) - hours*60*60)/60;
        int seconds = ((time%(24*60*60)) -hours*60*60-minutes*60);
        System.out.format("Время:"+"%02d"+":"+"%02d"+":"+"%02d",hours,minutes,seconds);
    }

}
