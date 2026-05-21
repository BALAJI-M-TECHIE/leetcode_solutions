class Solution {
    public int romanToInt(String s) {
 
 HashMap<Character,Integer> map = new HashMap<>();

map.put('I',1);
map.put('V',5);
map.put('X',10);
map.put('L',50);
map.put('C',100);
map.put('D',500);
map.put('M',1000);



 int lastCheck = 1001;
 int sum = 0;
 int lastNum =0;
 
 for(int i = 0 ; i<s.length();i++)
 {
    if(lastCheck>=map.get(s.charAt(i)))
    {
        sum+=map.get(s.charAt(i));
        lastCheck=map.get(s.charAt(i));
        lastNum = map.get(s.charAt(i));
    }
    else
    {
       sum = sum - (2*lastNum);
       sum+=map.get(s.charAt(i));
       lastNum= map.get(s.charAt(i));
       lastCheck=map.get(s.charAt(i));
    }
 }
        
        return sum;


      
    }
}