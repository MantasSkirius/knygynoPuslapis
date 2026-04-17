package com.skiriaus.knygynoPuslapis.domain.impl;

import com.skiriaus.knygynoPuslapis.domain.Knyga;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KnygaImpl implements Knyga {
	private Long id;
	private String pavadinimas;
	private String virselioAdresas;
	private String aprasymas;
	private String zanrai;
	private Integer metai;
	private String leidejas;
	private Integer puslapiuSkaicius;
	private String formatoInformacija;
	private String kalba;
}
