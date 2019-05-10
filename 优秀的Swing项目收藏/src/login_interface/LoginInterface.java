package login_interface;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * ��¼���û�����: admin
 * ������:123456
 */
public class LoginInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 JFrame frame = new JFrame("��¼");
         JLabel label = new JLabel();
         JLabel labelText = new JLabel("��ӭ������¼�����������");
         label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ͼƬ��Դ\\vlp.jpg"));
         frame.add(label, BorderLayout.NORTH);

         Box user = Box.createHorizontalBox();
         Box pwd = Box.createHorizontalBox();
         Box btn = Box.createHorizontalBox();

         JLabel userLabel = new JLabel("�û�����");
         JLabel pwdLabel = new JLabel("��   �룺");

         JTextField username = new JTextField(17);
         JTextField password = new JTextField(17);

         Font font = new Font("΢���ź�", Font.PLAIN, 20);

         userLabel.setFont(font);
         pwdLabel.setFont(font);

         username.setFont(font);
         username.setToolTipText("�����������û���...");
         username.setMargin(new Insets(5, 5, 5, 5));

         password.setFont(font);
         password.setToolTipText("��������������...");
         password.setMargin(new Insets(5, 5, 5, 5));

         user.add(Box.createHorizontalStrut(10));
         user.add(userLabel);
         user.add(username);
         user.add(Box.createHorizontalStrut(10));

         pwd.add(Box.createHorizontalStrut(10));
         pwd.add(pwdLabel);
         pwd.add(password);
         pwd.add(Box.createHorizontalStrut(10));

         JButton login = new JButton("��¼");
         JButton cancel = new JButton("ȡ��");

         login.setFont(font);
         cancel.setFont(font);

         ActionListener action = e->{

             switch (e.getActionCommand()) {

                 case "��¼":

                     if ("admin".equals(username.getText()) && "123456".equals(password.getText())) {

                         JOptionPane.showMessageDialog(frame, "��½�ɹ�����", "��ϲ", JOptionPane.INFORMATION_MESSAGE);

                     } else {

                         JOptionPane.showMessageDialog(frame, "�û������������", "���ź�", JOptionPane.ERROR_MESSAGE);

                     }

                     break;

                 case "ȡ��":

                     int type = JOptionPane.showConfirmDialog(frame, "��ȷ��ȡ����", "ȷ��", JOptionPane.OK_CANCEL_OPTION);

                     if (type == 0) {

                         JOptionPane.showMessageDialog(frame, "�ܱ�Ǹ��������ȷ��ȡ��Ҳȡ������Ŷ��", "��ܰ��ʾ", JOptionPane.INFORMATION_MESSAGE);

                     } else {

                         JOptionPane.showMessageDialog(frame, "����Ȼ��ô���ǣ�ΪʲôҪѡȡ���أ�", "��ܰ����", JOptionPane.QUESTION_MESSAGE);

                     }

                     break;

             }

         };

         login.addActionListener(action);
         cancel.addActionListener(action);

         btn.add(Box.createHorizontalStrut(55));
         btn.add(login);
         btn.add(Box.createHorizontalStrut(10));
         btn.add(cancel);

         Box box = Box.createVerticalBox();

         labelText.setFont(font);

         box.add(labelText);
         box.add(Box.createVerticalStrut(20));
         box.add(user);
         box.add(Box.createVerticalStrut(10));
         box.add(pwd);
         box.add(Box.createVerticalStrut(20));
         box.add(btn);
         box.add(Box.createVerticalStrut(20));

         frame.add(box);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setResizable(false);
         frame.pack();
         frame.setVisible(true);


	}

}
