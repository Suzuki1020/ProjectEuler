/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/03/31
 * Time: 4:50
 */
public class Problem7_10001stPrime {

	public int compute(int index)
	{
		int ans = 0;
		int primeCount = 0;
		int num = 2;
		while(true)
		{
			if(isPrime(num))
			{
				//素数の場合
				primeCount ++;

				if(primeCount == index)
				{
					//指定した番目の素数のためループから抜ける
					ans = num;
					break;
				}
			}
			num ++;
		}
		return ans;
	}

	/**
	 * 素数かどうか判定する
	 * @param num
	 * @return  素数の場合はtrue、そうでない場合はfalse
	 */
	public boolean isPrime(int num)
	{
		int end = (int)Math.sqrt(num);
		for (int i = 2; i <= end; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		Problem7_10001stPrime pro7 = new Problem7_10001stPrime();
		System.out.println("Answer is " + pro7.compute(10001));
	}
}
