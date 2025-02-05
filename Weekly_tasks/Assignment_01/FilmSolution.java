package assignment31;

import java.util.Scanner;

public class FilmSolution {

    
    public static double findAvgBudgetByDirector(Film[] films, String director) {
        double totalBudget = 0;
        int count = 0;

        
        for (Film film : films) {
            if (film.getDirector().equalsIgnoreCase(director)) {
                totalBudget += film.getBudget();
                count++;
            }
        }

        
        if (count == 0) {
            return 0;
        }
        return totalBudget / count;
    }

    
    public static Film getMovieByRatingBudget(Film[] films, int rating, int budget) {
        
        for (Film film : films) {
            if (film.getRating() == rating && film.getBudget() == budget) {
                
                if (budget % rating == 0) {
                    return film;
                }
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Film[] films = new Film[4];

        
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter film " + (i + 1) + " details:");
            int movieId = scanner.nextInt();
            scanner.nextLine(); 
            String director = scanner.nextLine();
            int rating = scanner.nextInt();
            int budget = scanner.nextInt();
            scanner.nextLine(); 

            films[i] = new Film(movieId, director, rating, budget);
        }

        
        System.out.println("Enter director name:");
        String director = scanner.nextLine();
        System.out.println("Enter rating:");
        int rating = scanner.nextInt();
        System.out.println("Enter budget:");
        int budget = scanner.nextInt();

        
        double avgBudget = findAvgBudgetByDirector(films, director);
        if (avgBudget > 0) {
            System.out.println(avgBudget);
        } else {
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

       
        Film resultFilm = getMovieByRatingBudget(films, rating, budget);
        if (resultFilm != null) {
            System.out.println(resultFilm.getMovieId());
        } else {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }

        scanner.close();
    }
}

