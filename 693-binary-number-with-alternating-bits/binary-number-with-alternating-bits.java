class Solution {
    public boolean hasAlternatingBits(int n) {

        String binary = "";

        while(n>0){
            binary = (n%2) + binary;
            n=n/2;
        }
        
        for(int i=1; i<binary.length(); i++){
            if(binary.charAt(i)==binary.charAt(i-1)) return false;
        }

        return true;
    }
}