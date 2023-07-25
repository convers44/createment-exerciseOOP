package createment.oop.answers.part_05_enums.exercise_5_3_translator;

import java.util.ArrayList;
import java.util.List;

public class Translator {
    private final List<Language> languages;

    public Translator() {
        this.languages = new ArrayList<>();
    }

    public void addLanguage(Language language) {
        languages.add(language);
    }

    public boolean canTranslate(Language from, Language to) {
        return languages.contains(from) && languages.contains(to);
    }
}
