package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		System.out.println("Here's an ArrayList of Strings:\n");
		ArrayList<String> string = new ArrayList<String>();
		
		string.add("Mediocre");
		string.add("Exuberant");
		string.add("Exuberance");
		string.add("Mediocrity");
		string.add("Blah Blah Blah");
		
		for(int i = 0; i < string.size(); i++){
			String s = string.get(i);
			System.out.println(s);
		}
		for (String s: string) {
			System.out.println(s);
		}
		System.out.println("Every other");
		for (int i = 0; i < string.size(); i+=2) {
			String s = string.get(i);
			System.out.println(s);
		}
		System.out.println("Reverse order");
		for (int i = string.size() - 1; i >= 0; i--) {
			System.out.println(string.get(i));
		}
		System.out.println("With letter e");
		for (int i = 0; i < string.size(); i++) {
			String s = string.get(i);
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
