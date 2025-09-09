public class Swap {
    public static void swap1(int n1,int n2)
    {
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println(n1+" "+n2);
    }
    public static void swap2(int n1,int n2)
    {
        n1=n1*n2;
        n2=n1/n2;
        n1=n1/n2;
        System.out.println(n1+" "+n2);
    }
    public void swap3(int n1,int n2)
    {
        n1=n2-n1+(n2=n1);
        System.out.println(n1+" "+n2);
    }
    public static void main(String[] args) {
        int x=5,y=10;
        swap1(x, y);
    }
}
