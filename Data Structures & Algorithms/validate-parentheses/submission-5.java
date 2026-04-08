class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();

        //edge case 
        if(s.length() <= 1){
            return false;
        }


        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ){
                myStack.push(s.charAt(i));
            }
            else {
                switch(s.charAt(i)){
                   case ')' :
                    if(myStack.isEmpty() || myStack.pop() != '('){
                        return false;
                    }
                    break;
                    
                   case ']' :
                    if(myStack.isEmpty() || myStack.pop() != '['){
                        return false;
                    }
                    break;
                    
                   case '}' :
                    if(myStack.isEmpty() || myStack.pop() != '{'){
                        return false;
                    }
                    break; 
                    

                }
            }
        }
        return myStack.isEmpty(); 

    }
}
