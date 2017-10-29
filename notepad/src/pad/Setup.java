package pad;

public class Setup {
	
	public static final String FRAME_TITLE = "Pad";
	public static final String OUTPUT_FILE = "SavedFile.txt";
	public static final int FONT_SIZE = 16;
	public static final int FRAME_W = 750;
	public static final int FRAME_H = 600;
	
	public static void main(String[] args) {
		
		Gui gui = new Gui();
		gui.builder();
	}
}
