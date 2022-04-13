import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.font.TextLayout;

public class Tareas extends JFrame implements ActionListener{

private JTextField task;
private JLabel label1,label2,label3;
private JButton boton1,boton2;
private JScrollPane scroll;
private JTextArea area_tareas;

String texto="";

public Tareas(){
	
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("SMTUDY - Task List ");
	getContentPane().setBackground(new Color(70,140,185));
   	setIconImage(new ImageIcon(getClass().getResource("imagenes/logo.png")).getImage());
   	
   	// IMAGEN I
	
	ImageIcon imagen = new ImageIcon("imagenes/tareas1.png");
	label1 = new JLabel(imagen);
	label1.setBounds(440,94,72,72);
	add(label1);
	
	// IMAGEN II
	
	ImageIcon imagen2 = new ImageIcon("imagenes/tareas2.png");
	label2 = new JLabel(imagen2);
	label2.setBounds(440,210,72,72);
	add(label2); 
	
	// TAREA TEXTO
	
	label3 = new JLabel("Tarea");
	label3.setBounds(10,10,100,30);
	add(label3);	
		
	task = new JTextField();
	task.setBounds(50,10,200,30);
	add(task);
	
	area_tareas = new JTextArea();
	scroll = new JScrollPane(area_tareas);
	area_tareas.setFont(new Font("Andale Mono",1,12));
	scroll.setBounds(10,50,400,300);
	add(scroll);
	
	// BOTON AGREGAR
	
	boton1 = new JButton("AGREGAR");
	boton1.setBackground(java.awt.Color.lightGray);
	boton1.setBounds(280,10,100,30);
	add(boton1);
	boton1.addActionListener(this);
	
	// BOTON MENU
	
	boton2 = new JButton("MENU");
	boton2.setBackground(java.awt.Color.lightGray);
	boton2.setBounds(390,10,100,30);
	add(boton2);
	boton2.addActionListener(this);
	
	}

	public void actionPerformed(ActionEvent a){
		
	if(a.getSource()== boton1){
			
	  texto += task.getText() + "\n"; // Saltos de linea
	  area_tareas.setText(texto);
	  task.setText("");
		
	 }if(a.getSource()==boton2){
	 
	 Menu_123 interfaz_1 = new Menu_123(); // es como si crearamos un objeto de tipo Scanner
	 interfaz_1.setBounds(0,0,500,500);	 // Creamos un objeto de tipo Menu_123 // ahora es el tamano de la interfaz
	 interfaz_1.setVisible(true);
	 interfaz_1.setLocationRelativeTo(null);
	 interfaz_1.setResizable(false);
	 this.setVisible(false);	
	 	
	 }	
	}

	public static void main(String[] args){
	

	Tareas tareas1 = new Tareas();	
	tareas1.setBounds(0,0,540,400);	
	tareas1.setVisible(true);
	tareas1.setResizable(false);
	tareas1.setLocationRelativeTo(null);
	
	}


}
 