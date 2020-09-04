package never_use_switch;

import never_use_switch.email_types.CallbackEmail;
import never_use_switch.email_types.Email;
import never_use_switch.email_types.HappyBirthdayEmail;
import never_use_switch.email_types.WelcomeEmail;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class EmailSupplier {
    private static final Map<Integer, Supplier<Email>>  EMAIL_TYPE = Map.of(1, WelcomeEmail::new,
                            2, CallbackEmail::new,
                            3, HappyBirthdayEmail::new);

}
