package server;

import java.net.Socket;

public class ClientInfo {
	private Socket cSocket = null;
	private String cliCode = null;
	private String cliName = null;
	
	ClientInfo(Socket cSocket,String cliCode,String cliName){
		this.cSocket = cSocket;
		this.cliCode = cliCode;
		this.cliName = cliName;
	}
	public Socket getCliSocket(){
		return this.cSocket;
	}
	
	public String getCliName() {
		return this.cliName;
	}
	
	@Override
	public String toString()
	{
		return this.cliCode;
	}

}
