package ravi80558055.maven;

import org.apache.commons.lang3.StringUtils;

public class Application {
    
	public int countWords(String words){
		String[] seperatedWords = StringUtils.split(words, " ");
		return (seperatedWords == null)? 0 : seperatedWords.length;
	}
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		
		int count = app.countWords("Cannot load or find main class");
		System.out.println("Words Count: " + count);
    }
}