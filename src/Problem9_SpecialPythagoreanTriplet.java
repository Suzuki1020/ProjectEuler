/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/03/31
 * Time: 5:45
 */
public class Problem9_SpecialPythagoreanTriplet {

	public int compute(int abcSum)
	{
		int c;
		for (int a = 1; a <= abcSum; a++)
		{
			for (int b = a + 1; b < (c = (abcSum - a - b)); b++)
			{
				if (isPythagoras(a, b, c))
				{
					return a * b * c;
				}
			}
		}
		return -1;
	}

	/**
	 * 3つの自然数がピタゴラス数かどうか判定します
	 * @param a
	 * @param b
	 * @param c
	 * @return  ピタゴラス数の場合はtrue、そうでない場合はfalse
	 */
	public boolean isPythagoras(long a, long b, long c)
	{
		if(a > b || a > c || b > c)
		{
			return false;
		}

		long sqA = (long) Math.pow(a, 2);
		long sqB = (long) Math.pow(b, 2);
		long sqC = (long) Math.pow(c, 2);

		if (sqA + sqB == sqC)
		{
			return true;
		}

		return false;
	}

	public static void main(String[] args)
	{
		Problem9_SpecialPythagoreanTriplet pro = new Problem9_SpecialPythagoreanTriplet();
		System.out.println("Answer is " + pro.compute(1000));
	}
}
