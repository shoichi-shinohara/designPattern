package adapter;

import adapter.inherit.Print;
import adapter.inherit.PrintAdapter;
import adapter.inherit.Show;

public class Main {

	public static void main(String[] args) {

		System.out.println("Version1");

		Show ver1 = new Show();
		ver1.showStr("Hello World");
		ver1.showNumber(100);

		System.out.println();
		System.out.println("Version2");
		Print ver2 = new PrintAdapter();
		ver2.printStr("Hello World");
		ver2.printNumber(100);
		
		System.out.println();
		System.out.println("Version3");
		
		Print ver3 = new adapter.delegate.PrintAdapter();
		ver3.printStr("Hello World");
		ver3.printNumber(100);
		
	}

}
