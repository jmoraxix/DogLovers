/**
 * Proyecto Final POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * David Diaz
 * 2014004725
 * Roger Villalobos
 * 2014079369
 * 25/10/2014
 */

package dogLovers.vista;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JTextField;

/**
 * @author JoséDavid 25/10/2014
 */
public class TransparentTextField extends JTextField {

	private static final long serialVersionUID = 1959323179223226142L;

	public TransparentTextField() {
		super();
		init();
	}

	public TransparentTextField(String text) {
		super(text);
		init();
	}

	public TransparentTextField(int columns) {
		super(columns);
		init();
	}

	public TransparentTextField(String text, int columns) {
		super(text, columns);
		init();
	}

	protected void init() {
		setOpaque(false);
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setComposite(AlphaComposite.SrcOver.derive(0.5f));
		super.paint(g2d);
		g2d.dispose();
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setColor(getBackground());
		g2d.fillRect(0, 0, getWidth(), getHeight());
		super.paintComponent(g2d);
		g2d.dispose();
	}

}