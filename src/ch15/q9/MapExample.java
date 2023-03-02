package ch15.q9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue",96);
		map.put("hong",86);
		map.put("white",92);
	
		String name = null;
		int maxScore = 0;
		int totalScore = 0; // �̰� ������ ������ �������� ���ذ�..
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			if(maxScore<map.get(key)){
				maxScore = map.get(key);
				name = key;
			}
			
		}
		System.out.println("�ְ� ����:"+maxScore);
		System.out.println("�ְ� ������ ���� ���"+name);
	
	
	}
	
	
	
}
