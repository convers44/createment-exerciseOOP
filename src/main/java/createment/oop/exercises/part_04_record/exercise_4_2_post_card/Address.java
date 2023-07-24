package createment.oop.exercises.part_04_record.exercise_4_2_post_card;

public class Address {
    private String street;
    private String postCode;

    public Address(String street, String postCode) {
        this.street = street;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}

