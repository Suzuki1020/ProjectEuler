/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/03/31
 * Time: 2:27
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromeProduct {

	public int compute()
	{
		int value = 0;
		int largestPalindrome = 0;
		for(int i = 999;i >= 100;i--)
		{
			for(int j = 999;j >= 100;j--)
			{
				value = i * j;
				if(value > largestPalindrome && isPalindrome(value))
				{
					largestPalindrome = value;
				}
			}
		}

		return largestPalindrome;
	}

	/**
	 * 第一引数の値が回文数かどうか判定します
	 * @param num
	 * @return  回文数の場合はtrue、そうでない場合はfalse
	 */
	public boolean isPalindrome(int num)
	{
		char[] digits = Integer.toString(num).toCharArray();
		int maxIndex = digits.length - 1;
		int loopNum = digits.length / 2;

		for(int i=0;i<loopNum;i++)
		{
			if(digits[i] != digits[maxIndex - i])
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		LargestPalindromeProduct l = new LargestPalindromeProduct();
		System.out.println("Answer is " + l.compute());
	}
}
