import java.util.*;
public class StreamFirstNon_repeating {
    public static void main(String[] args) {
        String stream = new Scanner(System.in).nextLine();
        System.out.println("First non-repeating characters in the stream: " + firstNonRepeating(stream));
    }
    static String firstNonRepeating(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        Queue<Character> nonrep=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(!freq.containsKey(s.charAt(i)))
            {
                freq.put(s.charAt(i),1);
            }
            else
            {
                freq.put(s.charAt(i),freq.get(s.charAt(i))+1);
            }
            nonrep.offer(s.charAt(i));
            
            while(!nonrep.isEmpty() && freq.get(nonrep.peek())>1)
                {
                    nonrep.poll();
                }
            
            if(nonrep.isEmpty())
            {
                sb.append("#");
            }
            else
            {
                sb.append(nonrep.peek());
            }
        }
        return sb.toString();
    }
    
}