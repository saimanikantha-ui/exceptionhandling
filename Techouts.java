package hello;

 class R{
	void m1()
	{
		System.out.println("Method");
		
	}
	void m1(int a)
	{
		System.out.println("techouts");
	}
	void m1(float f,char c)
	{
		System.out.println("1.22f,cj");
	}
 }
	
		class Techouts 
		{
	
	public static void main(String[] args) {
		
		R obj =new R();
		obj.m1();
		obj.m1(3);
		obj.m1(1.2f,'e');
		
	 }
		}

