package com.skiriaus.knygynoPuslapis.domain.impl;

import com.skiriaus.knygynoPuslapis.domain.Autorius;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AutoriusImpl implements Autorius {
	private Long id;
	private String vardas;
}
