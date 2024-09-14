// 3. Bags - Minimum and Search

// Create a class Bags with the following private attributes 

// bagid – int 

// brandName – String 

// type – String 

// price – int 

// Include a constructor to initialize these attributes and appropriate getter and setter methods. 

  

// In a separate Solution class with the main method, implement the following static methods: 

  

//     findBagWithMinimumPriceByType: This method should take an array of Bags objects and type(String) as parameters and return the minimum price of bag as an integer from the same type of bag. 

 

//     SearchBagsByBagId: This method should take an array of Bags objects and id(int) as a parameters and return the Bags object, whose id attribute is matching with the any one Bags from array of Bags objects and return the object to main method. 

  

// The above-mentioned static methods should be called from the main method. 

  

// For findBagWithMinimumPriceByType method - The main method should print the value returned from findBagWithMinimumPriceByType method as it is, if the returned value is not equals to 0 or else, it should print “No Bag found with mentioned type” 

  

// For SearchBagsByBagId method - The main method should print the details (bagid, brandName, type, price) of Bags returned from SearchBagsByBagId method. If the returned Bags object is not null print the Bags object or else, it should print “No Bag found with mentioned bagid” 

 

// The Output should be displayed as per the sample output format 

 

// Before calling these static methods in the main method, use the scanner object to read value for no.of Bags objects, then for each Bags object read the attributes as per the above-mentioned attribute sequence. Next read one string value and one int value using scanner object for capturing type and id of the Bags object.  

 

 

// For more clarity, refer to the sample input and output testcases provided below after the constraints. 

// Constraints: 

//     String comparison should be case – insensitive

// Consider below sample input and output: 

  

// Sample Input: 

// 4 

// 7379 

// skybags 

// travel bag 

// 2999 

// 4262 

// uppercase 

// laptop bag 

// 1600 

// 3892 

// turbo 

// laptop bag 

// 1799 

// 2928 

// wesley 

// college bag 

// 499 

// laptop bag 

// 2928 

 

// Sample Output: 

// 1600 

// bagid-2928 

// brandName-wesley 

// type-college bag 

// price-499

 

// Note on using Scanner object: 

// Sometimes scanner object does not read the new line character while invoking methods like nextInt(), nextDouble() etc. 

// Usually, this is not an issue, but this may be visible by calling nextLine() method. 

  

// Consider below input values: 

// 1001 

// Savings 

  

// Referring below code: 

  

// Scanner sc = new Scanner(System.in); 

// int x = sc.nextInt(); 

// String str = sc.nextLine(); -> here we expect str to have value Savings. Instead, it may be "". 

  

// If the above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value. 

import java.util.Scanner;

class Bags {
    // Private attributes
    private int bagid;
    private String brandName;
    private String type;
    private int price;
    
    // Constructor to initialize attributes
    public Bags(int bagid, String brandName, String type, int price) {
        this.bagid = bagid;
        this.brandName = brandName;
        this.type = type;
        this.price = price;
    }
    
    // Getters and Setters
    public int getBagid() {
        return bagid;
    }
    
    public void setBagid(int bagid) {
        this.bagid = bagid;
    }
    
    public String getBrandName() {
        return brandName;
    }
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
}

public class Solution {
    
    // Method to find the minimum price by bag type
    public static int findBagWithMinimumPriceByType(Bags[] bags, String type) {
        int minPrice = Integer.MAX_VALUE;
        boolean found = false;
        
        for (Bags bag : bags) {
            if (bag.getType().equalsIgnoreCase(type)) {
                found = true;
                if (bag.getPrice() < minPrice) {
                    minPrice = bag.getPrice();
                }
            }
        }
        
        return found ? minPrice : 0;
    }
    
    // Method to search bags by bag id
    public static Bags SearchBagsByBagId(Bags[] bags, int id) {
        for (Bags bag : bags) {
            if (bag.getBagid() == id) {
                return bag;
            }
        }
        return null;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // Number of bags
        Bags[] bags = new Bags[n];
        
        for (int i = 0; i < n; i++) {
            int bagid = sc.nextInt();
            sc.nextLine();  // Handle newline
            String brandName = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();
            bags[i] = new Bags(bagid, brandName, type, price);
        }
        
        sc.nextLine();  // Handle newline
        String type = sc.nextLine();  // Bag type to find minimum price
        int id = sc.nextInt();  // Bag id to search
        
        // Call the method to find the minimum price for the given type
        int minPrice = findBagWithMinimumPriceByType(bags, type);
        if (minPrice != 0) {
            System.out.println(minPrice);
        } else {
            System.out.println("No Bag found with mentioned type");
        }
        
        // Call the method to search the bag by id
        Bags bag = SearchBagsByBagId(bags, id);
        if (bag != null) {
            System.out.println("bagid-" + bag.getBagid());
            System.out.println("brandName-" + bag.getBrandName());
            System.out.println("type-" + bag.getType());
            System.out.println("price-" + bag.getPrice());
        } else {
            System.out.println("No Bag found with mentioned bagid");
        }
        
        sc.close();
    }
}
