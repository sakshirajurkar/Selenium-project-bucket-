package JBK_10_Oct_2024;

import org.testng.Assert;
import org.testng.annotations.Test;

//#Tester
public class TestArithmaticOp {

	ArithmaticOp ari = new ArithmaticOp();
      @Test
	public void tcSum() {
		int expSumRes = 15;
		int actSumRes = ari.sum(10, 5);

			Assert.assertEquals(actSumRes, expSumRes);
	}

      @Test
	public void tcSub() {
		int expSubRes = 3;
		int actSubRes = ari.sub(7, 4);

		Assert.assertEquals(actSubRes, expSubRes);

	}
}
