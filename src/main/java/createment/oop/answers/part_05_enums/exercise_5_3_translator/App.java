package createment.oop.answers.part_05_enums.exercise_5_3_translator;

public class App {

    public static void main(String[] args) {
        Translator translator = new Translator();
        translator.addLanguage(Language.EN);
        translator.addLanguage(Language.FA);
        translator.addLanguage(Language.NL);

        System.out.println(translator.canTranslate(Language.EN, Language.FA));
        System.out.println(translator.canTranslate(Language.EN, Language.DE));

    }

}
