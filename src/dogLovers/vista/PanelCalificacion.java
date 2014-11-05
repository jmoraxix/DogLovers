package dogLovers.vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dogLovers.DogLovers;
import dogLovers.modelo.Entidad;

public class PanelCalificacion extends JPanel {

	/**** VARIABLES ****/
	private static final long serialVersionUID = -1326979310389603138L;
	private LevelBar levelBar;

	/**** CONSTRUCTOR ****/
	public PanelCalificacion(Entidad entidad) {
		ImageIcon defaultIcon = new ImageIcon(Toolkit.getDefaultToolkit()
				.getImage(
						DogLovers.class.getResource("vista/imagenes/Star.png")));
		ImageProducer ip = defaultIcon.getImage().getSource();

		ImageIcon yStar = makeStarImageIcon(ip, new float[] { 1.0f, 1.0f, .0f });
		List<ImageIcon> list = Arrays.asList(yStar, yStar, yStar, yStar, yStar,
				yStar, yStar, yStar, yStar, yStar);
		setLayout(new BorderLayout(0, 0));
		levelBar = new LevelBar(defaultIcon, list, 1, entidad);
		add(levelBar);
		setPreferredSize(new Dimension(200, 45));
		setOpaque(false);
	}

	/**** MÉTODOS ****/
	public int getCalificacion() {
		return levelBar.getLevel();
	}

	public void setCalificacion(int calif) {
		levelBar.setLevel(calif);
	}

	private ImageIcon makeStarImageIcon(ImageProducer ip, float[] filter) {
		return new ImageIcon(createImage(new FilteredImageSource(ip,
				new SelectedImageFilter(filter))));
	}
}

class LevelBar extends JPanel implements MouseListener, MouseMotionListener {

	/**** VARIABLES ****/
	private static final long serialVersionUID = 3302441814675890136L;
	private final int gap;
	protected final List<ImageIcon> iconList;
	protected final List<JLabel> labelList = Arrays.asList(new JLabel(),
			new JLabel(), new JLabel(), new JLabel(), new JLabel(),
			new JLabel(), new JLabel(), new JLabel(), new JLabel(),
			new JLabel());
	protected final ImageIcon defaultIcon;
	private int clicked = -1;
	private Entidad entidad;

	/**** CONSTRUCTOR ****/
	public LevelBar(ImageIcon defaultIcon, List<ImageIcon> list, int gap,
			Entidad entidad) {
		super(new GridLayout(1, 10, gap * 2, gap * 2));
		this.entidad = entidad;
		this.defaultIcon = defaultIcon;
		this.iconList = list;
		this.gap = gap;
		for (JLabel l : labelList) {
			l.setIcon(defaultIcon);
			add(l);
		}
		addMouseListener(this);
		addMouseMotionListener(this);
		setOpaque(false);
	}

	/**** MÉTODOS ****/
	public void clear() {
		clicked = -1;
		repaintIcon(clicked);
	}

	public int getLevel() {
		return clicked;
	}

	public void setLevel(int l) {
		clicked = l;
		repaintIcon(clicked);
	}

	private int getSelectedIconIndex(Point p) {
		for (int i = 0; i < labelList.size(); i++) {
			Rectangle r = labelList.get(i).getBounds();
			r.grow(gap, gap);
			if (r.contains(p)) {
				return i;
			}
		}
		return -1;
	}

	protected void repaintIcon(int index) {
		for (int i = 0; i < labelList.size(); i++) {
			labelList.get(i)
					.setIcon(i <= index ? iconList.get(i) : defaultIcon);
		}
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		repaintIcon(getSelectedIconIndex(e.getPoint()));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		repaintIcon(getSelectedIconIndex(e.getPoint()));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		clicked = getSelectedIconIndex(e.getPoint());
		entidad.addCalificacion(clicked);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		repaintIcon(clicked);
	}

	@Override
	public void mouseDragged(MouseEvent e) { /* not needed */
	}

	@Override
	public void mousePressed(MouseEvent e) { /* not needed */
	}

	@Override
	public void mouseReleased(MouseEvent e) { /* not needed */
	}
}

class SelectedImageFilter extends RGBImageFilter {

	/**** VARIABLES ****/
	private final float[] filter;

	/**** CONSTRUCTOR ****/
	public SelectedImageFilter(float[] arrays) {
		super();
		// filter = arrays;
		filter = new float[arrays.length];
		for (int i = 0; i < arrays.length; i++) {
			filter[i] = arrays[i];
		}
		canFilterIndexColorModel = false;
	}

	/**** MÉTODOS ****/
	@Override
	public int filterRGB(int x, int y, int argb) {
		int r = (int) (((argb >> 16) & 0xff) * filter[0]);
		int g = (int) (((argb >> 8) & 0xff) * filter[1]);
		int b = (int) (((argb) & 0xff) * filter[2]);
		return (argb & 0xff000000) | (r << 16) | (g << 8) | (b);
	}
}
