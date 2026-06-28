class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
                    /* 

                        TRIED 2 POINTER AND ARRAY TO NOTE THE ,1,2 REPRESENT SAME ANAGRAM : 

                    List<List<String>> al = new ArrayList<> ();
                    
            

                int[] arr = new int[strs.length];

                int outer = 0;
                int mark = 1;
                while(outer<strs.length)
                {
                    arr[0]=mark;

                    int inner = outer+1;
                    while(inner<strs.length)
                    {
                        if(isAnagram(strs[outer],strs[inner]))
                        {
                            arr[inner]=mark;
                        }
                    }

                    mark++;

                int neww = 0;
                while(arr[neww]>0)
                {
                    neww++;
                }
                outer = neww;

                }

                    // pick the all elements based on number equal in array;
                    // fixing size for the arraylist : 

                    int max = 0;
                    for(int i =0;i<arr.length;i++)
                    {
                        if(arr[i]>max)
                        {max = arr[i];}
                    }
                    for(int i =0;i<max;i++)
                    {
                        al.add(new ArrayList<>());
                    }

                    for(int i =0;i<arr.length;i++)
                    {
                        al.get(arr[i]-1).add(strs[i]);
                    }

                    return al;
                }

                boolean isAnagram(String a, String z)
                {
                    int[] arr_count =  new int[123];

                    for(int i = 0;i<a.length();i++)
                    {
                        arr_count[a.charAt(i)] ++;
                    }
                    for(int i = 0;i<z.length();i++)
                    {
                        arr_count[z.charAt(i)] --;
                    }

                    for(int i = 97;i<123;i++)
                    {
                        if(arr_count[i] > 0)
                        {
                            return false;
                        
                        }
                    }

                    return true;

                }
                */
    List<List<String>> al = new ArrayList<>();

    int[] arr_mark = new int[strs.length];

    int mark = 1;
    int i ;
   for( i =0;i<strs.length;)
   {    
   
   arr_mark[i]=mark;
        
        for(int j =i+1;j<strs.length;j++)
        {
            if(arr_mark[j]==0 && isAnagram(strs[i],strs[j]))
            {
                arr_mark[j]=mark;;
            }
            
        }

        int next_place = i+1;

        while(next_place<strs.length)
        {
             if(arr_mark[next_place]!=0)
                {
                    next_place++;
                }
                else
                {
                    break;
                }
        }
       
            i = next_place;
            mark++;
        
        
   }

   for(int k =0;k<mark-1;k++)
   {
    al.add(new ArrayList<>());
   }

   for(int l =0;l<arr_mark.length;l++)
   {
    al.get(arr_mark[l]-1).add(strs[l]);
   }

return al;
    }

boolean isAnagram(String a, String z)
    {

        if(a.length()!=z.length())
        {
            return false;
        }
        int[] arr_count =  new int[26];

        for(int i = 0;i<a.length();i++)
        {
            arr_count[a.charAt(i)-'a'] ++;
        }
        for(int i = 0;i<z.length();i++)
        {
            arr_count[z.charAt(i)-'a'] --;
        }

        for(int i = 0;i<26;i++)
        {
            if(arr_count[i] != 0)
            {
                return false;
            
            }
        }

        return true;

    }
}