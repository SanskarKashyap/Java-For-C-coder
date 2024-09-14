
// 2. Manage Customers Information

// Title: Customer

// Create a class Customer with below attributes:

// customerId - int
// customerName - String
// age - int
// city - String


// Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

// Create class Solution with main method

// Implement two static methods - calculateAverageAgeOfCustomers and findCustomerByGivenCity in Solution class.

 

// calculateAverageAgeOfCustomers
// Create a static method calculateAverageAgeOfCustomers in the Solution class. This method will take array of Customer objects and returns the average age of Customer if found else return 0 if not found.

 

// findCustomerByGivenCity
// Create a static method findCustomerByGivenCity in the Solution class. This method will take array of Customer objects and a city as input and returns the Customer object having the mentioned city if found else return null if not found.

 

// These methods should be called from the main method.

 

// Write code to perform the following tasks:

// 1. Take necessary input variable and call calculateAverageAgeOfCustomers. For this method - The main method should print the average of the given attribute of Customer object as it is if the returned value is not null, or it should print "No such customer found"

// 2. Take necessary input variable and call findCustomerByGivenCity. For this method - The main method should print the Customer object details as it is, if the returned value is not null, or it should print "No such customer found"

// The above mentioned static methods should be called from the main method. Also write the code for accepting the inputs and printing the outputs. Don't use any static test or formatting for printing the result. Just invoke the method and print the result

 

// Note : 

// All String comparison needs to be case in-sensitive.

// No two customers will have same city.

 

// You can use/refer the below given sample input and output to verify your solution.

// Sample Input (below) description:
// The 1st input taken in the main section is the number of Customer objects to be added to the array of Customer. 

// The next set of inputs are customerId,customerName,age,city for each Customer object taken one after other and is repeated for number of Customer objects given in the first line of input.

// The last line of inputs will be the arguments which needs to be passed as parameter to the methods.

// Consider below sample input and output to test your code:


// Sample Input 1 

// 4
// 63
// Adam
// 55
// Chicago
// 54
// Brian
// 50
// Dallas
// 33
// Charles
// 70
// Atlanta
// 46
// David
// 65
// Denver
// Atlanta

 

// Sample Output 1 

// 60.0
// 33
// Charles
// 70
// Atlanta


// Sample Input 2

// 4
// 63
// Adam
// 55
// Chicago
// 54
// Brian
// 50
// Dallas
// 33
// Charles
// 70
// Atlanta
// 47
// Diana
// 35
// Denver
// Raleigh

 

// Sample Output 2 

// 52.5

// No such customer found

 

 

// -------------------------------------------------------------

// Note on using Scanner object:
// Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc. 
// Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.

// Consider below input values:
// 100
// Paragon

 

// Referring below code:

// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// String str = sc.nextLine(); -> here we expect str to have value Paragon. Instead it may be "".

// If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Customer {
    private int customerId;
    private String customerName;
    private int age;
    private String city;

    public Customer(int customerId, String customerName, int age, String city) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.age = age;
        this.city = city;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Customer[] customers = new Customer[n];
        
        for(int i = 0; i < n; i++) {
            int customerId = sc.nextInt();
            String customerName = sc.next();
            int age = sc.nextInt();
            String city = sc.next();
            customers[i] = new Customer(customerId, customerName, age, city);
        }
        
        double avgAge = calculateAverageAgeOfCustomers(customers);
        if(avgAge == 0) {
            System.out.println("No such customer found");
        } else {
            System.out.printf("%.1f%n", avgAge);  // Print average with one decimal place
        }
        
        String city = sc.next();
        Customer customer = findCustomerByGivenCity(customers, city);
        
        if(customer == null) {
            System.out.println("No such customer found");
        } else {
            System.out.println(customer.getCustomerId());
            System.out.println(customer.getCustomerName());
            System.out.println(customer.getAge());
            System.out.println(customer.getCity());
        }
    }
    
    // Method to calculate average age of customers above 18
    public static double calculateAverageAgeOfCustomers(Customer[] customers) {
        int sum = 0;
        int count = 0;
        for(Customer customer : customers) {
            if(customer.getAge() > 18) {
                sum += customer.getAge();
                count++;
            }
        }
        if(count == 0) return 0;  // No customers found with age > 18
        return (double) sum / count;
    }
    
    // Method to find the first customer by city
    public static Customer findCustomerByGivenCity(Customer[] customers, String city) {
        for(Customer customer : customers) {
            if(customer.getCity().equalsIgnoreCase(city)) {
                return customer;
            }
        }
        return null;  // No customer found from the given city
    }
}
