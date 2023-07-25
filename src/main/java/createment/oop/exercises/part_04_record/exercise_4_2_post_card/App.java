package createment.oop.exercises.part_04_record.exercise_4_2_post_card;

import java.util.ArrayList;
import java.util.List;

public class App {

    //TODO: Create records Customer and Address in a way that each Customer has an address
    // Complete the sendMail method in the current class to print following message only for
    // customers that have address
    // Mail to CustomerName - Street 10, 1234AB
    public static void main(String[] arg) {
        Customer customerA = new Customer("Person A", new Address("Street 1", "1234AB"));
        Customer customerB = new Customer("Person B", null);
        Customer customerC = new Customer("Person C", new Address("Street 1", "4321AB"));

        List<Customer> customerList = new ArrayList<>();
        customerList.add(customerA);
        customerList.add(customerB);
        customerList.add(customerC);

        sendMails(customerList);
    }

    private static void sendMails(List<Customer> customerList) {
        //TODO: Write this method
    }

}
