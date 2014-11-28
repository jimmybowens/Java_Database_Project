package java_database_project;

import java.awt.Dimension;

import javax.swing.JFrame;

public class QueryWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public QueryWindow(){
		this.setTitle("Query Database");
		this.setSize(new Dimension(400,400));
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

}
