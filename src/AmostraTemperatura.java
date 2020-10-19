import java.util.Scanner;

public class AmostraTemperatura {
	static Scanner ler = new Scanner(System.in); 
	Hora hora;
	Data data;
	int numseq;
	static float valor;
	public AmostraTemperatura() {
		hora = new Hora();
		data = new Data();
				System.out.println("Digite a temperatura: ");
				valor = ler.nextInt(); 
	}
	public AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v){
		this.data.dia = a;        
	    this.data.mes = b;
	    this.data.ano = c;
	    this.hora.hora = d;        
	    this.hora.min = e;
	    this.hora.seg = f;
	    this.valor = v;        	
	}
	public AmostraTemperatura(Data d, Hora h, float v){
	    this.data = d;        
	    this.hora = h;
	    this.valor = v;
	}
	
	public void setData(int dia, int mes, int ano) {
		this.data.dia = dia;
		this.data.mes = mes;
		this.data.ano = ano;
	}
	public static void setData() {
		do {
			System.out.println("Digite o dia: ");
			Data.dia = ler.nextInt(); 
		} while ( Data.dia > 30 || Data.dia < 1);
		do {
			System.out.println("Digite o mes: ");
			Data.mes = ler.nextInt(); 
		} while (Data.mes > 12 || Data.mes < 0);
		do {
			System.out.println("Digite o ano: ");
			Data.ano= ler.nextInt(); 
		} while (Data.ano > 2020 || Data.ano < 0);
	}
	
	public void setHora(int hora, int min, int seg) {
		this.hora.hora = hora;
		this.hora.min = min;
		this.hora.seg = seg;
	}
	public static void setHora() {
		do {
			System.out.println("Digite a hora: ");
			Hora.hora = ler.nextInt(); 
		} while (Hora.hora > 24 || Hora.hora < 1);
		do {
			System.out.println("Digite os minutos: ");
			Hora.min = ler.nextInt(); 
		} while (Hora.min > 60 || Hora.min < 0);
		do {
			System.out.println("Digite os segundos: ");
			Hora.seg = ler.nextInt(); 
		} while (Hora.seg > 60 || Hora.seg < 0);
	}
	public void setValor(float v) {
		this.valor = v;
		}
	public static void setValor() {
		System.out.println("Digite a Tempertaura: ");
		valor = ler.nextInt(); 

	}
	public static String GetData(){
		   String A = (Data.dia+":"+Data.mes+":"+Data.ano);
		    return A;
		}
	public static String GetHora ()
	{
		String formatado = (Hora.hora+":"+Hora.min+":"+Hora.seg);
		return formatado;
	}
	public static float GetValor() {
		
		float B = (valor);
		return B;
	}
}