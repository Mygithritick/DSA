public class HappyNumbers {
    public static boolean check(int num)
    {
        while(num!=4 && num!=1)
        {
            int sum=0;
            while(num>0)
            {
                int a=num%10;
                num/=10;
                sum=sum+a;
            }
            num=sum;

        }
        if(num==1)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        System.out.println(check(82));
    }
    
}
