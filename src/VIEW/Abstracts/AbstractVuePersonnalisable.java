package VIEW.Abstracts;

import javax.swing.JDialog;

public abstract class AbstractVuePersonnalisable extends JDialog {

	private int attr1;
	private int attr2;
	private int attr3;
	
	public AbstractVuePersonnalisable(int attr1, int attr2, int attr3) {
		super();
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
	}
	
	
}