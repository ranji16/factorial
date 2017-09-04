import java.util.*;
public class sum
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b[]=new int[a];
        int i,j,sum=0,se=0,sr=0,max=65000;
        for(i=0;i<a;i++)
            b[i]=n.nextInt();
        Arrays.sort(b);
        for(i=0;i<a-1;i++)
        {sum=0;
           for(j=i+1;j<a;j++)
           {
               sum=b[i]+b[j];
               if(Math.abs(sum)<Math.abs(max))
               {
                   max=sum;
                   se=b[i];
                   sr=b[j];
                   sum=0;
               }
               else
               sum=0;
           }
        }
        System.out.println(se+" "+sr);
    }
}
