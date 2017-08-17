package server;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;

public class InitConnection extends JFrame {

	private int port;
	
	ServerSocket socket = null;
	DataInputStream din = null;
	DataOutputStream dout = null;
	
	List<ClientInfo> hostList;
	
	public InitConnection(int port) {
		this.port = port;
		hostList = new ArrayList<>();
		
	    this.setSize(300,80); 				
	    this.setLocation(500,300);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		try {
			socket = new ServerSocket(port);
			while(true) {
				Socket cSocket = socket.accept();
				ConnectionManager con = new ConnectionManager(cSocket);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	 class ConnectionManager extends Thread{
		 
		 Socket socket = null;
		 DataInputStream dIn = null;
		 DataOutputStream dOut = null;
		 
		 public ConnectionManager(Socket socket) {
			try {
			 this.socket = socket;
			 dIn = new DataInputStream(socket.getInputStream());
			 dOut = new DataOutputStream(socket.getOutputStream());
			 String type = dIn.readUTF();
			 if(type.equals("host")) {
				 String name = dIn.readUTF();
				 String key = dIn.readUTF();
				 ClientInfo info = new ClientInfo(socket,key,name);
				 hostList.add(info);
				 System.out.println(info);
			 }
			 
			 
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			}
		 
		 
	 } 
}
