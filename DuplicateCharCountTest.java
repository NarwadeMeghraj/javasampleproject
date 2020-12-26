
import java.util.HashMap;
import java.util.Set;

public class DuplicateCharCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="find duplicate character from this string";
		char characters[]=str.toCharArray();
		HashMap<Character, Integer>hm=new HashMap<Character,Integer>();
		
		for(Character c:characters) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
			
		}
		Set<Character>set=hm.keySet();
		System.out.println("Given String:"+str);
		System.out.println("List of duplicate char");
		System.out.println("============================================================");
		
			for(Character c:set) {
				//if(hm.get(c)>1)
				System.out.println(c+"  "+hm.get(c));
				
			}
	}

}
