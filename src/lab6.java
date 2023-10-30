package Lab6;

public class lab6 {
    public static void main(String[] args) {
        LyricsReader lyricsReader = new LyricsReader();
        TermFrequencyCalculator termFrequencyCalculator = new TermFrequencyCalculator();
        InverseDocumentFrequencyCalculator inverseDocumentFrequencyCalculator = new InverseDocumentFrequencyCalculator();

        SearchEngine searchEngine = new SearchEngine(lyricsReader, termFrequencyCalculator, inverseDocumentFrequencyCalculator);

        String search = searchEngine.search("All we hear is");
        System.out.println(search);
    }
}
