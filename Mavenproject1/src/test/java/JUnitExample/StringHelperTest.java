package JUnitExample;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class StringHelperTest extends TestCase {
@Test
public void test(){
	StringHelper helper=new StringHelper();
	assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	
	
	
}
}
