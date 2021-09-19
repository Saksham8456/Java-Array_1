import java.util.Scanner;

public class Only14 {
    int n;
    int arr[];
    Only14()
    {
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        arr=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=obj.nextInt();
        }
    }
     public void Only14Display()
     {
         int c=0;
         for (int i = 0; i < arr.length; i++)
         {
            if (arr[i]!=4 && arr[i]!=1)
            {
                c=1;
                break;
            }
         }
         if (c==1)
             System.out.println(false);
         else
             System.out.println(true);
     }
}
class Only14Main
{
    public static void main(String[] args) {
        Only14 obj1=new Only14();
        obj1.Only14Display();
    }
}
