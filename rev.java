import java.util.*;
public class reversedigits
{
    public static void main(String[] s)
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        String b=String.valueOf(a);
        StringBuffer sb=new StringBuffer(b);
        sb.reverse();
        System.out.println(sb);
    }
}
