package radio_alarm;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
   /*     RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.nextRadioStation();
        radioAlarm.setVolumeAlarm(66);
        radioAlarm.setVolumeRadio(123);*/
        RadioAlarmV2 radioAlarmV2 = new RadioAlarmV2();
        radioAlarmV2.alarm.setDataTime(LocalDateTime.now());
        radioAlarmV2.radio.setVolume(44);
    }
}
