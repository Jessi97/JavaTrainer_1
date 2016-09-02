package JavaTrainer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrame_JavaTrainer extends JFrame {

	private JPanel contentPane;
	private JTextField textField_ID;
	private JTextField textField_NName;
	private JTextField textField_VName;
	private JTextField textField_Alter;
	private JTextField textField_Erfahrung;
	private JTextField textField_Geburtsdatum;
	private int ID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_JavaTrainer frame = new JFrame_JavaTrainer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame_JavaTrainer() {
		setTitle("Verwaltung - Trainerdaten");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField_ID = new JTextField();
		textField_ID.setBounds(12, 13, 264, 22);
		panel.add(textField_ID);
		textField_ID.setColumns(10);
		
		JButton button_Suchen = new JButton("Suchen");
		button_Suchen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonSuchenActionPerformed(e);
			}
		});
		button_Suchen.setBounds(288, 12, 110, 25);
		panel.add(button_Suchen);
		
		textField_NName = new JTextField();
		textField_NName.setBounds(129, 44, 269, 22);
		panel.add(textField_NName);
		textField_NName.setColumns(10);
		
		JLabel lblName = new JLabel("Nachname:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(12, 47, 97, 16);
		panel.add(lblName);
		
		JLabel lblNewLabel = new JLabel("Alter:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(257, 110, 56, 16);
		panel.add(lblNewLabel);
		
		JLabel lblVorname = new JLabel("Vorname:");
		lblVorname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVorname.setBounds(12, 81, 77, 16);
		panel.add(lblVorname);
		
		textField_VName = new JTextField();
		textField_VName.setBounds(129, 75, 269, 22);
		panel.add(textField_VName);
		textField_VName.setColumns(10);
		
		textField_Alter = new JTextField();
		textField_Alter.setEditable(false);
		textField_Alter.setBounds(301, 108, 97, 22);
		panel.add(textField_Alter);
		textField_Alter.setColumns(10);
		
		JLabel lblErfahrung = new JLabel("Erfahrung:");
		lblErfahrung.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblErfahrung.setBounds(12, 142, 97, 22);
		panel.add(lblErfahrung);
		
		textField_Erfahrung = new JTextField();
		textField_Erfahrung.setBounds(129, 143, 269, 22);
		panel.add(textField_Erfahrung);
		textField_Erfahrung.setColumns(10);
		
		JButton button_First = new JButton("<<");
		button_First.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonFirstActionPerformed(e);
			}
		});
		button_First.setBounds(12, 219, 65, 25);
		panel.add(button_First);
		
		JButton button_Last = new JButton(">>");
		button_Last.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonLastActionPerformed(e);
			}
		});
		button_Last.setBounds(333, 219, 65, 25);
		panel.add(button_Last);
		
		JButton button_Next = new JButton("<");
		button_Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonPreviousActionPerformed(e);
			}
		});
		button_Next.setBounds(89, 219, 65, 25);
		panel.add(button_Next);
		
		JButton button_Previous = new JButton(">");
		button_Previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonNextActionPerformed(e);
			}
		});
		button_Previous.setBounds(256, 219, 65, 25);
		panel.add(button_Previous);
		
		JButton button_Exit = new JButton("Beenden");
		button_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonBeendenActionPerformed(e); 
			}
		});
		button_Exit.setBounds(313, 191, 85, 25);
		panel.add(button_Exit);
		
		JButton button_Aendern = new JButton("\u00C4ndern");
		button_Aendern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonAendernActionPerformed(e);
			}
		});
		
		button_Aendern.setBounds(12, 191, 85, 25);
		panel.add(button_Aendern);
		
		JButton btnNewButton_1 = new JButton("Neu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonNeuActionPerformed(arg0);
			}
		});
		btnNewButton_1.setBounds(107, 191, 85, 25);
		panel.add(btnNewButton_1);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.setBounds(204, 191, 97, 25);
		panel.add(btnSpeichern);
		
		JLabel lblGeburtsdatum = new JLabel("Geburtsdatum:");
		lblGeburtsdatum.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGeburtsdatum.setBounds(12, 111, 114, 16);
		panel.add(lblGeburtsdatum);
		
		textField_Geburtsdatum = new JTextField();
		textField_Geburtsdatum.setBounds(129, 108, 116, 22);
		panel.add(textField_Geburtsdatum);
		textField_Geburtsdatum.setColumns(10);
}

		protected void buttonNeuActionPerformed(ActionEvent arg0) {
			textField_ID.setText(null);
			textField_NName.setText(null);
			textField_VName.setText(null);
			textField_Geburtsdatum.setText(null);
			textField_Alter.setText(null);
			textField_Erfahrung.setText(null);
}
		protected void buttonAendernActionPerformed(ActionEvent e){
			Trainer.setNName(textField_NName.getText());
			Trainer.setVName(textField_VName.getText());
			Trainer.setGeburtsdatum(textField_Geburtsdatum.getText());
			Trainer.setErfahrung(textField_Erfahrung.getText());
			ITrainerDAO.update();
}	
		protected void buttonBeendenActionPerformed(ActionEvent e) {
			System.exit(0);
  }
		protected void buttonFirstActionPerformed(ActionEvent e){
			try{
				Trainer = ITrainerDAO.first();
			}
			catch (NoTrainerFound e) {
					
			}
			textField_ID.setText(Integer.toString(Trainer.getTrainerID()));
			textField_NName.setText(Trainer.getNName());
			textField_VName.setText(Trainer.getVName());
			textField_Geburtsdatum.setText(Trainer.getGeburtsdatum());
			textField_Erfahrung.setText(Trainer.getErfahrung());
  }
		protected void buttonPreviousActionPerformed(ActionEvent e){
			try{
				Trainer = ITrainerDAO.previous(Trainer);
			}
			catch(NoPerviousTrainerFound e){
				JOptionPane.showMessageDialog(this, e.getMessage(), "Fehlermeldung", JOptionPane.ERROR_MESSAGE);
			}
			textField_ID.setText(Integer.toString(Trainer.getTrainerID()));
			textField_NName.setText(Trainer.getNName());
			textField_VName.setText(Trainer.getVName());
			textField_Geburtsdatum.setText(Integer.toString(Trainer.getGeburtsdatum()));
			textField_Erfahrung.setText(Trainer.getErfahrung());
  }
		protected void buttonNextActionPerformed(ActionEvent e){
			try{
				Trainer = ITrainerDAO.next(Trainer);
			}
			catch(NoNextTrainerFound e){
				JOptionPane.showMessageDialog(this, e.getMessage(), "Fehlermeldung", JOptionPane.ERROR_MESSAGE);
			}
			textField_ID.setText(Integer.toString(Trainer.getTrainerID()));
			textField_NName.setText(Trainer.getNName());
			textField_VName.setText(Trainer.getVName());
			textField_Geburtsdatum.setText(Integer.toString(Trainer.getGeburtsdatum()));
			textField_Erfahrung.setText(Trainer.getErfahrung());
  }
		protected void buttonLastActionPerformed(ActionEvent e){
			try{
				Trainer = ITrainerDAO.last();
			}catch (NoTrainerFound e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Fehlermeldung", JOptionPane.ERROR_MESSAGE);
  }
			textField_ID.setText(Integer.toString(Trainer.getTrainerID()));
			textField_NName.setText(Trainer.getNName());
			textField_VName.setText(Trainer.getVName());
			textField_Geburtsdatum.setText(Integer.toString(Trainer.getGeburtsdatum()));
			textField_Erfahrung.setText(Trainer.getErfahrung());
		}
		
		protected void buttonSuchenActionPerformed(ActionEvent e){
			try {
				ID = Integer.parseInt(textField_ID.getText());
				try{		
					Trainer = ITrainerDAO.select(ID);
				}
				catch (NoTrainerFound e) {
					JOptionPane.showMessageDialog(this, e.getMessage(), "Fehlermeldung", JOptionPane.ERROR_MESSAGE);
				}
				textField_ID.setText(Integer.toString(Trainer.getTrainerID()));
				textField_NName.setText(Trainer.getNName());
				textField_VName.setText(Trainer.getVName());
				textField_Geburtsdatum.setText(Integer.toString(Trainer.getGeburtsdatum()));
				textField_Erfahrung.setText(Trainer.getErfahrung());
		
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(this, "Bitte geben Sie die entsprechende Trainer ID ein.", this.getTitle(), JOptionPane.ERROR_MESSAGE);	
			}
			

		}
}