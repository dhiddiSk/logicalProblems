import java.util.HashMap;

public class MajorityElement {
		public int majorityElement(int[] nums) {
	        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	        
	        for(int i:nums){
	            if(!hm.containsKey(i)){
	                hm.put(i,1);
	            }else{
	                hm.put(i,(hm.get(i)+1));
	            }
	            if(hm.get(i)>(nums.length/2)){
	                return i;
	            }
	        }
	        return 0;
	    }
}
