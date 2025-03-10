import com.screenmatch.calculations.TimeCalculator;
import com.screenmatch.models.Movie;
import com.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie movieOne = new Movie();
        movieOne.setTitle("The Godfather");
        movieOne.setYear(1972);
        movieOne.setSignatureMovie(true);
        movieOne.setDuration(175);

        Movie movieTwo = new Movie();
        movieTwo.setTitle("Avatar");
        movieTwo.setYear(2023);
        movieTwo.setSignatureMovie(true);
        movieTwo.setDuration(200);

        Movie movieThree = new Movie();
        movieThree.setTitle("King Lion");
        movieThree.setYear(1995);
        movieThree.setSignatureMovie(true);
        movieThree.setDuration(110);

        movieOne.showInfo();
        movieOne.rateMovie(7);
        movieOne.rateMovie(10);
        movieOne.rateMovie(8);

        System.out.println("Total de avaliações: " + movieOne.getTotalRate());
        System.out.println(movieOne.getAverageRate());

        Serie serieOne = new Serie();
        serieOne.setTitle("Breaking Bad");
        serieOne.setYear(2008);
        serieOne.setEpisodesPerSeason(13);
        serieOne.setMinutesPerEpisode(50);
        serieOne.setSeasons(5);
        serieOne.setActive(false);
        System.out.println("Duração da série: " + serieOne.getDuration() + " minutes");

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(movieOne);
        calculator.include(movieTwo);
        calculator.include(movieThree);
        calculator.include(serieOne);
        System.out.println(calculator.getTotalTime() + " minutes");
    }
}