package DS_0210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {
		
//
//				Input: strs = ["eat","tea","tan","ate","nat","bat"]
//				Output: [[“bat”],[“nat”,“tan”],[“ate”,“eat”,“tea”]]
		Solution obj1 = new Solution();
		String[] input = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> result = obj1.groupAnagrams(input);
		for(List<String> str: result) {
			System.out.println(str);
		}
	}
	
	private List<List<String>> groupAnagrams(String[] strs){
		
		//corner case
		if(strs == null || strs.length==0) {
			return new ArrayList<>();
		}
		//general case
		Map<String, List<String>> map = new HashMap<>();
		for(String s: strs) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String sKey = String.valueOf(charArray);
			if(!map.containsKey(sKey)) {
				map.put(sKey, new ArrayList<String>());
			}
			map.get(sKey).add(s);
			
			
		}		
		return new ArrayList<>(map.values());
	}

}
