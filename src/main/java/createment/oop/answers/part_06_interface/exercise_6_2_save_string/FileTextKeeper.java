package createment.oop.answers.part_06_interface.exercise_6_2_save_string;

public class FileTextKeeper implements TextKeeper {

    private static final String FILE_PATH = "text.txt";

    @Override
    public String load() {
        return FileHelper.load(FILE_PATH);
    }

    @Override
    public void save(String value) {
        FileHelper.save(FILE_PATH, value);
    }
}
