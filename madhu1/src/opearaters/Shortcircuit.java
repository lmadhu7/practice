package opearaters;

public class Shortcircuit {

	public static void main(String[] args) {
		int a = 10 , b = 25;
		if(++a<15&&++b>34)
		{
			a++;
		}
		else
		{
			b++;
		}
		
    System.out.println(a+"..."+b);
	
	}
}

