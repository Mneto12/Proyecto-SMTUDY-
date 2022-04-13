import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextLayout;

public class Feed_Back extends JFrame implements ActionListener{

private JLabel label1,imagen_1,imagen_2;
private JButton boton1,boton2;
private JScrollPane scroll;
private JTextArea texto;

	public Feed_Back(){
		
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("SMTUDY - FeedBack");
	getContentPane().setBackground(new Color(70,140,185));
	setIconImage(new ImageIcon(getClass().getResource("imagenes/feed.png")).getImage());	
	
	// Imagen 1 (Bombilla)
	
	ImageIcon imagen1 = new ImageIcon("imagenes/bombillo.png");
	imagen_1 = new JLabel(imagen1);
	imagen_1.setBounds(400,260,50,50);
	add(imagen_1);
	
	// Imagen 2 (Tuercas)
	
	ImageIcon imagen2 = new ImageIcon("imagenes/tuercas.png");
	imagen_2 = new JLabel(imagen2);
	imagen_2.setBounds(480,260,50,50);
	add(imagen_2);
	
	// TITULO
	
	label1 = new JLabel(" Ayudame a Mejorar! ");
	label1.setBounds(215,5,200,30);
	label1.setFont(new Font("Times New Roman",1,14));
	label1.setForeground(new Color(0,0,0));
	add(label1);
	
	// INFORMACION
	
	texto = new JTextArea();		
	texto.setEditable(false);
	texto.setText("\n\n                         	           Desarrollado por Miguel Arturo Coronel Rivas " +
					"\n\n  	  Esta aplicacion fue desarrollada por terminos educativos para la Materia Programacion II" +
					"\n    	  Sin embargo la aplicacion esta sujeta a mejoras en el futuro ( SOLO ES LA PRIMERA VERSION )" +
					"\n    	  Por eso me gustaria que me dieras tu opinion al respecto para poder mejorar y ayudarte con " +
					"\n    	  unos estudios mas efectivos" +
					"\n\n        Correo: envenezuela2000@gmail.com" +
					"\n        CI: 29882740 ");
	texto.setFont(new Font("Arial",2,10));				
	scroll = new JScrollPane(texto);
	scroll = new JScrollPane(texto);
	scroll.setBounds(10,40,575,200);
	add(scroll);
	
	// BOTON ENVIAR
	
	boton1 = new JButton("ENVIAR FEEDBACK");
	boton1.setBackground(java.awt.Color.lightGray);
	boton1.setBounds(10,270,160,28);
	boton1.addActionListener(this);
	add(boton1);
	
	// BOTON MENU
	
	boton2 = new JButton("MENU");
	boton2.setBackground(java.awt.Color.lightGray);
	boton2.setBounds(220,270,100,28);
	boton2.addActionListener(this);
	add(boton2);
		
	}
	
	public void actionPerformed(ActionEvent a){
	if(a.getSource()==boton1){
		
	Iconos2 icono = new Iconos2();	
	JOptionPane.showMessageDialog(null,"Puede Enviar el FeedBack via a \n" +
										"\n1.Portal de estudios a Distancia" +
										"\n2.Via Correo GMAIL" +
										"\n\nCon mucho gusto atendere su solicitud!","CALIFICAME",JOptionPane.DEFAULT_OPTION,icono);
		
		
	}if(a.getSource()== boton2){	
	Menu_123 interfaz_1 = new Menu_123(); // es como si crearamos un objeto de tipo Scanner
	interfaz_1.setBounds(0,0,500,500);	 // Creamos un objeto de tipo Menu_123 // ahora es el tamano de la interfaz
	interfaz_1.setVisible(true);
	interfaz_1.setLocationRelativeTo(null);
	interfaz_1.setResizable(false);
	this.setVisible(false);	
		
	}
		
		
	}
	
	
	public static void main(String[] args){
	
	Iconos2 icono = new Iconos2();	
	Feed_Back feed = new Feed_Back();
	feed.setBounds(0,0,600,360);
	feed.setVisible(true);
	feed.setResizable(false);
	feed.setLocationRelativeTo(null);	
		
	}
     
    
}