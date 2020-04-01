class Solution {
    public boolean isPerfectSquare(int num) {
        double value = Math.sqrt(num);
        int    val = (int)value;
        
        if(num==val*val){return true;}
        else return false;
    }
}
