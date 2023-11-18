package org.example;

public class Student extends Person{

     public Status status;

     public Student(String name, String addressLine1, String addressLine2, String phone, String email, Status status) {
          super(name, addressLine1, addressLine2, phone, email);
          this.status = status;
     }

     public Student(Status status) {
          this.status = status;
     }

     public Student() {
     }

     @Override
     public String toString() {
          String string = this.getClass().getName();
          return    "Class: " + string +
                    "\nname: " + name;

     }
}
