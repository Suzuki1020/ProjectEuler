/**
 * Created with IntelliJ IDEA.
 * User: Bob_Mk2
 * Date: 13/03/30
 * Time: 0:11
 * To change this template use File | Settings | File Templates.
 */
public class MultiplesOf3And5 {

	public void MultiplesOf3And5() {
	}

	/**
	 * 主な処理はここに全部書く
	 */
	public void start() {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if(isMultipleOf(3, i) || isMultipleOf(5, i))
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}

	/**
	 * 第二引数で与えた値が第一引数の倍数かどうか判定する
	 * @param multiple
	 * @param num
	 * @return  倍数だった場合はtrue、そうでないばあいはfalse
	 */
	public boolean isMultipleOf(int multiple, int num) {
		if (num % multiple == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		MultiplesOf3And5 m = new MultiplesOf3And5();
		m.start();
	}
}
