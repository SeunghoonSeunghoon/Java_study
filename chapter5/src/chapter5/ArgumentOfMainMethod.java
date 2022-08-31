package chapter5;

public class ArgumentOfMainMethod {
	public static void man(String[] args) {
		System.out.println(args.length);
		System.out.println();
		
		for(String k : args) {
			System.out.println(k);
		}
	}
}
