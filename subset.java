import java.util.*;
public class subset
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int e=0,i,j;
        int []b=new int[a];
        for(i=0;i<b.length;i++)
        {
          b[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        int []d=new int[c];
        for(i=0;i<d.length;i++)
        {
          d[i]=sc.nextInt();
        }
        for(i=0;i<c;i++)
        {
          for(j=0;j<a;j++)
          {
              if(d[i]==b[j])
              {
                  e++;
              }
          }
        }
        if(e>=c)
        {
            System.out.println("a1 is a subset of a2");
        }
    }
}
