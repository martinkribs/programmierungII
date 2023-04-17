package Generics.Container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Verzeichnis {

	static Map<String, String> woerterbuch;

	public static void main(String[] args) {
		initialize();
		enter("Wasser", "Water");
		output();
		translate("Angebot");
		german();
		english();
		sortedEnglish();
	}

	public static void initialize() {
		woerterbuch = new HashMap<String, String>();
		woerterbuch.put("Hallo", "Hello");
		woerterbuch.put("Artikel", "Article");
		woerterbuch.put("Angebot", "Offer");
		woerterbuch.put("Position", "Position");
	}

	public static void enter(String key, String value) {
		woerterbuch.put(key, value);
	}

	public static void output() {
		String result = "";
		for (String key : woerterbuch.keySet()) {
			String value = woerterbuch.get(key);
			result = result + key + ":" + value + ", ";
		}
		System.out.println(result);
	}

	public static void translate(String key) {
		System.out.println(woerterbuch.get(key));
	}

	public static void german() {
		Set<String> german = woerterbuch.keySet();
		List<String> sortedList = new ArrayList<String>(german);
		Collections.sort(sortedList);
		System.out.println(sortedList);
	}

	public static void english() {
		Collection<String> english = woerterbuch.values();
		List<String> list = new ArrayList<String>(english);
		//fjmseohjfto9es
		System.out.println(list);
	}

	public static void sortedEnglish() {
		Collection<String> english = woerterbuch.values();
		List<String> list = new ArrayList<String>(english);
		Collections.sort(list);
		System.out.println(list);
	}
}
