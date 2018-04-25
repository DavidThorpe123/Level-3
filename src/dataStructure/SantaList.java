package dataStructure;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SantaList implements MouseListener {

	JFrame frame;
	JPanel panel;
	JLabel current;
	String[] images = new String[] { "vbucks-fortnite.jpg", "org_220.png", "fer.png" };

	SantaList() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.addMouseListener(this);
		frame.setVisible(true);

		frame.pack();
	}

	public static void main(String[] args) {
		SantaList sl = new SantaList();
	}

	public ArrayList<JLabel> labels() {
		ArrayList<JLabel> labels = new ArrayList();
		for (int i = 0; i < images.length; i++) {
			JLabel jlabel = loadImageFromJavaProject(images[i]);
			labels.add(jlabel);
		}
		return labels;

	}

	private JLabel loadImageFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private JLabel loadImageFromJavaProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		int ran = new Random().nextInt(labels().size());
		System.out.println(ran);
		ArrayList<JLabel> labels = labels();
		JLabel label1 = labels.get(ran);
		if (current != null) {
			panel.remove(current);
		}
		panel.add(label1);
		current = label1;
		// frame.setVisible(false);
		frame.pack();
		// frame.setVisible(true);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
