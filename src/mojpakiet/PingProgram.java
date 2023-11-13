package mojpakiet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PingProgram {

    public static void main(String[] args) {
        String host = "example.com"; // Zmień na adres hosta, który chcesz spingować

        try {
            Process process = Runtime.getRuntime().exec("ping " + host);
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Host " + host + " is reachable");
            } else {
                System.out.println("Host " + host + " is not reachable");
            }

            // Odczytaj wyniki pingu
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}