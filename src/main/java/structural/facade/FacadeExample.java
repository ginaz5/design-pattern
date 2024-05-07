package structural.facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class FacadeExample {

    public static void main(String[] args) throws Exception {

        URL url = new URI("http://www-cs-students.stanford.edu/~kaan/test.html").toURL();

        // connection to the specified URL
        // retrieve and deal with the input stream
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}
