package stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class _20��Ч������ {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="[()][][]";
solution20 s1=new solution20();
System.out.println(s1.isValid(s));

	}

}
class solution20{
	/*
	 * 1.�Ƚ��ж��ַ���s�������ж�
	 * ȡ��Ϊ1ʱֱ�Ӵ��󣨣�{}[]
	 */
	public boolean isValid(String s) {
		int n= s.length();
		if (n%2==1) {
			return false;
		}
		/*
		 * ����һ��hash�� pairs��ţ����������ļ�ֵ��Ӧ��ϵ
		 */
		Map<Character, Character> pairs=new HashMap<Character, Character>(){
			{
				put(')', '(');
				put(']', '[');
				put('}', '{');
			}
		};
		/*
		 * dequeʲô��˼��֪��>=<
		 * deque ˫��˿�
		 * ������һ���������͵�stack������ַ�����
		 */
		Deque<Character> stack=new LinkedList<Character>();
		
		for (int i = 0; i < n; i++) {
		/*
		 * char��charAt����>=<
		 * Ӧ���ǽ�s�ַ����е�ÿ���ַ��ŵ�ch�а�*=*
		 */
			char ch=s.charAt(i);
			/*
			 * ���hash��pairs�����ַ���ch
			 * ���ң���������
			 */
			if (pairs.containsKey(ch)) {
				if (stack.isEmpty()||stack.peek()!=pairs.get(ch)) {
					return false;
				}
				stack.pop();
			}else {
				stack.push(ch);
			}
		}
		return stack.isEmpty();
	}
}
