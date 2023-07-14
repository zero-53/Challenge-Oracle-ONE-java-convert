package co.com.challenger.main;

public enum Monedas {
	USD("USD", "Dólar estadounidense", 1.000), 
	EUR("EUR", "Euro", 0.8809),
	COP("COP", "Pesos Colombianos", 4101.00),
	ARS("ARS", "Peso argentino", 264.37),
    BOB("BOB", "Boliviano boliviano", 6.96),
    BRL("BRL", "Real brasileño", 4.80),
    CLP("CLP", "Peso chileno", 809.84),
    CRC("CRC", "Colón costarricense", 545.03),
    CUP("CUP", "Peso cubano", 24.00),
    DOP("DOP", "Peso dominicano", 55.75),
    GTQ("GTQ", "Quetzal guatemalteco", 7.73),
    HNL("HNL", "Lempira hondureño", 23.83),
    HTG("HTG", "Gourde haitiano", 98.43),
    MXN("MXN", "Peso mexicano", 20.31),
    NIO("NIO", "Córdoba nicaragüense", 35.09),
    PAB("PAB", "Balboa panameño", 1.00),
    PEN("PEN","Sol peruano ",4.09),
    PYG("PYG","Guaraní paraguayo ",6855.00),
    UYU("UYU","Peso uruguayo ",44.27),
	JPY("JPY", "Yen japonés", 113.61),
    GBP("GBP", "Libra esterlina", 0.75),
    AUD("AUD", "Dólar australiano", 1.36),
    CAD("CAD", "Dólar canadiense", 1.23),
    CHF("CHF", "Franco suizo", 0.92),
    CNY("CNY", "Yuan chino", 6.39),
    HKD("HKD", "Dólar de Hong Kong", 7.78),
    NZD("NZD", "Dólar neozelandés", 1.43),
    SEK("SEK", "Corona sueca", 8.62),
    KRW("KRW", "Won surcoreano", 1187.50),
    SGD("SGD", "Dólar de Singapur", 1.34),
    NOK("NOK", "Corona noruega", 8.53),
    INR("INR", "Rupia india", 74.82),
    RUB("RUB","Rublo ruso ",73.52),
    ZAR("ZAR","Rand sudafricano ",15.08),
    TRY("TRY","Lira turca ",9.43),
    TWD("TWD","Nuevo dólar taiwanés ",28.44),
    DKK("DKK","Corona danesa ",6.35),
    PLN("PLN","Zloty polaco ",3.93),
    THB("THB","Baht tailandés ",33.42),
    IDR("IDR","Rupia indonesia ",14215.00),
    HUF("HUF","Forint húngaro ",304.48),
    CZK("CZK","Corona checa ",21.44),
    ILS("ILS","Nuevo séquel israelí ",3.20),
	AED("AED", "Dirham de los Emiratos Árabes Unidos", 3.67),
    AFN("AFN", "Afghani de Afganistán", 77.06),
    ALL("ALL", "Lek de Albania", 103.03),
    AMD("AMD", "Dram de Armenia", 478.71),
    ANG("ANG", "Florín de las Antillas Neerlandesas", 1.79),
    AOA("AOA", "Kwanza de Angola", 642.06),
    AWG("AWG", "Florín de Aruba", 1.79),
    AZN("AZN", "Manat de Azerbaiyán", 1.70);
	// Bing 13/07/2023

	private String codigo;
	private String nombre;
	private double tasaCambio;

	private Monedas(String codigo, String nombre, double tasaCambio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tasaCambio = tasaCambio;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getTasaCambio() {
		return tasaCambio;
	}

	@Override
	public String toString() {
		return codigo;
	}
}
