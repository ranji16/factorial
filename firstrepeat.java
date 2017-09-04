import java.util.*;
public class firstrepeat
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b[]=new int[a];
        int i,j;
        for(i=0;i<a;i++)
        {
         b[i]=n.nextInt();
        }
        for(i=0;i<a;i++)
        {
            for(j=i+1;j<a;j++)
            {
                if(b[i]==b[j])
                {
                    System.out.println(b[i]);
                    System.exit(0);
                }
                
            }
        }
    }
}
