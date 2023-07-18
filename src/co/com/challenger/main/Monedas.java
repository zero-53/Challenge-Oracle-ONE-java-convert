package co.com.challenger.main;

import java.io.*;
import java.math.BigDecimal;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

import org.json.*;

/**
 * El enum Monedas representa las diferentes monedas disponibles para el
 * conversor de moneda. Cada moneda tiene un código, un nombre y una tasa de
 * cambio asociada.
 */
public enum Monedas {
	USD("USD", "Dólar estadounidense"), EUR("EUR", "Euro"), COP("COP", "Pesos Colombianos"),
	ARS("ARS", "Peso argentino"), BOB("BOB", "Boliviano boliviano"), BRL("BRL", "Real brasileño"),
	CLP("CLP", "Peso chileno"), CRC("CRC", "Colón costarricense"), CUP("CUP", "Peso cubano"),
	DOP("DOP", "Peso dominicano"), GTQ("GTQ", "Quetzal guatemalteco"), HNL("HNL", "Lempira hondureño"),
	HTG("HTG", "Gourde haitiano"), MXN("MXN", "Peso mexicano"), NIO("NIO", "Córdoba nicaragüense"),
	PAB("PAB", "Balboa panameño"), PEN("PEN", "Sol peruano "), PYG("PYG", "Guaraní paraguayo "),
	UYU("UYU", "Peso uruguayo "), JPY("JPY", "Yen japonés"), GBP("GBP", "Libra esterlina"),
	AUD("AUD", "Dólar australiano"), CAD("CAD", "Dólar canadiense"), CHF("CHF", "Franco suizo"),
	CNY("CNY", "Yuan chino"), HKD("HKD", "Dólar de Hong Kong"), NZD("NZD", "Dólar neozelandés"),
	SEK("SEK", "Corona sueca"), KRW("KRW", "Won surcoreano"), SGD("SGD", "Dólar de Singapur"),
	NOK("NOK", "Corona noruega"), INR("INR", "Rupia india"), RUB("RUB", "Rublo ruso "), ZAR("ZAR", "Rand sudafricano "),
	TRY("TRY", "Lira turca "), TWD("TWD", "Nuevo dólar taiwanés "), DKK("DKK", "Corona danesa "),
	PLN("PLN", "Zloty polaco "), THB("THB", "Baht tailandés "), IDR("IDR", "Rupia indonesia "),
	HUF("HUF", "Forint húngaro "), CZK("CZK", "Corona checa "), ILS("ILS", "Nuevo séquel israelí "),
	AED("AED", "Dirham de los Emiratos Árabes Unidos"), AFN("AFN", "Afghani de Afganistán"),
	ALL("ALL", "Lek de Albania"), AMD("AMD", "Dram de Armenia"), ANG("ANG", "Florín de las Antillas Neerlandesas"),
	AOA("AOA", "Kwanza de Angola"), AWG("AWG", "Florín de Aruba"), AZN("AZN", "Manat de Azerbaiyán");

	private String codigo;
	private String nombre;
	private double tasaCambio;
	private String url_str = "https://api.exchangerate.host/latest?base=USD";
	private JSONObject dataRate;

	/**
	 * Crea una instancia de Monedas con el código y nombre de la moneda. La tasa de
	 * cambio se obtiene del archivo "rate.json" o de una API en línea si el archivo
	 * no existe o es antiguo.
	 *
	 * @param codigo el código de la moneda
	 * @param nombre el nombre de la moneda
	 */
	private Monedas(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
		try {
			this.tasaCambio = fileRate(codigo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Obtiene el código de la moneda.
	 *
	 * @return el código de la moneda
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Obtiene el nombre de la moneda.
	 *
	 * @return el nombre de la moneda
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene la tasa de cambio de la moneda.
	 *
	 * @return la tasa de cambio de la moneda
	 */
	public double getTasaCambio() {
		return tasaCambio;
	}

	/**
	 * Devuelve una representación en forma de cadena del código de la moneda.
	 *
	 * @return una cadena que representa el código de la moneda
	 */
	@Override
	public String toString() {
		return codigo;
	}

	private double fileRate(String Code) throws IOException, JSONException {
		String fileName = "rate.json";
		String encoding = "UTF-8";
		File rate = new File("rate.json");
		if (!rate.exists()) {
			PrintWriter writer = new PrintWriter(fileName, encoding);
			this.dataRate = allRate();
			writer.println(this.dataRate);
			writer.close();
		} else {
			FileTime fileTime = Files.getLastModifiedTime(rate.toPath());
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime convertedFileTime = LocalDateTime.ofInstant(fileTime.toInstant(), ZoneId.systemDefault());
			if (convertedFileTime.toLocalDate().equals(now.toLocalDate())) {
				try (Scanner scanner = new Scanner(rate)) {
					this.dataRate = new JSONObject(scanner.next());
				}
			} else {
				PrintWriter writer = new PrintWriter(fileName, encoding);
				this.dataRate = allRate();
				writer.println(this.dataRate);
				writer.close();
			}
		}
		if (this.dataRate.get(Code).getClass().getSimpleName().equals("Integer")) {
			System.out.println(this.dataRate.get(Code));
			return (1.0 * (Integer) this.dataRate.get(Code));
		} else {
			return (double) ((BigDecimal) this.dataRate.get(Code)).doubleValue();
		}
	}

	private JSONObject allRate() throws IOException {
		@SuppressWarnings("deprecation")
		URL url = new URL(this.url_str);
		HttpURLConnection request = (HttpURLConnection) url.openConnection();
		request.setRequestMethod("GET");
		request.setRequestProperty("Content-Type", "application/json");
		request.setRequestProperty("Accept", "application/json");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"))) {
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) {
				response.append(responseLine.trim());
			}
			JSONObject rateJson = new JSONObject(response.toString());
			return (JSONObject) rateJson.get("rates");
		}
	}
}
