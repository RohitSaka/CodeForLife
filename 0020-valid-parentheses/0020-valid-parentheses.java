class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0 ; i < s.length(); i++){
            
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['  ){
                stack.push(s.charAt(i));
            }
            
            else if(s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']' ){
                if(stack.isEmpty()){
                    return false;
                }
                char TopChar = stack.pop();
                
                if(s.charAt(i) == '}' && TopChar == '{' || s.charAt(i) == ')' && TopChar == '(' || s.charAt(i) == ']' && TopChar == '[' ){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
        
    }
}