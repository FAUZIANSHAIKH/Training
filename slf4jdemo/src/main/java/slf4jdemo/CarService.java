package slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService 
{
	private Logger log= LoggerFactory.getLogger(CarService.class);
	public void process(String msg)
	{
		if(log.isDebugEnabled())
			log.debug("Processing Car debug: {}",msg);
		log.error("Processing Car in smart way error  "+msg);
		log.info("Processing Car in smart way info  "+msg);
		System.out.println("Processing Car....");
	}
}
