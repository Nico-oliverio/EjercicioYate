package ar.edu.unlam.pb2.AmarrasTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.Amarras.Fondeadero;
import ar.edu.unlam.pb2.Amarras.YateMotor;
import ar.edu.unlam.pb2.Amarras.YateVela;

public class AmarrasTest {

	@Test
	public void queSePuedaCrearUnFondeaderoConUnaCantidadMaxDeAmarras() {
		Integer cantidadMaxAmarras=70;
		Fondeadero nuevoFondeadero= new Fondeadero (cantidadMaxAmarras);
		
		Integer valorEsperado=70;
		Integer valorObtenido=0;
		
		valorObtenido= nuevoFondeadero.cantidadDeAmarras();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePuedaCalcularElCostoDeAmarreDeUnYateMotor() {
		Integer cantidadMaximaAmarras = 70;
		Fondeadero miFondeadero = new Fondeadero(cantidadMaximaAmarras);
		
		Double valorEsperado = 13000.0;
		Double valorObtenido = 0.0;
		String nombre = "AZ1";
		String duenio = "Andres Borgeat"; 
		Double manga = 18.87;
		Double calado = 5.15;
		Double eslora = 119.0;
		Integer tripulacion = 37;
		Integer peso= 5500;
		Integer desplazamiento = 5959;
		String propulsion ="2x Motores Diesel MAN rk 2805";
		Integer potencia = 9000;
		Integer velocidad = 23;
		Integer autonomia = 6500;
		
		YateMotor miYateMotor = new YateMotor(nombre,duenio,manga,calado,eslora,tripulacion,peso,desplazamiento,propulsion,potencia,velocidad,autonomia);

		valorObtenido = miYateMotor.obtenerPrecioAmarra();	
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queSePuedaCalcularElCostoDeAmarreDeUnYateVela() {

		Integer cantidadMaximaAmarras = 70;
		Fondeadero miFondeadero = new Fondeadero(cantidadMaximaAmarras);
		
		Double valorEsperado = 11000.0;
		Double valorObtenido = 0.0;
		
		String nombre = "XXR";
		String duenio = "Sebastian Bardo"; 
		Double manga = 6.9;
		Double calado = 2.7;
		Double eslora = 13.45;
		Integer tripulacion = 5;
		Integer peso= 1400;
		Double alturaMastil = 21.5;
		Integer superficieVelicaMayor = 85;
		Integer superficieTotal = 133;
		
		YateVela miYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion,peso,alturaMastil,superficieVelicaMayor,superficieTotal);

		valorObtenido = miYateVela.obtenerPrecioAmarra();	

		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queSePuedaAmarrarUnYate() {

		Integer cantidadMaximaAmarras = 70;
		Fondeadero miFondeadero = new Fondeadero(cantidadMaximaAmarras);
		
		Integer valorEsperado = 69;
		Integer valorObtenido = 0;
		
		String nombre = "XXR";
		String duenio = "Sebastian Bardo"; 
		Double manga = 6.9;
		Double calado = 2.7;
		Double eslora = 13.45;
		Integer tripulacion = 5;
		Integer peso= 1400;
		Double alturaMastil = 21.5;
		Integer superficieVelicaMayor = 85;
		Integer superficieTotal = 133;
		
		YateVela miYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion,peso,alturaMastil,superficieVelicaMayor,superficieTotal);


		miFondeadero.amarrarUnYate(miYateVela);
		valorObtenido = miFondeadero.cantidadAmarrasDisponibles();
		

		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queNoSePuedaAmarrarUnYateDuplicado() {
		
		Integer cantidadMaximaAmarras = 70;
		Fondeadero miFondeadero = new Fondeadero(cantidadMaximaAmarras);
		
		Integer valorEsperado = 68;
		Integer valorObtenido = 0;
		
		String nombre = "XXR";
		String duenio = "Sebastian Bardo"; 
		Double manga = 6.9;
		Double calado = 2.7;
		Double eslora = 13.45;
		Integer tripulacion = 5;
		Integer peso= 1400;
		Double alturaMastil = 21.5;
		Integer superficieVelicaMayor = 85;
		Integer superficieTotal = 133;
		
		YateVela miYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion,peso,alturaMastil,superficieVelicaMayor,superficieTotal);
		
		nombre = "XXR";
		duenio = "Sebastian Bardo"; 
		manga = 6.9;
		calado = 2.7;
		eslora = 13.45;
		tripulacion = 5;
		peso= 1400;
		alturaMastil = 21.5;
		superficieVelicaMayor = 85;
		superficieTotal = 133;
		
		YateVela miSegundoYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion,peso,alturaMastil,superficieVelicaMayor,superficieTotal);

		nombre = "XXL";
		duenio = "Sebastian Bardo"; 
		manga = 6.9;
		calado = 2.7;
		eslora = 13.45;
		tripulacion = 5;
		peso= 1400;
		alturaMastil = 21.5;
		superficieVelicaMayor = 85;
		superficieTotal = 133;
		
		YateVela miTercerYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion,peso,alturaMastil,superficieVelicaMayor,superficieTotal);

		nombre = "XXL";
		duenio = "Sebastian Bardo"; 
		manga = 6.9;
		calado = 2.7;
		eslora = 13.45;
		tripulacion = 5;
		peso= 1400;
		alturaMastil = 21.5;
		superficieVelicaMayor = 85;
		superficieTotal = 133;
		
