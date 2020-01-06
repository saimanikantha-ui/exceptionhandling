package hello;

 class Pearl {
	void display()
	{
		System.out.println("Techouts");
		
	}
 }

 class Overriding extends Pearl
{
	void display()
	{
		super.display();
	System.out.println("Oops");
}
	public static void main(String[] args) {
		Overriding obj1=new Overriding();
		obj1.display();
		

	}

}

