import java.util.Scanner;

public class Sum67 {
    int n,sum;
    int arr[];
    Sum67()
    {
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        sum=0;
        arr=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=obj.nextInt();
        }
    }
    void Sum67Sum()
    {
        int f1=0,f2=0,i,j;
        for ( i = 0; i < arr.length; i++)
        {
            if (arr[i]==6)
            {
                f1=1;
                break;
            }
        }
        for ( j = 0; j < arr.length; j++)
        {
            if (arr[j]==7)
            {
                f2=1;
            }
        }
        if (f1==1 && f2==1 )
        {
            for (int k = 0; k < arr.length; k++)
            {
              if (k>=i && k<=j)
              {
                  continue;
              }
              else
                  sum=sum+arr[k];
            }
        }
        else
        {
            for (int l = 0; l < arr.length; l++)
            {
                sum=sum+arr[l];
            }
        }
        System.out.println(sum);

    }

}
class Sum67Main
{
    public static void main(String[] args) {
        Sum67 obj2=new Sum67();
        obj2.Sum67Sum();
    }
}
