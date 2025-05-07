
class Solution 
{
    public String[] findWords(String[] words) 
    {
        return Stream.of(words).filter(s -> s.matches("(?i)^[qwertyuiop]+|[asdfghjkl]+|[zxcvbnm]+$")).toArray(String[]::new);
    }
}