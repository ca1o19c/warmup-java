package collections;

import model.Customer;

import java.util.ArrayList;

public class CollectionsAndLambdaExpression {
    public static void main(String[] args) {
        var customers = new ArrayList<Customer>();

        customers.add(new Customer(1L, "José"));
        customers.add(new Customer(2L, "Maria"));
        customers.add(new Customer(3L, "João"));

        customers.forEach(customer -> System.out.printf("ID: %d, NAME: %s%n", customer.getId(), customer.getName()));
    }
}