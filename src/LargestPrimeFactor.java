import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/03/30
 * Time: 2:21
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor {

	public long compute(long value)
	{
		long l;

		//その値と1以外で割り切れなくなるまで値を割り続ける
		while ((l = calculateMinDivisibleValue(value)) != value)
		{
			value /= l;
		}
		return value;
	}

	/**
	 * 2以上で割り切れる最小の値を返す
	 * @param value
	 * @return
	 */
	public long calculateMinDivisibleValue(long value)
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

	public static void main(String[] args)
	{
		LargestPrimeFactor l = new LargestPrimeFactor();
		System.out.println("Answer is " + l.compute(600851475143L));
	}
}
