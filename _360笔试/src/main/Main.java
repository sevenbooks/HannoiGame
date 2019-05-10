package main;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			String str = sc.nextLine();
			int i = myAtoi(str);
			System.out.println(i);
		}
	}
	
	public static int myAtoi(String str) {
		
		// �Ϸ����ж�
	    if (str.isEmpty()) return 0;
	    if(str.contains(" ")) {
	    	return 0;
	    }
		int n = str.length();
		int i = 0;
		while(i < n && str.charAt(i) == ' ') {
			i++;
		}
		if(i == n || !((str.charAt(i) == '+') || (str.charAt(i) == '-') ||(str.charAt(i) >= '0' && str.charAt(i) <= '9'))) {
			return 0;
		}
		StringBuilder stringBuilder = new StringBuilder();
		if(str.charAt(i) == '-') {
			stringBuilder.append('-');
			i++;
		}else if(str.charAt(i) == '+') {
			i++;
		}
		if(i == n || !(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
			return 0;
		}
		while(i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			stringBuilder.append(str.charAt(i));
			i++;
		}
		
//		if(i != n) {
//			return 0;
//		}
		try {
			return Integer.valueOf(stringBuilder.toString());
		}catch (Exception e) {
			if(stringBuilder.substring(0, 1).equals("-")) {
				return Integer.MIN_VALUE;
			}else {
				return Integer.MAX_VALUE;
			}
		}
    }
	
	
	
	/**
	 * �ڶ�������
	 * @param str
	 * @return
	 */
//	public static int myAtoi(String str) {
//	    // �Ϸ����ж�
//	    if (str.isEmpty()) return 0;
//
//	    // �����ű��
//	    int sign = 1;
//
//	    // ת��ֵ
//	    int base = 0;
//
//	    // ����λ��
//	    int i = 0;
//
//	    // �޳���ʼ�հ��ַ�
//	    while (str.charAt(i) == ' ')
//	        i++;
//
//	    // �ж�������
//	    if (str.charAt(i) == '-' || str.charAt(i) == '+')
//	        sign = str.charAt(i++) == '-' ? -1 : 1;
//
//	    // ������Ч�����ַ�
//	    while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//
//	        // that statement is used to test if the num is bigger than INT_MAX after the str[i] is handled, if base > INT_MAX/10, 
//	        // then base10+ str[i] -��0��> base10>INT_MAX, or when base== INT_MAX/10, that means all the places are the same as INT_MAX except the ones place, so str[i]>��7�� is needed. 
//	        // ���������LeetCode����վ���������Ľ��͡�
//	        // ����˵����
//	        // ���`base > MAX_VALUE/10`����ô`base*10 + new_value` > `base*10` > `MAX_VALUE`�����Ӧ�ú�������⣬��������¾ͻᷢ�������
//	        // ��`base == INT_MAX/10`������`new_value = str.charAt(i++) - '0'`����`7`��Ҳ�ᷢ���������Ϊ`MAX_VALUE = 2147483647`
//	        if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
//	            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//	        }
//
//	        // ����ת��ֵ
//	        base = 10 * base + (str.charAt(i++) - '0');
//	    }
//
//	    // ������ֵ
//	    return base * sign;
//	}
}
