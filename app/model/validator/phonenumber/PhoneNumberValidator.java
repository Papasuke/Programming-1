package app.model.validator.phonenumber;

import app.implement.helper.Validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator implements Validator {
    private static final String CONFIG_RULE =
            "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
    private static final Pattern pattern = Pattern.compile(CONFIG_RULE);

    @Override
    public boolean isValid(final String phoneNumber) {
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
