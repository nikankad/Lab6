package Lab6;

import java.io.IOException;

public class lab6 {
    public static void main(String[] args) throws IOException {
        LyricsReader lyricsReader = new LyricsReader("src/Queen");
        TermFrequencyCalculator termFrequencyCalculator = new TermFrequencyCalculator();
        InverseDocumentFrequencyCalculator inverseDocumentFrequencyCalculator = new InverseDocumentFrequencyCalculator();

        SearchEngine searchEngine = new SearchEngine(lyricsReader, termFrequencyCalculator, inverseDocumentFrequencyCalculator);

        String search = searchEngine.search("Champions");
        System.out.println(search);
    }
}
