import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public String largestNumber(int[] input) {
		String[] numsToStrings = new String[input.length];
	    for(int i=0;i<input.length;i++) numsToStrings[i] = String.valueOf(input[i]);

	    Comparator<String> comp = new Comparator<String>(){
	        @Override
	        public int compare(String s1, String s2){
	            String str1 = s1 + s2;
	            String str2 = s2 + s1;
	            return str2.compareTo(str1);
	        }
	    };

	    Arrays.sort(numsToStrings, comp);
	 	// In edge case
	    if(numsToStrings[0].charAt(0) == '0') return "0";

	    StringBuilder sb = new StringBuilder();

	    for(String s:numsToStrings){
	        sb.append(s);
	    }
	    return sb.toString();

		}
}
