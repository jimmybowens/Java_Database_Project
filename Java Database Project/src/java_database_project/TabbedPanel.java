package java_database_project;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;

import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.JScrollPane;

import net.proteanit.sql.DbUtils;

import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TabbedPanel extends JTabbedPane{
	
	private static final long serialVersionUID = 1L;
	//private String[] states = { "MD","DC" };
	public static JTable scout_table;
	public static JTable volunteer_table;
	public static JTable troop_table;
	public static JTable customer_table;
	public static JTable shipment_table;
	public static JTable product_table;
	public static JTable order_table;
	public static JTable money_table;
	public static JTable inventory_table;

	public TabbedPanel (){
		addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				loadData();
			}
		});	
		setSize(800, 800);
		
		JPanel volunteer_tab = new JPanel();
		addTab("Volunteer", null, volunteer_tab, null);
		volunteer_tab.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 800, 800);
		volunteer_tab.add(scrollPane_1);
		
		volunteer_table = new JTable(){
	        private static final long serialVersionUID = 1L;

	        public boolean isCellEditable(int row, int column) {                
	                return false;               
	        };
	    };
		
		
		volunteer_table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		scrollPane_1.setViewportView(volunteer_table);
		
		JPanel troop_tab = new JPanel();
		addTab("Troop", null, troop_tab, null);
		troop_tab.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 800, 800);
		troop_tab.add(scrollPane_2);
		
		troop_table = new JTable(){
	        private static final long serialVersionUID = 1L;

	        public boolean isCellEditable(int row, int column) {                
	                return false;               
	        };
	    };
	    
		troop_table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		scrollPane_2.setViewportView(troop_table);
		
		JPanel scout_tab = new JPanel();
		scout_tab.setBackground(Color.LIGHT_GRAY);
		addTab("Scout", null, scout_tab, null);
		scout_tab.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 800, 800);
		scout_tab.add(scrollPane);
		
		scout_table = new JTable(){
	        private static final long serialVersionUID = 1L;

	        public boolean isCellEditable(int row, int column) {                
	                return false;               
	        };
	    };
	    
		scout_table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		scrollPane.setViewportView(scout_table);
		
		JPanel customer_tab = new JPanel();
		addTab("Customer", null, customer_tab, null);
		customer_tab.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 800, 800);
		customer_tab.add(scrollPane_3);
		
		customer_table = new JTable(){
	        private static final long serialVersionUID = 1L;

	        public boolean isCellEditable(int row, int column) {                
	                return false;               
	        };
	    };
	    
		customer_table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		scrollPane_3.setViewportView(customer_table);
		
		JPanel shipment_tab = new JPanel();
		addTab("Shipment", null, shipment_tab, null);
		shipment_tab.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 0, 800, 800);
		shipment_tab.add(scrollPane_4);
		
		shipment_table = new JTable(){
	        private static final long serialVersionUID = 1L;

	        public boolean isCellEditable(int row, int column) {                
	                return false;               
	        };
	    };
	    
		shipment_table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		scrollPane_4.setViewportView(shipment_table);
		
		JPanel product_tab = new JPanel();
		addTab("Product", null, product_tab, null);
		product_tab.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 0, 800, 800);
		product_tab.add(scrollPane_5);
		
		product_table = new JTable(){
	        private static final long serialVersionUID = 1L;

	        public boolean isCellEditable(int row, int column) {                
	                return false;               
	        };
	    };
	    
		scrollPane_5.setViewportView(product_table);
		
		JPanel order_tab = new JPanel();
		addTab("Orders", null, order_tab, null);
		order_tab.setLayout(null);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(0, 0, 800, 800);
		order_tab.add(scrollPane_6);
		
		order_table = new JTable(){
	        private static final long serialVersionUID = 1L;

	        public boolean isCellEditable(int row, int column) {                
	                return false;               
	        };
	    };
	    
		scrollPane_6.setViewportView(order_table);
		
		JPanel money_tab = new JPanel();
		addTab("Money", null, money_tab, null);
		money_tab.setLayout(null);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(0, 0, 800, 800);
		money_tab.add(scrollPane_7);
		
		money_table = new JTable(){
	        private static final long serialVersionUID = 1L;

	        public boolean isCellEditable(int row, int column) {                
	                return false;               
	        };
	    };
	    
		scrollPane_7.setViewportView(money_table);
		
		JPanel inventory_tab = new JPanel();
		addTab("Inventory", null, inventory_tab, null);
		inventory_tab.setLayout(null);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(0, 0, 800, 800);
		inventory_tab.add(scrollPane_8);
		
		inventory_table = new JTable(){
	        private static final long serialVersionUID = 1L;

	        public boolean isCellEditable(int row, int column) {                
	                return false;               
	        };
	    };
	    
		scrollPane_8.setViewportView(inventory_table);
		
		
		loadData();	
	}
	
	public void populateManager(JComboBox combo){
		try{
			Main.makeConnection();
			Main.preparedStatement = Main.connection.prepareStatement("SELECT * FROM Volunteer");
			Main.result = Main.preparedStatement.executeQuery();
			while (Main.result.next()){
				combo.addItem(Main.result.getString("FIRSTNAME")+ " "+ Main.result.getString("LASTNAME"));
			}
			Main.closeConnection();
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e ,"Error!",JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void loadData(){
		Main.makeConnection();
		try {
			Main.preparedStatement = Main.connection.prepareStatement("SELECT NAME, DESCRIPTION, PRICE FROM PRODUCT");
			Main.result = Main.preparedStatement.executeQuery();
			TabbedPanel.product_table.setModel(DbUtils.resultSetToTableModel(Main.result));
			
			Main.preparedStatement = Main.connection.prepareStatement("SELECT * FROM SCOUT");
			Main.result = Main.preparedStatement.executeQuery();
			TabbedPanel.scout_table.setModel(DbUtils.resultSetToTableModel(Main.result));
			
			Main.preparedStatement = Main.connection.prepareStatement("SELECT * FROM VOLUNTEER");
			Main.result = Main.preparedStatement.executeQuery();
			TabbedPanel.volunteer_table.setModel(DbUtils.resultSetToTableModel(Main.result));
			
			Main.preparedStatement = Main.connection.prepareStatement("SELECT NAME, ADDRESS, CITY, STATE, ZIPCODE, MANAGER, FIRSTNAME, LASTNAME FROM TROOP, VOLUNTEER WHERE TROOP.MANAGER = VOLUNTEER.VOLUNTEER_ID");
			Main.result = Main.preparedStatement.executeQuery();
			TabbedPanel.troop_table.setModel(DbUtils.resultSetToTableModel(Main.result));
			
			Main.preparedStatement = Main.connection.prepareStatement("SELECT * FROM CUSTOMER");
			Main.result = Main.preparedStatement.executeQuery();
			TabbedPanel.customer_table.setModel(DbUtils.resultSetToTableModel(Main.result));
			
			Main.preparedStatement = Main.connection.prepareStatement("SELECT * FROM SHIPMENT");
			Main.result = Main.preparedStatement.executeQuery();
			TabbedPanel.shipment_table.setModel(DbUtils.resultSetToTableModel(Main.result));
			
			Main.preparedStatement = Main.connection.prepareStatement("SELECT * FROM PRODUCT_ORDER");
			Main.result = Main.preparedStatement.executeQuery();
			TabbedPanel.order_table.setModel(DbUtils.resultSetToTableModel(Main.result));
			
			Main.preparedStatement = Main.connection.prepareStatement("SELECT * FROM MONEY");
			Main.result = Main.preparedStatement.executeQuery();
			TabbedPanel.money_table.setModel(DbUtils.resultSetToTableModel(Main.result));
			
			Main.preparedStatement = Main.connection.prepareStatement("SELECT * FROM INVENTORY");
			Main.result = Main.preparedStatement.executeQuery();
			TabbedPanel.inventory_table.setModel(DbUtils.resultSetToTableModel(Main.result));
			
			Main.closeConnection();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e ,"Please make sure you have a connection to your database!",JOptionPane.WARNING_MESSAGE);
		}catch(Exception general){
			JOptionPane.showMessageDialog(null, general ,"Error!",JOptionPane.WARNING_MESSAGE);
		}
		
	}
}
