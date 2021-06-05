package _06_tea_party;

public class TeaParty {
	String name;
	boolean isWoman;
	boolean isKnighted;
	public TeaParty(String name, boolean isWoman, boolean isKnighted){
		
	}
	
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
        
    }
}

public class TeaPartyTest {
	 /**
	 * Jane Austen is a woman, so say “Hello Ms. Austen”. 
	 * George Orwell is a man, so say “Hello Mr. Orwell”. 
	 * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
	 **/

	@Test
	public void testIsWomanNotKnighted() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
	}

	@Test
	public void testIsManNotKnighted() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
	}

	@Test
	public void testIsManKnighted() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
	}
	
	@Test
	public void testIsWomanKnighted() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello Lady Laura", teaParty.welcome("Laura", true, true));
	}
}
