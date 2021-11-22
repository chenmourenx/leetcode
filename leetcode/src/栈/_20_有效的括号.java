package 栈;

import java.util.Stack;

public class _20_有效的括号 {
    class Solution {
//		//暴力枚举
//	    public boolean isValid(String s) {
//	    	//contains方法判断字符串是否包含某字符
//	    	while(s.contains("()")
//	    		||s.contains("[]")
//	    		||s.contains("{}")) {
//	    			//replace方法，将什么替换成什么
//	    			s=s.replace("()", "");
//	    			s=s.replace("[]", "");
//	    			s=s.replace("{}", "");
//	    	}
//	    	//判断字符串是否为空，为空返回true，否则返回false
//	    	return s.isEmpty();
//	    }


        //栈方法1
//		public boolean isValid(String s) {
//			//创建一个栈
//			Stack<Character> stack = new Stack<>();
//			
//			//字符串长度
//			int len = s.length();
//			for (int i = 0; i < len; i++) {
//				//charAt(索引) 返回指定位置的字符串
//				char c = s.charAt(i);
//				if(c=='('||c=='['||c=='{') {//如果c是左括号，就放入栈
//					stack.push(c);
//				}else {//如果c是右括号
//					//先判断栈是否为空，为空的话就说明不是有效括号
//					if(stack.isEmpty())	return false;
//					
//					//不为空，就把左括号弹出栈
//					char left=stack.pop();
//					//比较弹出栈的左括号和c是否匹配
//					if(left=='('&&c!=')')	return false;
//					if(left=='['&&c!=']')	return false;
//					if(left=='{'&&c!='}')	return false;
//				}
//			}
//			//如果栈为空，说明都两两匹配了，是有效括号
//			return stack.isEmpty();
//	    }


        //栈方法2
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            if (s.isEmpty()) return true;

            //for循环，toCharArray方法让字符串变成数组，然后让c分别等于数组中的元素
            for (char c : s.toCharArray()) {
                //如果c是左括号，则将右括号入栈
                if (c == '(') stack.push(')');
                else if (c == '[') stack.push(']');
                else if (c == '{') stack.push('}');
                    //如果c是右括号，则把栈中的有括号弹出，和c做对比，不对的话则说明之前没有对应的左括号
                    //如果栈为空，说明c是单独的有括号，不可能和前面的有对应
                else if (stack.isEmpty() || c != stack.pop()) return false;
            }
            return stack.isEmpty();
        }


    }
}
