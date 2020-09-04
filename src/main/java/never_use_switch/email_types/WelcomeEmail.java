package never_use_switch.email_types;

import never_use_switch.MailInfo;

public class WelcomeEmail implements Email {
    @Override
    public void sendEmail(MailInfo mailInfo) {
        System.out.println("WELCOME " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
