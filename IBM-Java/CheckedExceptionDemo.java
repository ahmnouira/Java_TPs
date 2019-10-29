import java.net.URL;
// unreported exception MalformedURLException;

import java.net.MalformedURLException;

public class CheckedExceptionDemo{

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost");
        System.out.println("Protocol: " + url.getProtocol());

    }
}