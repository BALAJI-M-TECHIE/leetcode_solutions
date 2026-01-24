class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = left ;i<=right ; i++)
        {
            int num = i;
            int x = num;
           boolean ok = true;
            while(x>0)
            {
                
                int last_digit = x%10;
                if(last_digit == 0 || num%last_digit != 0)
                {
                    ok = false;
                    break;
                }
                x/=10;
                
            }
            if(ok)
            {
                arr.add(num);
            }

        }

        return arr;
    }
}