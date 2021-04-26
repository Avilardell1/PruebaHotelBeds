import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MinutosEntreFechas {

	public static void main(String[] args) throws ParseException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entra una fecha: "); 
		String fechaStr1 = br.readLine();
		System.out.println("Entra una segunda fecha: "); 
		String fechaStr2 = br.readLine();
		
		int minutos = ObtenerMinutosEntreFechas(fechaStr1,fechaStr2);
		
		System.out.println("La diferencia entre las dos fechas es de: " + minutos + " minutos");
	}
			
	private static int ObtenerMinutosEntreFechas(String fecha1, String fecha2) throws ParseException {
		String pattern = "EEE, dd MMM yyyy HH:mm:ss Z";
		SimpleDateFormat format = new SimpleDateFormat(pattern, Locale.ENGLISH);
		Date fechaf1 = format.parse(fecha1);
		Date fechaf2 = format.parse(fecha2);
		
		return Math.round(Math.abs((float) ((fechaf1.getTime()/1000) - (fechaf2.getTime()/1000))) / 60);
	}
}
