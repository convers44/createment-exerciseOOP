package createment.oop.exercises.part_04_record.exercise_4_2_post_card;

public class Customer {
    private String username; // username in this system is an email address
    private Address address;

    public Customer(String username, Address address) {
        this.username = username;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

