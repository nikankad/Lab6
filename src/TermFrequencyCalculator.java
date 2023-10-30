package Lab6;

import java.util.TreeMap;
import java.util.stream.Stream;

/**
 *
 * @since 30 October 2023
 * @author Behrooz Mansouri, Julian Edwards
 *
 */
public class TermFrequencyCalculator implements ITermFrequency
{
    /**
     * @param songLyrics TreeMap of Song titles as the key, with their lyrics as values
     * @return TreeMap with song title as the key, and value representing a TreeMap. In the inner TreeMap
     * each key is a word, with term frequency saved as a double
     *
     * @since 30 October 2023
     * @author Behrooz Mansouri, Julian Edwards
     */
    @Override
    public TreeMap<String, TreeMap<String, Double>> getTermFrequency(final TreeMap<String, String> songLyrics) {
        final TreeMap<String, TreeMap<String, Double>> result = new TreeMap<>();
        for(final String songTitle: songLyrics.keySet()) {
            // For each song you have to create TF values
            final TreeMap<String, Double> tempMap = new TreeMap<>();

            // current lyrics
            final String lyric = songLyrics.get(songTitle);
            final String[] words = lyric.split(" ");
            
            // Calculate the Term Frequency (TF) Values here and save them in tempMap
            
            // You might need to introduce other methods and additional variables
            
            // TF for Term (word) X in Song S is calculated as frequency of that X divided 
            // by total number of words in the lyric
            
            ////////////////////////////
            //WRITE HERE
            //////////////////////////

            tempMap.put(lyric, Stream.of(words).filter(lyric::equals).count() / (double)words.length);
            
            // After Calculaion
            result.put(songTitle, tempMap);
        }
        
        return result;
    }

}
