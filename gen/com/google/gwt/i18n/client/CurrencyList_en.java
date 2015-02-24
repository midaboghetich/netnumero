package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.i18n.client.CurrencyList;

public class CurrencyList_en extends com.google.gwt.i18n.client.CurrencyList_ {
  
  private void loadSuperCurrencyMap() {
    super.loadCurrencyMap();
  }
  
  @Override
  protected native void loadCurrencyMap() /*-{
    this.@com.google.gwt.i18n.client.CurrencyList_en::loadSuperCurrencyMap()();
    this.@com.google.gwt.i18n.client.CurrencyList_en::overrideCurrencyMap(Lcom/google/gwt/core/client/JavaScriptObject;)({
      // Andorran Peseta
      "ADP": [ "ADP", "ADP", 128],
      // United Arab Emirates Dirham
      "AED": [ "AED", "DH", 2, "DH"],
      // Afghani (1927-2002)
      "AFA": [ "AFA", "AFA", 130],
      // Afghani
      "AFN": [ "AFN", "Af", 2],
      // Albanian Lek
      "ALL": [ "ALL", "lek", 2],
      // Armenian Dram
      "AMD": [ "AMD", "dram", 2],
      // Netherlands Antillan Guilder
      "ANG": [ "ANG", "NA f.", 2],
      // Angolan Kwanza
      "AOA": [ "AOA", "AOA", 2],
      // Angolan Kwanza (1977-1990)
      "AOK": [ "AOK", "AOK", 130],
      // Angolan New Kwanza (1990-2000)
      "AON": [ "AON", "AON", 130],
      // Angolan Kwanza Reajustado (1995-1999)
      "AOR": [ "AOR", "AOR", 130],
      // Argentine Austral
      "ARA": [ "ARA", "ARA", 130],
      // Argentine Peso (1983-1985)
      "ARP": [ "ARP", "ARP", 130],
      // Argentine Peso
      "ARS": [ "ARS", "Arg$", 2, "AR$"],
      // Austrian Schilling
      "ATS": [ "ATS", "ATS", 130],
      // Australian Dollar
      "AUD": [ "AUD", "$A", 2, "AU$"],
      // Aruban Guilder
      "AWG": [ "AWG", "AWG", 2],
      // Azerbaijanian Manat (1993-2006)
      "AZM": [ "AZM", "AZM", 130],
      // Azerbaijanian Manat
      "AZN": [ "AZN", "AZN", 2],
      // Bosnia-Herzegovina Dinar
      "BAD": [ "BAD", "BAD", 130],
      // Bosnia-Herzegovina Convertible Mark
      "BAM": [ "BAM", "KM", 2],
      // Barbados Dollar
      "BBD": [ "BBD", "BDS$", 2],
      // Bangladesh Taka
      "BDT": [ "BDT", "Tk", 2, "Tk"],
      // Belgian Franc (convertible)
      "BEC": [ "BEC", "BEC", 130],
      // Belgian Franc
      "BEF": [ "BEF", "BF", 130],
      // Belgian Franc (financial)
      "BEL": [ "BEL", "BEL", 130],
      // Bulgarian Hard Lev
      "BGL": [ "BGL", "lev", 130],
      // Bulgarian New Lev
      "BGN": [ "BGN", "BGN", 2],
      // Bahraini Dinar
      "BHD": [ "BHD", "BD", 3],
      // Burundi Franc
      "BIF": [ "BIF", "Fbu", 0],
      // Bermudan Dollar
      "BMD": [ "BMD", "Ber$", 2],
      // Brunei Dollar
      "BND": [ "BND", "BND", 2],
      // Boliviano
      "BOB": [ "BOB", "Bs", 2],
      // Bolivian Peso
      "BOP": [ "BOP", "BOP", 130],
      // Bolivian Mvdol
      "BOV": [ "BOV", "BOV", 130],
      // Brazilian Cruzeiro Novo (1967-1986)
      "BRB": [ "BRB", "BRB", 130],
      // Brazilian Cruzado
      "BRC": [ "BRC", "BRC", 130],
      // Brazilian Cruzeiro (1990-1993)
      "BRE": [ "BRE", "BRE", 130],
      // Brazilian Real
      "BRL": [ "BRL", "R$", 2, "R$"],
      // Brazilian Cruzado Novo
      "BRN": [ "BRN", "BRN", 130],
      // Brazilian Cruzeiro
      "BRR": [ "BRR", "BRR", 130],
      // Bahamian Dollar
      "BSD": [ "BSD", "BSD", 2],
      // Bhutan Ngultrum
      "BTN": [ "BTN", "Nu", 130],
      // Burmese Kyat
      "BUK": [ "BUK", "BUK", 130],
      // Botswanan Pula
      "BWP": [ "BWP", "BWP", 2],
      // Belarussian New Ruble (1994-1999)
      "BYB": [ "BYB", "BYB", 130],
      // Belarussian Ruble
      "BYR": [ "BYR", "Rbl", 0],
      // Belize Dollar
      "BZD": [ "BZD", "BZ$", 2],
      // Canadian Dollar
      "CAD": [ "CAD", "Can$", 2, "C$"],
      // Congolese Franc Congolais
      "CDF": [ "CDF", "CDF", 2],
      // WIR Euro
      "CHE": [ "CHE", "CHE", 130],
      // Swiss Franc
      "CHF": [ "CHF", "SwF", 2, "CHF"],
      // WIR Franc
      "CHW": [ "CHW", "CHW", 130],
      // Chilean Unidades de Fomento
      "CLF": [ "CLF", "CLF", 128],
      // Chilean Peso
      "CLP": [ "CLP", "Ch$", 0, "CL$"],
      // Chinese Yuan Renminbi
      "CNY": [ "CNY", "Y", 2, "RMB¥"],
      // Colombian Peso
      "COP": [ "COP", "Col$", 2, "COL$"],
      // Unidad de Valor Real
      "COU": [ "COU", "COU", 130],
      // Costa Rican Colon
      "CRC": [ "CRC", "C", 2, "CR₡"],
      // Old Serbian Dinar
      "CSD": [ "CSD", "CSD", 130],
      // Czechoslovak Hard Koruna
      "CSK": [ "CSK", "CSK", 130],
      // Cuban Peso
      "CUP": [ "CUP", "$MN", 2, "$MN"],
      // Cape Verde Escudo
      "CVE": [ "CVE", "CVEsc", 2],
      // Cyprus Pound
      "CYP": [ "CYP", "£C", 130],
      // Czech Republic Koruna
      "CZK": [ "CZK", "Kč", 2, "Kč"],
      // East German Ostmark
      "DDM": [ "DDM", "DDM", 130],
      // Deutsche Mark
      "DEM": [ "DEM", "DEM", 130],
      // Djibouti Franc
      "DJF": [ "DJF", "DF", 0],
      // Danish Krone
      "DKK": [ "DKK", "DKr", 2, "kr"],
      // Dominican Peso
      "DOP": [ "DOP", "RD$", 2, "RD$"],
      // Algerian Dinar
      "DZD": [ "DZD", "DA", 2],
      // Ecuador Sucre
      "ECS": [ "ECS", "ECS", 130],
      // Ecuador Unidad de Valor Constante (UVC)
      "ECV": [ "ECV", "ECV", 130],
      // Estonian Kroon
      "EEK": [ "EEK", "EEK", 2],
      // Egyptian Pound
      "EGP": [ "EGP", "LE", 2, "LE"],
      // Ekwele
      "EQE": [ "EQE", "EQE", 130],
      // Eritrean Nakfa
      "ERN": [ "ERN", "ERN", 2],
      // Spanish Peseta (A account)
      "ESA": [ "ESA", "ESA", 130],
      // Spanish Peseta (convertible account)
      "ESB": [ "ESB", "ESB", 130],
      // Spanish Peseta
      "ESP": [ "ESP", "₧", 128],
      // Ethiopian Birr
      "ETB": [ "ETB", "Br", 2],
      // Euro
      "EUR": [ "EUR", "€", 2, "€"],
      // Finnish Markka
      "FIM": [ "FIM", "FIM", 130],
      // Fiji Dollar
      "FJD": [ "FJD", "F$", 2],
      // Falkland Islands Pound
      "FKP": [ "FKP", "FKP", 2],
      // French Franc
      "FRF": [ "FRF", "FRF", 130],
      // British Pound Sterling
      "GBP": [ "GBP", "£", 2, "GB£"],
      // Georgian Kupon Larit
      "GEK": [ "GEK", "GEK", 130],
      // Georgian Lari
      "GEL": [ "GEL", "lari", 2],
      // Ghana Cedi (1979-2007)
      "GHC": [ "GHC", "GHC", 130],
      // Ghana Cedi
      "GHS": [ "GHS", "GH¢", 2],
      // Gibraltar Pound
      "GIP": [ "GIP", "GIP", 2],
      // Gambia Dalasi
      "GMD": [ "GMD", "GMD", 2],
      // Guinea Franc
      "GNF": [ "GNF", "GF", 0],
      // Guinea Syli
      "GNS": [ "GNS", "GNS", 130],
      // Equatorial Guinea Ekwele Guineana
      "GQE": [ "GQE", "GQE", 130],
      // Greek Drachma
      "GRD": [ "GRD", "GRD", 130],
      // Guatemala Quetzal
      "GTQ": [ "GTQ", "Q", 2],
      // Portuguese Guinea Escudo
      "GWE": [ "GWE", "GWE", 130],
      // Guinea-Bissau Peso
      "GWP": [ "GWP", "GWP", 2],
      // Guyana Dollar
      "GYD": [ "GYD", "G$", 2],
      // Hong Kong Dollar
      "HKD": [ "HKD", "HK$", 2, "HK$"],
      // Honduras Lempira
      "HNL": [ "HNL", "L", 2],
      // Croatian Dinar
      "HRD": [ "HRD", "HRD", 130],
      // Croatian Kuna
      "HRK": [ "HRK", "HRK", 2],
      // Haitian Gourde
      "HTG": [ "HTG", "HTG", 2],
      // Hungarian Forint
      "HUF": [ "HUF", "Ft", 2],
      // Indonesian Rupiah
      "IDR": [ "IDR", "Rp", 2],
      // Irish Pound
      "IEP": [ "IEP", "IR£", 130],
      // Israeli Pound
      "ILP": [ "ILP", "ILP", 130],
      // Israeli New Sheqel
      "ILS": [ "ILS", "IL₪", 2, "IL₪"],
      // Indian Rupee
      "INR": [ "INR", "Rs", 2, "Rs"],
      // Iraqi Dinar
      "IQD": [ "IQD", "ID", 3],
      // Iranian Rial
      "IRR": [ "IRR", "RI", 2],
      // Icelandic Krona
      "ISK": [ "ISK", "kr", 2, "kr"],
      // Italian Lira
      "ITL": [ "ITL", "₤", 128],
      // Jamaican Dollar
      "JMD": [ "JMD", "J$", 2, "JA$"],
      // Jordanian Dinar
      "JOD": [ "JOD", "JD", 3],
      // Japanese Yen
      "JPY": [ "JPY", "¥", 0, "JP¥"],
      // Kenyan Shilling
      "KES": [ "KES", "K Sh", 2],
      // Kyrgystan Som
      "KGS": [ "KGS", "som", 2],
      // Cambodian Riel
      "KHR": [ "KHR", "CR", 2],
      // Comoro Franc
      "KMF": [ "KMF", "CF", 0],
      // North Korean Won
      "KPW": [ "KPW", "KPW", 2],
      // South Korean Won
      "KRW": [ "KRW", "KR₩", 0, "KR₩"],
      // Kuwaiti Dinar
      "KWD": [ "KWD", "KD", 3],
      // Cayman Islands Dollar
      "KYD": [ "KYD", "KYD", 2],
      // Kazakhstan Tenge
      "KZT": [ "KZT", "T", 2],
      // Laotian Kip
      "LAK": [ "LAK", "LAK", 2],
      // Lebanese Pound
      "LBP": [ "LBP", "LL", 2],
      // Sri Lanka Rupee
      "LKR": [ "LKR", "SL Re", 2, "SLRs"],
      // Liberian Dollar
      "LRD": [ "LRD", "LRD", 2],
      // Lesotho Loti
      "LSL": [ "LSL", "M", 130],
      // Maloti
      "LSM": [ "LSM", "LSM", 130],
      // Lithuanian Lita
      "LTL": [ "LTL", "LTL", 2],
      // Lithuanian Talonas
      "LTT": [ "LTT", "LTT", 130],
      // Luxembourg Convertible Franc
      "LUC": [ "LUC", "LUC", 130],
      // Luxembourg Franc
      "LUF": [ "LUF", "LUF", 128],
      // Luxembourg Financial Franc
      "LUL": [ "LUL", "LUL", 130],
      // Latvian Lats
      "LVL": [ "LVL", "LVL", 2],
      // Latvian Ruble
      "LVR": [ "LVR", "LVR", 130],
      // Libyan Dinar
      "LYD": [ "LYD", "LD", 3],
      // Moroccan Dirham
      "MAD": [ "MAD", "MAD", 2],
      // Moroccan Franc
      "MAF": [ "MAF", "MAF", 130],
      // Moldovan Leu
      "MDL": [ "MDL", "MDL", 2],
      // Madagascar Ariary
      "MGA": [ "MGA", "MGA", 0],
      // Madagascar Franc
      "MGF": [ "MGF", "MGF", 128],
      // Macedonian Denar
      "MKD": [ "MKD", "MDen", 2],
      // Mali Franc
      "MLF": [ "MLF", "MLF", 130],
      // Myanmar Kyat
      "MMK": [ "MMK", "MMK", 2],
      // Mongolian Tugrik
      "MNT": [ "MNT", "Tug", 2, "MN₮"],
      // Macao Pataca
      "MOP": [ "MOP", "MOP", 2],
      // Mauritania Ouguiya
      "MRO": [ "MRO", "UM", 2],
      // Maltese Lira
      "MTL": [ "MTL", "Lm", 130],
      // Maltese Pound
      "MTP": [ "MTP", "MTP", 130],
      // Mauritius Rupee
      "MUR": [ "MUR", "MUR", 2],
      // Maldive Islands Rufiyaa
      "MVR": [ "MVR", "MVR", 2],
      // Malawi Kwacha
      "MWK": [ "MWK", "MK", 2],
      // Mexican Peso
      "MXN": [ "MXN", "MEX$", 2, "Mex$"],
      // Mexican Silver Peso (1861-1992)
      "MXP": [ "MXP", "MXP", 130],
      // Mexican Unidad de Inversion (UDI)
      "MXV": [ "MXV", "MXV", 130],
      // Malaysian Ringgit
      "MYR": [ "MYR", "RM", 2, "RM"],
      // Mozambique Escudo
      "MZE": [ "MZE", "MZE", 130],
      // Old Mozambique Metical
      "MZM": [ "MZM", "Mt", 130],
      // Mozambique Metical
      "MZN": [ "MZN", "MTn", 2],
      // Namibia Dollar
      "NAD": [ "NAD", "N$", 130],
      // Nigerian Naira
      "NGN": [ "NGN", "NGN", 2],
      // Nicaraguan Cordoba
      "NIC": [ "NIC", "NIC", 130],
      // Nicaraguan Cordoba Oro
      "NIO": [ "NIO", "NIO", 2],
      // Netherlands Guilder
      "NLG": [ "NLG", "NLG", 130],
      // Norwegian Krone
      "NOK": [ "NOK", "NKr", 2, "NOkr"],
      // Nepalese Rupee
      "NPR": [ "NPR", "Nrs", 2],
      // New Zealand Dollar
      "NZD": [ "NZD", "$NZ", 2],
      // Oman Rial
      "OMR": [ "OMR", "RO", 3],
      // Panamanian Balboa
      "PAB": [ "PAB", "B/.", 2, "B/."],
      // Peruvian Inti
      "PEI": [ "PEI", "PEI", 130],
      // Peruvian Sol Nuevo
      "PEN": [ "PEN", "S/.", 2, "S/."],
      // Peruvian Sol
      "PES": [ "PES", "PES", 130],
      // Papua New Guinea Kina
      "PGK": [ "PGK", "PGK", 2],
      // Philippine Peso
      "PHP": [ "PHP", "Php", 2, "PHP"],
      // Pakistan Rupee
      "PKR": [ "PKR", "Pra", 2, "PKRs."],
      // Polish Zloty
      "PLN": [ "PLN", "Zl", 2],
      // Polish Zloty (1950-1995)
      "PLZ": [ "PLZ", "PLZ", 130],
      // Portuguese Escudo
      "PTE": [ "PTE", "PTE", 130],
      // Paraguay Guarani
      "PYG": [ "PYG", "PYG", 0],
      // Qatari Rial
      "QAR": [ "QAR", "QR", 2],
      // Rhodesian Dollar
      "RHD": [ "RHD", "RHD", 130],
      // Old Romanian Leu
      "ROL": [ "ROL", "Old lei", 130],
      // Romanian Leu
      "RON": [ "RON", "lei", 2],
      // Serbian Dinar
      "RSD": [ "RSD", "RSD", 2],
      // Russian Ruble
      "RUB": [ "RUB", "руб", 2, "руб"],
      // Russian Ruble (1991-1998)
      "RUR": [ "RUR", "RUR", 130],
      // Rwandan Franc
      "RWF": [ "RWF", "RWF", 0],
      // Saudi Riyal
      "SAR": [ "SAR", "SRl", 2, "SR"],
      // Solomon Islands Dollar
      "SBD": [ "SBD", "SI$", 2],
      // Seychelles Rupee
      "SCR": [ "SCR", "SR", 2],
      // Old Sudanese Dinar
      "SDD": [ "SDD", "SDD", 130],
      // Sudanese Pound
      "SDG": [ "SDG", "SDG", 2],
      // Old Sudanese Pound
      "SDP": [ "SDP", "SDP", 130],
      // Swedish Krona
      "SEK": [ "SEK", "SKr", 2, "kr"],
      // Singapore Dollar
      "SGD": [ "SGD", "S$", 2, "S$"],
      // Saint Helena Pound
      "SHP": [ "SHP", "SHP", 2],
      // Slovenia Tolar
      "SIT": [ "SIT", "SIT", 130],
      // Slovak Koruna
      "SKK": [ "SKK", "Sk", 2],
      // Sierra Leone Leone
      "SLL": [ "SLL", "SLL", 2],
      // Somali Shilling
      "SOS": [ "SOS", "So. Sh.", 2],
      // Surinam Dollar
      "SRD": [ "SRD", "SRD", 2],
      // Suriname Guilder
      "SRG": [ "SRG", "Sf", 130],
      // Sao Tome and Principe Dobra
      "STD": [ "STD", "Db", 2],
      // Soviet Rouble
      "SUR": [ "SUR", "SUR", 130],
      // El Salvador Colon
      "SVC": [ "SVC", "SVC", 2],
      // Syrian Pound
      "SYP": [ "SYP", "LS", 2],
      // Swaziland Lilangeni
      "SZL": [ "SZL", "E", 2],
      // Thai Baht
      "THB": [ "THB", "THB", 2, "THB"],
      // Tajikistan Ruble
      "TJR": [ "TJR", "TJR", 130],
      // Tajikistan Somoni
      "TJS": [ "TJS", "TJS", 2],
      // Turkmenistan Manat
      "TMM": [ "TMM", "TMM", 2],
      // Tunisian Dinar
      "TND": [ "TND", "TND", 3],
      // Tonga Paʻanga
      "TOP": [ "TOP", "T$", 2],
      // Timor Escudo
      "TPE": [ "TPE", "TPE", 130],
      // Turkish Lira
      "TRL": [ "TRL", "TL", 128],
      // New Turkish Lira
      "TRY": [ "TRY", "YTL", 2, "YTL"],
      // Trinidad and Tobago Dollar
      "TTD": [ "TTD", "TT$", 2],
      // Taiwan New Dollar
      "TWD": [ "TWD", "NT$", 2, "NT$"],
      // Tanzanian Shilling
      "TZS": [ "TZS", "T Sh", 2],
      // Ukrainian Hryvnia
      "UAH": [ "UAH", "UAH", 2],
      // Ukrainian Karbovanetz
      "UAK": [ "UAK", "UAK", 130],
      // Ugandan Shilling (1966-1987)
      "UGS": [ "UGS", "UGS", 130],
      // Ugandan Shilling
      "UGX": [ "UGX", "U Sh", 2],
      // US Dollar
      "USD": [ "USD", "$", 2, "US$"],
      // US Dollar (Next day)
      "USN": [ "USN", "USN", 130],
      // US Dollar (Same day)
      "USS": [ "USS", "USS", 130],
      // Uruguay Peso en Unidades Indexadas
      "UYI": [ "UYI", "UYI", 130],
      // Uruguay Peso (1975-1993)
      "UYP": [ "UYP", "UYP", 130],
      // Uruguay Peso Uruguayo
      "UYU": [ "UYU", "Ur$", 2, "UY$"],
      // Uzbekistan Sum
      "UZS": [ "UZS", "UZS", 2],
      // Venezuelan Bolivar
      "VEB": [ "VEB", "Be", 130],
      // Venezuelan Bolivar Fuerte
      "VEF": [ "VEF", "BsF", 2],
      // Vietnamese Dong
      "VND": [ "VND", "₫", 26, "₫"],
      // Vanuatu Vatu
      "VUV": [ "VUV", "VT", 0],
      // Western Samoa Tala
      "WST": [ "WST", "WST", 2],
      // CFA Franc BEAC
      "XAF": [ "XAF", "XAF", 0],
      // Silver
      "XAG": [ "XAG", "XAG", 130],
      // Gold
      "XAU": [ "XAU", "XAU", 130],
      // European Composite Unit
      "XBA": [ "XBA", "XBA", 130],
      // European Monetary Unit
      "XBB": [ "XBB", "XBB", 130],
      // European Unit of Account (XBC)
      "XBC": [ "XBC", "XBC", 130],
      // European Unit of Account (XBD)
      "XBD": [ "XBD", "XBD", 130],
      // East Caribbean Dollar
      "XCD": [ "XCD", "EC$", 2],
      // Special Drawing Rights
      "XDR": [ "XDR", "XDR", 130],
      // European Currency Unit
      "XEU": [ "XEU", "XEU", 130],
      // French Gold Franc
      "XFO": [ "XFO", "XFO", 130],
      // French UIC-Franc
      "XFU": [ "XFU", "XFU", 130],
      // CFA Franc BCEAO
      "XOF": [ "XOF", "XOF", 0],
      // Palladium
      "XPD": [ "XPD", "XPD", 130],
      // CFP Franc
      "XPF": [ "XPF", "CFPF", 0],
      // Platinum
      "XPT": [ "XPT", "XPT", 130],
      // RINET Funds
      "XRE": [ "XRE", "XRE", 130],
      // Testing Currency Code
      "XTS": [ "XTS", "XTS", 130],
      // Unknown or Invalid Currency
      "XXX": [ "XXX", "XXX", 130],
      // Yemeni Dinar
      "YDD": [ "YDD", "YDD", 130],
      // Yemeni Rial
      "YER": [ "YER", "YRl", 2, "YER"],
      // Yugoslavian Hard Dinar
      "YUD": [ "YUD", "YUD", 130],
      // Yugoslavian Noviy Dinar
      "YUM": [ "YUM", "YUM", 130],
      // Yugoslavian Convertible Dinar
      "YUN": [ "YUN", "YUN", 130],
      // South African Rand (financial)
      "ZAL": [ "ZAL", "ZAL", 130],
      // South African Rand
      "ZAR": [ "ZAR", "R", 2, "ZAR"],
      // Zambian Kwacha
      "ZMK": [ "ZMK", "ZMK", 2],
      // Zairean New Zaire
      "ZRN": [ "ZRN", "ZRN", 130],
      // Zairean Zaire
      "ZRZ": [ "ZRZ", "ZRZ", 130],
      // Zimbabwe Dollar
      "ZWD": [ "ZWD", "Z$", 2],
    });
  }-*/;
  
