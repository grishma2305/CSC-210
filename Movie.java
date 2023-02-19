/*
 * Assignment : Assignment 12
 * Description: Creating a Movie Class
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

public class Movie {

    //Declaration of variables
    public String title;
    public int releaseYear;
    public double rating;
    public static int countOfMovies = 0;

    //Constructor which takes in movie title, year and rating and assign respective values
    public Movie(String movieTitle, int yearReleased, double movieRating){
        setTitle(movieTitle);
        setReleaseYear(yearReleased);
        setRating(movieRating);
        countOfMovies++;
    }

    //Constructor which takes in movie title and year and assign respective values
    public Movie(String movieTitle, int yearReleased){
        setTitle(movieTitle);
        setReleaseYear(yearReleased);
        setRating(0);
        countOfMovies++;
    }

    //Getter for title
    public String getTitle() {
        return title;
    }
    //Setter for title
    public void setTitle(String title) {
        this.title = title;
    }
    //Getter for Release year
    public int getReleaseYear() {
        return releaseYear;
    }
    //Setter for Release year
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    //Getter for rating
    public double getRating() {
        return rating;
    }
    //Setter for rating
    public void setRating(double rating) {
        this.rating = rating;
    }

    //Start of getMoviesAboveRating method
    public static Movie[] getMoviesAboveRating(Movie[] array, double ratingNew){

        Movie[] arrayNew = new Movie[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++){

            if (array[i].rating >= ratingNew){
                arrayNew[j] = array[i];
                j++;
            }

        }
        //Returning the arrayNew
        return arrayNew;
    }

    //Start of the main method
    public static void main(String[] args){

        //Create instances of class Movie and then print out the values
        Movie myMovie = new Movie("Everything Everywhere All At Once", 2022, 8.9);
        System.out.println("The title of movie is \"" + myMovie.getTitle() + "\" released in " + myMovie.getReleaseYear() + " which has rating " + myMovie.getRating());
        Movie myMovie2 = new Movie("Doctor Strange in the Multiverse of Madness", 2022);
        System.out.println("The title of movie is \"" + myMovie2.getTitle() + "\" released in " + myMovie2.getReleaseYear() + " which has rating " + myMovie2.getRating());
        //Print out the count of movies
        System.out.println("Total count of movies are: " + countOfMovies);

    }
    //End of the main method

}
