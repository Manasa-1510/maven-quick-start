package clinic.programming.training;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest{
	private Application app;
	
	@Before
	public void setUp(){
		app = new Application();
	}
	
	@Test
	public void testWordCounting(){
		int count = app.countWords("I have four words");
		assertTrue(count == 4);
	}
	
	@Test
	public void testWordCountingEmpty(){
		int count = app.countWords("");
		assertTrue(count == 0);
	}
}