package server;

public class StartServer {
	public static void main(String... s)
	{
		SetPassword frame1= new SetPassword();
    	frame1.setSize(300,80); 				
    	frame1.setLocation(500,300);
    	frame1.setTitle("Start Server");
    	frame1.setVisible(true);	
	}
}
