# FacturaPersona

El web service devuelve las facturas adeudadas de BPS y DGI (IRPF) de todas las empresas en las que una persona es integrante físico para ser descargadas desde un chatbot de WhatsApp.

## Endpoints

### Obtener facturas persona

**Método:** `GET`  
**URL:** `https://serviciointernobpst.bps.net/facturaspersona/api/v1/wsFacturasPersona/obtenerFacturasPersona`

**Descripción:**  
A partir de un documento de identidad obtiene las facturas de la empresa unipersonal donde la persona es patrón. Si existe más de un contribuyente/empresa/aportación con nómina automática, devuelve la lista de contribuyentes/empresas/aportaciones para que el cliente indique la aportación cuyas facturas deben devolverse.

**Parámetros de consulta:**

| Parámetro           | Tipo    | Descripción                                      | Ejemplo   |
|---------------------|---------|--------------------------------------------------|-----------|
| `persIdentificador` | Long    | Identificador de la persona.                    | `584522`  |
| `usuario`           | String  | Nombre del usuario que realiza la solicitud.    | `PRUEBA`  |
| `tipoAportacion`    | Integer | Tipo de aportación.                             | `1`       |

### Ejemplos de Respuestas

#### Solicitud correcta con factura

**Solicitud:**
```http
https://serviciointernobpst.bps.net/facturaspersona/api/v1/wsFacturasPersona/obtenerFacturasPersona?persIdentificador=3268292&usuario=PRUEBA
```

**Respuesta:**
```json
{
    "status": "success",
    "data": {
        "resultObtenerFacturasPersona": {
            "colEmpresas": [
                {
                    "nroIntEmp": null,
                    "nroEmpresa": " 0000003773708",
                    "tipoAportacion": 1,
                    "descAportacion": "INDUSTRIA Y COMERCIO",
                    "colFacturas": [
                        {
                            "nroReferencia": 1015482278,
                            "tipoFactura": "T",
                            "tipoDocumento": "F",
                            "documento": "BASE64",
                            "fechaVencimiento": "2025-01-23",
                            "mesCargoDesde": 202411,
                            "mesCargoHasta": 202411,
                            "importeTotal": 2487
                        }
                    ]
                }
            ],
            "colErrores": null
        }
    }
}
```

#### Solicitud correcta con varias aportaciones

**Solicitud:**
```http
https://serviciointernobpst.bps.net/facturaspersona/api/v1/wsFacturasPersona/obtenerFacturasPersona?persIdentificador=584522&usuario=PRUEBA
```

**Respuesta:**
```json
{
    "status": "success",
    "data": {
        "resultObtenerFacturasPersona": {
            "colEmpresas": [
                {
                    "nroIntEmp": 987566,
                    "nroEmpresa": " 0000003676302",
                    "tipoAportacion": 3,
                    "descAportacion": "RURAL",
                    "colFacturas": null
                },
                {
                    "nroIntEmp": 987566,
                    "nroEmpresa": " 0000003676302",
                    "tipoAportacion": 1,
                    "descAportacion": "INDUSTRIA Y COMERCIO",
                    "colFacturas": null
                }
            ],
            "colErrores": null
        }
    }
}
```

#### Error 1: Parámetros inválidos

**Solicitud:**
```http
https://serviciointernobpst.bps.net/facturaspersona/api/v1/wsFacturasPersona/obtenerFacturasPersona
```

**Respuesta:**
```json
{
    "status": "success",
    "data": {
        "resultObtenerFacturasPersona": {
            "colEmpresas": null,
            "colErrores": [
                {
                    "codigo": 1,
                    "descripcion": "Parámetros inválidos"
                }
            ]
        }
    }
}
```

#### Error 2: Sin contribuyente asociado

**Solicitud:**
```http
https://serviciointernobpst.bps.net/facturaspersona/api/v1/wsFacturasPersona/obtenerFacturasPersona?persIdentificador=1234&usuario=PRUEBA
```

**Respuesta:**
```json
{
    "status": "success",
    "data": {
        "resultObtenerFacturasPersona": {
            "colEmpresas": null,
            "colErrores": [
                {
                    "codigo": 2,
                    "descripcion": "Verificamos que no tienes una empresa que cumpla las condiciones para brindarte la factura por este medio."
                }
            ]
        }
    }
}
```

#### Error 102: Factura no generada o no emitida

**Solicitud:**
```http
https://serviciointernobpst.bps.net/facturaspersona/api/v1/wsFacturasPersona/obtenerFacturasPersona?persIdentificador=584522&usuario=PRUEBA&tipoAportacion=1
```

**Respuesta 1:** Antes del tercer día hábil
```json
{
    "status": "success",
    "data": {
        "resultObtenerFacturasPersona": {
            "colEmpresas": null,
            "colErrores": [
                {
                    "codigo": 102,
                    "descripcion": "La factura de este mes aún no está generada, solicítala nuevamente a partir del 3er día hábil del mes."
                }
            ]
        }
    }
}
```

**Respuesta 2:** Tercer día hábil o después
```json
{
    "status": "success",
    "data": {
        "resultObtenerFacturasPersona": {
            "colEmpresas": null,
            "colErrores": [
                {
                    "codigo": 102,
                    "descripcion": "La factura no se puede emitir, comunícate por el servicio Consúltenos, motivo Recaudación- Mesa de Ayuda."
                }
            ]
        }
    }
}
```

#### Error 106: Aportación inválida

**Solicitud:**
```http
https://serviciointernobpst.bps.net/facturaspersona/api/v1/wsFacturasPersona/obtenerFacturasPersona?persIdentificador=1136921&usuario=PRUEBA&tipoAportacion=48
```

**Respuesta:**
```json
{
    "status": "success",
    "data": {
        "resultObtenerFacturasPersona": {
            "colEmpresas": null,
            "colErrores": [
                {
                    "codigo": 106,
                    "descripcion": "Aportación inválida para el contribuyente."
                }
            ]
        }
    }
}
```

