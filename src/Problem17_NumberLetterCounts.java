/**
 * Created with IntelliJ IDEA.
 * User: tsugutoshi_aoshima
 * Date: 13/07/19
 * Time: 10:42
 * To change this template use File | Settings | File Templates.
 */
public class Problem17_NumberLetterCounts {

	public long compute(int startValue, int endValue)
	{
		System.out.println(_parseNumToLetter(1234));
		return -1;
	}

	private String _parseNumToLetter(int value)
	{
		String result = new String();
		String str = new String();

		char[] valueChars = Integer.toString(value).toCharArray();
		char c;
		int len = valueChars.length;
		for(int i = 0; i < len; i++)
		{
			c = valueChars[len - i -1 ];

			if(i == 0)
			{
				switch (c)
				{
					case '1':
						str = "one";
						break;
					case '2':
						str = "two";
						break;
					case '3':
						str = "three";
						break;
					case '4':
						str = "four";
						break;
					case '5':
						str = "five";
						break;
					case '6':
						str = "six";
						break;
					case '7':
						str = "seven";
						break;
					case '8':
						str = "eight";
						break;
					case '9':
						str = "nine";
						break;
				}
			}
			else if (i == 1)
			{
				switch (c)
				{
					case '0':
						str = "";
						break;
					case '1':
						str = "";
						break;
					case '2':
						str = "two";
						break;
					case '3':
						str = "three";
						break;
					case '4':
						str = "four";
						break;
					case '5':
						str = "five";
						break;
					case '6':
						str = "six";
						break;
					case '7':
						str = "seven";
						break;
					case '8':
						str = "eight";
						break;
					case '9':
						str = "nine";
						break;
				}
			}


			result = str + result;
		}

		return result;
	}

	public String _t(int tensPlace, int onesPlace)
	{
		String result = "";

		if(tensPlace == 0)
		{
			switch (onesPlace)
			{
				case 0:
					result = "zero";
					break;
				case 1:
					result = "one";
					break;
				case 2:
					result = "two";
					break;
				case 3:
					result = "three";
					break;
				case 4:
					result = "four";
					break;
				case 5:
					result = "five";
					break;
				case 6:
					result = "six";
					break;
				case 7:
					result = "seven";
					break;
				case 8:
					result = "eight";
					break;
				case 9:
					result = "nine";
					break;
			}
		}
		else if(tensPlace == 1)
		{
			switch (onesPlace)
			{
				case 0:
					result = "ten";
					break;
				case 1:
					result = "eleven";
					break;
				case 2:
					result = "twelve";
					break;
				case 3:
					result = "thirteen";
					break;
				case 4:
					result = "fourteen";
					break;
				case 5:
					result = "fifteen";
					break;
				case 6:
					result = "sixteen";
					break;
				case 7:
					result = "seventeen";
					break;
				case 8:
					result = "eighteen";
					break;
				case 9:
					result = "nineteen";
					break;
			}
		}
		else
		{
			String head = "";
			String foot = "";

			switch(tensPlace)
			{
				case 2:
					head = "twenty";
					break;
				case 3:
					head = "thirty";
					break;
				case 4:
					head = "forty";
					break;
				case 5:
					head = "fifty";
					break;
				case 6:
					head = "sixty";
					break;
				case 7:
					head = "seventy";
					break;
				case 8:
					head = "eighty";
					break;
				case 9:
					head = "ninety";
					break;
			}

			switch (onesPlace)
			{
				case 0:
					foot = "";
					break;
				case 1:
					foot = "one";
					break;
				case 2:
					foot = "two";
					break;
				case 3:
					foot = "three";
					break;
				case 4:
					foot = "four";
					break;
				case 5:
					foot = "five";
					break;
				case 6:
					foot = "six";
					break;
				case 7:
					foot = "seven";
					break;
				case 8:
					foot = "eight";
					break;
				case 9:
					foot = "nine";
					break;
			}

			if(foot != null && foot.length() > 0)
			{
				result = head + "-" + foot;
			}
			else
			{
				result = head;
			}
		}

		return result;
	}


	public static void main(String[] args)
	{
		Problem17_NumberLetterCounts nlc = new Problem17_NumberLetterCounts();
		System.out.println("Answer is " + nlc.compute(1, 1000));
		System.out.println(nlc._t(0,1));
		System.out.println(nlc._t(0,2));
		System.out.println(nlc._t(0,3));
		System.out.println(nlc._t(0,4));
		System.out.println(nlc._t(0,5));
		System.out.println(nlc._t(0,6));
		System.out.println(nlc._t(0,7));
		System.out.println(nlc._t(0,8));
		System.out.println(nlc._t(0,9));
		System.out.println(nlc._t(1,0));
		System.out.println(nlc._t(1,1));
		System.out.println(nlc._t(1,2));
		System.out.println(nlc._t(1,3));
		System.out.println(nlc._t(1,4));
		System.out.println(nlc._t(1,5));
		System.out.println(nlc._t(1,6));
		System.out.println(nlc._t(1,7));
		System.out.println(nlc._t(1,8));
		System.out.println(nlc._t(1,9));
		System.out.println(nlc._t(2,0));
		System.out.println(nlc._t(2,1));
		System.out.println(nlc._t(2,2));
		System.out.println(nlc._t(2,3));
		System.out.println(nlc._t(2,4));
		System.out.println(nlc._t(2,5));

	}
}
