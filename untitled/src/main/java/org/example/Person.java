package org.example;

abstract class Person {
    public String name;
    public String addressLine1;
    public String addressLine2;
    public String phone;
    public String email;

    //region constructors

    public Person(String name, String addressLine1, String addressLine2, String phone, String email) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.phone = phone;
        this.email = email;
    }

    public Person() {
    }

    //endregion

    //region getters & setters

    public String getName() {
        return name;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    //endregion


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
