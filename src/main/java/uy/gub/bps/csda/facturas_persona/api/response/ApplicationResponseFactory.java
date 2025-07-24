package uy.gub.bps.csda.facturas_persona.api.response;

public class ApplicationResponseFactory {

    private static ApplicationResponseFactory INSTANCE = null;
 
    private ApplicationResponseFactory() {
    }

    public static ApplicationResponseFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApplicationResponseFactory();
        }
        return INSTANCE;
    }

    public ApplicationResponse buildSuccess(Object content){
        ApplicationResponse response = new ApplicationResponse();
        response.setData(content);
        return response;
    }

    public ErrorResponse buildFail(String message){
        ErrorResponse response = new ErrorResponse();
        response.setStatus(ApplicationResponse.STATUS_FAIL);
        response.setMessage(message);
        return response;
    }
    
    public ErrorResponse buildFail(String fail,Object content){
        ErrorResponse response = new ErrorResponse();
        response.setStatus(ApplicationResponse.STATUS_FAIL);
        response.setMessage(fail);
        response.setData(content);
        return response;
    }
    
    public ErrorResponse buildError(String message){
        ErrorResponse response = new ErrorResponse();
        response.setStatus(ApplicationResponse.STATUS_ERROR);
        response.setMessage(message);
        return response;
    }
}