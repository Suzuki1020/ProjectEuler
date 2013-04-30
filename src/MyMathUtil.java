import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/05/01
 * Time: 3:12
 */
public class MyMathUtil {

	/**
	 * 素数かどうか判定する
	 * @param num
	 * @return  素数の場合はtrue、そうでない場合はfalse
	 */
	static public boolean isPrime(long num)
	{
		long end = (long)Math.sqrt(num);
		for (long i = 2; i <= end; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * 2以上で割り切れる最小の値を返す
	 * @param value
	 * @return
	 */
	static public long calculateMinDivisibleValue(long value)
	{
		if(Math.abs(value) <= 1)
		{
			//絶対値が1以下なら何もせず返す
			return value;
		}

		int end = (int) Math.sqrt(value);
		for (int i = 2; i <= end; i++)
		{
			if (value % i == 0)
			{
				//割り切れたのでその値を返す
				return i;
			}
		}

		//割り切れなかったので引数の値をそのまま返す
		return value;
	}

	/**
	 * 素因数分解する
	 * @return
	 */
	static public ArrayList<Long> factorizeIntoPrimeFactors(long value)
	{
		ArrayList<Long> result = new ArrayList<Long>();

		long l;

		//1になるまで素因数で割り続ける
		while((l = calculateMinDivisibleValue(value)) != 1)
		{
			result.add(l);
			value /= l;
		}

		return result;
	}
}
