class Solution {
    public int numOfStrings(String[] patterns, String word) {


/// BRUTE APPROACH : STOARE ALL THE SUBSTRINGS AND THEN CKECK AND COUNTS: 
        String[] arr = new String[(word.length()*(word.length()+1))/2];

        int k =0;
        for(int i =0;i<word.length();i++)
        {
            for(int j = i+1;j<word.length()+1;j++)
            {
                arr[k++]=word.substring(i,j);
            }
        }

        int count =0;

        for(int i =0;i<patterns.length;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                if(patterns[i].equals(arr[j]))
                {
                    count++;
                    break;
                }
            }
        }

        return count;
        
    }
}