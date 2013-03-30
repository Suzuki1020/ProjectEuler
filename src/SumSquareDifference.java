/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/03/31
 * Time: 4:06
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference
{
	public long compute(int max)
	{
		return calculateSquareOfSum(max) - calculateSumOfSquare(max);
	}

	/**
	 * 二乗の和を返します
	 * @param max
	 * @return
	 */
	public long calculateSumOfSquare(int max)
	{
		long sum = 0;
		for(int i=1;i <= max;i++)
		{
			sum += Math.pow(i, 2);
		}
		return sum;
	}

	/**
	 * 和の二乗を返します
	 * @param max
	 * @return
	 */
	public long calculateSquareOfSum(int max)
	{
		long sum = max * (max + 1) / 2;
		return (long)Math.pow(sum, 2);
	}

	public static void main(String[] args)
	{
		SumSquareDifference ssd = new SumSquareDifference();
		System.out.println("Answer is " + ssd.compute(100));
	}
}
