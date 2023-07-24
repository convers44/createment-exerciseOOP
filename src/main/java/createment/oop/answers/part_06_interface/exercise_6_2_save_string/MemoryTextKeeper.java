package createment.oop.answers.part_06_interface.exercise_6_2_save_string;

public class MemoryTextKeeper implements TextKeeper {

    private String value;

    @Override
    public String load() {
        return value;
    }

    @Override
    public void save(String value) {
        this.value = value;
    }
}
