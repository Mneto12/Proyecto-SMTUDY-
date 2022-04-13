import javax.swing.*; // Importamos los componentes para el diseno
import java.awt.event.*; // Importamos los eventos
import javax.swing.JOptionPane; // Importamos los mensjaes de dialogo
import java.awt.font.TextLayout;
import java.awt.*;

public class Menu_123 extends JFrame implements ActionListener{ // Incorpora enventos en la interfaz
	
	// Definimos la variables de la interfaz
	
	private	JLabel titulo,imagen_1,imagen_2,descripcion,descripcion1,descripcion2,descripcion3;
	private JMenuItem acerca,version;
	private JMenu menu1;
	private JMenuBar menu_m; // acerca de como usar la app
	JButton boton1,boton2,boton3,boton4; // BOTONES: SALIR,POMODOR,TAREAS,FEEDBACK
	
	public Menu_123(){ 
	setLayout(null); // permite imprimir datos en pantalla sin System.out.println();
	setDefaultCloseOperation(EXIT_ON_CLOSE); // Cierra el programa y no lo deja en segundo plano
	setTitle(" SMTUDY "); // Titulo en la barra arriba
	getContentPane().setBackground(new Color(70,140,185)); // Fondo con RGB
	setIconImage(new ImageIcon(getClass().getResource("imagenes/logo.png")).getImage());
	
	// Imagen en el Menu ( con label )
	
	ImageIcon imagen = new ImageIcon("imagenes/menu.png");
	imagen_1 = new JLabel(imagen);
	imagen_1.setBounds(230,110,90,90);
	add(imagen_1);
	
	ImageIcon imagen2 = new ImageIcon("imagenes/libreta.png");
	imagen_2 = new JLabel(imagen2);
	imagen_2.setBounds(330,110,90,90);
	add(imagen_2);
	
	// Jlabels 
	
	titulo = new JLabel(" SMTUDY "); // Imprimir en la interfaz
	titulo.setFont(new java.awt.Font("Times New Roman", 1, 30)); // TAMANO del titulo y fuente
    titulo.setText("SMTUDY"); 
	titulo.setBounds(170,30,200,30); // PX ( Tamano ) del texto a imprimir (x,y,ancho,altura)
	add(titulo);
	
	// Descripcion de la aplicacion
	
	descripcion = new JLabel("SMTUDY es una aplicacion para mejorar ");
	descripcion.setFont(new java.awt.Font("Arial",2,12));
	descripcion.setBounds(200,80,300,300);
	add(descripcion);
	
	descripcion1 = new JLabel("tu productividad en el estudio. Te permite trabajar");
	descripcion1.setFont(new java.awt.Font("Arial",2,12));
	descripcion1.setBounds(180,100,300,300);
	add(descripcion1);
	
	descripcion2 = new JLabel("concentrado con el modo (FOCUS) y agregar tareas");
	descripcion2.setFont(new java.awt.Font("Arial",2,12));
	descripcion2.setBounds(180,120,300,300);
	add(descripcion2);
	
	descripcion3 = new JLabel("pendientes para mantener un control. Estudia Mejor!");
	descripcion3.setFont(new java.awt.Font("Arial",2,12));
	descripcion3.setBounds(180,140,300,300);
	add(descripcion3);
	
//---------------------------------------------------------------------
	
	// Diseno BOTONES
	// BOTON ( Salir )
	setLayout(null);	
	boton1 = new JButton("SALIR");
	boton1.setBackground(java.awt.Color.lightGray);	
	boton1.setBounds(360,400,100,30);
	add(boton1); // Agrega el boton o cualquier complemento (Jlabel , texto , imagne etc) a la interfaz !IMPORTANTE
	boton1.addActionListener(this); // Vamos a hacer uso de la clase de arriba (le damos vida al boton)
	// Boton focus
	boton2 = new JButton(" FOCUS ");
	boton2.setBackground(java.awt.Color.lightGray);
	boton2.setBounds(35,100,106,35);
	boton2.setBorderPainted(true);
	add(boton2);
	boton2.addActionListener(this);
	// Boton Tareas
	boton3 = new JButton("TAREAS");
	boton3.setBackground(java.awt.Color.lightGray);
	boton3.setBounds(35,200,106,35);
	add(boton3);
	boton3.addActionListener(this);
	// Boton Feedback
	boton4 = new JButton("FEEDBACK");
	boton4.setBackground(java.awt.Color.lightGray);
	boton4.setBounds(35,300,106,35);
	add(boton4);
	boton4.addActionListener(this);
	
	// Menu Acerda de y version
	
	menu_m = new JMenuBar(); // Definir menu principal
	setJMenuBar(menu_m);
	
	menu1 = new JMenu("Informacion"); // Igual Definimos el nombre
	menu_m.add(menu1);
	
	// OPCIONES DEL MENU
	
	acerca = new JMenuItem("Manual"); // Creamos los componentes del menu
	acerca.addActionListener(this);
	menu1.add(acerca);
	
	version = new JMenuItem("Version"); // Creamos los componentes del menu
	version.addActionListener(this);
	menu1.add(version);
	
	}
	
