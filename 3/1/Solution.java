// 1. Find TV show with Maximum Rating and Sort Channels based on ID

// Create a class TV with below attributes:

// float- rating
// int- show_ID
// string- show
// string - anchor_name

 

// Include a constructor to initialize these attributes and appropriate getter and setter methods.
 

// In separate solution class with the main method, Implement the following two static methods: ShowWithMaxRating and ShowByShowId in Channels class.

 

// ShowWithMaxRating


// Create a  method  ShowWithMaxRating in the  Solution class. This method should take an array of TV objects and return the details of the show having the maximum rating of all the shows. If there is no show found in the given array of TV objects then return null to main program.

 

// ShowByShowId 


// Create a  method  ShowByShowId in the  Solution class. This method should take an array of TV objects and return sorted array of all the show names in ascending order based on show_ID. If there is no show found in the given array of TV objects then return null to main program.

 

// The above-mentioned static methods should be called from the main method. 

// For ShowWithMaxRating method - The main method should print the value returned from ShowWithMaxRating method.

  

// For ShowByShowId method - The main method should print the value returned from ShowByShowId method.

 

// The Output should be displayed as per the sample output format.

 

// Before calling these static methods in the main method, use the scanner object to read value for no.of TV objects, then for each TV object read the attributes as per the above-mentioned attribute sequence.  

 

// For more clarity, refer to the sample input and output testcases provided below.

// Sample Input:
// 3
// 4.0
// 209
// bigboss
// salman
// 4.8
// 109
// ted talks
// amir
// 4.3
// 201
// laughter challenge
// kapil


// Sample Output:
// 4.8
// 109
// ted talks
// amir
// ted talks
// laughter challenge
// bigboss
import java.util.*;

class TV {
    // TV class attributes
    private float rating;
    private int show_ID;
    private String show;
    private String anchor_name;

    // Constructor to initialize the attributes
    public TV(float rating, int show_ID, String show, String anchor_name) {
        this.rating = rating;
        this.show_ID = show_ID;
        this.show = show;
        this.anchor_name = anchor_name;
    }

    // Getter methods
    public float getRating() {
        return rating;
    }

    public int getShow_ID() {
        return show_ID;
    }

    public String getShow() {
        return show;
    }

    public String getAnchor_name() {
        return anchor_name;
    }
}

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading the number of TV shows
        int n = sc.nextInt();
        TV[] tvArray = new TV[n];

        // Reading each TV show information
        for (int i = 0; i < n; i++) {
            float rating = sc.nextFloat();
            int show_ID = sc.nextInt();
            sc.nextLine(); // to consume the newline character after the int
            String show = sc.nextLine();
            String anchor_name = sc.nextLine();
            tvArray[i] = new TV(rating, show_ID, show, anchor_name);
        }

        // Calling ShowWithMaxRating method
        TV showWithMaxRating = ShowWithMaxRating(tvArray);
        if (showWithMaxRating != null) {
            System.out.println(showWithMaxRating.getRating());
            System.out.println(showWithMaxRating.getShow_ID());
            System.out.println(showWithMaxRating.getShow());
            System.out.println(showWithMaxRating.getAnchor_name());
        }

        // Calling ShowByShowId method
        String[] showsById = ShowByShowId(tvArray);
        if (showsById != null) {
            for (String show : showsById) {
                System.out.println(show);
            }
        }

        sc.close();
    }

    // Method to find the show with the maximum rating
    public static TV ShowWithMaxRating(TV[] tvArray) {
        if (tvArray.length == 0) {
            return null;
        }
        TV maxRatingShow = tvArray[0];
        for (TV tv : tvArray) {
            if (tv.getRating() > maxRatingShow.getRating()) {
                maxRatingShow = tv;
            }
        }
        return maxRatingShow;
    }

    // Method to sort shows by show_ID in ascending order
    public static String[] ShowByShowId(TV[] tvArray) {
        if (tvArray.length == 0) {
            return null;
        }

        // Sorting the array by show_ID
        Arrays.sort(tvArray, new Comparator<TV>() {
            @Override
            public int compare(TV t1, TV t2) {
                return Integer.compare(t1.getShow_ID(), t2.getShow_ID());
            }
        });

        // Extracting show names into a new array
        String[] sortedShows = new String[tvArray.length];
        for (int i = 0; i < tvArray.length; i++) {
            sortedShows[i] = tvArray[i].getShow();
        }
        return sortedShows;
    }
}
