/**
 * Вариант 3.
 * Класс объекта
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Comparator;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "movie",
        "year",
        "release_date",
        "director",
        "character",
        "movie_duration",
        "timestamp",
        "full_line",
        "current_wow_in_movie",
        "total_wows_in_movie",
        "poster",
        "video",
        "audio"
})

public class Wow {

    @JsonProperty("movie")
    private String movie;
    @JsonProperty("year")
    private Integer year;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("director")
    private String director;
    @JsonProperty("character")
    private String character;
    @JsonProperty("movie_duration")
    private String movieDuration;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("full_line")
    private String fullLine;
    @JsonProperty("current_wow_in_movie")
    private Integer currentWowInMovie;
    @JsonProperty("total_wows_in_movie")
    private Integer totalWowsInMovie;
    @JsonProperty("poster")
    private String poster;
    @JsonProperty("video")
    private Video video;
    @JsonProperty("audio")
    private String audio;


    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }


    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getMovieDuration() {
        return movieDuration;
    }


    public void setMovieDuration(String movieDuration) {
        this.movieDuration = movieDuration;
    }


    public String getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    public String getFullLine() {
        return fullLine;
    }


    public void setFullLine(String fullLine) {
        this.fullLine = fullLine;
    }


    public Integer getCurrentWowInMovie() {
        return currentWowInMovie;
    }


    public void setCurrentWowInMovie(Integer currentWowInMovie) {
        this.currentWowInMovie = currentWowInMovie;
    }


    public Integer getTotalWowsInMovie() {
        return totalWowsInMovie;
    }

    public void setTotalWowsInMovie(Integer totalWowsInMovie) {
        this.totalWowsInMovie = totalWowsInMovie;
    }


    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }


    public Video getVideo() {
        return video;
    }


    public void setVideo(Video video) {
        this.video = video;
    }


    public String getAudio() {
        return audio;
    }


    public void setAudio(String audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "Wow [" +
                "Movie = '" + movie + '\'' +
                "," + "\nYear = " + year +
                "," + "\nReleaseDate = '" + releaseDate + '\'' +
                "," + "\nDirector = '" + director + '\'' +
                "," + "\nCharacter = '" + character + '\'' +
                "," + "\nMovie duration = '" + movieDuration + '\'' +
                "," + "\nTimestamp = '" + timestamp + '\'' +
                "," + "\nFull line = '" + fullLine + '\'' +
                "," + "\nCurrent Wow in movie = " + currentWowInMovie +
                "," + "\nTotal Wows in movie = " + totalWowsInMovie +
                "," + "\nPoster = '" + poster + '\'' +
                "," + "\nVideo = " + video +
                "," + "\nAudio = '" + audio + '\'' +
                "]\n";
    }

    /**
     * Сравнения, по названию фильма и по дате.
     */
    public static Comparator<Wow> byNameAsc = Comparator.comparing(o -> o.movie);
    public static Comparator<Wow> byNameDesc = (o1, o2) -> o2.movie.compareTo(o1.movie);
    public static Comparator<Wow> byYearAsc = (o1, o2) -> o1.year > o2.year ? 1 : o1.year < o2.year ? -1 : 0;
    public static Comparator<Wow> byYearDesc = (o1, o2) -> o1.year < o2.year ? 1 : o1.year > o2.year ? -1 : 0;
}