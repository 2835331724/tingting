package selenium12;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {

	@Before
	public void setUp() throws Exception {
	System.out.println("1");
	}

	@After
	public void tearDown() throws Exception {
	System.out.println("2");
	}

	@Test
	public void testDiv() {
		//fail("Not yet implemented");
		//System.out.println("3");
		int d=Junit.div(4, 2);
		assertEquals(2,d);
		assertNotSame(4,d);
		}
	//@Test
	//public void testDiv1() {
		//fail("Not yet implemented");
//		System.out.println("4");
	
	//}

}
