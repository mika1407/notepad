package pad;

import java.io.IOException;
import java.io.PrintWriter;

public class Save {

	public void write() {
		
		try {
			PrintWriter writer = new PrintWriter(Setup.OUTPUT_FILE, "UTF-8");
			writer.println(Gui.text.getText());
			writer.close();
			Gui.info.setText("Saved ("+Setup.OUTPUT_FILE+")");
			
		}catch (IOException e){}
		
	}

}
