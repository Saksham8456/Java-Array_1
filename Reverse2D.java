import java.util.Scanner;

public class Reverse2D {
    int arr[][];
    Reverse2D()
    {
        Scanner obj =new Scanner(System.in);
        arr=new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                arr[i][j]=obj.nextInt();
            }
        }
    }
   void  Reverse2DDisplay()
    {

        for (int i= arr.length-1;i>=0;i--) {
            for (int j = arr[i].length-1; j >=0 ; j--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
class Reverse2dMain
{
    public static void main(String[] args) {
        Reverse2D obj1=new Reverse2D();
        obj1.Reverse2DDisplay();
    }
}
