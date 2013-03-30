/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/03/31
 * Time: 5:08
 */
public class Problem8_LargestProductInASeries {
	public static final String DIGIT_NUMBER_STR =
					"73167176531330624919225119674426574742355349194934" +
					"96983520312774506326239578318016984801869478851843" +
					"85861560789112949495459501737958331952853208805511" +
					"12540698747158523863050715693290963295227443043557" +
					"66896648950445244523161731856403098711121722383113" +
					"62229893423380308135336276614282806444486645238749" +
					"30358907296290491560440772390713810515859307960866" +
					"70172427121883998797908792274921901699720888093776" +
					"65727333001053367881220235421809751254540594752243" +
					"52584907711670556013604839586446706324415722155397" +
					"53697817977846174064955149290862569321978468622482" +
					"83972241375657056057490261407972968652414535100474" +
					"82166370484403199890008895243450658541227588666881" +
					"16427171479924442928230863465674813919123162824586" +
					"17866458359124566529476545682848912883142607690042" +
					"24219022671055626321111109370544217506941658960408" +
					"07198403850962455444362981230987879927244284909188" +
					"84580156166097919133875499200524063689912560717606" +
					"05886116467109405077541002256983155200055935729725" +
					"71636269561882670428252483600823257530420752963450";

	/**
	 *
	 * @param digitNumberStr    数値文字列
	 * @param perDigitLen       一回に切り出す文字列の長さ
	 * @return
	 */
	public long compute(String digitNumberStr, int perDigitLen)
	{
		//繰り返し終了値
		int endIdx = digitNumberStr.length() - perDigitLen + 1;

		String str;
		long max = Long.MIN_VALUE;
		long product;
		for(int i=0;i < endIdx;i++)
		{
			str = digitNumberStr.substring(i, i + perDigitLen);
			product = productOfConsecutiveDigits(str);
			if(product > max)
			{
				max = product;
			}
		}
		return max;
	}

	/**
	 * 数値文字列の各値の積を返す
	 * @param digitStr
	 * @return
	 */
	public long productOfConsecutiveDigits(String digitStr)
	{
		char[] digits = digitStr.toCharArray();
		long result = 1;
		for(char digit : digits)
		{
			result *= Integer.parseInt(String.valueOf(digit));
		}
		return result;
	}

	public static void main(String[] args)
	{
		Problem8_LargestProductInASeries pro8 = new Problem8_LargestProductInASeries();
		System.out.println("Answer is " + pro8.compute(DIGIT_NUMBER_STR, 5));
	}
}
