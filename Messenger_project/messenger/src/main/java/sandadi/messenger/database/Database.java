package sandadi.messenger.database;

import java.util.HashMap;

import sandadi.messenger.model.Comment;
import sandadi.messenger.model.Message;
import sandadi.messenger.model.Profile;

public class Database {
	
	public static HashMap<Long,Message> messages = new HashMap<>();
	public static HashMap<String,Profile> profiles = new HashMap<>();

	
}
