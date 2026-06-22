class Solution {
    public int maxNumberOfBalloons(String text) {

/*

  /// EXTREME NAIVE APPROACH
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('b',0);
         map.put('a',0);
          map.put('l',0); map.put('o',0); map.put('n',0);

        for(int i =0;i<text.length();i++)
        {
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);

        }

        int count = 0;

        int[] arr = new int[5];

        String need = "balon";

        arr[0]=map.get('b');
        arr[1]=map.get('a');
        arr[2]=map.get('l')/2;
        arr[3]=map.get('o')/2;
        arr[4]=map.get('n');

        int min_count = arr[0];
        int min = 1000000;
        if(min_count == 0)
        {
            return 0;
        }

        else
        {
            

            for(int i = 0;i<arr.length;i++ )
            {
                if(arr[i]<min)
                {
                    min = arr[i];
                }
            }
            
        }
       
return min;

*/

int[] arr = new int[5];

for(int i =0;i<text.length();i++)
{
    
            if(text.charAt(i) == 'b')
            {
                arr[0]++;
            }
            else if(text.charAt(i) == 'a')
            {
                arr[1]++;
            }
            else if(text.charAt(i) == 'l')
            {
                arr[2]++;
            }
            else if(text.charAt(i) == 'o')
            {
                arr[3]++;
            }
            else if(text.charAt(i) == 'n')
            {
                arr[4]++;
            }
        
        
    
}

arr[2]/=2;
arr[3]/=2;

int min = 2000;

for(int x : arr)
{
    if(x<min)
    {
        min = x;
    }
}

return min;
        
    }
}