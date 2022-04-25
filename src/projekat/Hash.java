package projekat;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hash {

    //PROGRAM SAMO SLUZI ZA DOBIJANJE BITA
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            String lozinka = "admin";
            byte hash[] = md.digest(lozinka.getBytes());
            System.out.println(Arrays.toString(hash));

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Hash.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
