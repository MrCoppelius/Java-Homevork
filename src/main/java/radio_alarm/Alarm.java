package radio_alarm;

import java.time.LocalDateTime;
import java.util.SortedMap;

public class Alarm {
    public void setVolume(int volume) {
        System.out.println("Alarm volume changed to " + volume );

    }
    public  void  setDataTime(LocalDateTime dateTime) {
        System.out.println("Date and Time set at" + dateTime);
    }
}
