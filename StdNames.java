package stdnames;

import java.util.*;

public class StdNames {
        public void login() {
        String[] user = { "AmeyKuradeAK", "Codec-Headec", "Apple" };
        String[] pass = {"Amey1234", "Codec1234", "Apple1234"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username");
        String b = sc.nextLine();

        boolean found = false;
        for (String s : user) {
            if (s.equals(b)) {
                found = true;
                break;
            }
        }

        System.out.println("Enter password:");
        String c = sc.nextLine();

        boolean g = false;
        for (String q : pass) {
            if (q.equals(c)) {
                g = true;
                break;
            }
        }
        if (g && found) {
            System.out.println("\nYou are welcome");
        }
        else
            System.out.println("You can't access or re-check Username and Password");


    }
}

