/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portscanner;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author TOKELO
 */
public class portscanners extends JFrame implements ActionListener{
    JMenuBar bar = new JMenuBar();
    JMenu menu = new JMenu("Files");
    JMenuItem items = new JMenuItem("Exit");
    JLabel lab = new JLabel("Enter IP Address: ");
     JTextField te = new JTextField(25);
     JButton but = new JButton("Search");
     JTextArea ar = new JTextArea();
        JScrollPane pan = new JScrollPane(ar);
        
        JCheckBox ch = new JCheckBox("common ports");
        JCheckBox ch1= new JCheckBox("udp ports");
        JCheckBox ch2 = new JCheckBox("uncommon ports");
       
        int[] commonports = {20,21,22,23,25,53,80,110,143,443,445,3389,8080};
    int[] udpports = {53,67,68,123,161,162,69};
    int[] uncommonports = {135,137,138,139,3306,1521,5060,5061,5900,6379};
        
        public  portscanners(){
            setTitle("Port Scanner");
        final int width = 450;
        final int height = 450;
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
         menu.add(items);
        bar.add(menu);
        
        add(lab);
         add(te);
         
         add(ch);
        ch.addActionListener(this);
         add(ch1);
        ch1.addActionListener(this);
         add(ch2);
        ch2.addActionListener(this); 
         add(but);
         but.setPreferredSize(new Dimension(280,20));
         but.addActionListener(this);
         add(pan);
          pan.setPreferredSize(new Dimension(450,250));
         items.addActionListener(this);
           setVisible(true);
        }
   public static void main(String[] args) {
       portscanners run = new portscanners();
       
}

    @Override
    public void actionPerformed(ActionEvent e) {
     Object source = e.getSource();
    String host = te.getText();
   
    
    if(source ==but){
     if(ch.isSelected())Ports(commonports,host);
    if(ch1.isSelected())Ports(udpports,host);
    if(ch2.isSelected())Ports(uncommonports,host);
}   
    }

    public String Ports(int[] ports,String host){
      for(int c: ports){
    try(Socket s = new Socket(host,c)){
        ar.append("\nport open"+c);
}catch(Exception g){
     
}
    
}     
        return null;
        
    }
}