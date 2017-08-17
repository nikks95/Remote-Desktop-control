package server;

import java.net.Socket;

public class ConnectionClient {

private Socket tSocket=null;
private Socket sSocket=null;

public ConnectionClient(Socket tSocket,Socket sSocket){
	this.tSocket = tSocket;
	this.sSocket = sSocket;
	}


}
