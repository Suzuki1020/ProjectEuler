/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/04/01
 * Time: 22:48
 */
public class Problem10_SummationOfPrimes {

	public long compute(int max)
	{
		long ans = 0;

		for (int i = 2; i < max; i++)
		{
			if(isPrime(i))
			{
				ans += i;
			}
		}

		return ans;
	}

	/**
	 * 素数かどうか判定する
	 *
	 * @param num
	 * @return 素数の場合はtrue、そうでない場合はfalse
	 */
	public boolean isPrime(int num)
	{
		int end = (int) Math.sqrt(num);
		for (int i = 2; i <= end; i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		Problem10_SummationOfPrimes pro = new Problem10_SummationOfPrimes();
		System.out.println("Answer is " + pro.compute(2000000));
	}
}
