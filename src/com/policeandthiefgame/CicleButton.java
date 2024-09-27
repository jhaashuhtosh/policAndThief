package com.policeandthiefgame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CicleButton {

	private JFrame frame;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CicleButton window = new CicleButton();
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
	public CicleButton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(800, 800);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				Shape line1 = new Line2D.Double(300, 50, 160, 180);
				g2.draw(line1);
				Shape line2 = new Line2D.Double(330, 80, 500, 180);
				g2.draw(line2);
				Shape line3 = new Line2D.Double(290, 80, 290, 250);
				g2.draw(line3);
				Shape line4 = new Line2D.Double(120, 250, 120, 400);
				g2.draw(line4);
				Shape line5 = new Line2D.Double(550, 250, 550, 400);
				g2.draw(line5);
				Shape line6 = new Line2D.Double(160, 450, 500, 450);
				g2.draw(line6);
				Shape line7 = new Line2D.Double(120, 401, 250, 330);
				g2.draw(line7);
				Shape line8 = new Line2D.Double(540, 401, 340, 330);
				g2.draw(line8);
			}
		};
		panel.setSize(800, 800);
		panel.setLayout(null);

		JButton btnNewButton = new JButton() {
			@Override
			protected void paintComponent(Graphics g1) {
				Graphics2D g2 = (Graphics2D) g1;
				Shape circle1 = new Ellipse2D.Double(10, 10, 75, 75);
				g2.draw(circle1);
			}
		};
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("dsfsdfs");
			}
		});
		btnNewButton.setBounds(250, 0, 88, 88);
		btnNewButton.setBorder(null);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton() {
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				Shape circle1 = new Ellipse2D.Double(10, 10, 75, 75);
				g2.draw(circle1);
			}
		};
		btnNewButton_1.setBounds(250, 250, 88, 89);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("dsfsdfs2");
			}
		});
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton() {
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				Shape circle1 = new Ellipse2D.Double(10, 10, 75, 75);
				g2.draw(circle1);
			}
		};
		btnNewButton_2.setBounds(75, 150, 88, 88);
		btnNewButton_2.setForeground(Color.GREEN);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("dsfsdfs3");
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton() {
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				Shape circle1 = new Ellipse2D.Double(10, 10, 75, 75);
				g2.draw(circle1);
			}
		};
		btnNewButton_3.setBounds(500, 150, 88, 89);
		btnNewButton_3.setForeground(Color.GREEN);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("dsfsdfs4");
			}
		});
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton() {
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				Shape circle1 = new Ellipse2D.Double(10, 10, 75, 75);
				g2.draw(circle1);
			}
		};
		btnNewButton_4.setBounds(75, 400, 88, 89);
		btnNewButton_4.setForeground(Color.GREEN);
		btnNewButton_4.setBorder(null);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("dsfsdfs5");
			}
		});
		panel.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton() {
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				Shape circle1 = new Ellipse2D.Double(10, 10, 75, 75);
				g2.draw(circle1);
			}
		};
		btnNewButton_5.setBounds(500, 400, 88, 89);
		btnNewButton_5.setForeground(Color.GREEN);
		btnNewButton_5.setBorder(null);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("dsfsdfs6");
			}
		});
		panel.add(btnNewButton_5);
		frame.getContentPane().add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
