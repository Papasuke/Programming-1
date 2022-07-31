package app.model.validator.username;

import app.implement.helper.Validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidator implements Validator{
    private static final String CONFIG_RULE =
            "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";

    private static final Pattern pattern = Pattern.compile(CONFIG_RULE);

    @Override
    public boolean isValid(final String username) {
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
}
