package com.aurionpro.test;



import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.aurionpro.model.Movie;
import com.aurionpro.model.MovieManager;

public class MovieApp {
	private static Scanner scanner = new Scanner(System.in);
	private static List<MovieManager> managers = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		boolean exit = false;

		while (!exit) {

			System.out.println("1.Add Mananger 2.Existing User 3.Exit the App ");
			int userChoice = scanner.nextInt();

			if (userChoice == 2) {
				existedManager();

			} else if (userChoice == 1) {
				addManager();
			} else if(userChoice == 3) {
				exit = true;
			}else {
				System.out.println("Enter the valid choice!");
			}
		}
		System.out.println("Thank for using our app!");
	}

	private static void addManager() {
		System.out.println("Enter the Manager Id: ");
		int managerId = scanner.nextInt();

		for (MovieManager manager : managers ) {
			if (manager.getManagerId() == managerId) {
				System.out.println("Manager already exist!");
				return;
			}
		}

		managers.add(new MovieManager(managerId));
		System.out.println(managers);

		
	}

	private static void existedManager() throws IOException {
		if (managers.isEmpty()) {
			System.out.println("No Mananger found");
			return;
		}
		boolean existed = true;
		while (existed) {
			for (MovieManager manager : managers) {
				System.out.println(manager.getManagerId());
			}

			MovieManager selectManager  = selectManager();

			if (selectManager == null) {
				System.out.println("Mananger does not exist!");

			} else {
				existed = false;
				handleManagerChoice(selectManager);

			}
		}

		
	}

	private static MovieManager selectManager() {
		System.out.println("Enter manager id to manage :");
		int existedUserChoice = scanner.nextInt();

		for (MovieManager manager : managers) {
			if (manager.getManagerId() == existedUserChoice)
				return manager;
		}

		
		return null;
	}
	
	private static void handleManagerChoice(MovieManager manager) throws IOException {
		

		boolean exit = false;
		while (!exit) {
            System.out.println("1.Add Movies  2.Save Permenanteley  3.Load Movies  4.Find Movie 5.Back");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addMovie(manager);
                    break;
                case 2:
                	saveMovie(manager);
                    break;
                case 3:
                	loadMovies(manager);
                	break;
                	
                case 4:
                	findMovie(manager);
                case 5:
                    exit = true; // Go back to the main menu
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
		}
	}

	

	
	

	private static void findMovie(MovieManager manager) {
		boolean findingMovie = true;
		while(findingMovie) {
			System.out.println("1.Find a movie 2. exit");
			int find = scanner.nextInt();
			
			switch(find) {
			case  1: 
				System.out.println("Enter movie id: ");
				int id = scanner.nextInt();
				for (Movie movie : manager.getMovies()) {
					if(movie.getMovieId() ==  id ) {
						System.out.println(movie);
						break;
					}
				}
				System.out.println("No movie found of id "+id);
				break;
				
				
			case 2: 
				findingMovie =  false;
			}
			
			
		}
		
	}

	private static void addMovie(MovieManager manager) {
		boolean addingMovies = true;
		while (addingMovies) {

			System.out.println("1.Add a movie 2. exit");
			int chocie2 = scanner.nextInt();

			switch (chocie2) {
			case 1:
				

				System.out.println("Enter Movie Name: ");
				String name = scanner.next();
				
				for(Movie movie: manager.getMovies()) {
					if(movie.getMovieName().equals(name) ) {
						System.out.println("Movie already present ");
						return;
					}
				}
				System.out.println("Enter Movie ID: ");
				int movieId = scanner.nextInt();
				
				System.out.println("Enter Movie year (eg., 2002): ");
				int movieYear = scanner.nextInt();
				
				System.out.println("Enter the genre of movie:");
				System.out.println("Avaiable genre are Action , Drama , Comedy");
				String genre =  scanner.next();
				
				 manager.addManagersMovies( new Movie(movieId,name,movieYear,genre));	
				break;
			case 2:
				addingMovies = false;
				break;

			default:
				System.out.println("Enter valid Choice! ");
				break;
				
			}
			System.out.println(manager.getManagersMovies());
			
		}
		
	}
	
	
	private static void saveMovie(MovieManager manager) throws IOException {
		
		if(manager.getManagersMovies().isEmpty()) {
			System.out.println("There no movie to save");
			return;
		}
		for(Movie movie : manager.getManagersMovies()) {
			  manager.addMovies(movie);
		  }
		
		manager.getManagersMovies().clear();
		  if (manager.getMovies().isEmpty()) {
		        System.out.println("There are no movies to save: Add and save a movie.");
		        return;
		    }

		  
		 
		    try (FileOutputStream fileOut = new FileOutputStream("Movie.txt");
		    		ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
		        for (Movie movie : manager.getMovies()) {
		            out.writeObject(movie);
		        }
		        System.out.println("Serialized data is saved in Movie.txt");
		    } catch (IOException i) {
		        i.printStackTrace();
		    }

		  if(manager.getPath() == null) {
		    File file = new File("Movie.txt");
		    String absolutePath = file.getAbsolutePath();
		    System.out.println("Absolute path: " + absolutePath);
		    manager.setPath(absolutePath);
		  }
		    
	
		   
		}

	private static void loadMovies(MovieManager manager) throws  IOException {
		
		 if (manager.getPath() == null) {
		        System.out.println("There is no Movie in the file: Add and save the movie!");
		        return;
		    }

		    File file = new File(manager.getPath());
		    if (!file.exists() || file.length() == 0) {
		        System.out.println("Movie.txt is empty or does not exist.");
		        return;
		    }

		    try (FileInputStream fileIn = new FileInputStream(manager.getPath());
		         ObjectInputStream in = new ObjectInputStream(fileIn)) {
//		        manager.getMovies().clear(); 
		        while (true) {
		            try {
//		            	System.out.println(manager.getMovies());
		                Movie movie = (Movie) in.readObject();
		             
		                
		                	
		                
		                System.out.println(movie);
		            } catch (EOFException e) {
		                break; 
		            }
		        }
		    } catch (ClassNotFoundException c) {
		        System.out.println("Movie class not found");
		    } catch (FileNotFoundException exception) {
		        System.out.println("Movie.txt file not found. Please save the file first.");
		    }
		    
		    
		}
	
	
		
}
	


