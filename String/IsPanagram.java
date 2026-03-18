import java.util.Arrays;
import java.util.Scanner;
// the string is said to be panagram if it contains all the letters of the english alphabet atleast once
class IsPanagram{
    public static boolean isPanagram(String sentence){
       
         int[] freq=new int[26];
        for(int i=0;i<sentence.length();i++)
        {
            freq[sentence.charAt(i)-'a']++;
        }
     
        for(int i=0;i<26;i++)
        {
            if(freq[i]==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        System.out.println(isPanagram(sentence));

        
    }
}