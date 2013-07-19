import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: tsugutoshi_aoshima
 * Date: 13/07/19
 * Time: 10:23
 * To change this template use File | Settings | File Templates.
 */
public class Problem16_PowerDigitSum {

	/**
	 * @param base		底
	 * @param index	指数
	 * @return
	 */
	public BigInteger compute(int base,int index)
	{
		BigInteger result = new BigInteger(String.valueOf(base));
		result = result.pow(index);
		return result;
	}


	public long sumValueOfDigit(BigInteger value)
	{
		long result = 0;

		char[] valueChars = value.toString().toCharArray();
		for(char c : valueChars)
		{
			result += Long.parseLong(String.valueOf(c));
		}

		return result;
	}


	public static void main(String[] args)
	{
		Problem16_PowerDigitSum pds = new Problem16_PowerDigitSum();
		System.out.println("Answer is " + pds.sumValueOfDigit(pds.compute(2, 1000)));
	}
}
