package pangram;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import pangram.Pangram;
import java.util.ArrayList;
import java.util.List;

public class SentenceCheckerTest
{
	@Test
	public void isSentencePangram()
	{
		Pangram pangram = new Pangram();
		assertFalse( pangram.isPangram() );
		List<String> sentence = new ArrayList<String>();
		sentence.add( "Pack" );
		sentence.add( "my" );
		sentence.add( "box" );
		sentence.add( "with" );
		sentence.add( "five" );
		sentence.add( "dozen" );
		sentence.add( "liquor" );
		sentence.add( "jugs" );
		pangram.setSentence((ArrayList) sentence );
		pangram.pangramCheck();
		//System.out.println("##############");
		//pangram.printSentence();
		//pangram.getAlphabet().printStatus();
		assertTrue( pangram.isPangram() );
	}

	@Test
	public void isSentenceNotPangram(){
		Pangram pangram = new Pangram();
		assertFalse( pangram.isPangram() );
		List<String> sentence = new ArrayList<String>();
		sentence.add( "Pack" );
		pangram.setSentence((ArrayList) sentence );
		pangram.pangramCheck();
		assertFalse( pangram.isPangram() );
	}
}
