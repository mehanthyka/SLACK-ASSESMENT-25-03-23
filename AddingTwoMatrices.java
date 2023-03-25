public class AddingTwoMatrices
{
    public static void main(String args[])
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,1,1},{1,1,1},{1,1,1}};
        int c[][]=new int[3][3];
        System.out.println("Elements of Matrix 1:");
        for(int i = 0;i<3;i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Elements of Matrix 2:");
        for(int i = 0;i<3;i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Elements after adding two Matrices:");
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}