class DecrementDemo
{
	public static void main(String args[])
	{
		//pre decrement operator
		int a = 10;
		int b = --a;
		System.out.println("a :"+a);
		System.out.println("b :"+b);


		//post decrement operator
		int x = 100;
		x--;
		int y = x;
		System.out.println("x :"+(x++));
		System.out.println("x :"+(--y));
		System.out.println("y :"+y);
}
}