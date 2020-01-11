import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.Canvas;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Experimenting extends Canvas{
    private static int Aboxes = 0;
    private static int Bboxes = 0;
	private JFrame frame;
	private JTextField txtVennDiagram;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private Drawing canvas2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Experimenting window = new Experimenting();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Experimenting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 300, 1325, 700);      //Bounds for the application window, Third: Width  Fourth: Height 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtVennDiagram = new JTextField();
		txtVennDiagram.setEditable(false);
		txtVennDiagram.setBackground(Color.YELLOW);
		txtVennDiagram.setFont(new Font("Calibri", Font.BOLD, 20));
		txtVennDiagram.setText(" Venn Diagram");
		txtVennDiagram.setBounds(529, 56, 140, 53);
		frame.getContentPane().add(txtVennDiagram);
		txtVennDiagram.setColumns(10);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(282, 132, 641, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_1.setBounds(551, 218, 103, 41);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Text:");
		lblNewLabel.setLabelFor(textField);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNewLabel.setBounds(198, 147, 74, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAOrB = new JLabel("A or B:");
		lblAOrB.setLabelFor(textField_1);
		lblAOrB.setFont(new Font("Calibri", Font.BOLD, 16));
		lblAOrB.setBounds(490, 220, 51, 41);
		frame.getContentPane().add(lblAOrB);
		
		JButton btnSubmit = new JButton("Submit");
		buttonGroup.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String input; String side;
			try {
			input = textField.getText();
			side = textField_1.getText(); 
			if(side.length() > 1 || (Character.toLowerCase(side.charAt(0)) != Character.toLowerCase('A') && Character.toLowerCase(side.charAt(0)) != Character.toLowerCase('B'))) {
			JOptionPane.showMessageDialog(null, "Please enter a valid side");
			}
			if(Character.toLowerCase(side.charAt(0)) == Character.toLowerCase('A')) {Aboxes ++;}
			if(Character.toLowerCase(side.charAt(0)) == Character.toLowerCase('B')) {Bboxes ++;}
		
			if(Aboxes == 1 && textField_2.isEditable()) {
			textField_2.setText(input);
			textField_2.setEditable(false);
			}
			if(Aboxes == 2 && textField_3.isEditable()) {
			textField_3.setText(input);
			textField_3.setEditable(false);
			}
			if(Aboxes == 3 && textField_4.isEditable()) {
			textField_4.setText(input);
			textField_4.setEditable(false);
			}
			if(Aboxes == 4 && textField_5.isEditable()) {
			textField_5.setText(input);
			textField_5.setEditable(false);
			}
			if(Bboxes == 1 && textField_6.isEditable()) {
			textField_6.setText(input);
			textField_6.setEditable(false);
			}
			if(Bboxes == 2 && textField_7.isEditable()) {
			textField_7.setText(input);
			textField_7.setEditable(false);
			}
			if(Bboxes == 3 && textField_8.isEditable()) {
			textField_8.setText(input);
			textField_8.setEditable(false);
			}
			if(Bboxes == 4 && textField_9.isEditable()) {
			textField_9.setText(input);
			textField_9.setEditable(false);
			}
			if(Bboxes == 5 && textField_10.isEditable()) {
			textField_10.setText(input);
			textField_10.setEditable(false);
			}
			textField.setText("");
			textField_1.setText(""); 
			}
			catch(Exception e1){
			JOptionPane.showMessageDialog(null, "Please enter a valid entry");	
			}
			}
		});
		btnSubmit.setFont(new Font("Calibri", Font.BOLD, 16));
		btnSubmit.setBounds(551, 569, 120, 41);
		frame.getContentPane().add(btnSubmit);       
        
        Label label = new Label("A");
        label.setFont(new Font("Dialog", Font.BOLD, 16));
        label.setBounds(368, 238, 24, 21);
        frame.getContentPane().add(label);
        
        Label label_1 = new Label("B\r\n");
        label_1.setFont(new Font("Dialog", Font.BOLD, 16));
        label_1.setBounds(823, 238, 24, 21);
        frame.getContentPane().add(label_1);
        
        textField_2 = new JTextField();
        textField_2.setBackground(SystemColor.window);
        textField_2.setFont(new Font("Calibri", Font.BOLD, 10));
        textField_2.setBounds(316, 310, 140, 21);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setBackground(SystemColor.window);
        textField_3.setBounds(296, 363, 171, 21);
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setBackground(SystemColor.window);
        textField_4.setBounds(268, 410, 232, 19);
        frame.getContentPane().add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBackground(SystemColor.window);
        textField_5.setBounds(293, 457, 186, 19);
        frame.getContentPane().add(textField_5);
        textField_5.setColumns(10);
        
        textField_6 = new JTextField();
        textField_6.setBackground(SystemColor.window);
        textField_6.setBounds(764, 322, 140, 19);
        frame.getContentPane().add(textField_6);
        textField_6.setColumns(10);
        
        textField_7 = new JTextField();
        textField_7.setBackground(SystemColor.window);
        textField_7.setBounds(713, 362, 232, 21);
        frame.getContentPane().add(textField_7);
        textField_7.setColumns(10);
        
        textField_8 = new JTextField();
        textField_8.setBackground(SystemColor.window);
        textField_8.setBounds(709, 410, 251, 19);
        frame.getContentPane().add(textField_8);
        textField_8.setColumns(10);
        
        textField_9 = new JTextField();
        textField_9.setBackground(SystemColor.window);
        textField_9.setBounds(713, 457, 232, 19);
        frame.getContentPane().add(textField_9);
        textField_9.setColumns(10);
        
        textField_10 = new JTextField();
        textField_10.setBackground(SystemColor.window);
        textField_10.setBounds(737, 507, 186, 19);
        frame.getContentPane().add(textField_10);
        textField_10.setColumns(10);
        

        Canvas canvas = new Drawing();
        canvas.setLocation(677, 270);
        canvas.setBackground(new Color(255, 255, 255, 80));
        canvas.setSize(301, 303);
        frame.getContentPane().add(canvas);
        
        canvas2 = new Drawing();
        canvas2.setBackground(new Color(255, 255, 255, 80));
        canvas2.setBounds(228, 270, 301, 303);
        frame.getContentPane().add(canvas2);
        
        JButton btnDone = new JButton("Done?");
        btnDone.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        	Satistics newFrame = new Satistics();	
        	newFrame.pack();
        	newFrame.setLocationRelativeTo(null);
        	newFrame.setVisible(true);
        	newFrame.setBounds(252, 111, 390, 159);
        	String s = "A: " + Aboxes + "\n" + "B: " + Bboxes;
            newFrame.textField.setText(s);
            newFrame.textField.setEditable(false);

        	
        	}
        });
        btnDone.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        	}
        });
        btnDone.setFont(new Font("Calibri", Font.BOLD, 16));
        btnDone.setBounds(1081, 569, 140, 41);
        frame.getContentPane().add(btnDone);
 
        
        
    
	}
	public Color getCanvas2Background() {
		return canvas2.getBackground();
	}
	public void setCanvas2Background(Color background) {
		canvas2.setBackground(background);
	}
}
