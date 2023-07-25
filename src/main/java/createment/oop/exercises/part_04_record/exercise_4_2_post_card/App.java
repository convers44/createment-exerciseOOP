package createment.oop.exercises.part_04_record.exercise_4_2_post_card;

import java.util.ArrayList;
import java.util.List;

public class App {

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
        for (Customer customer : customerList) {
            if (customer.address() != null) {
                System.out.printf("Mail to %s, on %s %s\n",
                        customer.username(), customer.address().street(), customer.address().postCode());
            }
        }
    }

}
