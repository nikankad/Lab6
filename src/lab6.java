package Lab6;

import java.io.IOException;

public class lab6 {
    public static void main(String[] args) throws IOException {
        // Creating a new LyricsReader object, specifying the directory path "src/Queen"
        LyricsReader lyricsReader = new LyricsReader("src/Queen");

        // Creating a new TermFrequencyCalculator object
        TermFrequencyCalculator termFrequencyCalculator = new TermFrequencyCalculator();

        // Creating a new InverseDocumentFrequencyCalculator object
        InverseDocumentFrequencyCalculator inverseDocumentFrequencyCalculator = new InverseDocumentFrequencyCalculator();

        // Creating a new SearchEngine object, passing in the LyricsReader, TermFrequencyCalculator, and InverseDocumentFrequencyCalculator
        SearchEngine searchEngine = new SearchEngine(lyricsReader, termFrequencyCalculator, inverseDocumentFrequencyCalculator);

        // Performing a search using the search query "All we hear is" and storing the result in the 'search' variable
        String search = searchEngine.search("All we hear is");

        // Printing the search result to the console
        System.out.println(search);
    }
}
