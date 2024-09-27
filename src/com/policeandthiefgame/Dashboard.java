package com.policeandthiefgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dashboard {

	JFrame jFrame = null;
	JPanel jPanel = null;

	public Dashboard() {
		jFrame = new JFrame("Police & Thief Game");
		jFrame.setSize(800, 800);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
	}

	public void drawCircle() {
		jPanel = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				Shape circle1 = new Ellipse2D.Double(300, 100, 75, 75);
				g2.setColor(Color.CYAN);

				Shape line1 = new Line2D.Double(320, 170, 170, 300);
				Shape line2 = new Line2D.Double(355, 170, 505, 303);
				Shape line3 = new Line2D.Double(340, 175, 340, 350);

				Shape circle2 = new Ellipse2D.Double(100, 250, 75, 75);
				Shape line7 = new Line2D.Double(130, 325, 130, 500);

				Shape circle3 = new Ellipse2D.Double(500, 250, 75, 75);
				Shape line8 = new Line2D.Double(540, 325, 540, 500);

				Shape circle4 = new Ellipse2D.Double(300, 350, 75, 75);
				Shape line4 = new Line2D.Double(360, 415, 502, 520);
				Shape line5 = new Line2D.Double(310, 415, 170, 520);

				Shape circle5 = new Ellipse2D.Double(100, 500, 75, 75);
				Shape circle6 = new Ellipse2D.Double(500, 500, 75, 75);
				Shape line6 = new Line2D.Double(170, 550, 502, 550);

				g2.draw(line1);
				g2.draw(line2);
				g2.draw(line3);
				g2.draw(line4);
				g2.draw(line5);
				g2.draw(line6);
				g2.draw(line7);
				g2.draw(line8);
				g2.fill(circle1);
				g2.fill(circle2);
				g2.fill(circle3);
				g2.fill(circle4);
				g2.fill(circle5);
				g2.fill(circle6);
				g2.draw(circle1);
				g2.draw(circle2);
				g2.draw(circle3);
				g2.draw(circle4);
				g2.draw(circle5);
				g2.draw(circle6);
			}
		};

		jFrame.setContentPane(jPanel);
	}

	public static void main(String[] args) {
		new Dashboard().drawCircle();
	}
}
