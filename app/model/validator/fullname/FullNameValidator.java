package app.model.validator.fullname;

import app.implement.helper.Validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullNameValidator implements Validator {
    private static final String CONFIG_RULE =
            "^[A-Z][a-zA-Z]{3,}(?: [A-Z][a-zA-Z]*){0,2}$";

    private static final Pattern pattern = Pattern.compile(CONFIG_RULE);

    @Override
    public boolean isValid(final String fullName) {
        Matcher matcher = pattern.matcher(fullName);
        return matcher.matches();
    }
}
