class Solution {
    public boolean isPalindrome(String s) {

        String lowercasedS = s.toLowerCase();
        String updatedS = lowercasedS.replaceAll("[^a-zA-Z0-9]", "");

        for(int i = 0 ; i < updatedS.length()/2 ; i++){
            
            int j = updatedS.length() - 1 - i; 
            if(updatedS.charAt(i) != updatedS.charAt(j)){
                return false;
            }

        }

        return true; 
    }
}
