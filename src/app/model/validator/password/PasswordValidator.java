package app.model.validator.password;

import app.implement.helper.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator implements Validator {
    private static final String CONFIG_RULE =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$";
    private static final Pattern pattern = Pattern.compile(CONFIG_RULE);

    @Override
    public boolean isValid(final String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
