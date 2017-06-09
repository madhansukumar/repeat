import java.util.*;
public class Repeat {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j,n,flags=0;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                   
                    flags++; 
                    break;
                }
            }
            if(flags!=0)
                break;
        }
        if(i==n)
        {
            System.out.print("NON REPEATED");
        }
        else
        {
            System.out.print(a[i]);
        }
    }
    
}
