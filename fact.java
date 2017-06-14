import java.util.*;
public class factorial
{
    public static void main(String[] s)
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int i,sum=1;
        for(i=1;i<=a;i++)
        {
           sum=sum*i; 
        }
        System.out.println(sum);
    }
}
