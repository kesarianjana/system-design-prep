package com.anjana.interviewprep.design_patterns.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;

public class Customer {
    /*
        Reasons to avoid setters
         1. You can modify values even after object is created
         2. You can make half baked object by missing required properties !
     */
    //mandatory fields
    private  String firstName;
    private  String middleName;
    private  String lastName;
    private  String primaryMobileNumber;
    private  String primaryEmail;

    //Optional fields
    private  String secondaryEmail;
    private  String secondaryMobileNumber;


    private Customer(CustomerBuilder customerBuilder) {
        this.firstName = customerBuilder.firstName;
        this.middleName = customerBuilder.middleName;
        this.lastName = customerBuilder.lastName;
        this.primaryMobileNumber = customerBuilder.primaryMobileNumber;
        this.primaryEmail = customerBuilder.primaryEmail;
        this.secondaryEmail = customerBuilder.secondaryEmail;
        this.secondaryMobileNumber = customerBuilder.secondaryMobileNumber;
    }
    public static CustomerBuilder builder() {  // add this to return builder object like - Customer.builder() !
        return new CustomerBuilder();
    }

    public String toString() {
        return "FirstName is "+firstName+" lastName is "+lastName;
    }

    public static class CustomerBuilder {
        private  String firstName;
        private  String middleName;
        private  String lastName;
        private  String primaryMobileNumber;
        private  String primaryEmail;

        //Optional fields
        private  String secondaryEmail;
        private  String secondaryMobileNumber;

        public CustomerBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public CustomerBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
        public CustomerBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public CustomerBuilder primaryMobileNumber(String primaryMobileNumber) {
            this.primaryMobileNumber = primaryMobileNumber;
            return this;
        }public CustomerBuilder primaryEmail(String primaryEmail) {
            this.primaryEmail = primaryEmail;
            return this;
        }public CustomerBuilder secondaryEmail(String secondaryEmail) {
            this.secondaryEmail = secondaryEmail;
            return this;
        }public CustomerBuilder secondaryMobileNumber(String secondaryMobileNumber) {
            this.secondaryMobileNumber = secondaryMobileNumber;
            return this;
        }

        public Customer build() {
            /*
            Here you can also add validation for required properties. Something like this:
            if(this.firstName == null || this.primaryEmail == null) throw new RunTimeException("mandatory fields missing!")
             */
            return new Customer(this);
        }



    }


}
