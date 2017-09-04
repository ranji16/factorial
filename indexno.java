import java.util.*;
public class indexno
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        String a="";
        int []d=new int[b];
        for(int i=0;i<d.length;i++)
        {
          d[i]=sc.nextInt();
          if(i==d[i])
          {
             a=a+d[i]+" ";
          }
        }
        System.out.println(a.trim());
    }
}
