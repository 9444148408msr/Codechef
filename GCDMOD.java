import java.util.*;
import java.math.*;
class GCDMOD
{
	public static long gcd(long a,long b)
	{
		if(b==0)
			return a%(1000000007);
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        for (int i=0;i<t;i++) 
        {
			long a=sc.nextLong();
			long b=sc.nextLong();
			long n=sc.nextLong();
			if(a!=b)
			{
				BigInteger x= new BigInteger(""+a).modPow(new BigInteger(""+n), new BigInteger(""+Math.abs(a-b)));
				BigInteger y= new BigInteger(""+b).modPow(new BigInteger(""+n), new BigInteger(""+Math.abs(a-b)));
				long k=x.longValue();
				long l=y.longValue();
				System.out.println(gcd(k+l,Math.abs(a-b)));
			}
			else
			{
				BigInteger x= new BigInteger(""+a).modPow(new BigInteger(""+n), new BigInteger(""+1000000007));
				BigInteger y= new BigInteger(""+b).modPow(new BigInteger(""+n), new BigInteger(""+1000000007));
				long k=x.longValue();
				long l=y.longValue();
				System.out.println(gcd(Math.abs(a-b),k+l));	
			}
		}
	}
}