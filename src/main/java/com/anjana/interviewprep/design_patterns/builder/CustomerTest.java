package com.anjana.interviewprep.design_patterns.builder;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer1 =  Customer.builder().firstName("Anjana").lastName("Kesari")
                .primaryEmail("kesarianjana96@gmail.com").build();

        Customer customer2 =  Customer.builder().firstName("Aravind").lastName("Madhwa")
                .primaryEmail("aravindmadhwa@gmail.com").build();

        System.out.println("Customer 1 Name is"+customer1.toString());
        System.out.println("Customer 2 Name is"+customer2.toString());

    }
}
