import java.net.*;

public class inet {
	
	public static void main(String args[]) throws UnknownHostException {
		
		System.out.println("Details of machine getLocalHost(): ");
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println(Address);
		
		System.out.println("Details of machine getByName(): ");
		Address = InetAddress.getByName("");
		System.out.println(Address);
		
		System.out.println("Details 'www.google.com' getByName(): ");
		InetAddress sw1[] = InetAddress.getAllByName("www.google.com");
		for(int i=0; i<sw1.length; i++) {
			System.out.println(sw1[i]);
		}
		
		System.out.println("Details 'www.sinhgad.edu' getByName(): ");
		InetAddress sw2[] = InetAddress.getAllByName("www.sinhgad.edu");
		for(int i=0; i<sw2.length; i++) {
			System.out.println(sw2[i]);
		}
		
	}
	
}
