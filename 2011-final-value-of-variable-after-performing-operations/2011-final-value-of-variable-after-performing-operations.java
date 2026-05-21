class Solution {
    public int finalValueAfterOperations(String[] operations) {

      int num =0;
       for(String x : operations)
       {
        switch(x)
        {
            case "--X": num--;break;

            case "X--": num--;break;

            case "++X": num++;break;

            default: num++;

        }
       }
        
        return num;
    }
}