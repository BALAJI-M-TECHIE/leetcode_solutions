class Solution {
    public int maxProduct(int n) {

        // storing the each digits in the arraylist and sort it multiple the last 2 : 

        ArrayList<Integer> al = new ArrayList<>();

        while(n>0)
        {
            al.add(n%10);
            n=n/10;
        }

        Collections.sort(al);
        return al.get(al.size()-1)*al.get(al.size()-2);
        
    }
}