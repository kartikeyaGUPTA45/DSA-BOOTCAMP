class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        int reverseX = 0, temp = x;

        while(temp>0){
            reverseX = reverseX*10+temp%10;
            temp/=10;
        }

        return reverseX == x? true: false;
    }
}
