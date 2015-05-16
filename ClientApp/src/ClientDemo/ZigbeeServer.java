/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientDemo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author msi
 */
public class ZigbeeServer implements Runnable{
	static PrintStream[] output=new PrintStream[10]; // 输出流
	BufferedReader[] input=new BufferedReader[10];
	String message;// 输入流
	Socket[] socket=new Socket[10]; // 客户端的Socket接口对象
	static int counter = 1; // 连接数
        public String temp;
        public String damp;
        
	public static void sendData(String s) 
	{ // 将文本框中的字符传递给客户端
		try {
			for(int i=1;i<=counter;i++)
			{
				output[i].println(s); // 将文本框中的内容发送到PrintStream缓冲区中
				output[i].flush(); // 将缓冲区中的数据发送到客户端
			}
		} catch (Exception e) {
		}
			
	}
        
        public void sendData2(String s) 
	{ // 将文本框中的字符传递给客户端
			for(int i=1;i<=counter;i++)
			{
				output[i].println("Server:  " ); // 将文本框中的内容发送到PrintStream缓冲区中
				output[i].flush(); // 将缓冲区中的数据发送到客户端
                        }
			
	}
        
        public void run(){
            connect();
        }
        
	public void connect() {
		ServerSocket server; // 服务器端的Socket接口对象

		try {
			// 第1步:创建一个监听，端口是4321，最大连接数是10
			server = new ServerSocket(4321, 10);
			while (true) 
			{
				// 第1步：等待一个请求
				System.out.println("等待网关的请求\n");
				socket[counter] = server.accept(); // 等待客户端的请求
				System.out.println("连接" + counter + "来自:"
						+ socket[counter].getInetAddress().getHostName()
						+"\n对方端口为"+socket[counter].getPort()+"\n");
				// 第3步：获得输入和输出流
				output[counter] = new PrintStream(new BufferedOutputStream(
						socket[counter].getOutputStream()));
				output[counter].flush();
				input[counter]= new BufferedReader(new InputStreamReader(
						socket[counter].getInputStream()));
				// 第4步：传递信息
				//message = "Server Connection successful!";
				//output[counter].println(message); // 将“message”字符串内容发送到PrintStream缓冲区中
				//output[counter].flush(); // 将缓冲区中的数据发送到客户端
				ser ser=new ser(socket[counter],input[counter],output[counter]);
				ser.start();
				if(counter==2)
				{
					output[1].println("另一客户端IP与端口:" + socket[2].getInetAddress().getHostAddress()
							+":"+socket[2].getPort());
					output[1].flush();
					output[2].println("另一客户端IP与端口:" + socket[1].getInetAddress().getHostAddress()
							+":"+socket[1].getPort());
					output[2].flush();
				}
				++counter;
			}
		} catch (EOFException eof) {
			System.out.println("Client terminated connection");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	
	//多线程内部类，处理多个客户端
	class ser extends Thread
	{	
		Socket socket;
		BufferedReader input;
		PrintStream output;

		public ser(Socket socket, BufferedReader input,PrintStream output) 
		{
			this.socket=socket;
			this.input=input;
			this.output=output;
		}

		@Override
		public void run() 
		{
			try {
				while ((message = (String) input.readLine())!=null){
					message = (String) input.readLine();
					System.out.println(message+"hi!\n"); // 在文本域显示客户端传递的信息
                                        Character lastChar1 = message.charAt(4);
                                        Character lastChar2 = message.charAt(3);
                                        char damp1[]={lastChar2,lastChar1};
                                        damp = String.valueOf(damp1);
                                        Character lastChar4 = message.charAt(2);
                                        Character lastChar5 = message.charAt(1);
                                        char temp1[]={lastChar5,lastChar4};
                                        temp = String.valueOf(temp1);
                                        System.out.println(damp1+"!\n");
                                        System.out.println(temp1+"!\n");
				}
				
				// 第5步：拆除连接
				System.out.println("\n关闭连接");
				output.close();
				input.close();
				socket.close(); // 关闭当前客户端请求，继续监听其他客户端
				
			} catch (IOException e) {
				System.out.println("Data Error");
			}
			
		}
	}
    
}
