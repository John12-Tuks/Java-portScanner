package portscanner;
import java.net.*;//i used the network class the specific is Sockets
import java.util.*;


public class portscanner {

    public static void main(String[] args) {
        String host;

        // Check if an IP address was provided as a command-line argument
        if (args.length < 1) {
            // If no argument, prompt for user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter IP address: ");
            host = scanner.nextLine();  // Read user input
            scanner.close();
        } else {
            host = args[0];  // Use the command-line argument as the host
        }

        System.out.println("Scanning ports on host: " + host);

        // Start port scanning
        try {//the number 65535 is the number of ports avaliable
            for (int i = 1; i <= 65535; i++) {  // Loop through all ports
                try (Socket s = new Socket(host, i)) {
                    System.out.println("Port open: " + i);  // Print open port
                } catch (Exception e) {
                    // Port is not open; do nothing
                }
            }
        } catch (Exception e) {
            System.out.println("Error scanning ports: " + e.getMessage());
        }
    }
}
