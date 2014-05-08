package unir;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
@SuppressWarnings({ "serial" })
public class JFrameConFondo extends JFrame {
		
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
JFrameConFondo frame = new JFrameConFondo();
frame.setSize(1300,700); 
frame.setResizable(false);
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}



public JFrameConFondo() {
setTitle("Mi Primer Juego"); 

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setBounds(45, 10, 0, 00);
PanelImagen p = new PanelImagen();
p.setBorder(new EmptyBorder(0, 0, 0, 0));
p.setLayout(new BorderLayout(50, 50));


p.setLayout(null);
JButton boton = new JButton("TUTORIAL");
boton.setBounds(430,250,140,35);
p.add(boton);
JButton boton2 = new JButton("JUGAR");
boton2.setBounds(750,250,140,35);
p.add(boton2);
JButton boton3 = new JButton("SALIR");
boton3.setBounds(590,310,140,35);
p.add(boton3);

//Codigo accion Botones
boton.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
JOptionPane.showMessageDialog(null, "                  Tutorial");
}
});
boton2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
 JOptionPane.showMessageDialog(null, "                   Jugar");
}
});
boton3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
 //JOptionPane.showMessageDialog(null, "                Saliendo",null,JOptionPane.WARNING_MESSAGE);
 
 System.exit(0);
}
});

setContentPane(p);
p.setSize(500,300);
}



private static void setText(String string) {
	// TODO Auto-generated method stub
	
}
}