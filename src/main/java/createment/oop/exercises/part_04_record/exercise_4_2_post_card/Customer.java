package createment.oop.exercises.part_04_record.exercise_4_2_post_card;

import java.util.Objects;

public record Customer(String username, Address address) {

    public Customer(String username, Address address) {

        Objects.requireNonNull(username);

        this.username = username;
        this.address = address;
    }

}

