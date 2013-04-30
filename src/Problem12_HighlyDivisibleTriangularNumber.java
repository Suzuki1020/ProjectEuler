import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/05/01
 * Time: 2:40
 */
public class Problem12_HighlyDivisibleTriangularNumber {

	public long compute(int minAliquotCount)
	{
		//項の値
		long termNum = 0;

		//第n項
		long nTerm = 1;

		while(_calculateAliquotCount(termNum) < minAliquotCount)
		{
			termNum += nTerm;

			nTerm ++;
		}
		return termNum;
	}

	/**
	 * 約数の個数を返す
	 * @param value
	 * @return
	 */
	protected long _calculateAliquotCount(long value)
	{
		if(value == 0)
		{
			//0は0の約数らしい
			return 1;
		}

		//素因数分解の結果を受け取る
		ArrayList<Long> primeList = MyMathUtil.factorizeIntoPrimeFactors(value);

		//ex)
		//20を素因数分解すると
		//2 * 2 * 5
		//この時の約数の数は、 (素因数2の個数 + 1) * (素因数5の個数 + 1) = 3 * 2 = 6
		// 約数 = {1, 2, 4, 5, 10, 20}

		long result = 1;
		long lastPrime = -1;
		int chainCount = 1;

		for(long prime : primeList)
		{
			if(lastPrime != prime)
			{
				//最後の素数と値が異なる
				lastPrime = prime;
				result *= (chainCount + 1);
				chainCount = 1;
			}
			else
			{
				//同じ値の素数が連続している
				chainCount ++;
			}
		}

		return result;
	}



	public static void main(String[] args)
	{
		Problem12_HighlyDivisibleTriangularNumber hdtn = new Problem12_HighlyDivisibleTriangularNumber();
		System.out.println("Answer is " + hdtn.compute(500));
	}
}
