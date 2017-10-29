package pad;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Gui {
	
	public static JTextArea text = new JTextArea();
	public static JLabel info = new JLabel();
	private Save save = new Save();
	
	public void builder() {
		
		//FRAME
		JFrame frame = new JFrame(Setup.FRAME_TITLE);
		frame.setSize(Setup.FRAME_W, Setup.FRAME_H);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menubar = new JMenuBar();
		menubar.setBackground(Color.WHITE);
		menubar.setBorder(null);
		
		JMenu filemenu = new JMenu("File");
		menubar.add(filemenu);
		
		@SuppressWarnings("serial")
		JMenuItem item = new JMenuItem(new AbstractAction("Save"){
			public void actionPerformed(ActionEvent e) {
				save.write();
			}
		});
		
		filemenu.add(item);
		
		Font font = new Font("Consolas", Font.PLAIN, Setup.FONT_SIZE);
		text.setFont(font);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(menubar, BorderLayout.NORTH);
		panel.add(text, BorderLayout.CENTER);
		panel.add(info, BorderLayout.SOUTH);
		frame.add(panel);
		
		
		frame.setVisible(true);
	}
}
