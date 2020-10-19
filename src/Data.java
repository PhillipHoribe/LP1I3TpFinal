import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Data {
	Scanner ler = new Scanner(System.in);

	static int dia;
	static int mes;
	static int ano;

	public Data(){        
	    do{
	    System.out.println("Digite o ano: (0~2020): ");
	    ano = ler.nextInt();              
	    }while(ano <0 || ano > 2020);         
	    
	    do{
	    System.out.println("Digite o mes: (1~12): ");
	    mes = ler.nextInt();                
	    }        
	    while(mes <1 || mes>12);
	    
	    do{
	    if(mes == 2){
	        System.out.println("Digite o dia: (1~29)");
	        dia = ler.nextInt();
	    }
	    else{
	    	System.out.println("Digite o dia: (1~31)");
	        dia = ler.nextInt();
	    }}
	    while(dia < 1 || dia > 31);   
	}

	public Data(int d, int m, int a){
	    this.dia = d;        
	    this.mes = m;
	    this.ano = a;
	}

	public void entraDia(int d){
	    this.dia = d;
	}
	public void entraMes(int m){
	    this.mes = m;
	}
	public void entraAno(int a){
	    this.ano = a;
	}

	public void getDia(){
	    do{
	        System.out.println("Digite o dia: (1~30)");
	        dia = ler.nextInt();
	    }
	    while(dia <1 || dia > 30);
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}

	public void getMes(){
	    do{
	        System.out.println("Digite o mes: (1~12)");
	        mes = ler.nextInt();
	    }
	    while(mes <1 || mes > 12);
	}
	public void setMes(int mes) {
		this.mes = mes;
	}

	public void getAno(){
	    do{
	        System.out.println("Digite o ano: (0~2020)");
	        ano = ler.nextInt();
	    }
	    while(ano <0 || ano > 2020);
	    
	}
    public void setAno(int ano) {
		this.ano = ano;
	}

	/*public static int retDia(){
	    return dia;
	}

	public static int retMes(){
	    return mes;
	}

	public static int retAno(){
	    return ano;
	}*/

	public static String mostra1(){
	   String A = (dia+":"+mes+":"+ano);
	    return A;
	}
	public String mostra2(){
		
		
	    String mes;
	    String dia;
	    String ano;
	    
	    if(this.mes == 1){ mes = "Janeiro";}
	    else if(this.mes == 2){ mes = "Fevereiro";}
	    else if(this.mes == 3){ mes = "Março";}
	    else if(this.mes == 4){ mes = "Abril";}
	    else if(this.mes == 5){ mes = "Maio";}
	    else if(this.mes == 6){ mes = "Junho";}
	    else if(this.mes == 7){ mes = "Julho";}
	    else if(this.mes == 8){ mes = "Agosto";}
	    else if(this.mes == 9){ mes = "Setembro";}
	    else if(this.mes == 10){ mes = "Outubro";}
	    else if(this.mes == 11){ mes = "Novembro";}
	    else { mes = "Dezembro";}
	    
	    if(this.dia < 10){ dia = "0"+this.dia;}        
	    else{ dia = ""+this.dia; }
	    
	    if(this.ano < 10){ ano = "000"+this.ano;}
	    else if(this.ano < 100){ ano = "00"+this.ano;}        
	    else{ ano = ""+this.ano;}
	   
	        
	    return dia+"/"+mes+"/"+ano;
	    
	}

	public static boolean bissexto(){
	    if ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) ){
	        return true;
	    }
	    else{
	        return false;
	    }
	}

	public static int diasTranscorridos(){
	    int diastrans = 0;        
	      
	        switch (mes) {
	             case 3: case 5:
	            case 7: case 8: case 10:
	            case 12:
	            diastrans += 31;
	            break;
	            case 4: case 6: case 9: case 11:
	            diastrans += 30;
	            break;
	            case 2:
	            diastrans += 28;
	            break;
	        }
	        
	        diastrans += dia;       
	     if (bissexto() == true && mes > 2 ){ 
	         diastrans += 1;
	    }
	     return diastrans;        

	}

	public static void apresentaDataAtual(){
	    Date data = new Date();
	    
	    System.out.println("Data atual: "+ DateFormat.getDateInstance(DateFormat.FULL).format(data));
	}


}