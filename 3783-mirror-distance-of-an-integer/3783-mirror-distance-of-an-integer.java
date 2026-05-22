class Solution {
    public int mirrorDistance(int n) {

             if(n<10)
                return 0;

              else
              {
                int revNum=0;
                int num = n;

                while(num>9)
                {
                    revNum= revNum*10+(num%10);
                    num = num/10;
                }
                revNum=revNum*10+ num;

                return Math.abs(n - revNum);
              }



/* /// USING STRING
        if(n<10)
        return 0;

        else
        {
            String current = ""+n;
            String rev ="" ;

            for(int i = current.length()-1 ; i>=0 ;i--)
            {
                rev+=current.charAt(i);
            }

            int revNum = Integer.parseInt(rev);

            return Math.abs(n - revNum);


        }


        */
    }
}