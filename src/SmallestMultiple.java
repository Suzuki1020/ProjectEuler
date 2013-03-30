import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/03/31
 * Time: 2:51
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {

	public long compute(int min, int max)
	{
		//minからmaxまでの値を配列に入れる
		int[] values = new int[max - min + 1];
		int valuesLen = values.length;
		for (int i = 0; i < valuesLen; i++)
		{
			values[i] = min + i;
		}

		int divisibleNum = -1;
		ArrayList<Integer> divisibleNumList = new ArrayList<Integer>();
		while ((divisibleNum = findMinDivisibleNumber(values)) != 1)
		{
			//divisibleNumで割り切れる値は割った後の値に更新する
			for (int i = 0; i < valuesLen; i++)
			{
				if(values[i] % divisibleNum == 0)
				{
					values[i] /= divisibleNum;
				}
			}

			//割った値を記憶
			divisibleNumList.add(divisibleNum);
		}

		//配列の各値と、割った値を全て掛けた値が最小公倍数
		long ans = 1;
		for (int i : values)
		{
			ans *= i;
		}
		for (int i : divisibleNumList)
		{
			ans *= i;
		}

		return ans;
	}

	/**
	 * int型配列の中で最低でも2つ以上の値を割り切ることができる整数の最小値を返す
	 * @param values
	 * @return
	 */
	public int findMinDivisibleNumber(int[] values)
	{
		int maxValue = findMax(values);
		boolean divisibleFlg = false;

		for (int i = 2; i < maxValue; i++)
		{
			divisibleFlg = false;
			for (int j : values)
			{
				if (j % i == 0)
				{
					if (!divisibleFlg)
					{
						divisibleFlg = true;
					} else
					{
						return i;
					}
				}
			}
		}
		return 1;
	}

	/**
	 * int型の配列の中で最大値を返す
	 * @param values
	 * @return  最大値
	 */
	public int findMax(int[] values)
	{
		int max = Integer.MIN_VALUE;
		int len = values.length;
		for (int i : values)
		{
			if (i > max)
			{
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args)
	{
		SmallestMultiple sm = new SmallestMultiple();
		System.out.println("Answer is " + sm.compute(1, 20));
	}
}