		YateVela miCuartoYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion,peso,alturaMastil,superficieVelicaMayor,superficieTotal);

		
		miFondeadero.amarrarUnYate(miYateVela);
		miFondeadero.amarrarUnYate(miSegundoYateVela);
		miFondeadero.amarrarUnYate(miTercerYateVela);
		miFondeadero.amarrarUnYate(miCuartoYateVela);
		
		valorObtenido = miFondeadero.cantidadAmarrasDisponibles();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queSePuedaDesamarrarUnYate() {

		Integer cantidadMaximaAmarras = 70;
		Fondeadero miFondeadero = new Fondeadero(cantidadMaximaAmarras);
		
		Integer valorEsperado = 70;
		Integer valorObtenido = 0;
		
		String nombre = "XXR";
		String duenio = "Sebastian Bardo"; 
		Double manga = 6.9;
		Double calado = 2.7;
		Double eslora = 13.45;
		Integer tripulacion = 5;
		Integer peso= 1400;
		Double alturaMastil = 21.5;
		Integer superficieVelicaMayor = 85;
		Integer superficieTotal = 133;
		
		YateVela miYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion,peso,alturaMastil,superficieVelicaMayor,superficieTotal);


		nombre = "XXL";
		duenio = "Sebastian Bardo"; 
		manga = 6.9;
		calado = 2.7;
		eslora = 13.45;
		tripulacion = 5;
		peso= 1400;
		alturaMastil = 21.5;
		superficieVelicaMayor = 85;
		superficieTotal = 133;
		
		YateVela miCuartoYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion,peso,alturaMastil,superficieVelicaMayor,superficieTotal);

		
		miFondeadero.amarrarUnYate(miYateVela);
		miFondeadero.amarrarUnYate(miCuartoYateVela);
		miFondeadero.desamarrarUnYate(miYateVela);
		miFondeadero.desamarrarUnYate(miCuartoYateVela);
		
		valorObtenido = miFondeadero.cantidadAmarrasDisponibles();
		

		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queSePuedaObtenerCantidadDeYatesAmarrados() {

		Integer cantidadMaximaAmarras = 70;
		Fondeadero miFondeadero = new Fondeadero(cantidadMaximaAmarras);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = 0;
		
		String nombre = "XXR";
		String duenio = "Sebastian Bardo"; 
		Double manga = 6.9;
		Double calado = 2.7;
		Double eslora = 13.45;
		Integer tripulacion = 5;
		Integer peso= 1400;
		Double alturaMastil = 21.5;
		Integer superficieVelicaMayor = 85;
		Integer superficieTotal = 133;
		
		YateVela miYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion,peso,alturaMastil,superficieVelicaMayor,superficieTotal);


		nombre = "XXL";
		duenio = "Sebastian Bardo"; 
		manga = 6.9;
		calado = 2.7;
		eslora = 13.45;
		tripulacion = 5;
		peso= 1400;
		alturaMastil = 21.5;
		superficieVelicaMayor = 85;
		superficieTotal = 133;
		
		YateVela miCuartoYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion,peso,alturaMastil,superficieVelicaMayor,superficieTotal);

		miFondeadero.amarrarUnYate(miYateVela);
		miFondeadero.amarrarUnYate(miCuartoYateVela);
		miFondeadero.desamarrarUnYate(miYateVela);
		
		valorObtenido = miFondeadero.cantidadDeAmarrasOcupadas();
		

		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queSePuedaObtenerLaRecaudacionTotalPorLosAmarres() {

		Integer cantidadMaximaAmarras = 70;
		Fondeadero miFondeadero = new Fondeadero(cantidadMaximaAmarras);
		
		Double valorEsperado = 24000.0;
		Double valorObtenido = 0.0;
		
		String nombre = "XXR";
		String duenio = "Sebastian Bardo"; 
		Double manga = 6.9;
		Double calado = 2.7;
		Double eslora = 13.45;
		Integer tripulacion = 5;
		Integer peso= 1400;
		Double alturaMastil = 21.5;
		Integer superficieVelicaMayor = 85;
		Integer superficieTotal = 133;
		
		YateVela miYateVela = new YateVela(nombre,duenio,manga,calado,eslora,tripulacion,peso,alturaMastil,superficieVelicaMayor,superficieTotal);
		
		
		
		nombre = "AZ1";
		duenio = "Andres Borgeat"; 
		manga = 18.87;
		calado = 5.15;
		eslora = 119.0;
		tripulacion = 37;
		peso= 5500;
		Integer desplazamiento = 5959;
		String propulsion ="2x Motores Diesel MAN rk 2805";
		Integer potencia = 9000;
		Integer velocidad = 23;
		Integer autonomia = 6500;
		
		YateMotor miYateMotor = new YateMotor(nombre,duenio,manga,calado,eslora,tripulacion,peso,desplazamiento,propulsion,potencia,velocidad,autonomia);

		miFondeadero.amarrarUnYate(miYateVela);
		miFondeadero.amarrarUnYate(miYateMotor);
		
		valorObtenido =miFondeadero.obtenerRecaudacionTotal();	

		assertEquals(valorEsperado,valorObtenido);
	}
}
