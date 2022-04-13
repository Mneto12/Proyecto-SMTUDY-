// Prueba de cronometro en java

import java.awt.font.TextLayout;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Prueba_Cronometro extends JFrame implements ActionListener{
	
	static JLabel imagen1,imagen3,imagen4,tarea,reloj,sesion_l;
	static JButton iniciar,descanso,reiniciar,menu,long_break,pausar;
	static String tarea1;
	static int opcion;
	static int sesion=0;
	
	static int minuto=25,segundo=1;
	static boolean iniciaHilo=true; // Permite que el hilo se ejecute
	static boolean corriendo=false; // Controla cuando incia o para
	
	public Prueba_Cronometro(){
	
	// definicion del fondo, titulo e imagen superior	
	
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("SMTUDY - Focus");
	getContentPane().setBackground(new Color(70,140,185));	
	setIconImage(new ImageIcon(getClass().getResource("imagenes/logo.png")).getImage());	
	
	// imagenes
	
	ImageIcon imagen = new ImageIcon("imagenes/timer.png");
	imagen1 = new JLabel(imagen);
	imagen1.setBounds(180,20,128,128); // RECUERDA (X,Y,ANCHURA DE LA IMAGEN,ALTURA DE LA IMAGEN)
	add(imagen1);
	
	ImageIcon imagen_2 = new ImageIcon("imagenes/note.png");
	imagen3 = new JLabel(imagen_2);
	imagen3.setBounds(50,220,64,64); // RECUERDA (X,Y,ANCHURA DE LA IMAGEN,ALTURA DE LA IMAGEN)
	add(imagen3);
	
	ImageIcon imagen_3 = new ImageIcon("imagenes/medalla.png");
	imagen4 = new JLabel(imagen_3);
	imagen4.setBounds(50,285,64,64); // RECUERDA (X,Y,ANCHURA DE LA IMAGEN,ALTURA DE LA IMAGEN)
	add(imagen4);
	
	// Labels
	
	reloj = new JLabel(minuto+":00");
	reloj.setFont(new Font("Times New Roman",2,50));
	reloj.setBounds(180,140,150,100);
	add(reloj);
	
	tarea = new JLabel("Tarea: "+ tarea1);
	tarea.setFont(new java.awt.Font("Arial",1,16));
	tarea.setBounds(130,230,420,50);
	add(tarea);
	
	sesion_l = new JLabel("Sesion: "+ sesion);
	sesion_l.setFont(new java.awt.Font("Arial",1,16));
	sesion_l.setBounds(130,290,280,50);
	add(sesion_l);
	
	// Botones
	
	iniciar = new JButton("");
	iniciar.setBorderPainted(true);
	iniciar.setBounds(20,360,100,35); // recuerda colocar el setBounds primero siempre y cuando se coloque una imagen en el boton
	ImageIcon incics = new ImageIcon("imagenes/iniciar2.png");
	iniciar.setIcon(new ImageIcon(incics.getImage().getScaledInstance(28,27,Image.SCALE_SMOOTH)));
	iniciar.setBackground(Color.LIGHT_GRAY);
	iniciar.addActionListener(this);
	add(iniciar);
	
	descanso = new JButton("5:00");
	descanso.setFont(new Font("Arial",1,16));
	descanso.setBackground(Color.LIGHT_GRAY);
	descanso.setBounds(130,360,100,35);
	descanso.addActionListener(this);
	add(descanso);
	
	long_break = new JButton("15:00");
	long_break.setFont(new Font("Arial",1,16));
	long_break.setBackground(Color.LIGHT_GRAY);
	long_break.setBounds(240,360,120,35);
	long_break.addActionListener(this);
	add(long_break);
	
	reiniciar = new JButton("");
	reiniciar.setBackground(Color.LIGHT_GRAY);
	reiniciar.setBounds(370,360,100,35);
	ImageIcon incics2 = new ImageIcon("imagenes/restart.png");
	reiniciar.setIcon(new ImageIcon(incics2.getImage().getScaledInstance(32,35,Image.SCALE_SMOOTH)));
	reiniciar.addActionListener(this);
	add(reiniciar);
	
	menu = new JButton("MENU");
	menu.setFont(new Font("Arial",1,16));
	menu.setBackground(Color.LIGHT_GRAY);
	menu.setBounds(240,420,106,35);
	menu.addActionListener(this);
	add(menu);
	
	pausar = new JButton("");
	pausar.setBackground(Color.LIGHT_GRAY);
	pausar.setBounds(130,420,100,35);
	ImageIcon incics3 = new ImageIcon("imagenes/stop2.png");
	pausar.setIcon(new ImageIcon(incics3.getImage().getScaledInstance(32,25,Image.SCALE_SMOOTH)));
	pausar.addActionListener(this);
	add(pausar);
		
	}
	
	public void actionPerformed(ActionEvent a){
	if(a.getSource()==iniciar){
			if(corriendo==false){
			
			iniciar.setBackground(java.awt.Color.GREEN);
			iniciaHilo=true;	
			corriendo=true;	
			iniciarHiloCronometro();
			sesion++;
			descanso.setBackground(Color.RED);
			long_break.setBackground(Color.RED);
			reiniciar.setBackground(Color.LIGHT_GRAY);
			pausar.setBackground(Color.LIGHT_GRAY);		
				
			}
			}				
		
		if(a.getSource()==descanso){
			
			iniciaHilo=false;
			corriendo=false;
			minuto=5;
			segundo=1;
			sesion--;
			iniciar.setBackground(Color.LIGHT_GRAY);
			descanso.setBackground(Color.green);
			long_break.setBackground(Color.RED);
				
				
		}
		
		if(a.getSource()==long_break){
		
		iniciaHilo=false;
		corriendo=false;	
		minuto=15;
		segundo=1;
		sesion--;
		iniciar.setBackground(Color.LIGHT_GRAY);
		descanso.setBackground(Color.red);
		long_break.setBackground(Color.green);	
			
		}
		
		if(a.getSource()==reiniciar){
				
			iniciaHilo=false;
			corriendo=false;
			minuto=25;
			segundo=1;	
			iniciar.setBackground(Color.LIGHT_GRAY);
			descanso.setBackground(Color.red);
			long_break.setBackground(Color.red);
			reiniciar.setBackground(Color.GREEN);		
				
		
		
		
		}
		
		//--------------PAUSAR----------------//
		
		if(a.getSource()==pausar){
		iniciaHilo=false;
		corriendo=false;
		sesion--;
		pausar.setBackground(Color.GREEN);
		iniciar.setBackground(Color.RED);
		
		Iconos3 icu = new Iconos3();
		JOptionPane.showMessageDialog(null," Si pausas no estas estudiando al 100% \n\n"+
										"VAMOS TE ESPERO! Todavia queda por Aprender","   RECUERDA!   ",JOptionPane.DEFAULT_OPTION,icu);	
		}
		
		//---------- MENU--------------------//
		
		if(a.getSource()==menu){
		
		Iconos3 icu = new Iconos3();
		JOptionPane.showMessageDialog(null," Al salir se perdera todo tu progreso! ","                           RECUERDA!   ",JOptionPane.DEFAULT_OPTION,icu);
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1 = Salir / Cualquier Numero = Quedarse","                        Recuerda!",JOptionPane.INFORMATION_MESSAGE));
		
		if(opcion==1){
		
		sesion=0;
		minuto=25;
		segundo=1;
				
		Menu_123 interfaz_1 = new Menu_123(); // es como si crearamos un objeto de tipo Scanner
		interfaz_1.setBounds(0,0,500,500);	 // Creamos un objeto de tipo Menu_123 // ahora es el tamano de la interfaz
		interfaz_1.setVisible(true);
		interfaz_1.setLocationRelativeTo(null);
		interfaz_1.setResizable(false);	
		this.setVisible(false);
		detener();		
			
		}	
			
		}
	 }
	
	public void iniciarHiloCronometro(){
		if(iniciaHilo==true){
		
		System.out.println("GO"); 
		Logica l = new Logica(reloj,sesion_l);
		l.start();
		
		}	
	}
	
	public static void detener(){
		
	l.stop();	
		
	}
	
	static Thread l;
	
   public static void main(String[] args){	
   
   Iconos3 icu = new Iconos3();
   tarea1 = JOptionPane.showInputDialog(null,"Tarea","Agregar Tarea",JOptionPane.INFORMATION_MESSAGE);
   Iconos image = new Iconos();		  	
   Prueba_Cronometro ventana_focus = new Prueba_Cronometro();
   ventana_focus.setBounds(0,0,500,500);
   ventana_focus.setVisible(true);
   ventana_focus.setLocationRelativeTo(null);
   ventana_focus.setResizable(false);
  
   } 
    
}