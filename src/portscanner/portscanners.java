/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portscanner;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author TOKELO
 */
public class portscanners {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter IP address: ");     
    String host = input.next();
    input.close();
    int[] commonports = {20,21,22,23,25,53,80,110,143,443,445,3389,8080};
    int[] udpports = {53,67,68,123,161,162,69};
    int[] ports = {135,137,138,139,3306,1521,5060,5061,5900,6379};
    for(int c: ports){
    try(Socket s = new Socket(host,c)){
        System.out.println("port open"+c);
}catch(Exception g){
    
}
    
}
}
}