import com.exceptions.FooRuntimeException;

public class MyFileUtils {

	public int subtract10FromLargeNumber(int number) throws Exception{
		if (number < 10) {
			throw new FooRuntimeException("The number passed was lesser than 10");
		}
		return number-10;
	}
	
	
}
