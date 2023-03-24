package conversor_divisas;

public interface Acronimos {
	
	String [] monedas = {
			"Afganistán Afgani AFN",
			"Albania Lek ALL",
			"Algeria Dinar DZD",
			"Angola Kwanza AOA",
			"Argentina Peso ARS",
			"Armenia Dram AMD",
			"Aruba Florín AWG",
			"Australia Dólar AUD",
			"Austria Chelín ATS",
			"Bélgica Franco BEF",
			"Azerbaiyán Nvo Manat AZN",
			"Bahamas Dólar BSD",
			"Bahréin Dinar BHD",
			"Bangladesh Taka BDT",
			"Barbados Dólar BBD",
			"Bielorrusia Rublo BYR",
			"Belice Dólar BZD",
			"Bermuda Dólar BMD",
			"Bután Ngultrum BTN",
			"Bolivia Boliviano BOB",
			"Bosnia Marco BAM",
			"Botsuana Pula BWP",
			"Brasil Real BRL",
			"G.B. Libra esterlina GBP",
			"Brunéi Dólar BND",
			"Bulgaria Lev BGN",
			"Burundi Franco BIF",
			"CFA Franco BCEAO XOF",
			"CFA Franco BEAC XAF",
			"CFP Franco XPF",
			"Camboya Riel KHR",
			"Canadá Dólar CAD",
			"Cabo Verde Escudo CVE",
			"Islas Caimán Dólar KYD",
			"Chile Peso CLP",
			"China Yuan/Renminbi CNY",
			"Colombia Peso COP",
			"Comoras Franco KMF",
			"Congo Franco CDF",
			"Costa Rica Colón CRC",
			"Croacia Kuna HRK",
			"Cuba Peso CUC",
			"Cuba Peso CUP",
			"Chipre Libra CYP",
			"Rep. Checa Corona CZK",
			"Dinamarca Corona DKK",
			"Yibuti Franco DJF",
			"Rep. Dominicana Peso DOP",
			"Caribe oriental Dólar XCD",
			"Egipto Libra EGP",
			"El Salvador Colón SVC",
			"Estonia Corona EEK ",
			"Etiopía Birr ETB",
			"Euro EUR",
			"Islas Falkland Libra FKP",
			"Finlandia Marco FIM",
			"Fiji Dólar FJD",
			"Gambia Dalasi GMD",
			"Georgia Lari GEL",
			"Alemania Marco DMK",
			"Ghana Nuevo Cedi GHS",
			"Gibraltar Libra GIP",
			"Grecia Dracma GRD",
			"Guatemala Quetzal GTQ",
			"Guinea Franco GNF",
			"Guyana Dólar GYD",
			"Haití Gourde HTG",
			"Honduras Lempira HNL",
			"Hong Kong Dólar HKD",
			"Hungría Forinto HUF",
			"Islandia Corona ISK",
			"India Rupia INR",
			"Indonesia Rupia IDR",
			"Irán Rial IRR",
			"Irak Dinar IQD",
			"Irlanda Libra IED",
			"Israel Nuevo Séquel ILS",
			"Italia Lira ITL",
			"Jamaica Dólar JMD",
			"Japón Yen JPY",
			"Jordania Dinar JOD",
			"Kazajistán Tenge KZT",
			"Kenia Chelín KES",
			"Kuwait Dinar KWD",
			"Kirguistán Som KGS",
			"Laos Kip LAK",
			"Letonia Lats LVL",
			"Líbano Libra LBP",
			"Lesotho Loti LSL",
			"Liberia Dólar LRD",
			"Libia Dinar LYD",
			"Lituania Litas LTL",
			"Luxemburgo Franco LUF",
			"Macao Pataca MOP",
			"Macedonia Denar MKD",
			"Madagascar Ariary MGA",
			"Malawi Kwacha MWK",
			"Malasia Ringgit MYR",
			"Maldivas Rufiyaa MVR",
			"Malta Lira MTL",
			"Mauritania Ouguiya MRO",
			"Mauricio Rupia MUR",
			"México Peso MXN",
			"Moldavia Leu MDL",
			"Mongolia Tugrik MNT",
			"Marruecos Dirham MAD",
			"Mozamb. Nvo Metical MZN",
			"Myanmar Kyat MMK",
			"Antillas Holandesas ANG",
			"Namibia Dólar NAD",
			"Nepal Rupia NPR",
			"Países bajos Florín NLG",
			"Nueva Zelanda Dólar NZD",
			"Nicaragua Córdoba NIO",
			"Nigeria Naira NGN",
			"Corea del Norte Won KPW",
			"Noruega Corona NOK",
			"Omán Rial OMR",
			"Pakistán Rupia PKR",
			"Panamá Balboa PAB",
			"Papúa Nva Guinea Kina PGK",
			"Paraguay Guaraní PYG",
			"Perú Nuevo Sol PEN",
			"Filipinas Peso PHP",
			"Polonia Zloty PLN",
			"Portugal Escudo PTE",
			"Catar Rial QAR",
			"Rumania Nuevo Lei RON",
			"Rusia Rublo RUB",
			"Ruanda Franco RWF",
			"Samoa Tala WST",
			"Sto Tomé Prpe Dobra STD",
			"Arabia Saudita Rial SAR",
			"Serbia Dinar RSD",
			"Seychelles Rupia SCR",
			"Sierra Leona Leone SLL",
			"Singapur Dólar SGD",
			"Eslovaquia Koruna SKK",
			"Eslovenia Tolar SIT",
			"Islas Salomón Dólar SBD",
			"Somalía Chelín SOS",
			"Sudáfrica Rand ZAR",
			"Corea del Sur Won KRW",
			"Suiza Franco CHF",
			"España Peseta ESP",
			"Sri Lanka Rupia LKR",
			"Santa Helena Libra SHP",
			"Sudán Libra SDG",
			"Suriname Dólar SRD",
			"Suazilandia Lilangeni SZL",
			"Suecia Corona EK",
			"Siria Libra SYP",
			"Taiwán Dólar TWD",
			"Tanzania Chelín TZS",
			"Tailandia Baht THB",
			"Tonga Pa'anga OP",
			"Trinidad Tobago Dólar TTD",
			"Túnez Dinar TND",
			"Turquía Nueva Lira TRY",
			"Turkmenistán Manat TMM",
			"EE.UU. Dólar USD",
			"Uganda Chelín UGX",
			"Ucrania Hryvnia UAH",
			"Uruguay Peso UYU",
			"Emiratos Árabes U. AED",
			"Vanuatu Vatu VUV",
			"Venezuela Bolívar VEB",
			"Vietnam Dong VND",
			"Yemen Rial YER",
			"Zambia Kwacha ZMK",
			"Zimbabue Dólar ZWD",
	};
	
	public default String [] getMonedas() {
		return monedas;
	}

}
