/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/05/01
 * Time: 5:47
 */
public class Problem14_LongestCollatzSequence {

	public long compute(int endValue)
	{
		int maxTermLength = 0;
		int maxStartNum = 0;
		for(int i = 1; i < endValue;i ++)
		{
			long termValue = i;
			int termLength = 1;

			do
			{
				//1になるまで続ける
				termValue = calculateCollatzValue(termValue);
				termLength ++;
			}
			while(termValue > 1);

			if(termLength > maxTermLength)
			{
				maxTermLength = termLength;
				maxStartNum = i;
			}
		}

		return maxStartNum;
	}

	/**
	 * コラッツ数を求める
	 * @param value
	 * @return
	 */
	protected long calculateCollatzValue(long value)
	{
		if(value % 2 == 0)
		{
			//偶数
			return value / 2;
		}
		else
		{
			//奇数
			return 3 * value + 1;
		}
	}

	public static void main(String[] args)
	{
		Problem14_LongestCollatzSequence lcs = new Problem14_LongestCollatzSequence();
		System.out.println("Answer is " + lcs.compute(1000000));
	}
}
