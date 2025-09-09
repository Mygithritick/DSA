public class BinaryToDecimal {
    public static void convert(int n){
    int sum=0;int count=0;
    while(n>0)
    {
        int mod=n%10;
        n/=10;
        sum=sum+(int)Math.pow(2,count)*mod;
        count++;

    }
    System.out.println(sum);
    
}
public static void main(String[] args) {
    convert(1101);
}
}