  private void loadSuperNamesMap() {
    super.loadNamesMap();
  }
  
  @Override
  protected native void loadNamesMap() /*-{
    this.@com.google.gwt.i18n.client.CurrencyList_en::loadSuperNamesMap()();
    this.@com.google.gwt.i18n.client.CurrencyList_en::overrideNamesMap(Lcom/google/gwt/core/client/JavaScriptObject;)({
      "ADP": "Andorran Peseta",
      "AED": "United Arab Emirates Dirham",
      "AFA": "Afghani (1927-2002)",
      "AFN": "Afghani",
      "ALL": "Albanian Lek",
      "AMD": "Armenian Dram",
      "ANG": "Netherlands Antillan Guilder",
      "AOA": "Angolan Kwanza",
      "AOK": "Angolan Kwanza (1977-1990)",
      "AON": "Angolan New Kwanza (1990-2000)",
      "AOR": "Angolan Kwanza Reajustado (1995-1999)",
      "ARA": "Argentine Austral",
      "ARP": "Argentine Peso (1983-1985)",
      "ARS": "Argentine Peso",
      "ATS": "Austrian Schilling",
      "AUD": "Australian Dollar",
      "AWG": "Aruban Guilder",
      "AZM": "Azerbaijanian Manat (1993-2006)",
      "AZN": "Azerbaijanian Manat",
      "BAD": "Bosnia-Herzegovina Dinar",
      "BAM": "Bosnia-Herzegovina Convertible Mark",
      "BBD": "Barbados Dollar",
      "BDT": "Bangladesh Taka",
      "BEC": "Belgian Franc (convertible)",
      "BEF": "Belgian Franc",
      "BEL": "Belgian Franc (financial)",
      "BGL": "Bulgarian Hard Lev",
      "BGN": "Bulgarian New Lev",
      "BHD": "Bahraini Dinar",
      "BIF": "Burundi Franc",
      "BMD": "Bermudan Dollar",
      "BND": "Brunei Dollar",
      "BOB": "Boliviano",
      "BOP": "Bolivian Peso",
      "BOV": "Bolivian Mvdol",
      "BRB": "Brazilian Cruzeiro Novo (1967-1986)",
      "BRC": "Brazilian Cruzado",
      "BRE": "Brazilian Cruzeiro (1990-1993)",
      "BRL": "Brazilian Real",
      "BRN": "Brazilian Cruzado Novo",
      "BRR": "Brazilian Cruzeiro",
      "BSD": "Bahamian Dollar",
      "BTN": "Bhutan Ngultrum",
      "BUK": "Burmese Kyat",
      "BWP": "Botswanan Pula",
      "BYB": "Belarussian New Ruble (1994-1999)",
      "BYR": "Belarussian Ruble",
      "BZD": "Belize Dollar",
      "CAD": "Canadian Dollar",
      "CDF": "Congolese Franc Congolais",
      "CHE": "WIR Euro",
      "CHF": "Swiss Franc",
      "CHW": "WIR Franc",
      "CLF": "Chilean Unidades de Fomento",
      "CLP": "Chilean Peso",
      "CNY": "Chinese Yuan Renminbi",
      "COP": "Colombian Peso",
      "COU": "Unidad de Valor Real",
      "CRC": "Costa Rican Colon",
      "CSD": "Old Serbian Dinar",
      "CSK": "Czechoslovak Hard Koruna",
      "CUP": "Cuban Peso",
      "CVE": "Cape Verde Escudo",
      "CYP": "Cyprus Pound",
      "CZK": "Czech Republic Koruna",
      "DDM": "East German Ostmark",
      "DEM": "Deutsche Mark",
      "DJF": "Djibouti Franc",
      "DKK": "Danish Krone",
      "DOP": "Dominican Peso",
      "DZD": "Algerian Dinar",
      "ECS": "Ecuador Sucre",
      "ECV": "Ecuador Unidad de Valor Constante (UVC)",
      "EEK": "Estonian Kroon",
      "EGP": "Egyptian Pound",
      "EQE": "Ekwele",
      "ERN": "Eritrean Nakfa",
      "ESA": "Spanish Peseta (A account)",
      "ESB": "Spanish Peseta (convertible account)",
      "ESP": "Spanish Peseta",
      "ETB": "Ethiopian Birr",
      "EUR": "Euro",
      "FIM": "Finnish Markka",
      "FJD": "Fiji Dollar",
      "FKP": "Falkland Islands Pound",
      "FRF": "French Franc",
      "GBP": "British Pound Sterling",
      "GEK": "Georgian Kupon Larit",
      "GEL": "Georgian Lari",
      "GHC": "Ghana Cedi (1979-2007)",
      "GHS": "Ghana Cedi",
      "GIP": "Gibraltar Pound",
      "GMD": "Gambia Dalasi",
      "GNF": "Guinea Franc",
      "GNS": "Guinea Syli",
      "GQE": "Equatorial Guinea Ekwele Guineana",
      "GRD": "Greek Drachma",
      "GTQ": "Guatemala Quetzal",
      "GWE": "Portuguese Guinea Escudo",
      "GWP": "Guinea-Bissau Peso",
      "GYD": "Guyana Dollar",
      "HKD": "Hong Kong Dollar",
      "HNL": "Honduras Lempira",
      "HRD": "Croatian Dinar",
      "HRK": "Croatian Kuna",
      "HTG": "Haitian Gourde",
      "HUF": "Hungarian Forint",
      "IDR": "Indonesian Rupiah",
      "IEP": "Irish Pound",
      "ILP": "Israeli Pound",
      "ILS": "Israeli New Sheqel",
      "INR": "Indian Rupee",
      "IQD": "Iraqi Dinar",
      "IRR": "Iranian Rial",
      "ISK": "Icelandic Krona",
      "ITL": "Italian Lira",
      "JMD": "Jamaican Dollar",
      "JOD": "Jordanian Dinar",
      "JPY": "Japanese Yen",
      "KES": "Kenyan Shilling",
      "KGS": "Kyrgystan Som",
      "KHR": "Cambodian Riel",
      "KMF": "Comoro Franc",
      "KPW": "North Korean Won",
      "KRW": "South Korean Won",
      "KWD": "Kuwaiti Dinar",
      "KYD": "Cayman Islands Dollar",
      "KZT": "Kazakhstan Tenge",
      "LAK": "Laotian Kip",
      "LBP": "Lebanese Pound",
      "LKR": "Sri Lanka Rupee",
      "LRD": "Liberian Dollar",
      "LSL": "Lesotho Loti",
      "LSM": "Maloti",
      "LTL": "Lithuanian Lita",
      "LTT": "Lithuanian Talonas",
      "LUC": "Luxembourg Convertible Franc",
      "LUF": "Luxembourg Franc",
      "LUL": "Luxembourg Financial Franc",
      "LVL": "Latvian Lats",
      "LVR": "Latvian Ruble",
      "LYD": "Libyan Dinar",
      "MAD": "Moroccan Dirham",
      "MAF": "Moroccan Franc",
      "MDL": "Moldovan Leu",
      "MGA": "Madagascar Ariary",
      "MGF": "Madagascar Franc",
      "MKD": "Macedonian Denar",
      "MLF": "Mali Franc",
      "MMK": "Myanmar Kyat",
      "MNT": "Mongolian Tugrik",
      "MOP": "Macao Pataca",
      "MRO": "Mauritania Ouguiya",
      "MTL": "Maltese Lira",
      "MTP": "Maltese Pound",
      "MUR": "Mauritius Rupee",
      "MVR": "Maldive Islands Rufiyaa",
      "MWK": "Malawi Kwacha",
      "MXN": "Mexican Peso",
      "MXP": "Mexican Silver Peso (1861-1992)",
      "MXV": "Mexican Unidad de Inversion (UDI)",
      "MYR": "Malaysian Ringgit",
      "MZE": "Mozambique Escudo",
      "MZM": "Old Mozambique Metical",
      "MZN": "Mozambique Metical",
      "NAD": "Namibia Dollar",
      "NGN": "Nigerian Naira",
      "NIC": "Nicaraguan Cordoba",
      "NIO": "Nicaraguan Cordoba Oro",
      "NLG": "Netherlands Guilder",
      "NOK": "Norwegian Krone",
      "NPR": "Nepalese Rupee",
      "NZD": "New Zealand Dollar",
      "OMR": "Oman Rial",
      "PAB": "Panamanian Balboa",
      "PEI": "Peruvian Inti",
      "PEN": "Peruvian Sol Nuevo",
      "PES": "Peruvian Sol",
      "PGK": "Papua New Guinea Kina",
      "PHP": "Philippine Peso",
      "PKR": "Pakistan Rupee",
      "PLN": "Polish Zloty",
      "PLZ": "Polish Zloty (1950-1995)",
      "PTE": "Portuguese Escudo",
      "PYG": "Paraguay Guarani",
      "QAR": "Qatari Rial",
      "RHD": "Rhodesian Dollar",
      "ROL": "Old Romanian Leu",
      "RON": "Romanian Leu",
      "RSD": "Serbian Dinar",
      "RUB": "Russian Ruble",
      "RUR": "Russian Ruble (1991-1998)",
      "RWF": "Rwandan Franc",
      "SAR": "Saudi Riyal",
      "SBD": "Solomon Islands Dollar",
      "SCR": "Seychelles Rupee",
      "SDD": "Old Sudanese Dinar",
      "SDG": "Sudanese Pound",
      "SDP": "Old Sudanese Pound",
      "SEK": "Swedish Krona",
      "SGD": "Singapore Dollar",
      "SHP": "Saint Helena Pound",
      "SIT": "Slovenia Tolar",
      "SKK": "Slovak Koruna",
      "SLL": "Sierra Leone Leone",
      "SOS": "Somali Shilling",
      "SRD": "Surinam Dollar",
      "SRG": "Suriname Guilder",
      "STD": "Sao Tome and Principe Dobra",
      "SUR": "Soviet Rouble",
      "SVC": "El Salvador Colon",
      "SYP": "Syrian Pound",
      "SZL": "Swaziland Lilangeni",
      "THB": "Thai Baht",
      "TJR": "Tajikistan Ruble",
      "TJS": "Tajikistan Somoni",
      "TMM": "Turkmenistan Manat",
      "TND": "Tunisian Dinar",
      "TOP": "Tonga Paʻanga",
      "TPE": "Timor Escudo",
      "TRL": "Turkish Lira",
      "TRY": "New Turkish Lira",
      "TTD": "Trinidad and Tobago Dollar",
      "TWD": "Taiwan New Dollar",
      "TZS": "Tanzanian Shilling",
      "UAH": "Ukrainian Hryvnia",
      "UAK": "Ukrainian Karbovanetz",
      "UGS": "Ugandan Shilling (1966-1987)",
      "UGX": "Ugandan Shilling",
      "USD": "US Dollar",
      "USN": "US Dollar (Next day)",
      "USS": "US Dollar (Same day)",
      "UYI": "Uruguay Peso en Unidades Indexadas",
      "UYP": "Uruguay Peso (1975-1993)",
      "UYU": "Uruguay Peso Uruguayo",
      "UZS": "Uzbekistan Sum",
      "VEB": "Venezuelan Bolivar",
      "VEF": "Venezuelan Bolivar Fuerte",
      "VND": "Vietnamese Dong",
      "VUV": "Vanuatu Vatu",
      "WST": "Western Samoa Tala",
      "XAF": "CFA Franc BEAC",
      "XAG": "Silver",
      "XAU": "Gold",
      "XBA": "European Composite Unit",
      "XBB": "European Monetary Unit",
      "XBC": "European Unit of Account (XBC)",
      "XBD": "European Unit of Account (XBD)",
      "XCD": "East Caribbean Dollar",
      "XDR": "Special Drawing Rights",
      "XEU": "European Currency Unit",
      "XFO": "French Gold Franc",
      "XFU": "French UIC-Franc",
      "XOF": "CFA Franc BCEAO",
      "XPD": "Palladium",
      "XPF": "CFP Franc",
      "XPT": "Platinum",
      "XRE": "RINET Funds",
      "XTS": "Testing Currency Code",
      "XXX": "Unknown or Invalid Currency",
      "YDD": "Yemeni Dinar",
      "YER": "Yemeni Rial",
      "YUD": "Yugoslavian Hard Dinar",
      "YUM": "Yugoslavian Noviy Dinar",
      "YUN": "Yugoslavian Convertible Dinar",
      "ZAL": "South African Rand (financial)",
      "ZAR": "South African Rand",
      "ZMK": "Zambian Kwacha",
      "ZRN": "Zairean New Zaire",
      "ZRZ": "Zairean Zaire",
      "ZWD": "Zimbabwe Dollar",
    });
  }-*/;
  
  @Override
  public native CurrencyData getDefault() /*-{
    return [ "USD", "$", 2, "US$"];
  }-*/;
}