	public void actionPerformed(ActionEvent a){ // Evento ( Vida al boton ) NOTA: la letra a es un espacio de memoria
		
		Container fondo = this.getContentPane(); // Para el modo nocturno
																			// donde se guarda el evento 
		if(a.getSource() == boton1){ // getSource (Metodo) pertenece a ActionEvente contiene el objeto donde se origino el evento
											//  entonces le decimos al programa que si se ejecuta el boton 1 (el usuario)
		System.exit(0);	
	// se cierra la interfaz grafica con la siguiente linea System.exit(0);
		}if(a.getSource() == boton4){
			
		Feed_Back feed = new Feed_Back();
		feed.setBounds(0,0,600,360);
		feed.setVisible(true);
		feed.setResizable(false);
		feed.setLocationRelativeTo(null);	
		this.setVisible(false);
			
		}if(a.getSource()==boton3){
			
		Tareas tareas1 = new Tareas();	
		tareas1.setBounds(0,0,540,400);	
		tareas1.setVisible(true);
		tareas1.setResizable(false);
		tareas1.setLocationRelativeTo(null);
		this.setVisible(false);	
					
		}
		if(a.getSource()==boton2){
			
   		Prueba_Cronometro.tarea1 = JOptionPane.showInputDialog(null,"Tarea","Agregar Tarea",JOptionPane.INFORMATION_MESSAGE);	
   		Iconos icono = new Iconos();			
		Prueba_Cronometro ventana_focus = new Prueba_Cronometro();
	  	ventana_focus.setBounds(0,0,500,500);
	   	ventana_focus.setVisible(true);
	   	ventana_focus.setLocationRelativeTo(null);
	   	ventana_focus.setResizable(false);
	   	this.setVisible(false);	
			
		}
		
		if(a.getSource()==acerca){
		
		Iconos3 icu = new Iconos3();	
		JOptionPane.showMessageDialog(null,"  SMTUDY te ayuda a ser mas productivo en el estudio\n\n"+
										"FOCUS es un temporizador para que estudies enfocadamente\n"+
										"por periodos de 25 minutos a su vez tienes Break (descanso)\n"+
										"y long break (descanso largo).Solo tienes que darle a iniciar\n"+
										",despues que llegue a 00:00 puedes escoger entre 15:00 M o 5:00 M\n"+
										"Para descansar y reiniciar para volver a los 25:00 M. Esta tecnica\n"+
										"es efectiva(inspirada en la tecnica Pomodoro. Pero Ideada de una \n"+
										"manera mas flexible)\n\n"+
										"Ideal Contra la procrastinacion ya que nos incentiva a darlo todo en\n"+
										"25 minutos.\n\n TAREAS es para agregar las tareas pendientes\n "+
										"de estudio para que lleves un control de ellas","Como usar la app",JOptionPane.DEFAULT_OPTION,icu);
		
			
		}if(a.getSource()==version){
		
		Iconos3 icu = new Iconos3();
		JOptionPane.showMessageDialog(null,"Version 1.0# Beta","Developer: Miguel Coronel Rivas",JOptionPane.DEFAULT_OPTION,icu);	
			
		}
	}				
	
	public static void main(String[] args){
	
	Iconos3 icu = new Iconos3();
	Menu_123 interfaz_1 = new Menu_123(); // es como si crearamos un objeto de tipo Scanner
	interfaz_1.setBounds(0,0,500,500);	 // Creamos un objeto de tipo Menu_123 // ahora es el tamano de la interfaz
	interfaz_1.setVisible(true);
	interfaz_1.setLocationRelativeTo(null);
	interfaz_1.setResizable(false); // Permiso para modificar el tamano de la interfaz (false es decir no puede agrandar)
	}	
	
}