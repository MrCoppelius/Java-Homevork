package never_use_switch.email_types;

import never_use_switch.MailInfo;

public class CallbackEmail implements Email {
    @Override
    public void sendEmail(MailInfo mailInfo) {
        System.out.println("EMAIL_CALLBACK " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());

    }
}
