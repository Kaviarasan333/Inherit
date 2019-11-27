package sample;

public class Inter implements ClientDetails,LocalOffice
{
	@Override
	public void uk() {
		System.out.println("UK country: Vasan");
		
	}

	@Override
	public void usa(String name) 
	{
	System.out.println("USA country is "+name);
		
	}

	@Override
	public void Aus() {
		System.out.println("Aus country is Akshay");
		
	}

	@Override
	public void Swi() {
		System.out.println("Swi country is Ragavan");
		
	}
	@Override
	public void cmtickets() {
System.out.println("Cmtickets is Sathish");
		
	}

	@Override
	public void tariffIndia() {
		System.out.println("Tariffindia is vasanth");
		
	}

	@Override
	public void lmit() {
		System.out.println("lmit is arul");
		
	}
	public static void main(String[] args) {
		Inter i=new Inter();
		i.uk();
		i.usa("Naje");
		i.Aus();
		i.Swi();
		i.lmit();
	}

	
	
}
