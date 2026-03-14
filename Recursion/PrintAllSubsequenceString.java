
public class PrintAllSubsequenceString {
    public static void main(String[] args) {
        String str="abc";
        printSubsequence(str, 0, new StringBuilder());
    }
    public static void printSubsequence(String str,int i,StringBuilder sb)
    {
        if(i==str.length())
        {
            System.out.println(sb.toString());
            return;
        }
        // include
        sb.append(str.charAt(i));
        printSubsequence(str, i+1, sb);
        // exclude
        sb.deleteCharAt(sb.length()-1);
        printSubsequence(str, i+1, sb);
    }
}
