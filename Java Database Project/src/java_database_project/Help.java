package java_database_project;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Help extends JFrame{
	public Help() {
		this.setTitle("Help");
		getContentPane().setLayout(null);
		
		//set up tree
		 DefaultMutableTreeNode root = new DefaultMutableTreeNode("Tutorial");
		 //leaves
		 DefaultMutableTreeNode aboutMenu = new DefaultMutableTreeNode("About");
	     DefaultMutableTreeNode fileMenu = new DefaultMutableTreeNode("File");
	     DefaultMutableTreeNode queryMenu = new DefaultMutableTreeNode("Query");
	     DefaultMutableTreeNode reportMenu = new DefaultMutableTreeNode("Report");
	     DefaultMutableTreeNode statisticsMenu = new DefaultMutableTreeNode("Statistics");
	     DefaultMutableTreeNode helpMenu = new DefaultMutableTreeNode("Help");
	     
	     root.add(aboutMenu);
	     root.add(fileMenu);
	     root.add(queryMenu);
	     root.add(reportMenu);
	     root.add(statisticsMenu);
	     root.add(helpMenu);
	     
		JTree tree = new JTree(root);
		tree.setBounds(10, 11, 374, 350);
		getContentPane().add(tree);
		this.setResizable(false);
		this.setSize(new Dimension(400,400));
		this.setVisible(true);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
