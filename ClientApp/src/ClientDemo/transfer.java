/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//服务器指令监听与转发给Zigbee

package ClientDemo;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Hamish_Lin
 */
public class transfer extends FinalClient implements Runnable {
	String message = "";//指令文本	
	int portNo=4700;
	ZigbeeServer ser;
    
    public transfer(ZigbeeServer ser){
        this.ser=ser;
        System.out.println("1111111");
    }
    
    public void run(){
        trans();
    }
    
    public void trans(){
		try{
                    socket=new Socket(serverIP,portNo);
			while(true){
                                System.out.println(socket.getInputStream());
                                is =new DataInputStream(socket.getInputStream()); 
				message = (String) is.readLine();
                                char[] a = message.toCharArray();
                                System.out.println(message);
				if (a[0]>'A'&&a[0]<'Z'){
					ser.sendData(message);
                                        System.out.println(a[0]+"!");
                                    }
				}
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
