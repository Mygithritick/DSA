public class FibonacciSeries {
    public static void series(int limit)
    {
        int n1=0,n2=1;
        System.out.print(n1+" "+n2);
        for(int i=2;i<limit;i++)
        {
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }
    public static void main(String[] args) {
        series(10);
    }
    
}
