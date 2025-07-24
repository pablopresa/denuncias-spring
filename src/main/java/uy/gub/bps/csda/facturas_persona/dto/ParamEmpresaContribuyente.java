package uy.gub.bps.csda.facturas_persona.dto;

public class ParamEmpresaContribuyente {

    private ParamContribuyente contribuyente;
    private ParamEmpresa empresa;

    public ParamContribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(ParamContribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public ParamEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ParamEmpresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "ParamEmpresaContribuyente [contribuyente=" + contribuyente + ", empresa=" + empresa + "]";
    }

}
