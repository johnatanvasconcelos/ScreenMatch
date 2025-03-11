import com.screenmatch.calculations.FilterRecomendation;
import com.screenmatch.calculations.TimeCalculator;
import com.screenmatch.models.Episode;
import com.screenmatch.models.Movie;
import com.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Movie movieOne = new Movie();
        movieOne.setTitle("The Godfather");
        movieOne.setYear(1972);
        movieOne.setSignatureMovie(true);
        movieOne.setDuration(175);
        movieOne.rateMovie(9.5);
        movieOne.rateMovie(10);
        movieOne.rateMovie(8.8);
        movieOne.showInfo();
        System.out.println("Total de avaliações: " + movieOne.getTotalRate());

        System.out.println("\n------------------------------------------------------------\n");

        Movie movieTwo = new Movie();
        movieTwo.setTitle("Avatar");
        movieTwo.setYear(2023);
        movieTwo.setSignatureMovie(true);
        movieTwo.setDuration(200);
        movieTwo.rateMovie(7);
        movieTwo.rateMovie(6);
        movieTwo.rateMovie(7.8);
        movieTwo.showInfo();
        System.out.println("Total de avaliações: " + movieTwo.getTotalRate());

        System.out.println("\n------------------------------------------------------------\n");

        Movie movieThree = new Movie();
        movieThree.setTitle("King Lion");
        movieThree.setYear(1994);
        movieThree.setSignatureMovie(true);
        movieThree.setDuration(110);
        movieThree.rateMovie(9.3);
        movieThree.rateMovie(8.7);
        movieThree.rateMovie(9.5);
        movieThree.showInfo();
        System.out.println("Total de avaliações: " + movieThree.getTotalRate());

        System.out.println("\n------------------------------------------------------------\n");

        Series seriesOne = new Series();
        seriesOne.setTitle("Breaking Bad");
        seriesOne.setYear(2008);
        seriesOne.setEpisodes(62);
        seriesOne.setMinutesPerEpisode(50);
        seriesOne.setSeasons(5);
        seriesOne.setActive(false);
        seriesOne.rateMovie(10);
        seriesOne.rateMovie(8);
        seriesOne.rateMovie(9);
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
    }
}