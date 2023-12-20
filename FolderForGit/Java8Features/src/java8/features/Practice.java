package java8.features;

import java.util.HashMap;

public class Practice {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(1, 0);
		hm.put(2, 1);
		hm.put(3, 4);
		hm.put(4, 4);
		int k= hm.entrySet().stream().max((e1,e2)-> e1.getValue()>e2.getValue()? 1:-1).get().getKey();
		System.out.println(k);
		String s="Nikita";
				System.out.println(s.indexOf('i'));
	}

}
