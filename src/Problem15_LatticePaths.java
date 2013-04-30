import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/05/01
 * Time: 6:19
 */
public class Problem15_LatticePaths {
	public long compute(int xGridNum, int yGridNum)
	{
		//分母の階乗の配列を取得
		int[] numeratorArray = MyMathUtil.factorialArray(xGridNum + yGridNum);

		//分子左の階乗の配列を取得
		int[] denoLeftArray = MyMathUtil.factorialArray(xGridNum);

		//分子右の階乗の配列を取得
		int[] denoRightArray = MyMathUtil.factorialArray(yGridNum);

		//各要素を素因数分解して、分母、分子毎のリストに入れる
		ArrayList<Long> numeratorList = new ArrayList<Long>();
		ArrayList<Long> denominatorList = new ArrayList<Long>();

		for(int value : numeratorArray)
		{
			numeratorList.addAll(MyMathUtil.factorizeIntoPrimeFactors(value));
		}

		for(int value : denoLeftArray)
		{
			denominatorList.addAll(MyMathUtil.factorizeIntoPrimeFactors(value));
		}

		for(int value : denoRightArray)
		{
			denominatorList.addAll(MyMathUtil.factorizeIntoPrimeFactors(value));
		}

		//分母と分子で重複した値を持つ場合はそれを消す
		for(int i = numeratorList.size() - 1; i >= 0; i--)
		{
			long value = numeratorList.get(i);
			if(denominatorList.contains(value))
			{
				numeratorList.remove(i);
				denominatorList.remove(value);
			}
		}

		long numeratorProduct = 1;
		long denominatorProduct = 1;

		//分子の積の値を求める
		for(long l : numeratorList)
		{
			numeratorProduct *= l;
		}

		//分母の積の値を求める
		//分母のリスト長は0になっていないとおかしいけど一応
		for(long l : denominatorList)
		{
			denominatorProduct *= l;
		}

		return numeratorProduct / denominatorProduct;
	}

	public static void main(String[] args)
	{
		Problem15_LatticePaths lp = new Problem15_LatticePaths();
		System.out.println("Answer is " + lp.compute(20, 20));
	}
}
