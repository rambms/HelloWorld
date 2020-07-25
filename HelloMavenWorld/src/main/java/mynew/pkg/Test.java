package mynew.pkg;

public class Test implements Airtel
{
	public void simDetails() {
		System.out.println("Airtel is mobile operator in India...");
		
	}
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Test tt=new Test();
        tt.simDetails();
    }

	
}
