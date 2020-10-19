import java.util.Scanner;

public class Hora {
	Scanner ler = new Scanner(System.in);
	static int hora=0;
	static int min=0;
	static int seg=0;
	
	public Hora() {		
		do {
			System.out.println("Digite as horas: ");
			hora = ler.nextInt();	 
			} while (hora > 24 || hora < 1);
			do {	
				System.out.println("Digite os minutos: ");
				min = ler.nextInt();;		
			} while (min > 60 || min < 0);
			do {
				System.out.println("Digite os segundos: ");
				seg = ler.nextInt();		
			} while (seg > 60 || seg < 0);
	}
	public Hora(int h, int m, int s){
		this.hora = h;
		this.min = m;
		this.seg = s;
	}
	public void setHora(int h)
	{
		this.hora = h;

	}
	public void setMin(int m)
	{
		this.min = m;
	}
	public void setSeg(int s)
	{
		this.seg = s;
	}
	public void setHora()
	{	
		do {
			System.out.println("Digite a hora: ");
			hora = ler.nextInt(); 
		} while (hora > 24 || hora < 1);

	}
	public void setMin()
	{
		do {	
			System.out.println("Digite a hora: ");
			min = ler.nextInt();
		} while (min > 60 || min < 0);

	}
	public void setSeg()
	{
		do {
			System.out.println("Digite a hora: ");
			seg = ler.nextInt();
		} while (seg > 60 || seg < 0);

	}

	public static int getHora()
	{
		return hora;
	}

	public static int getMin()
	{
		return min;
	}

	public static int getSeg()
	{
		return seg;
	}

	public static String getHora1 ()
	{
		String formatado;
		formatado = (hora+":"+min+":"+seg);
		return formatado;
	}

	public static String getHora2()
    {       
        String hr;
        String min = null ;
        String seg = null ;
        String periodo;
        int hr2;
        int x = Integer.parseInt(min);
        int y = Integer.parseInt(seg);
        
        if(hora > 12)
        {
            hr2 = hora - 12;
        }
        else 
        {
            hr2 = hora;
        }
        if(hr2 < 10)
        {
            hr = "0"+hr2;
        }
        else
        {
            hr = ""+hr2;
        }
        
        if(x < 10)
            {
                min = "0"+min;
            }
        else
            {
                min = ""+min;
            }
        if(y < 10)
            {
                seg = "0"+seg;
            }
        else 
            {
                seg = ""+seg;
            }
        if(hora < 12)
            {                    
                periodo = "AM";
            }
        else
            {
                
                periodo = "PM";
            }
    
    return hr+":"+min+":"+seg+"("+periodo+")";
}

	public static void getSegundos()
	{
		int calcH = hora * 3600;
		int calcM = min * 60;		
		int horario = seg + calcH + calcM;
		System.out.println("Qt segundos: "+horario);	
	}	
}

