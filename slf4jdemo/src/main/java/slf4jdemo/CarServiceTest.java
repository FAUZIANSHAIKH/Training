package slf4jdemo;
import static org.junit.Assert.*;

import org.junit.Test;
public class CarServiceTest 
{
	@Test
	public void test()
	{
		CarService service = new CarService();
		service.process("Servicing my car in progress  ");
	}
}
