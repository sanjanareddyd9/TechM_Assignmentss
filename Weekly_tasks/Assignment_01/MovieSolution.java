package assignment31;

import java.util.Scanner;

public class MovieSolution {

    
    public static Movie[] getMovieByGenre(Movie[] movies, String searchGenre) {
        int count = 0;
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                count++;
            }
        }

       
        Movie[] result = new Movie[count];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                result[index++] = movie;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Movie[] movies = new Movie[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter movie " + (i + 1) + " details:");
            String movieName = scanner.nextLine();
            String company = scanner.nextLine();
            String genre = scanner.nextLine();
            int budget = scanner.nextInt();
            scanner.nextLine(); 
            movies[i] = new Movie(movieName, company, genre, budget);
        }

        
        System.out.println("Enter search genre:");
        String searchGenre = scanner.nextLine();

        
        Movie[] foundMovies = getMovieByGenre(movies, searchGenre);

       
        for (Movie movie : foundMovies) {
            if (movie.getBudget() > 80000000) {
                System.out.println("High Budget Movie");
            } else {
                System.out.println("Low Budget Movie");
            }
        }

        scanner.close();
    }
}

