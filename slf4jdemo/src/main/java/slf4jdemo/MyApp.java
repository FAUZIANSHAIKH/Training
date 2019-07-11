package slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MyApp 
{
	private static Logger logger = (Logger) LoggerFactory.getLogger(MyApp.class);
	public static void main(String[] args) 
	{
		logger.info("Hello World");
		int res=add(10,20);
		System.out.println("Result : "+res);
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
}
