package MovieCompareableCompararatorV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie implements Comparable<Movie> {
    private String title;
    private double rating;
    private int year;

    public Movie(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Movie file) {
        /*if(this.year > file.year){
            return 1;
        }
        else if(this.year < file.year){
            return -1;
        }
        else{
            return 0;
        }*/
        return this.year > file.year? 1: this.year < file.year? -1: 0;
    }

    public static void main(String[] args) {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Elemental", 53, 2023));
        list.add(new Movie("The incredible", 10, 2004));
        list.add(new Movie("The cats", 1, 2019));
        list.add(new Movie("Inception", 9, 2010));
        list.add(new Movie("Jaws", 9.5, 1975));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("//sorted ny rating//");
        Rating rt = new Rating();
        Collections.sort(list, rt);
        for (Movie movie : list) {
            System.out.println(movie.rating + ":" + movie.title + "," + movie.year);
        }

        list.forEach(movie -> System.out.print(movie.rating + ":" + movie.title + "," + movie.year));

        Name nm = new Name();
        Collections.sort(list, nm);
        System.out.println("//sorted by the title//");
        for (Movie movie : list) {
            System.out.println(movie.rating + ":" + movie.title + "," + movie.year);
        }

    }
}

class Name implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return m1.getTitle().compareToIgnoreCase(m2.getTitle());
    }
}

class Rating implements Comparator<Movie>{
    public int compare(Movie m1,Movie m2){
        return m1.getRating() > m2.getRating()? 1: m1.getRating() < m2.getRating()? -1: 0;
    }

}
