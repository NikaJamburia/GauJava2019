package gau.nika.util;

import java.util.InvalidPropertiesFormatException;

public class UserSettingsParser implements Parser {

    @Override
    public UserSettings parse(String lang, String params) throws InvalidPropertiesFormatException {
        UserSettings userSettings = new UserSettings();
        setLanguage(lang, userSettings);
        setParams(params, userSettings);
        return userSettings;
    }

    public void setLanguage(String lang, UserSettings userSettings) throws InvalidPropertiesFormatException {

        switch (lang){
            case "en":
                userSettings.setLang(Lang.EN);
                break;
            case "ru":
                userSettings.setLang(Lang.RU);
                break;
            case "ge":
                userSettings.setLang(Lang.GE);
                break;
            default:
                throw  new InvalidPropertiesFormatException("Invalid language");
        }

    }

    public void setParams(String userInput, UserSettings userSettings) throws InvalidPropertiesFormatException {
        int p = userInput.lastIndexOf("p");
        int s = userInput.lastIndexOf("s");
        int w = userInput.lastIndexOf("w");

        if(p == -1 || s == -1 || w == -1){
            throw new InvalidPropertiesFormatException("Invalid parameters");
        }

//        try {

            String sentenceCountStr = "";
            int count = 1;
            while (true){
                count++;
                if(userInput.charAt(p + count) != '-'){
                    sentenceCountStr += userInput.charAt(p + count);
                }
                else {
                    break;
                }
            }

            String minWordsStr = "";
            String maxWordsStr = "";
            count = 1;
            while (true){
                count++;
                char currentChar = userInput.charAt(s + count);
                if(currentChar != '-'){
                    minWordsStr += currentChar;
                }
                else {
                    int position = s + count;
                    count = 1;
                    while (true){
                        char newCurrentChar = userInput.charAt(position+count);
                        count++;
                        if(newCurrentChar != '-'){
                            maxWordsStr += newCurrentChar;
                        }
                        else {
                            break;
                        }
                    }
                    break;
                }
            }

            String minSymbolsStr = "";
            String maxSymbolsStr = "";
            count = 1;
            while (true){
                count++;
                char currentChar = userInput.charAt(w + count);
                if(currentChar != '-'){
                    minSymbolsStr += currentChar;
                }
                else {
                    int position = w + count;
                    count = 1;
                    while (true){
                        if (position+count > userInput.length()-1){
                            break;
                        }
                        char newCurrentChar = userInput.charAt(position+count);
                        count++;
                        if(newCurrentChar != '-'){
                            maxSymbolsStr += newCurrentChar;
                        }
                        else {
                            break;
                        }
                    }
                    break;
                }
            }


            int sentenceCount = Integer.parseInt(sentenceCountStr);
            int minWords = Integer.parseInt(minWordsStr);
            int maxWords = Integer.parseInt(maxWordsStr);
            int minSymbols = Integer.parseInt(minSymbolsStr);
            int maxSymbols = Integer.parseInt(maxSymbolsStr);

            userSettings.setSentenceCount(sentenceCount);
            userSettings.setMinWordsInSentence(minWords);
            userSettings.setMaxWordsInSentence(maxWords);
            userSettings.setMinSymbolsInWord(minSymbols);
            userSettings.setMaxSymbolsInWord(maxSymbols);


        //}
//        catch (Exception e){
//            System.out.println(e);
//            throw new InvalidPropertiesFormatException("Invalid parameters");
//        }


    }

}
