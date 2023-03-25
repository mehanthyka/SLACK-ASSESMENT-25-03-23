public class Copyarray
{
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]=new int[a.length];
        b=a;
        System.out.println("Eements of Original array");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println( );
        System.out.println("Elements of New array");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println( );
    }
}