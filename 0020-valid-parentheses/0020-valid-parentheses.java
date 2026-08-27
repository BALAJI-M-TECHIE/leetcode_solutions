class Solution 
{
    public boolean isValid(String s)
    {
        if(s.length()%2==1) return false;
        Stack<Character> stack = new Stack<>();

        for(char x : s.toCharArray())
        {
            if(x == '(' || x == '{' || x == '[')
            {
                stack.push(x);
            }
            else
            {
                if(!stack.isEmpty())
                {
                    if(stack.peek() == '(' && x!=')')
                    {
                        return false;
                    }
                    else if(stack.peek() == '[' && x!=']')
                    {
                        return false;
                    }
                    else if(stack.peek() == '{' && x!='}')
                    {
                        return false;
                    }
                    stack.pop();
                }
                else
                {
                    return false;
                }
                
            }
        }

if(stack.isEmpty())
        return true;
else
  return false;

    }
}