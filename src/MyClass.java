
public class MyClass {
public static void main(String[] args) {
	Movie BugsLife = new Movie("Bugs Life", 2);
	Movie LifeOfPie = new Movie("Life of Pie", 5);
	Movie TheJungleBook = new Movie("The Jungle Book", 4);
	Movie SuperMan = new Movie("Super Man", 3);
	Movie SpongeBob = new Movie("SpongeBob", 1);
	System.out.println(LifeOfPie.getTicketPrice());
	NetflixQueue queue = new NetflixQueue();
	queue.addMovie(BugsLife);
	queue.addMovie(LifeOfPie);
	queue.addMovie(TheJungleBook);
	queue.addMovie(SuperMan);
	queue.addMovie(SpongeBob);
	queue.printMovies();
	System.out.println("The best movie is " + queue.getBestMovie());
	System.out.println("The second best movie is The Jungle Book");
	queue.sortMoviesByRating();
	
}
}
