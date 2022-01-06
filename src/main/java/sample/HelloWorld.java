package sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = LocalTime.now();
    System.out.println("The current local time is: " + currentTime);
    //Greeter greeter = new Greeter();
    System.out.println("*****************************");
    System.out.println("Hello Java World");
    System.out.println("*****************************");
  }
}
