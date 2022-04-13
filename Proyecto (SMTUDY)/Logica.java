
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Logica extends Thread {

	static public int x=0;
	static JLabel etiqueta,etiqueta2;

	public Logica(JLabel reloj,JLabel sesion_l){
		this.etiqueta=reloj;
		this.etiqueta2=sesion_l;
			
	}   
		
	public void run(){
		 try{
		
		while(Prueba_Cronometro.iniciaHilo){
		
		Thread.sleep(1000); // Velocidad del reloj (1000 quiere decir a mil milisegundos vas a dormir al hilo
		ejecutarHilo(x); // variable del hilo
		x++; // aumenta en 1 progresivamente el hilo
			
		}	
			            
        }catch(Exception a){
		
		System.out.println("Excepcion en el hilo: " + a.getMessage());	
			
		}
	} 
		
	public void ejecutarHilo(int x){
		
	System.out.println(x+" - "+Thread.currentThread().getName());
	Prueba_Cronometro.segundo--;
	
			String texto_seg="",texto_mi="";
			String texto_sesion="Sesion: "; // Con esto creamos un texto compatible con el hilo es decir que se actualize
			texto_sesion+=Prueba_Cronometro.sesion; // igualamos coloccamos el texto a la variable de las sesiones
			String sesiones = texto_sesion;
			etiqueta2.setText(sesiones);
	
			if(Prueba_Cronometro.segundo==-1 && Prueba_Cronometro.minuto!=0){
			
			Prueba_Cronometro.minuto--;
			Prueba_Cronometro.segundo=59;
				
			}else if(Prueba_Cronometro.minuto==0 && Prueba_Cronometro.segundo==-1){
				
				Prueba_Cronometro.long_break.setBackground(java.awt.Color.LIGHT_GRAY);
				Prueba_Cronometro.descanso.setBackground(java.awt.Color.LIGHT_GRAY);
				Prueba_Cronometro.iniciar.setBackground(java.awt.Color.LIGHT_GRAY);
				
				Sounds.Sonido_R("sonido/good.wav"); // Sonido de finalizado
				
				Iconos image = new Iconos();
				JOptionPane.showMessageDialog(null,"Tiempo Listo!","TIEMPO",JOptionPane.DEFAULT_OPTION,image);
				
				if(Prueba_Cronometro.sesion==4 || Prueba_Cronometro.sesion==8 || Prueba_Cronometro.sesion==12 || Prueba_Cronometro.sesion==16 || Prueba_Cronometro.sesion==20 || Prueba_Cronometro.sesion==24 || Prueba_Cronometro.sesion==28 || Prueba_Cronometro.sesion==32){
				Iconos3 icu = new Iconos3();	
				JOptionPane.showMessageDialog(null,"Felicidades Estas estudiando MUY BIEN!! \n\n"+
										" Mereces un LONG BREAK de 15 minutos ","                               EXCELENTE!",JOptionPane.DEFAULT_OPTION,icu);		
					
				}
				
				Prueba_Cronometro.detener(); // Detener el hilo
					
			}
		
			if(Prueba_Cronometro.segundo<10){
				
			texto_seg="0"+Prueba_Cronometro.segundo;	
				
			}else{
				
			texto_seg=""+Prueba_Cronometro.segundo;
				
			}
			if(Prueba_Cronometro.minuto<10){
				
			texto_mi="0"+Prueba_Cronometro.minuto;	
				
			}else{
				
			texto_mi=""+Prueba_Cronometro.minuto;
				
			}
		
		String tiempo = texto_mi + ":" + texto_seg;
		etiqueta.setText(tiempo);
		
	}
    
}