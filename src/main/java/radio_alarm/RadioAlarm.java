package radio_alarm;

import java.time.LocalDateTime;

public class RadioAlarm {
    private final AlarmImpl alarm = new AlarmImpl();
    private final Radio radio = new Radio();
    public void setVolumeRadio(int volume) {
        radio.setVolume(volume);
    }
    public  void setVolumeAlarm(int volume) {
        //alarm.setVolume(volume);
    }
    public  void setDateTimeAlarm(LocalDateTime dateTime) {
        alarm.setDataTime(dateTime);
    }
    public void nextRadioStation() {
        radio.nextRadioStation();
    }
}
