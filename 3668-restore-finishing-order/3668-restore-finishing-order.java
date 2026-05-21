class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int[] arr = new int[friends.length];

        for(int x : friends)
        {
            map.put(x,x);
        }

      int i = 0;
        for(int x : order)
        {
            if(map.containsValue(x))
            {
              arr[i] = x;
              i++;
            }
        }

        return arr;
    }
}