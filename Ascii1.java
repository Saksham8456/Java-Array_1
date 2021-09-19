import java.util.Scanner;

public class Ascii1 {
    int n;
    int arr[];
    Ascii1()
    {
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        arr=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=obj.nextInt();
        }
    }
    void Ascii1Main()
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.printf("%c\n",arr[i]);
        }
    }
}
class Ascii1Main {
    public static void main(String[] args) {
        Ascii1 obj1=new Ascii1();
        obj1.Ascii1Main();

    }
}
