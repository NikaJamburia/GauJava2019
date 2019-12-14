package gau.nika.util;

import java.util.InvalidPropertiesFormatException;

public interface Parser {
    UserSettings parse(String lang, String params) throws InvalidPropertiesFormatException;

}
