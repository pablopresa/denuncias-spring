@echo off

chcp 65001
rem # ----------------------------------------------------
rem # 
rem # Script para iniciar el backend en localhost
rem # 
rem # ----------------------------------------------------

rem # Variables de conexion
set DATABASE_TYPE = ORACLE
set DATABASE_URL=jdbc:oracle:thin:@//BDQAOLTP:1533/qaoltp.world
set DATABASE_USERNAME=testqa
set DATABASE_PASSWORD=testqa
set DATABASE_DRIVER=oracle.jdbc.OracleDriver
set DATABASE_DRIVER_DIALECT=org.hibernate.dialect.OracleDialect

rem # Variables para conexiones con web services

rem # Ws Contribuyente
set webservices_reg_contribuyente_url=http://proxyservt.bps.net/Registros/Empresas/V003/WsRegContribuyenteService
set webservices_reg_contribuyente_wsdl=http://proxyservt.bps.net/Registros/Empresas/V003/WsRegContribuyenteService?wsdl
set webservices_reg_contribuyente_timeout=360000
rem # Ws Empresa
set webservices_reg_empresa_url=http://proxyservt.bps.net/Registros/Empresas/V003/WsRegEmpresasService
set webservices_reg_empresa_wsdl=http://proxyservt.bps.net/Registros/Empresas/V003/WsRegEmpresasService?wsdl
set webservices_reg_empresa_timeout=360000
rem # Ws Factura Generacion
set webservices_factura_generacion_url=http://srvh2122:8080/Facturacion/WsEmisorDocumentoService/V001/WsEmisorDocumentoService
set webservices_factura_generacion_wsdl=http://srvh2122:8080/Facturacion/WsEmisorDocumentoService/V001/WsEmisorDocumentoService?wsdl
set webservices_factura_generacion_timeout=360000
rem # Ws Factura Consulta
set webservices_factura_consulta_url=http://srvh2122:8080/Recaudacion/Emisor/V001/WsEmisorConsulta
set webservices_factura_consulta_wsdl=http://srvh2122:8080/Recaudacion/Emisor/V001/WsEmisorConsulta?wsdl
set webservices_factura_consulta_timeout=360000

rem # Variables para operacion Version
set SERVICIO_NOMBRE=wsFacturasPersona
set SERVICIO_VERSION=v1.0
set SERVICIO_FECHA_EXPIRACION=null
set SERVICIO_VERSION_ESTANDAR=v3.0

rem # Parametros
set COD_NAT_JURIDICA_UNIPERSONAL=1
set COD_REL_LABORAL_PATRONO_UNIPERSONAL=6
set COD_APORTACIONES_VALIDAS=1,3,48
set FLAG_FILTRAR_ANULADAS=1
set NIVEL_DETALLE_DUPLICADO_DOCUMENTO=NIVEL_2
set DIA_HABIL_CALCHAB=3
set DEVOLVER_BASE_64=false

rem # Mensajes
set MENSAJE_ERROR_DOCUMENTOS_POR_EMPRESA_101=Verificamos que no tienes una empresa que cumpla las condiciones para brindarte la factura por este medio.
rem Hasta el 2do. día hábil (102):
set MENSAJE_ERROR_DOCUMENTOS_POR_EMPRESA_102_1=La factura de este mes aún no está generada, solicítala nuevamente a partir del 3er día hábil del mes.
rem A partir del 3er. día hábil (102):
set MENSAJE_ERROR_DOCUMENTOS_POR_EMPRESA_102_2=La factura no se puede emitir, comunícate por el servicio Consúltenos, motivo Recaudación- Mesa de Ayuda.
set MENSAJE_ERROR_DOCUMENTOS_POR_EMPRESA_106=La factura no se puede emitir, comunícate por el servicio Consúltenos, motivo Recaudación- Mesa de Ayuda.
set MENSAJE_ERROR_DOCUMENTOS_POR_EMPRESA_107= Tu empresa no tiene obligaciones corrientes pendientes de pago a la fecha.
set MENSAJE_ERROR_DOCUMENTOS_POR_EMPRESA_999=Por favor, vuelve e intentar en unos minutos.
set MENSAJE_ERROR_VALIDACION_1=Parámetros inválidos
set MENSAJE_ERROR_VALIDACION_2=Verificamos que no tienes una empresa que cumpla las condiciones para brindarte la factura por este medio.
set MENSAJE_ERROR_VALIDACION_3=Verificamos que no tienes una empresa que cumpla las condiciones para brindarte la factura por este medio.
set MENSAJE_ERROR_VALIDACION_4=Verificamos que no tienes una empresa que cumpla las condiciones para brindarte la factura por este medio.
set MENSAJE_ERROR_VALIDACION_5=La factura no se puede emitir, comunícate por el servicio Consúltenos, motivo Recaudación-Mesa de Ayuda.
rem # Aseguramos que se generen todas las clases necesarias para el aplicativo
mvn clean install && mvn spring-boot:run -Dspring-boot.run.jvmArguments="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"
