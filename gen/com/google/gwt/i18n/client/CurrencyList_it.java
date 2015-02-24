package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.i18n.client.CurrencyList;

public class CurrencyList_it extends com.google.gwt.i18n.client.CurrencyList_ {
  
  private void loadSuperCurrencyMap() {
    super.loadCurrencyMap();
  }
  
  @Override
  protected native void loadCurrencyMap() /*-{
    this.@com.google.gwt.i18n.client.CurrencyList_it::loadSuperCurrencyMap()();
    this.@com.google.gwt.i18n.client.CurrencyList_it::overrideCurrencyMap(Lcom/google/gwt/core/client/JavaScriptObject;)({
      // Peseta Andorrana
      "ADP": [ "ADP", "ADP", 128],
      // Dirham degli Emirati Arabi Uniti
      "AED": [ "AED", "DH", 2, "DH"],
      // Afgani (1927-2002)
      "AFA": [ "AFA", "AFA", 130],
      // Afgani
      "AFN": [ "AFN", "Af", 2],
      // Lek Albanese
      "ALL": [ "ALL", "lek", 2],
      // Dram Armeno
      "AMD": [ "AMD", "dram", 2],
      // Fiorino delle Antille Olandesi
      "ANG": [ "ANG", "ANG", 2],
      // Kwanza Angolano
      "AOA": [ "AOA", "AOA", 2],
      // Kwanza Angolano (1977-1990)
      "AOK": [ "AOK", "AOK", 130],
      // Nuovo Kwanza Angolano (1990-2000)
      "AON": [ "AON", "AON", 130],
      // Kwanza Reajustado Angolano (1995-1999)
      "AOR": [ "AOR", "AOR", 130],
      // Austral Argentino
      "ARA": [ "ARA", "ARA", 130],
      // Peso Argentino (vecchio Cod.)
      "ARP": [ "ARP", "ARP", 130],
      // Peso Argentino
      "ARS": [ "ARS", "AR$", 2, "AR$"],
      // Scellino Austriaco
      "ATS": [ "ATS", "ATS", 130],
      // Dollaro Australiano
      "AUD": [ "AUD", "AU$", 2, "AU$"],
      // Fiorino di Aruba
      "AWG": [ "AWG", "AWG", 2],
      // Manat Azero
      "AZM": [ "AZM", "AZM", 130],
      // Manat azero
      "AZN": [ "AZN", "AZN", 2],
      // Dinar Bosnia-Herzegovina
      "BAD": [ "BAD", "BAD", 130],
      // Marco Conv. Bosnia-Erzegovina
      "BAM": [ "BAM", "KM", 2],
      // Dollaro di Barbados
      "BBD": [ "BBD", "BDS$", 2],
      // Taka Bangladese
      "BDT": [ "BDT", "Tk", 2, "Tk"],
      // Franco Belga (convertibile)
      "BEC": [ "BEC", "BEC", 130],
      // Franco Belga
      "BEF": [ "BEF", "BEF", 130],
      // Franco Belga (finanziario)
      "BEL": [ "BEL", "BEL", 130],
      // Lev Bulgaro
      "BGL": [ "BGL", "BGL", 130],
      // Nuovo Lev Bulgaro
      "BGN": [ "BGN", "lev", 2],
      // Dinaro del Bahraini
      "BHD": [ "BHD", "BD", 3],
      // Franco del Burundi
      "BIF": [ "BIF", "Fbu", 0],
      // Dollaro delle Bermuda
      "BMD": [ "BMD", "Ber$", 2],
      // Dollaro del Brunei
      "BND": [ "BND", "BND", 2],
      // Boliviano
      "BOB": [ "BOB", "BOB", 2],
      // Peso Boliviano
      "BOP": [ "BOP", "BOP", 130],
      // Mvdol Boliviano
      "BOV": [ "BOV", "BOV", 130],
      // Cruzeiro Novo Brasiliano (1967-1986)
      "BRB": [ "BRB", "BRB", 130],
      // Cruzado Brasiliano
      "BRC": [ "BRC", "BRC", 130],
      // Cruzeiro Brasiliano (1990-1993)
      "BRE": [ "BRE", "BRE", 130],
      // Real Brasiliano
      "BRL": [ "BRL", "R$", 2, "R$"],
      // Cruzado Novo Brasiliano
      "BRN": [ "BRN", "BRN", 130],
      // Cruzeiro Brasiliano
      "BRR": [ "BRR", "BRR", 130],
      // Dollaro delle Bahamas
      "BSD": [ "BSD", "BSD", 2],
      // Ngultrum Butanese
      "BTN": [ "BTN", "Nu", 130],
      // Kyat Birmano
      "BUK": [ "BUK", "BUK", 130],
      // Pula del Botswana
      "BWP": [ "BWP", "BWP", 2],
      // Nuovo Rublo Bielorussia (1994-1999)
      "BYB": [ "BYB", "BYB", 130],
      // Rublo Bielorussia
      "BYR": [ "BYR", "Rbl", 0],
      // Dollaro Belize
      "BZD": [ "BZD", "BZ$", 2],
      // Dollaro Canadese
      "CAD": [ "CAD", "C$", 2, "C$"],
      // Franco Congolese
      "CDF": [ "CDF", "CDF", 2],
      // Franco Svizzero
      "CHF": [ "CHF", "SFr.", 2, "CHF"],
      // Unidades de Fomento Chilene
      "CLF": [ "CLF", "CLF", 128],
      // Peso Cileno
      "CLP": [ "CLP", "CL$", 0, "CL$"],
      // Renmimbi Cinese
      "CNY": [ "CNY", "RMB¥", 2, "RMB¥"],
      // Peso Colombiano
      "COP": [ "COP", "Col$", 2, "COL$"],
      // Colón Costaricano
      "CRC": [ "CRC", "C", 2, "CR₡"],
      // Antico Dinaro serbo
      "CSD": [ "CSD", "CSD", 130],
      // Corona forte cecoslovacca
      "CSK": [ "CSK", "CSK", 130],
      // Peso Cubano
      "CUP": [ "CUP", "$MN", 2, "$MN"],
      // Escudo del Capo Verde
      "CVE": [ "CVE", "CVEsc", 2],
      // Sterlina Cipriota
      "CYP": [ "CYP", "CYP", 130],
      // Corona Ceca
      "CZK": [ "CZK", "Kč", 2, "Kč"],
      // Ostmark della Germania Orientale
      "DDM": [ "DDM", "DDM", 130],
      // Marco Tedesco
      "DEM": [ "DEM", "DEM", 130],
      // Franco Gibutiano
      "DJF": [ "DJF", "DF", 0],
      // Corona Danese
      "DKK": [ "DKK", "kr", 2, "kr"],
      // Peso Dominicano
      "DOP": [ "DOP", "RD$", 2, "RD$"],
      // Dinaro Algerino
      "DZD": [ "DZD", "DA", 2],
      // Sucre dell’Ecuador
      "ECS": [ "ECS", "ECS", 130],
      // Unidad de Valor Constante (UVC) dell’Ecuador
      "ECV": [ "ECV", "ECV", 130],
      // Corona dell’Estonia
      "EEK": [ "EEK", "EEK", 2],
      // Sterlina Egiziana
      "EGP": [ "EGP", "LE", 2, "LE"],
      // Nakfa Eritreo
      "ERN": [ "ERN", "ERN", 2],
      // Peseta Spagnola account
      "ESA": [ "ESA", "ESA", 130],
      // Peseta Spagnola account convertibile
      "ESB": [ "ESB", "ESB", 130],
      // Peseta Spagnola
      "ESP": [ "ESP", "ESP", 128],
      // Birr Etiopico
      "ETB": [ "ETB", "Br", 2],
      // Euro
      "EUR": [ "EUR", "€", 2, "€"],
      // Markka Finlandese
      "FIM": [ "FIM", "FIM", 130],
      // Dollaro delle Figi
      "FJD": [ "FJD", "F$", 2],
      // Sterlina delle Falkland
      "FKP": [ "FKP", "FKP", 2],
      // Franco Francese
      "FRF": [ "FRF", "FRF", 130],
      // Sterlina Inglese
      "GBP": [ "GBP", "GB£", 2, "GB£"],
      // Kupon Larit Georgiano
      "GEK": [ "GEK", "GEK", 130],
      // Lari Georgiano
      "GEL": [ "GEL", "lari", 2],
      // Cedi del Ghana
      "GHC": [ "GHC", "GHC", 130],
      // Sterlina di Gibilterra
      "GIP": [ "GIP", "GIP", 2],
      // Dalasi del Gambia
      "GMD": [ "GMD", "GMD", 2],
      // Franco della Guinea
      "GNF": [ "GNF", "GF", 0],
      // Syli della Guinea
      "GNS": [ "GNS", "GNS", 130],
      // Ekwele della Guinea Equatoriale
      "GQE": [ "GQE", "GQE", 130],
      // Dracma Greca
      "GRD": [ "GRD", "GRD", 130],
      // Quetzal Guatemalteco
      "GTQ": [ "GTQ", "Q", 2],
      // Escudo della Guinea portoghese
      "GWE": [ "GWE", "GWE", 130],
      // Peso della Guinea-Bissau
      "GWP": [ "GWP", "GWP", 2],
      // Dollaro della Guyana
      "GYD": [ "GYD", "G$", 2],
      // Dollaro di Hong Kong
      "HKD": [ "HKD", "HK$", 2, "HK$"],
      // Lempira Hoduregno
      "HNL": [ "HNL", "L", 2],
      // Dinaro Croato
      "HRD": [ "HRD", "HRD", 130],
      // Kuna Croata
      "HRK": [ "HRK", "HRK", 2],
      // Gourde Haitiano
      "HTG": [ "HTG", "HTG", 2],
      // Fiorino Ungherese
      "HUF": [ "HUF", "HUF", 2],
      // Rupia Indonesiana
      "IDR": [ "IDR", "Rp", 2],
      // Lira Irlandese
      "IEP": [ "IEP", "IR£", 130],
      // Sterlina Israeliana
      "ILP": [ "ILP", "ILP", 130],
      // Nuovo sheqel israeliano
      "ILS": [ "ILS", "IL₪", 2, "IL₪"],
      // Rupia Indiana
      "INR": [ "INR", "Rs", 2, "Rs"],
      // Dinaro Iracheno
      "IQD": [ "IQD", "ID", 3],
      // Rial Iraniano
      "IRR": [ "IRR", "RI", 2],
      // Corona Islandese
      "ISK": [ "ISK", "kr", 2, "kr"],
      // Lira Italiana
      "ITL": [ "ITL", "₤", 128],
      // Dollaro Giamaicano
      "JMD": [ "JMD", "J$", 2, "JA$"],
      // Dinaro Giordano
      "JOD": [ "JOD", "JOD", 3],
      // Yen Giapponese
      "JPY": [ "JPY", "JP¥", 0, "JP¥"],
      // Scellino Keniota
      "KES": [ "KES", "K Sh", 2],
      // Som  Kirghiso
      "KGS": [ "KGS", "som", 2],
      // Riel Cambogiano
      "KHR": [ "KHR", "CR", 2],
      // Franco Comoriano
      "KMF": [ "KMF", "CF", 0],
      // Won Nordcoreano
      "KPW": [ "KPW", "KPW", 2],
      // Won Sudcoreano
      "KRW": [ "KRW", "KR₩", 0, "KR₩"],
      // Dinaro Kuwaitiano
      "KWD": [ "KWD", "KD", 3],
      // Dollaro delle Isole Cayman
      "KYD": [ "KYD", "KYD", 2],
      // Tenge Kazaco
      "KZT": [ "KZT", "T", 2],
      // Kip Laotiano
      "LAK": [ "LAK", "LAK", 2],
      // Sterlina Libanese
      "LBP": [ "LBP", "LL", 2],
      // Rupia di Sri Lanka
      "LKR": [ "LKR", "SL Re", 2, "SLRs"],
      // Dollaro Liberiano
      "LRD": [ "LRD", "LRD", 2],
      // Loti del Lesotho
      "LSL": [ "LSL", "M", 130],
      // Maloti
      "LSM": [ "LSM", "LSM", 130],
      // Lita Lituana
      "LTL": [ "LTL", "LTL", 2],
      // Talonas Lituani
      "LTT": [ "LTT", "LTT", 130],
      // Franco convertibile del Lussemburgo
      "LUC": [ "LUC", "LUC", 130],
      // Franco del Lussemburgo
      "LUF": [ "LUF", "LUF", 128],
      // Franco finanziario del Lussemburgo
      "LUL": [ "LUL", "LUL", 130],
      // Lat Lettone
      "LVL": [ "LVL", "LVL", 2],
      // Rublo Lettone
      "LVR": [ "LVR", "LVR", 130],
      // Dinaro Libico
      "LYD": [ "LYD", "LD", 3],
      // Dirham Marocchino
      "MAD": [ "MAD", "MAD", 2],
      // Franco Marocchino
      "MAF": [ "MAF", "MAF", 130],
      // Leu Moldavo
      "MDL": [ "MDL", "MDL", 2],
      // Ariary Malgascio
      "MGA": [ "MGA", "MGA", 0],
      // Franco Malgascio
      "MGF": [ "MGF", "MGF", 128],
      // Dinaro Macedone
      "MKD": [ "MKD", "MDen", 2],
      // Franco di Mali
      "MLF": [ "MLF", "MLF", 130],
      // Kyat di Myanmar
      "MMK": [ "MMK", "MMK", 2],
      // Tugrik Mongolo
      "MNT": [ "MNT", "Tug", 2, "MN₮"],
      // Pataca di Macao
      "MOP": [ "MOP", "MOP", 2],
      // Ouguiya della Mauritania
      "MRO": [ "MRO", "UM", 2],
      // Lira Maltese
      "MTL": [ "MTL", "Lm", 130],
      // Sterlina Maltese
      "MTP": [ "MTP", "MTP", 130],
      // Rupia Mauriziana
      "MUR": [ "MUR", "MUR", 2],
      // Rufiyaa delle Maldive
      "MVR": [ "MVR", "MVR", 2],
      // Kwacha Malawiano
      "MWK": [ "MWK", "MK", 2],
      // Peso Messicano
      "MXN": [ "MXN", "MEX$", 2, "Mex$"],
      // Peso messicano d’argento (1861-1992)
      "MXP": [ "MXP", "MXP", 130],
      // Unidad de Inversion (UDI) Messicana
      "MXV": [ "MXV", "MXV", 130],
      // Ringgit della Malesia
      "MYR": [ "MYR", "RM", 2, "RM"],
      // Escudo del Mozambico
      "MZE": [ "MZE", "MZE", 130],
      // Metical del Mozambico
      "MZM": [ "MZM", "Mt", 130],
      // Nuovo metical del Mozambico
      "MZN": [ "MZN", "MZN", 2],
      // Dollaro Namibiano
      "NAD": [ "NAD", "N$", 130],
      // Naira Nigeriana
      "NGN": [ "NGN", "NGN", 2],
      // Cordoba Nicaraguense
      "NIC": [ "NIC", "NIC", 130],
      // Córdoba oro nicaraguense
      "NIO": [ "NIO", "NIO", 2],
      // Fiorino Olandese
      "NLG": [ "NLG", "NLG", 130],
      // Corona Norvegese
      "NOK": [ "NOK", "NOkr", 2, "NOkr"],
      // Rupia Nepalese
      "NPR": [ "NPR", "Nrs", 2],
      // Dollaro Neozelandese
      "NZD": [ "NZD", "$NZ", 2],
      // Rial Omanita
      "OMR": [ "OMR", "RO", 3],
      // Balboa di Panama
      "PAB": [ "PAB", "B/.", 2, "B/."],
      // Inti Peruviano
      "PEI": [ "PEI", "PEI", 130],
      // Sol Nuevo Peruviano
      "PEN": [ "PEN", "S/.", 2, "S/."],
      // Sol Peruviano
      "PES": [ "PES", "PES", 130],
      // Kina della Papua Nuova Guinea
      "PGK": [ "PGK", "PGK", 2],
      // Peso delle Filippine
      "PHP": [ "PHP", "PHP", 2, "PHP"],
      // Rupia del Pakistan
      "PKR": [ "PKR", "Pra", 2, "PKRs."],
      // Zloty Polacco
      "PLN": [ "PLN", "Zl", 2],
      // Zloty Polacco (1950-1995)
      "PLZ": [ "PLZ", "PLZ", 130],
      // Escudo Portoghese
      "PTE": [ "PTE", "PTE", 130],
      // Guarani del Paraguay
      "PYG": [ "PYG", "PYG", 0],
      // Rial del Qatar
      "QAR": [ "QAR", "QR", 2],
      // Dollaro della Rhodesia
      "RHD": [ "RHD", "RHD", 130],
      // Leu della Romania
      "ROL": [ "ROL", "ROL", 130],
      // Leu rumeno
      "RON": [ "RON", "RON", 2],
      // Dinaro serbo
      "RSD": [ "RSD", "RSD", 2],
      // Rublo Russo
      "RUB": [ "RUB", "руб", 2, "руб"],
      // Rublo della CSI
      "RUR": [ "RUR", "RUR", 130],
      // Franco Ruandese
      "RWF": [ "RWF", "RWF", 0],
      // Ryal Saudita
      "SAR": [ "SAR", "SR", 2, "SR"],
      // Dollaro delle Isole Solomon
      "SBD": [ "SBD", "SI$", 2],
      // Rupia delle Seychelles
      "SCR": [ "SCR", "SR", 2],
      // Dinaro Sudanese
      "SDD": [ "SDD", "SDD", 130],
      // Sterlina Sudanese
      "SDP": [ "SDP", "SDP", 130],
      // Corona Svedese
      "SEK": [ "SEK", "kr", 2, "kr"],
      // Dollaro di Singapore
      "SGD": [ "SGD", "S$", 2, "S$"],
      // Sterlina di Sant’Elena
      "SHP": [ "SHP", "SHP", 2],
      // Tallero Sloveno
      "SIT": [ "SIT", "SIT", 130],
      // Corona Slovacca
      "SKK": [ "SKK", "Sk", 2],
      // Leone della Sierra Leone
      "SLL": [ "SLL", "SLL", 2],
      // Scellino Somalo
      "SOS": [ "SOS", "So. Sh.", 2],
      // Fiorino del Suriname
      "SRG": [ "SRG", "Sf", 130],
      // Dobra di Sao Tomé e Principe
      "STD": [ "STD", "Db", 2],
      // Rublo Sovietico
      "SUR": [ "SUR", "SUR", 130],
      // Colón Salvadoregno
      "SVC": [ "SVC", "SVC", 2],
      // Sterlina Siriana
      "SYP": [ "SYP", "LS", 2],
      // Lilangeni dello Swaziland
      "SZL": [ "SZL", "E", 2],
      // Baht Tailandese
      "THB": [ "THB", "THB", 2, "THB"],
      // Rublo del Tajikistan
      "TJR": [ "TJR", "TJR", 130],
      // Somoni del Tajikistan
      "TJS": [ "TJS", "TJS", 2],
      // Manat Turkmeno
      "TMM": [ "TMM", "TMM", 2],
      // Dinaro Tunisino
      "TND": [ "TND", "TND", 3],
      // Paʻanga di Tonga
      "TOP": [ "TOP", "T$", 2],
      // Escudo di Timor
      "TPE": [ "TPE", "TPE", 130],
      // Lira Turca
      "TRL": [ "TRL", "TRL", 128],
      // Nuova lira turca
      "TRY": [ "TRY", "YTL", 2, "YTL"],
      // Dollaro di Trinidad e Tobago
      "TTD": [ "TTD", "TT$", 2],
      // Nuovo dollaro taiwanese
      "TWD": [ "TWD", "NT$", 2, "NT$"],
      // Scellino della Tanzania
      "TZS": [ "TZS", "T Sh", 2],
      // Hrivna Ucraina
      "UAH": [ "UAH", "UAH", 2],
      // Karbovanetz Ucraino
      "UAK": [ "UAK", "UAK", 130],
      // Scellino Ugandese (1966-1987)
      "UGS": [ "UGS", "UGS", 130],
      // Scellino Ugandese
      "UGX": [ "UGX", "U Sh", 2],
      // Dollaro Statunitense
      "USD": [ "USD", "US$", 2, "US$"],
      // Dollaro Statunitense (Next day)
      "USN": [ "USN", "USN", 130],
      // Dollaro Statunitense (Same day)
      "USS": [ "USS", "USS", 130],
      // Peso Uruguaiano (1975-1993)
      "UYP": [ "UYP", "UYP", 130],
      // Peso Uruguayo uruguaiano
      "UYU": [ "UYU", "Ur$", 2, "UY$"],
      // Sum dell’Uzbekistan
      "UZS": [ "UZS", "UZS", 2],
      // Bolivar Venezuelano
      "VEB": [ "VEB", "Be", 130],
      // Dong Vietnamita
      "VND": [ "VND", "₫", 26, "₫"],
      // Vatu di Vanuatu
      "VUV": [ "VUV", "VT", 0],
      // Tala della Samoa Occidentale
      "WST": [ "WST", "WST", 2],
      // Franco CFA BEAC
      "XAF": [ "XAF", "XAF", 0],
      // Oro
      "XAU": [ "XAU", "XAU", 130],
      // Unità composita europea
      "XBA": [ "XBA", "XBA", 130],
      // Unità monetaria europea
      "XBB": [ "XBB", "XBB", 130],
      // Unità di acconto europea (XBC)
      "XBC": [ "XBC", "XBC", 130],
      // Unità di acconto europea (XBD)
      "XBD": [ "XBD", "XBD", 130],
      // Dollaro dei Caraibi Orientali
      "XCD": [ "XCD", "EC$", 2],
      // Diritti Speciali di Incasso
      "XDR": [ "XDR", "XDR", 130],
      // Unità Monetaria Europea
      "XEU": [ "XEU", "XEU", 130],
      // Franco Oro Francese
      "XFO": [ "XFO", "XFO", 130],
      // Franco UIC Francese
      "XFU": [ "XFU", "XFU", 130],
      // Franco CFA BCEAO
      "XOF": [ "XOF", "XOF", 0],
      // Franco CFP
      "XPF": [ "XPF", "CFPF", 0],
      // Platino
      "XPT": [ "XPT", "XPT", 130],
      // Fondi RINET
      "XRE": [ "XRE", "XRE", 130],
      // Codice di verifica della valuta
      "XTS": [ "XTS", "XTS", 130],
      // Nessuna valuta
      "XXX": [ "XXX", "XXX", 130],
      // Dinaro dello Yemen
      "YDD": [ "YDD", "YDD", 130],
      // Rial dello Yemen
      "YER": [ "YER", "YRl", 2, "YER"],
      // Dinaro Forte Yugoslavo
      "YUD": [ "YUD", "YUD", 130],
      // Dinaro Noviy Yugoslavo
      "YUM": [ "YUM", "YUM", 130],
      // Dinaro Convertibile Yugoslavo
      "YUN": [ "YUN", "YUN", 130],
      // Rand Sudafricano (finanziario)
      "ZAL": [ "ZAL", "ZAL", 130],
      // Rand Sudafricano
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR"],
      // Kwacha dello Zambia
      "ZMK": [ "ZMK", "ZMK", 2],
      // Nuovo Zaire dello Zaire
      "ZRN": [ "ZRN", "ZRN", 130],
      // Zaire dello Zaire
      "ZRZ": [ "ZRZ", "ZRZ", 130],
      // Dollaro dello Zimbabwe
      "ZWD": [ "ZWD", "Z$", 2],
    });
  }-*/;
  
