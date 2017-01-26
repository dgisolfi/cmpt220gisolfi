//CMPT 220
//Author: Daniel Gisolfi
//Date: 1.22.17
//lab 1

//1.4 
public class ExpTable {
	public static void main(String[] args) {
		int a = 1;
		System.out.println("a  a^2   a^3");
		
		while (a < 5) {
		int b = a * a;
		int c = a * a * a;

		System.out.println(a + "   " + b + "    " + c);
		a = a + 1;
		}
	}
}