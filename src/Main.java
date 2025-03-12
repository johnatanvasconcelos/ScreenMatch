import com.screenmatch.calculations.FilterRecomendation;
import com.screenmatch.calculations.TimeCalculator;
import com.screenmatch.models.Episode;
import com.screenmatch.models.Movie;
import com.screenmatch.models.Series;
import com.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movieOne = new Movie("The Godfather", 1972);
        movieOne.setSignatureMovie(true);
        movieOne.setDuration(175);
        movieOne.rateMovie(9.5);
        movieOne.rateMovie(10);
        movieOne.rateMovie(8.8);
        movieOne.showInfo();
        System.out.println("Total de avaliações: " + movieOne.getTotalRate());

        System.out.println("\n------------------------------------------------------------\n");

        Movie movieTwo = new Movie("Avatar", 2009);
        movieTwo.setSignatureMovie(true);
        movieTwo.setDuration(200);
        movieTwo.rateMovie(7);
        movieTwo.rateMovie(6);
        movieTwo.rateMovie(7.8);
        movieTwo.showInfo();
        System.out.println("Total de avaliações: " + movieTwo.getTotalRate());

        System.out.println("\n------------------------------------------------------------\n");

        Movie movieThree = new Movie("King Lion", 1994);
        movieThree.setSignatureMovie(true);
        movieThree.setDuration(110);
        movieThree.rateMovie(9.3);
        movieThree.rateMovie(8.7);
        movieThree.rateMovie(9.5);
        movieThree.showInfo();
        System.out.println("Total de avaliações: " + movieThree.getTotalRate());

        System.out.println("\n------------------------------------------------------------\n");

        Series seriesOne = new Series("Breaking Bad", 2008);
        seriesOne.setEpisodes(62);
        seriesOne.setMinutesPerEpisode(50);
        seriesOne.setSeasons(5);
        seriesOne.setActive(false);
        seriesOne.rateMovie(10);
        seriesOne.rateMovie(8.8);
        seriesOne.rateMovie(9.5);
        seriesOne.showInfo();
        FilterRecomendation filter = new FilterRecomendation();
        filter.filter(seriesOne);

        System.out.println("\n-----------------------------\n");

        Episode episode = new Episode();
        episode.setTitle("Pilot");
        episode.setNumber(1);
        episode.setSerie(seriesOne);
        episode.setTotalViews(300);
        episode.showInfo();
        filter.filter(episode);

        System.out.println("\n------------------------------------------------------------\n");

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(movieOne);
        calculator.include(movieTwo);
        calculator.include(movieThree);
        calculator.include(seriesOne);
        System.out.println("Total time for watch all movies and series: ");
        System.out.println(calculator.getTotalTime() + " minutes or " + calculator.getTotalTime()/60 + " hours");

        System.out.println("\n------------------------------------------------------------\n");

        ArrayList<Title> titles = new ArrayList<>();
        titles.add(movieOne);
        titles.add(movieTwo);
        titles.add(movieThree);
        titles.add(seriesOne);
        for (Title t : titles) {
            System.out.println(t);
            System.out.println("Rating: " + String.format("%.2f",t.getRating()) + "⭐");
        }
        System.out.println("\n------------------------------------------------------------\n");
        System.out.println("Number of movies in the list: " + titles.size() + " movies");
        System.out.println("First movie title: " + titles.getFirst().getTitle());

        System.out.println("\n------------------------------------------------------------\n");
        List<String> artistSearch = new ArrayList<>();
        artistSearch.add("Robert de Niro");
        artistSearch.add("Bryan Cranston");
        artistSearch.add("Marlon Brando");
        System.out.println(artistSearch);

        Collections.sort(artistSearch);
        System.out.println(artistSearch);

        Collections.sort(titles);
        System.out.println(titles);

    }
}