  private void loadSuperNamesMap() {
    super.loadNamesMap();
  }
  
  @Override
  protected native void loadNamesMap() /*-{
    this.@com.google.gwt.i18n.client.CurrencyList_it::loadSuperNamesMap()();
    this.@com.google.gwt.i18n.client.CurrencyList_it::overrideNamesMap(Lcom/google/gwt/core/client/JavaScriptObject;)({
      "ADP": "Peseta Andorrana",
      "AED": "Dirham degli Emirati Arabi Uniti",
      "AFA": "Afgani (1927-2002)",
      "AFN": "Afgani",
      "ALL": "Lek Albanese",
      "AMD": "Dram Armeno",
      "ANG": "Fiorino delle Antille Olandesi",
      "AOA": "Kwanza Angolano",
      "AOK": "Kwanza Angolano (1977-1990)",
      "AON": "Nuovo Kwanza Angolano (1990-2000)",
      "AOR": "Kwanza Reajustado Angolano (1995-1999)",
      "ARA": "Austral Argentino",
      "ARP": "Peso Argentino (vecchio Cod.)",
      "ARS": "Peso Argentino",
      "ATS": "Scellino Austriaco",
      "AUD": "Dollaro Australiano",
      "AWG": "Fiorino di Aruba",
      "AZM": "Manat Azero",
      "AZN": "Manat azero",
      "BAD": "Dinar Bosnia-Herzegovina",
      "BAM": "Marco Conv. Bosnia-Erzegovina",
      "BBD": "Dollaro di Barbados",
      "BDT": "Taka Bangladese",
      "BEC": "Franco Belga (convertibile)",
      "BEF": "Franco Belga",
      "BEL": "Franco Belga (finanziario)",
      "BGL": "Lev Bulgaro",
      "BGN": "Nuovo Lev Bulgaro",
      "BHD": "Dinaro del Bahraini",
      "BIF": "Franco del Burundi",
      "BMD": "Dollaro delle Bermuda",
      "BND": "Dollaro del Brunei",
      "BOB": "Boliviano",
      "BOP": "Peso Boliviano",
      "BOV": "Mvdol Boliviano",
      "BRB": "Cruzeiro Novo Brasiliano (1967-1986)",
      "BRC": "Cruzado Brasiliano",
      "BRE": "Cruzeiro Brasiliano (1990-1993)",
      "BRL": "Real Brasiliano",
      "BRN": "Cruzado Novo Brasiliano",
      "BRR": "Cruzeiro Brasiliano",
      "BSD": "Dollaro delle Bahamas",
      "BTN": "Ngultrum Butanese",
      "BUK": "Kyat Birmano",
      "BWP": "Pula del Botswana",
      "BYB": "Nuovo Rublo Bielorussia (1994-1999)",
      "BYR": "Rublo Bielorussia",
      "BZD": "Dollaro Belize",
      "CAD": "Dollaro Canadese",
      "CDF": "Franco Congolese",
      "CHF": "Franco Svizzero",
      "CLF": "Unidades de Fomento Chilene",
      "CLP": "Peso Cileno",
      "CNY": "Renmimbi Cinese",
      "COP": "Peso Colombiano",
      "CRC": "Colón Costaricano",
      "CSD": "Antico Dinaro serbo",
      "CSK": "Corona forte cecoslovacca",
      "CUP": "Peso Cubano",
      "CVE": "Escudo del Capo Verde",
      "CYP": "Sterlina Cipriota",
      "CZK": "Corona Ceca",
      "DDM": "Ostmark della Germania Orientale",
      "DEM": "Marco Tedesco",
      "DJF": "Franco Gibutiano",
      "DKK": "Corona Danese",
      "DOP": "Peso Dominicano",
      "DZD": "Dinaro Algerino",
      "ECS": "Sucre dell’Ecuador",
      "ECV": "Unidad de Valor Constante (UVC) dell’Ecuador",
      "EEK": "Corona dell’Estonia",
      "EGP": "Sterlina Egiziana",
      "ERN": "Nakfa Eritreo",
      "ESA": "Peseta Spagnola account",
      "ESB": "Peseta Spagnola account convertibile",
      "ESP": "Peseta Spagnola",
      "ETB": "Birr Etiopico",
      "EUR": "Euro",
      "FIM": "Markka Finlandese",
      "FJD": "Dollaro delle Figi",
      "FKP": "Sterlina delle Falkland",
      "FRF": "Franco Francese",
      "GBP": "Sterlina Inglese",
      "GEK": "Kupon Larit Georgiano",
      "GEL": "Lari Georgiano",
      "GHC": "Cedi del Ghana",
      "GIP": "Sterlina di Gibilterra",
      "GMD": "Dalasi del Gambia",
      "GNF": "Franco della Guinea",
      "GNS": "Syli della Guinea",
      "GQE": "Ekwele della Guinea Equatoriale",
      "GRD": "Dracma Greca",
      "GTQ": "Quetzal Guatemalteco",
      "GWE": "Escudo della Guinea portoghese",
      "GWP": "Peso della Guinea-Bissau",
      "GYD": "Dollaro della Guyana",
      "HKD": "Dollaro di Hong Kong",
      "HNL": "Lempira Hoduregno",
      "HRD": "Dinaro Croato",
      "HRK": "Kuna Croata",
      "HTG": "Gourde Haitiano",
      "HUF": "Fiorino Ungherese",
      "IDR": "Rupia Indonesiana",
      "IEP": "Lira Irlandese",
      "ILP": "Sterlina Israeliana",
      "ILS": "Nuovo sheqel israeliano",
      "INR": "Rupia Indiana",
      "IQD": "Dinaro Iracheno",
      "IRR": "Rial Iraniano",
      "ISK": "Corona Islandese",
      "ITL": "Lira Italiana",
      "JMD": "Dollaro Giamaicano",
      "JOD": "Dinaro Giordano",
      "JPY": "Yen Giapponese",
      "KES": "Scellino Keniota",
      "KGS": "Som  Kirghiso",
      "KHR": "Riel Cambogiano",
      "KMF": "Franco Comoriano",
      "KPW": "Won Nordcoreano",
      "KRW": "Won Sudcoreano",
      "KWD": "Dinaro Kuwaitiano",
      "KYD": "Dollaro delle Isole Cayman",
      "KZT": "Tenge Kazaco",
      "LAK": "Kip Laotiano",
      "LBP": "Sterlina Libanese",
      "LKR": "Rupia di Sri Lanka",
      "LRD": "Dollaro Liberiano",
      "LSL": "Loti del Lesotho",
      "LSM": "Maloti",
      "LTL": "Lita Lituana",
      "LTT": "Talonas Lituani",
      "LUC": "Franco convertibile del Lussemburgo",
      "LUF": "Franco del Lussemburgo",
      "LUL": "Franco finanziario del Lussemburgo",
      "LVL": "Lat Lettone",
      "LVR": "Rublo Lettone",
      "LYD": "Dinaro Libico",
      "MAD": "Dirham Marocchino",
      "MAF": "Franco Marocchino",
      "MDL": "Leu Moldavo",
      "MGA": "Ariary Malgascio",
      "MGF": "Franco Malgascio",
      "MKD": "Dinaro Macedone",
      "MLF": "Franco di Mali",
      "MMK": "Kyat di Myanmar",
      "MNT": "Tugrik Mongolo",
      "MOP": "Pataca di Macao",
      "MRO": "Ouguiya della Mauritania",
      "MTL": "Lira Maltese",
      "MTP": "Sterlina Maltese",
      "MUR": "Rupia Mauriziana",
      "MVR": "Rufiyaa delle Maldive",
      "MWK": "Kwacha Malawiano",
      "MXN": "Peso Messicano",
      "MXP": "Peso messicano d’argento (1861-1992)",
      "MXV": "Unidad de Inversion (UDI) Messicana",
      "MYR": "Ringgit della Malesia",
      "MZE": "Escudo del Mozambico",
      "MZM": "Metical del Mozambico",
      "MZN": "Nuovo metical del Mozambico",
      "NAD": "Dollaro Namibiano",
      "NGN": "Naira Nigeriana",
      "NIC": "Cordoba Nicaraguense",
      "NIO": "Córdoba oro nicaraguense",
      "NLG": "Fiorino Olandese",
      "NOK": "Corona Norvegese",
      "NPR": "Rupia Nepalese",
      "NZD": "Dollaro Neozelandese",
      "OMR": "Rial Omanita",
      "PAB": "Balboa di Panama",
      "PEI": "Inti Peruviano",
      "PEN": "Sol Nuevo Peruviano",
      "PES": "Sol Peruviano",
      "PGK": "Kina della Papua Nuova Guinea",
      "PHP": "Peso delle Filippine",
      "PKR": "Rupia del Pakistan",
      "PLN": "Zloty Polacco",
      "PLZ": "Zloty Polacco (1950-1995)",
      "PTE": "Escudo Portoghese",
      "PYG": "Guarani del Paraguay",
      "QAR": "Rial del Qatar",
      "RHD": "Dollaro della Rhodesia",
      "ROL": "Leu della Romania",
      "RON": "Leu rumeno",
      "RSD": "Dinaro serbo",
      "RUB": "Rublo Russo",
      "RUR": "Rublo della CSI",
      "RWF": "Franco Ruandese",
      "SAR": "Ryal Saudita",
      "SBD": "Dollaro delle Isole Solomon",
      "SCR": "Rupia delle Seychelles",
      "SDD": "Dinaro Sudanese",
      "SDP": "Sterlina Sudanese",
      "SEK": "Corona Svedese",
      "SGD": "Dollaro di Singapore",
      "SHP": "Sterlina di Sant’Elena",
      "SIT": "Tallero Sloveno",
      "SKK": "Corona Slovacca",
      "SLL": "Leone della Sierra Leone",
      "SOS": "Scellino Somalo",
      "SRG": "Fiorino del Suriname",
      "STD": "Dobra di Sao Tomé e Principe",
      "SUR": "Rublo Sovietico",
      "SVC": "Colón Salvadoregno",
      "SYP": "Sterlina Siriana",
      "SZL": "Lilangeni dello Swaziland",
      "THB": "Baht Tailandese",
      "TJR": "Rublo del Tajikistan",
      "TJS": "Somoni del Tajikistan",
      "TMM": "Manat Turkmeno",
      "TND": "Dinaro Tunisino",
      "TOP": "Paʻanga di Tonga",
      "TPE": "Escudo di Timor",
      "TRL": "Lira Turca",
      "TRY": "Nuova lira turca",
      "TTD": "Dollaro di Trinidad e Tobago",
      "TWD": "Nuovo dollaro taiwanese",
      "TZS": "Scellino della Tanzania",
      "UAH": "Hrivna Ucraina",
      "UAK": "Karbovanetz Ucraino",
      "UGS": "Scellino Ugandese (1966-1987)",
      "UGX": "Scellino Ugandese",
      "USD": "Dollaro Statunitense",
      "USN": "Dollaro Statunitense (Next day)",
      "USS": "Dollaro Statunitense (Same day)",
      "UYP": "Peso Uruguaiano (1975-1993)",
      "UYU": "Peso Uruguayo uruguaiano",
      "UZS": "Sum dell’Uzbekistan",
      "VEB": "Bolivar Venezuelano",
      "VND": "Dong Vietnamita",
      "VUV": "Vatu di Vanuatu",
      "WST": "Tala della Samoa Occidentale",
      "XAF": "Franco CFA BEAC",
      "XAU": "Oro",
      "XBA": "Unità composita europea",
      "XBB": "Unità monetaria europea",
      "XBC": "Unità di acconto europea (XBC)",
      "XBD": "Unità di acconto europea (XBD)",
      "XCD": "Dollaro dei Caraibi Orientali",
      "XDR": "Diritti Speciali di Incasso",
      "XEU": "Unità Monetaria Europea",
      "XFO": "Franco Oro Francese",
      "XFU": "Franco UIC Francese",
      "XOF": "Franco CFA BCEAO",
      "XPF": "Franco CFP",
      "XPT": "Platino",
      "XRE": "Fondi RINET",
      "XTS": "Codice di verifica della valuta",
      "XXX": "Nessuna valuta",
      "YDD": "Dinaro dello Yemen",
      "YER": "Rial dello Yemen",
      "YUD": "Dinaro Forte Yugoslavo",
      "YUM": "Dinaro Noviy Yugoslavo",
      "YUN": "Dinaro Convertibile Yugoslavo",
      "ZAL": "Rand Sudafricano (finanziario)",
      "ZAR": "Rand Sudafricano",
      "ZMK": "Kwacha dello Zambia",
      "ZRN": "Nuovo Zaire dello Zaire",
      "ZRZ": "Zaire dello Zaire",
      "ZWD": "Dollaro dello Zimbabwe",
    });
  }-*/;
  
  @Override
  public native CurrencyData getDefault() /*-{
    return [ "CHF", "SFr.", 2, "CHF"];
  }-*/;
}
