package uy.gub.bps.csda.facturas_persona.api.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class ErrorResponse extends ApplicationResponse{
    
	private String message;

}