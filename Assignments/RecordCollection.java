import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

class Record {
	private String artist;
	private String track;
	private String genre;
	
	public Record(String artist, String track, String genre) {
		this.artist = artist;
		this.track = track;
		this.genre = genre;
	}
	
	public String getGenre() { return genre; }
	public String toString() { return artist + " - " + track; }
}


public class RecordCollection {
	
	static final List<Record> collection = new ArrayList<>();
	static {
		collection.add(new Record("Eric Prydz", "Propper education", "House"));
		collection.add(new Record("Jeff Mills", "The bells", "Techno"));
		collection.add(new Record("Sasha", "Xpander", "Progressive"));
	}
	
	public static void main(String args[]) {
		
		String genre = "";
		if (args.length > 0) genre = args[0].toLowerCase();
		
		
		Predicate<Record> filter; 
		
		switch(genre) {
			case "house": 
				filter = r -> !r.getGenre().toLowerCase().contains("house");	
			break;
			
			case "techno":
				filter = r -> !r.getGenre().toLowerCase().contains("house");
			break;
			
			case "progressive":
				filter = r -> !r.getGenre().toLowerCase().contains("progressive");
			break;
			
			default:
				filter = r -> false;
			break;
		}
		
		collection.removeIf(filter);
		
		for(Record r: collection)
			System.out.println(r);
		
		
		
	}
}