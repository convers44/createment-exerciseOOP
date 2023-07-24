package createment.oop.answers.part_04_record.exercise_4_2_post_card;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] arg) {
        Customer customerA = new Customer("Person A", new Address("Street 1", "1234AB"));
        Customer customerB = new Customer("Person A", null);

        List<Customer> customerList = new ArrayList<>();
        customerList.add(customerA);
        customerList.add(customerB);

        sendMails(customerList);
    }

    private static void sendMails(List<Customer> customerList) {
        for (Customer customer : customerList) {
            if (customer.address() != null)
                System.out.printf("Mail to %s - %s, %s", customer.name(),
                        customer.address().street(), customer.address().postCode());

        }
    }

}
