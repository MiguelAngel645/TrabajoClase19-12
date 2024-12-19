package e1T1_Miguel_Ángel_Villorejo;

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;


public class Examen {

	public static void main(String[] args) {
		DecimalFormat deci=new DecimalFormat("#.00");
		System.out.println("El volumen de la pirámide de lado 5 y altura 4 es de "+deci.format(ejercicio2(5,4)));
		int[][] tabla=new int[4][4];
		for (int i=0;i<tabla.length;i++){
			for (int j=0;j<tabla.length;j++){
				tabla[i][j]=i*i+j*j;
			}
		}
	}
	
	public static void ejercicio1() {
		double formula;
		for (int i=500;i>=100;i--) {
			formula=Math.cbrt(Math.PI*Math.pow(i, 4));
			if (i==100) {
				System.out.print(formula);
			}else {
				System.out.print(formula+"--");
			}
		}
	}
	public static double ejercicio2(double lado,double altura) {
		double solucion=(lado*lado*altura)/3;
		return solucion;
	}
	public static void ejercicio3() {
		Scanner teclado=new Scanner(System.in);
		Random rand=new Random();
		int a,b,c,resultado,resultadoUser,contador=0;
		do {
			a=rand.nextInt(2, 201);
			b=rand.nextInt(2, 13);
			c=rand.nextInt(2, 13);
			resultado=a+b*c;
			System.out.print(a+"+"+b+"x"+c+"=");
			resultadoUser=teclado.nextInt();
			if (resultado!=resultadoUser) {
				System.out.println("La solución era "+resultado);
			}else {
				contador++;
			}
		}while (resultado==resultadoUser);
		System.out.println("Has respondido correctamente a "+contador+" operaciones.");
	}
	public static void ejercicio4(int a,int b,int c,int d,int e) {
		Random rand=new Random();
		int num, rango1=0,rango2=0,rango3=0,rango4=0,rango5=0;
		for (int i=0;i<50;i++) {
			num=rand.nextInt(a, e);
			if (num>=a&&num<b) {
				rango1++;
			}else if (num>=b&&num<c) {
				rango2++;
			}else if (num>=c&&num<d) {
				rango3++;
			}else{
				rango4++;
			}
		}
		System.out.println("De los números aleatorios generados entre "+a+" y "+e+":");
		System.out.println(rango1+" estan entre "+a+" y "+(b-1)+".");
		System.out.println(rango2+" estan entre "+b+" y "+(c-1)+".");
		System.out.println(rango3+" estan entre "+c+" y "+(d-1)+".");
		System.out.println(rango4+" estan entre "+d+" y "+e+".");
	}
	public static void ejercicio5() {
		DecimalFormat deci=new DecimalFormat("#.00");
		Scanner teclado=new Scanner(System.in);
		int edadJugador,indice=0,prebenjamin=0,benjamin=0,alevin=0,infantil=0,cadete=0,juvenil=0;
		double media=0;
		do {
			System.out.print("Introduce la edad del jugador "+indice+": ");
			indice++;
			edadJugador=teclado.nextInt();
			if (edadJugador==-1) {
				indice--;
				break;
			}else if (edadJugador>=5&&edadJugador<=7) {
				prebenjamin++;
				media+=edadJugador;
			}else if (edadJugador>=8&&edadJugador<=9) {
				benjamin++;
				media+=edadJugador;
			}else if (edadJugador>=10&&edadJugador<=11) {
				alevin++;
				media+=edadJugador;
			}else if (edadJugador>=12&&edadJugador<=13) {
				infantil++;
				media+=edadJugador;
			}else if (edadJugador>=14&&edadJugador<=15) {
				cadete++;
				media+=edadJugador;
			}else if (edadJugador>=16&&edadJugador<=18) {
				juvenil++;
				media+=edadJugador;
			}else {
				System.out.println("La edad introducida no es valida");
				indice--;
			}
		}while(true);
		media/=indice;
		System.out.println("Hay "+prebenjamin+" jugaodres en la categoría Prebenjamín.");
		System.out.println("Hay "+benjamin+" jugaodres en la categoría Benjamín.");
		System.out.println("Hay "+alevin+" jugaodres en la categoría Alevin.");
		System.out.println("Hay "+infantil+" jugaodres en la categoría Infantil.");
		System.out.println("Hay "+cadete+" jugaodres en la categoría Cadete.");
		System.out.println("Hay "+juvenil+" jugaodres en la categoría Juvenil.");
		System.out.println("Hay "+indice+" jugadores y la media de sus edades es "+deci.format(media)+".");
	}
	public static int ejercicio6(int a,int b,boolean operacion) {
		int resultado=1;
		if (operacion==true) {
			resultado--;
			if (a<=b) {
				for (int i=a;i<=b;i++) {
					resultado+=i;
				}
			}else {
				for (int i=b;i<=a;i++) {
					resultado+=i;
				}
			}
		}else {
			if (a<=b) {
				for (int i=a;i<=b;i++) {
					resultado*=i;
				}
			}else {
				for (int i=b;i<=a;i++) {
					resultado*=i;
				}
			}
		}
		return resultado;
	}
	public static void ejercicio7(char vocal) {
		if (vocal=='a'||vocal=='e'||vocal=='i'||vocal=='o'||vocal=='u') {
			System.out.println("La vocal "+vocal+" está en minusculas.");
		}else if (vocal=='A'||vocal=='E'||vocal=='I'||vocal=='O'||vocal=='U') {
			System.out.println("La vocal "+vocal+" está en mayusculas.");
		}else {
			System.out.println("La letra introducida no es una vocal.");
		}
	}
}
