package org.example.service;

import java.util.HashMap;
import java.util.Map;

public class Transliteration {

    private static final Map<Character, String> transliterationMap = new HashMap<>();

    static {
        transliterationMap.put('а', "a");
        transliterationMap.put('б', "b");
        transliterationMap.put('в', "v");
        transliterationMap.put('г', "g");
        transliterationMap.put('д', "d");
        transliterationMap.put('е', "e");
        transliterationMap.put('ё', "yo");
        transliterationMap.put('ж', "zh");
        transliterationMap.put('з', "z");
        transliterationMap.put('и', "i");
        transliterationMap.put('й', "y");
        transliterationMap.put('к', "k");
        transliterationMap.put('л', "l");
        transliterationMap.put('м', "m");
        transliterationMap.put('н', "n");
        transliterationMap.put('о', "o");
        transliterationMap.put('п', "p");
        transliterationMap.put('р', "r");
        transliterationMap.put('с', "s");
        transliterationMap.put('т', "t");
        transliterationMap.put('у', "u");
        transliterationMap.put('ф', "f");
        transliterationMap.put('х', "h");
        transliterationMap.put('ц', "ts");
        transliterationMap.put('ч', "ch");
        transliterationMap.put('ш', "sh");
        transliterationMap.put('щ', "sch");
        transliterationMap.put('ъ', "'");
        transliterationMap.put('ы', "y");
        transliterationMap.put('ь', "");
        transliterationMap.put('э', "e");
        transliterationMap.put('ю', "yu");
        transliterationMap.put('я', "ya");
    }

    public static String transliterate(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String transliteration = transliterationMap.get(Character.toLowerCase(c));
            if (transliteration != null) {
                if (Character.isUpperCase(c)) {
                    transliteration = transliteration.substring(0, 1).toUpperCase() + transliteration.substring(1);
                }
                builder.append(transliteration);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}

