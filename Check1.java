import java.util.Scanner;

public class Check1 {
    int n,ele,arr[];
    Check1()
    {
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        ele=obj.nextInt();
        arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=obj.nextInt();
        }
    }
    void check1Display(){
        int f=0,i;
         for ( i = 0; i < arr.length; i++) {
             if (arr[i]==ele)
             {
                 f=1;
                 break;
             }
         }
         if (f==0)
         {
             System.out.println(-1);
         }
         else
             System.out.println(i);
    }
}
class Class1Main {
    public static void main(String[] args) {
        Check1 obj1=new Check1();
        obj1.check1Display();
    }
}

