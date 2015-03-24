//import java.awt.EventQueue;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javax.swing.JButton;
import java.awt.SystemColor;


public class NavSys7 
{

	public static void main(String[] args) 
	   {
		        final Browser browser = new Browser();
		        BrowserView browserView = new BrowserView(browser);

		        //final JTextField addressBar = new JTextField("https://www.google.com/maps/@41.2918589,-96.0812485,11z");
		        //final JTextField addressBar = new JTextField("http://www.weather.com/weather/today/l/USNE0363:1:US");
		        //final JTextField addressBar = new JTextField("http://www.cise.ufl.edu/~sdash/archives.html");
		        final JTextField addressBar = new JTextField("maps.google.com");
		        addressBar.setForeground(SystemColor.control);
		        addressBar.setBackground(SystemColor.control);
		        addressBar.setEditable(false);
		        
		        addressBar.addActionListener(new ActionListener() 
		        {
		           
		            public void actionPerformed(ActionEvent e) {
		                browser.loadURL(addressBar.getText());
		            }
		        });

		        JPanel addressPane = new JPanel(new BorderLayout());
		        addressPane.add(new JLabel(""), BorderLayout.WEST);
		        addressPane.add(addressBar, BorderLayout.CENTER);

		        JFrame frame = new JFrame("Navigation System");
		        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		        frame.getContentPane().add(addressPane, BorderLayout.NORTH);
		        frame.getContentPane().add(browserView, BorderLayout.CENTER);
		        
		        JPanel panel = new JPanel();
		        frame.getContentPane().add(panel, BorderLayout.SOUTH);
		        
		        final JButton btnHome = new JButton("Home");
		        btnHome.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        	
		        		
		        			browser.loadURL("https://accounts.google.com/ServiceLogin?sacu=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail");
		        			//addressBar = new JTextField("http://www.cise.ufl.edu/~sdash/contact.html");
		        		
		        	
		        	}
		        });
		        panel.add(btnHome);
		        
		        final JButton btnCurrentLocation = new JButton("Current Location");
		        btnCurrentLocation.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		browser.loadURL("https://www.google.com/maps/@41.2388801,-95.9998959,14z");
		        	}
		        });
		        panel.add(btnCurrentLocation);
		        
		        final  JButton btnWeather = new JButton("Weather");
		        btnWeather.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		browser.loadURL("http://www.weather.com/weather/today/l/USNE0363:1:US");
		        	}
		        });
		        panel.add(btnWeather);
		        
		        final JButton btnFuel = new JButton("Fuel");
		        btnFuel.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        	
		        		browser.loadURL("http://www.cise.ufl.edu/~sdash/archives.html");
		        	}
		        });
		        panel.add(btnFuel);
		        
		        final  JButton btnEmergenncyAssistence = new JButton("Emergenncy Assistence");
		        btnEmergenncyAssistence.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		browser.loadURL("http://www.cise.ufl.edu/~sdash/contact.html");
		        	}
		        });
		        panel.add(btnEmergenncyAssistence);
		        frame.setSize(800, 500);
		        frame.setLocationRelativeTo(null);
		        frame.setVisible(true);

		        browser.loadURL(addressBar.getText());
		    }
	
	
	
	
	
	

}
