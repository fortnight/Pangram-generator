package pangram;

public class Alphabet
{
	private boolean letters[] = new boolean[26];

	public Alphabet() {
		for(int i = 0; i<26; i++) {
			this.letters[i] = false;
		}
	}

	public void check(String s) {
		for( int i=0; i<s.length(); i++ ) {
//			System.out.println("Letter " + i + " of word " + s);
			switch ( s.charAt( i ) ) {
				case 'a': this.letters[0] = true;
					  break;
				case 'b': this.letters[1] = true;
					  break;
				case 'c': this.letters[2] = true;
					  break;
				case 'd': this.letters[3] = true;
					  break;
				case 'e': this.letters[4] = true;
					  break;
				case 'f': this.letters[5] = true;
					  break;
				case 'g': this.letters[6] = true;
					  break;
				case 'h': this.letters[7] = true;
					  break;
				case 'i': this.letters[8] = true;
					  break;
				case 'j': this.letters[9] = true;
					  break;
				case 'k': this.letters[10] = true;
					  break;
				case 'l': this.letters[11] = true;
					  break;
				case 'm': this.letters[12] = true;
					  break;
				case 'n': this.letters[13] = true;
					  break;
				case 'o': this.letters[14] = true;
					  break;
				case 'p': this.letters[15] = true;
					  break;
				case 'q': this.letters[16] = true;
					  break;
				case 'r': this.letters[17] = true;
					  break;
				case 's': this.letters[18] = true;
					  break;
				case 't': this.letters[19] = true;
					  break;
				case 'u': this.letters[20] = true;
					  break;
				case 'v': this.letters[21] = true;
					  break;
				case 'w': this.letters[22] = true;
					  break;
				case 'x': this.letters[23] = true;
					  break;
				case 'y': this.letters[24] = true;
					  break;
				case 'z': this.letters[25] = true;
					  break;
				case 'A': this.letters[0] = true;
					  break;
				case 'B': this.letters[1] = true;
					  break;
				case 'C': this.letters[2] = true;
					  break;
				case 'D': this.letters[3] = true;
					  break;
				case 'E': this.letters[4] = true;
					  break;
				case 'F': this.letters[5] = true;
					  break;
				case 'G': this.letters[6] = true;
					  break;
				case 'H': this.letters[7] = true;
					  break;
				case 'I': this.letters[8] = true;
					  break;
				case 'J': this.letters[9] = true;
					  break;
				case 'K': this.letters[10] = true;
					  break;
				case 'L': this.letters[11] = true;
					  break;
				case 'M': this.letters[12] = true;
					  break;
				case 'N': this.letters[13] = true;
					  break;
				case 'O': this.letters[14] = true;
					  break;
				case 'P': this.letters[15] = true;
					  break;
				case 'Q': this.letters[16] = true;
					  break;
				case 'R': this.letters[17] = true;
					  break;
				case 'S': this.letters[18] = true;
					  break;
				case 'T': this.letters[19] = true;
					  break;
				case 'U': this.letters[20] = true;
					  break;
				case 'V': this.letters[21] = true;
					  break;
				case 'W': this.letters[22] = true;
					  break;
				case 'X': this.letters[23] = true;
					  break;
				case 'Y': this.letters[24] = true;
					  break;
				case 'Z': this.letters[25] = true;
					  break;
			}
		}
	}

	public boolean isFull() {
		boolean full = false;
		int count = 0;
		for(int i = 0; i<26; i++) {
			if( letters[i] ) {
				count++;
			}
		}
		if( count == 26 ){
			full = true;
		}
		return full;
	}

	public void printStatus() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0; i<alphabet.length(); i++){
			System.out.println("Pangram contains " + alphabet.charAt(i) + ": " + letters[i] );
		}
	}
}
