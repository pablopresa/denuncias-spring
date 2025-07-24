package uy.gub.bps.csda.facturas_persona.api.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class ApplicationResponse {
	
	public static final String STATUS_SUCCESS="success";
	public static final String STATUS_FAIL="fail";
	public static final String STATUS_ERROR="error";
	
    private String status = STATUS_SUCCESS;
    private Object data;

}
