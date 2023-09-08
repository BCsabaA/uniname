package com.barab.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.barab.view.listener.IViewListener;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {
	
	private List<IViewListener> listeners;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableNames;
	private JButton btnNewName;
	private JPanel panel;

	public MainView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setTitle("Uniname");
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tableNames = new JTable();
		tableNames.setBounds(10, 78, 397, 392);
		contentPane.add(tableNames);
		
		panel = new JPanel();
		panel.setBounds(417, 78, 422, 392);
		contentPane.add(panel);
		
		btnNewName = new JButton("Új elnevezés");
		btnNewName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notifyOnButtonnNewNameClicked();				
			}
		});
		
		btnNewName.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewName.setBackground(new Color(152, 251, 152));
		btnNewName.setBounds(10, 10, 145, 28);
		contentPane.add(btnNewName);
		
		listeners = new ArrayList<>();
		setVisible(true);
	}

	protected void notifyOnButtonnNewNameClicked() {
		for (IViewListener listener : listeners) {
			listener.onButtonNewNameClicked();
		}
	}

	public void addListener(IViewListener listener) {
		listeners.add(listener);
	}
}
