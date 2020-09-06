package radio_alarm;

import java.time.LocalDateTime;

public class AlarmImpl implements Alarm {
    public void c(int volume) {
        System.out.println("Alarm volume changed to " + volume );

    }
    public  void  setDataTime(LocalDateTime dateTime) {
        System.out.println("Date and Time set at" + dateTime);
    }
}
