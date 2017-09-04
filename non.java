import java.util.*;
public class non
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b[]=new int[a];
        int i,j,k=0;
        for(i=0;i<a;i++)
        {
         b[i]=n.nextInt();
        }
        for(i=0;i<a;i++)
        {
            k=0;
            for(j=0;j<a;j++)
            {
                if(b[i]==b[j]&&i!=j)
                {
                    k=1;
                    break;
                }
            }
            if(k!=1)
            {
                System.out.println(b[i]);
            }
        }
    }
}
