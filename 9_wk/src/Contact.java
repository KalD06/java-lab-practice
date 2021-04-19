import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Contact {
	static HashMap<String, String> map = new HashMap<String, String>();
	static Scanner sc = new Scanner(System.in);
	
	public static void add(String name, String phone) {
		map.put(name, phone);
	}
	
	public static void show() {
		TreeMap<String,String> sorted = new TreeMap<String, String>(map);
		System.out.println(sorted);
	}
	
	public static void find(String name) {
		System.out.println(map.get(name));
	}
	
	public static void delete(String name) {
		map.remove(name);
	}
	
	public static void main(String[] args) {
		String line;
		
		while(true) {
			line = sc.nextLine();
			//sc.nextLine();
			String[] cut = line.split(" ");
			
			if(cut[0].equals("add")) {
				
				if(map.containsKey(cut[1])) {
					System.out.println("error");
				}
				
				else {
					add(cut[1], cut[2]);
				}
			}
			
			else if(cut[0].equals("show")) {
				show();
			}
			
			else if(cut[0].equals("find")) {
				find(cut[1]);
			}
			
			else if(cut[0].equals("delete")) {
	
				if(map.containsKey(cut[1])) {
					delete(cut[1]);
				}
				
				else {
					System.out.println("error");
				}
			}
			
			else {
				System.out.println("error");
			}
		}
	}
}