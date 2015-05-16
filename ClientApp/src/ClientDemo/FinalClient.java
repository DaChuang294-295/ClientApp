
package ClientDemo;

import java.io.*;
import java.net.*;
import java.util.*;
public class FinalClient {
	List<String> temp_description=new ArrayList<String>();
	PrintStream os;
	DataInputStream is;
	BufferedReader input; //指令输入流
	String message = "";//指令文本
	String serverIP="192.168.16.102";
	int portNo=4700;
	public Socket socket;
	ZigbeeServer ser;
	public void familyExit(String family_id){
		String validity="false";
		try{
			try{
				socket=new Socket(serverIP,portNo);
				os=new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
				is=new DataInputStream(socket.getInputStream());
				os.println("familyExit");
				os.flush();
				os.println(family_id);
				os.flush();
			}finally{
				socket.close();
			}
		}catch(Exception e){
			
		}
	}
	public int userExit(String family_id,String user_id){
		String validity="false";
		try{
			try{
			socket=new Socket(serverIP,portNo);
			os=new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
			is=new DataInputStream(socket.getInputStream());
			os.println("userExit");
			os.flush();
			os.println(family_id);
			os.println(user_id);
			os.flush();
			validity=is.readLine();
			if(validity.equals("true")){
				return 1;
			}else{
				return 0;		
			}
			}finally{
				socket.close();
			}
		}catch(Exception e){
			return 0;
		}
	}
	public int familyLog(String family_id,String family_password){
		String validity="false";
		try{
			try{
				socket=new Socket(serverIP,portNo);
				os=new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
				is=new DataInputStream(socket.getInputStream());
				os.println("familyLog");
				os.flush();
				os.println(family_id);
				os.println(family_password);
				os.flush();
				validity=is.readLine();
				if(validity.equals("true")){
					return 1;
				}
				else{
					return 0;		
				}
			}finally{
				socket.close();
			}
		}catch(Exception e){
			return 0;
		}
	}
	public int userLog(String family_id,String user_id,String user_password){
		String validity="false";
		try{
			try{
				socket=new Socket(serverIP,portNo);
				os=new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
				is=new DataInputStream(socket.getInputStream());
				os.println("userLog");
				os.flush();
				os.println(family_id);
				os.println(user_id);
				os.println(user_password);
				os.flush();
				validity=is.readLine();
				if(validity.equals("true")){
					return 1;
				}
				else{
					return 0;		
				}
			}finally{
				socket.close();
			}
		}catch(Exception e){
			return 0;
		}
	}
	public int familyReg(String activekey,String family_id,String family_password){
		String validity="false";
		try{
			try{
				socket=new Socket(serverIP,portNo);
				os=new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
				is=new DataInputStream(socket.getInputStream());
				os.println("familyReg");
				os.flush();
				os.println(activekey);
				os.println(family_id);
				os.println(family_password);
				os.flush();
				validity=is.readLine();
				if(validity.equals("true")){
					return 1;
				}
				else{
					return 0;		
				}
			}finally{
				socket.close();
			}
		}catch(Exception e){
			return 0;
		}
	}
	public int userReg(String family_id,String user_id,String user_password){
		String validity="false";
		try{
			try{
				socket=new Socket(serverIP,portNo);
				os=new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
				is=new DataInputStream(socket.getInputStream());
				os.println("userReg");
				os.flush();
				os.println(family_id);
				os.println(user_id);
				os.println(user_password);
				os.flush();
				validity=is.readLine();
				if(validity.equals("true")){
					return 1;
				}
				else{
					return 0;		
				}
			}finally{
				socket.close();
			}
		}catch(Exception e){
			return 0;
		}
	}
	public int insertOption(int option,String family_id,String user_id,String operation){
		String validity="false";
		try{
			try{
				socket=new Socket(serverIP,portNo);
				os=new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
				is=new DataInputStream(socket.getInputStream());
				switch(option){
					case 1:{
						os.println("IPCInsertOption");
						os.flush();
						os.println(family_id);
						os.println(user_id);
						os.println(operation);
						os.flush();
						validity=is.readLine();
						if(validity.equals("true")){
							return 1;
						}
						else{
							return 0;		
						}
					}
					case 2:{
						os.println("ZigBeeInsertOption");
						os.flush();
						os.println(family_id);
						os.println(user_id);
						os.println(operation);
						os.flush();
						validity=is.readLine();
						if(validity.equals("true")){
							return 1;
						}
						else{
							return 0;		
						}
					}
					default: return 0;
				}
			}finally{
				socket.close();
			}
		}catch(Exception e){
			return 0;
		}
	}
	public int selectOption(int option,String family_id,String user_id,String date){
		String temp;
		int templong;
		temp_description=new ArrayList<String>();
		try{
			try{
				socket=new Socket(serverIP,portNo);
				os=new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
				is=new DataInputStream(socket.getInputStream());
				switch(option){
					case 1:{
						os.println("IPCSelectOption");
						os.flush();
						os.println(family_id);
						os.println(user_id);
						os.println(date);
						os.flush();
						temp=is.readLine();
						templong=Integer.parseInt(temp);
						for(int i=0;i<templong;i++){
							temp_description.add(is.readLine());
						}
						return 1;
					}
					case 2:{
						os.println("ZigBeeSelectOption");
						os.flush();
						os.println(family_id);
						os.println(user_id);
						os.println(date);
						os.flush();
						temp=is.readLine();
						templong=Integer.parseInt(temp);
						for(int i=0;i<templong;i++){
							temp_description.add(is.readLine());
						}
						return 1;
					}
					default: return 0;
				}
			}finally{
				socket.close();
			}
		}catch(Exception e){
			return 0;
		}
	}
        
}

/*for(int i=0;i<templong;i++){
	System.out.println(temp_description.get(i));
}*/
