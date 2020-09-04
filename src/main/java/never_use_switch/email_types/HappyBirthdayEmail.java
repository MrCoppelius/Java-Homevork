package never_use_switch.email_types;

import never_use_switch.MailInfo;

public class HappyBirthdayEmail implements Email {
    @Override
    public void sendEmail(MailInfo mailInfo) {
        System.out.println("HappyBirthday email" + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
