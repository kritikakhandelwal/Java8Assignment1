package edu.knoldus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainApplication {
    public static void main(String[] args) {

        /***Question1***/

        System.out.println("Question1->");
        isPrime q1 = new isPrime();
        List<Integer> myList = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(100);
            myList.add(num);
        }

        myList.forEach(num -> {

            if (q1.isPrime(num))
                System.out.println(num + " " + "is Prime");
            else
                System.out.println(num + " " + "is not Prime");
        });

        System.out.println("*******************************************");

        /***Question2***/

        System.out.println("Question2->");
        ReadFile q2 = new ReadFile();
        System.out.println(q2.WordCount());

        System.out.println("*******************************************");

        /***Question3***/

        System.out.println("Question3->");
        WordCount q3 = new WordCount();
        System.out.println(q3.wordCountMap);

        /***Question4***/

        System.out.println("Question4->");
        List<Integer> numList1 = Arrays.asList(1, 2, 3);
        List<Integer> numList2 = Arrays.asList(8, 9, 10);
        ListMultiplication q4 = new ListMultiplication();
        System.out.println(q4.ListMultiplication(numList1, numList2));

        System.out.println("*******************************************");

        /***Question5***/

        System.out.println("Question5->");
        MovieOperations movieObject = new MovieOperations();
        List<Movie> movieDb = Arrays.asList(
                (new Movie("Tiger Zinda Hai", 2017, 9, "Action")),
                (new Movie("2 States", 2014, 7, "Romance")),
                (new Movie("Mubarkan", 2017, 6, "Comedy")),
                (new Movie("Ready", 2011, 9, "Comedy")),
                (new Movie("Yeh Jawaani Hai Deewani", 2013, 7, "Drama")),
                (new Movie("Ra-One", 2011, 7, "Sci-Fi"))
        );

        // Movie with genre Comedy and Rating greater than 8
        System.out.println("Movie with rating more than 8 and genre comedy");
        movieObject.movieWithGenreAndRating("Comedy", 8, movieDb)
                .forEach(System.out::println);
        System.out.println("*******************************************");

        // Movie with release year greater than 2000 and rating less than 8
        System.out.println("Movie with release year greater than 2000 and rating less than 8");
        movieObject.movieWithReleaseYearAndRating(2000, 8, movieDb)
                .forEach(System.out::println);
        System.out.println("*******************************************");

        // Movie with even number ratings
        System.out.println("Movie with even number ratings");
        movieObject.movieWithEvenNumberRating(movieDb)
                .forEach(System.out::println);
        System.out.println("********************************************");

        // Movie with rating 7 and genre Sci-Fi
        System.out.println("Movie with rating 7 and genre Sci-Fi");
        movieObject.movieWithRatingAndGenre("Sci-Fi", 7, movieDb)
                .forEach(System.out::println);
        System.out.println("*********************************************");
    }
}
