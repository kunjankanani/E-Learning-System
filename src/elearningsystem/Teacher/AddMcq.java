package elearningsystem.Teacher;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import elearningsystem.DBConnection;
import javax.swing.JComboBox;
//import javasemesterproject.Teacher.AddCourse;

public class AddMcq extends JFrame {

	 JPanel contentPane;
	 JTextField textField;
         JTextField textField_1;
	 JTextField textField_2;
	 JTextField textField_3;
	 JTextField textField_4;
        String Subjectname[];

	public AddMcq() 
	{
		setTitle("Add Mcq");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(this);
		setBounds(100, 100, 450, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("upload.jpg").getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT)));
		
		JLabel lblQuestionDescription = new JLabel("Question Description");
		
		JTextArea textArea = new JTextArea();
		
		JLabel lblOptionA = new JLabel("Option A");
		
		JLabel lblOptionB = new JLabel("Option B");
		
		JLabel lblOptionC = new JLabel("Option C");
		
		JLabel lblOptionD = new JLabel("Option D");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblTypeOfQuiz = new JLabel("Subject");
		
                this.getSubjects();
		JComboBox comboBox = new JComboBox(Subjectname);
		
		JButton btnUploadQuestion = new JButton("Upload Mcq");
                
                setVisible(true);
		btnUploadQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String sub=(String)comboBox.getSelectedItem();
                                
				String ques=textArea.getText();
				String opta=textField.getText();
				String optb=textField_1.getText();
				String optc=textField_2.getText();
				String optd=textField_3.getText();
				String ans=textField_4.getText();
				DBConnection c1 = new DBConnection();
				String query="insert into mcq values(?,?,?,?,?,?,?)";
				int i=0;
				try
				{
					PreparedStatement ps=c1.c.prepareStatement(query);
					ps.setString(1, ques);
					ps.setString(2, opta);
					ps.setString(3, optb);
					ps.setString(4, optc);
					ps.setString(5, optd);
					ps.setString(6, ans);
                                        ps.setString(7, sub);
					i=ps.executeUpdate();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				if(i==1)
				{
					JOptionPane.showMessageDialog(AddMcq.this,"Data Inserted");
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_4.setText(null);
					textArea.setText(null);
//					comboBox.setSelectedIndex(0);
					textField_3.setText(null);
				}
				if(i==0)
				{
					JOptionPane.showMessageDialog(AddMcq.this,"Registration Failed!!");
				} 
				}
				
				
				
			
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				textArea.setText(null);
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
//				comboBox.setSelectedIndex(0);
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTypeOfQuiz)
					.addContainerGap(361, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(69)
					.addComponent(btnUploadQuestion)
					.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
					.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(69))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQuestionDescription)
						.addComponent(lblOptionA)
						.addComponent(lblOptionB)
						.addComponent(lblOptionC)
						.addComponent(lblOptionD)
						.addComponent(lblAnswer))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_4)
						.addComponent(textField_3)
						.addComponent(textField_2)
						.addComponent(textField_1)
						.addComponent(textField)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(28, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(112)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(113, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuestionDescription)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOptionA)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOptionB)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOptionC)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOptionD)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAnswer)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTypeOfQuiz)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnUploadQuestion)
						.addComponent(btnReset))
					.addGap(33))
		);
		contentPane.setLayout(gl_contentPane);
	}

    void getSubjects() {
        try{
            DBConnection c1 = new DBConnection();

            String q = "select * from Subjects";

            ResultSet rs = c1.s.executeQuery(q);
            int rowCount = 0;
            while(rs.next())
                rowCount++;
            Subjectname = new String[rowCount];
            rs.beforeFirst();
            int i=0;
            while(rs.next()){
                Subjectname[i] = rs.getString("Name");
                i++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
       public static void main(String[] args) {
        new AddMcq();
    }
}
