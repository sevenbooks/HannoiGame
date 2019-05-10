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
		
		// 合法性判断
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
	 * 第二个方法
	 * @param str
	 * @return
	 */
//	public static int myAtoi(String str) {
//	    // 合法性判断
//	    if (str.isEmpty()) return 0;
//
//	    // 正负号标记
//	    int sign = 1;
//
//	    // 转换值
//	    int base = 0;
//
//	    // 索引位数
//	    int i = 0;
//
//	    // 剔除开始空白字符
//	    while (str.charAt(i) == ' ')
//	        i++;
//
//	    // 判断正负号
//	    if (str.charAt(i) == '-' || str.charAt(i) == '+')
//	        sign = str.charAt(i++) == '-' ? -1 : 1;
//
//	    // 索引有效数字字符
//	    while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//
//	        // that statement is used to test if the num is bigger than INT_MAX after the str[i] is handled, if base > INT_MAX/10, 
//	        // then base10+ str[i] -‘0’> base10>INT_MAX, or when base== INT_MAX/10, that means all the places are the same as INT_MAX except the ones place, so str[i]>‘7’ is needed. 
//	        // 上面这段是LeetCode国外站对下面代码的解释。
//	        // 简单来说就是
//	        // 如果`base > MAX_VALUE/10`，那么`base*10 + new_value` > `base*10` > `MAX_VALUE`。这个应该很容易理解，这种情况下就会发生溢出。
//	        // 若`base == INT_MAX/10`，而且`new_value = str.charAt(i++) - '0'`大于`7`，也会发生溢出。因为`MAX_VALUE = 2147483647`
//	        if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
//	            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//	        }
//
//	        // 计算转换值
//	        base = 10 * base + (str.charAt(i++) - '0');
//	    }
//
//	    // 计算结果值
//	    return base * sign;
//	}
}
