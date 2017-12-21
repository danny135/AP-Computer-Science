import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reads a file and counts the number of characters, words, sentences, and paragraphs.
 * @author Daniel Ruano
 *
 */
public class Unit7ProgrammingLab1 
{
	boolean countChar, countWord, countSentence, countParagraph;
	int currentChar, chars = 0, words = 0, sentences = 0, paragraphs = 0;
	
	public Unit7ProgrammingLab1(File file, String options)
	{
		if (options.contains("c")) countChar = true;
		if (options.contains("w")) countWord = true;
		if (options.contains("s")) countSentence = true;
		if (options.contains("p")) countParagraph = true;
		
		FileReader fr;
		try 
		{
			fr = new FileReader(file);
			while ( (currentChar = fr.read() ) != -1)
			{
				chars++;
				
				switch(currentChar)
				{
					case ' ':
					case '\t':
						words++;
						break;
					case '.':
						sentences++;
						break;
					case '\n':
						paragraphs++;
						break;
				}
			}
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (countChar) System.out.println("Characters: " + chars);
		if (countWord) System.out.println("Words: " + words);
		if (countSentence) System.out.println("Sentences: " + sentences);
		if (countParagraph) System.out.println("Paragraphs: " + paragraphs);
	}

	public static void main(String[] args) 
	{
		if (args.length == 2)
		{
			new Unit7ProgrammingLab1(new File(args[1]), args[0]);
		}
		else if (args.length == 1)
		{
			new Unit7ProgrammingLab1(new File(args[0]), "-cwsp");
		}
		else
		{
			System.out.println("Usage: -[c][w][s][p] filename");
		}
	}
}
