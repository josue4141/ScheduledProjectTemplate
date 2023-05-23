/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.consumoApi;

import AppServiceScheduler.StartService;
import com.conexionApi.ApiToJsonProcessor;
import com.dao.DaoRegistro;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.modelo.registro;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import ols.doci.env.EnvLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/**
 *
 * @author josue
 */
public class ConsumoApi {

    protected String ruta = "";
    protected String archivo = "";

    public void Consumir() throws ParserConfigurationException, SAXException, IOException {
        ApiToJsonProcessor conexionApi = new ApiToJsonProcessor();
        DaoRegistro dr = new DaoRegistro();
        registro regis = new registro();
        JsonArray result = conexionApi.requestPendingEntries();
        LocalDateTime fechaActual = LocalDateTime.now();
        String fechaActualFormato = fechaActual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String horaActualFormato = fechaActual.format(DateTimeFormatter.ofPattern("HH:mm:ss.SS"));
        String sssActualFormato = fechaActual.format(DateTimeFormatter.ofPattern("SSS"));
        try {
            // usando una instancia
            EnvLoader env = new EnvLoader();
            this.ruta = env.getString("ruta", "outputFilePath");
            this.archivo = env.getString("archivo", "type");

        } catch (IOException | ParserConfigurationException | SAXException | NullPointerException ex) {
            Logger.getLogger(StartService.class.getName()).log(Level.SEVERE, null, ex);
        }

        String outputFilePath = this.ruta + "Registro "+ sssActualFormato + this.archivo;
        try (FileWriter fileWriter = new FileWriter(outputFilePath)) {
                JSONObject jsonSalida = new JSONObject();
                JSONObject detalle = new JSONObject();
                JSONArray detalleArray = new JSONArray();
                JSONObject contacto = new JSONObject();
                JSONArray contactoArray = new JSONArray();
                JSONObject arTributos = new JSONObject();
                JSONArray arTributosArray = new JSONArray();
                JSONArray tributosArray = new JSONArray();
                JSONArray unidadMedidaArray = new JSONArray();
                
                
            for (int i = 0; i < result.size(); i++) {
                JSONObject jsonEntrada = new JSONObject(result.get(i).toString());
                JSONArray lineArray = jsonEntrada.getJSONArray("lineas");
                JSONObject lineaOnjeto = lineArray.getJSONObject(0);
                System.out.println(jsonEntrada.toString());

                jsonSalida.put("nit", jsonEntrada.getString("niu"));
                jsonSalida.put("nrc", "");
                jsonSalida.put("idDepartamentoEmisor", "");
                jsonSalida.put("idMunicipioEmisor", "");
                jsonSalida.put("direccionEmisor", "");
                jsonSalida.put("fechaEnvio", jsonEntrada.getString("fecVenAviso"));
                jsonSalida.put("fechaEmision", jsonEntrada.getString("fechaEmision"));
                jsonSalida.put("terminal", "");
                jsonSalida.put("numFactura", "");
                jsonSalida.put("correlativoInterno", "");
                jsonSalida.put("numeroTransaccion", "");
                jsonSalida.put("codigoUsuario", "");
                jsonSalida.put("nombreUsuario", jsonEntrada.getString("usuario"));
                jsonSalida.put("correoUsuario", "");
                jsonSalida.put("cajaSuc", "");
                jsonSalida.put("tipoDocumento", jsonEntrada.getString("tipo"));
                jsonSalida.put("pdv", "");
                jsonSalida.put("nitCliente", jsonEntrada.getString("niu"));
                jsonSalida.put("duiCliente", jsonEntrada.getString("numNitCliente"));
                jsonSalida.put("nrcCliente", "");
                jsonSalida.put("codigoCliente", "");
                jsonSalida.put("nombreCliente", jsonEntrada.getString("nomCompleto"));
                jsonSalida.put("direccionCliente", jsonEntrada.getString("direccion"));
                jsonSalida.put("departamento", "");
                jsonSalida.put("municipio", "");
                contacto.put("telefono", "");
                contacto.put("email", "");
                contacto.put("sms", "");
                contacto.put("whatsapp", "");
                contactoArray.put(contacto);
                jsonSalida.put("idDepartamentoReceptor", "");
                jsonSalida.put("idMunicipioReceptor", "");
                jsonSalida.put("codigoActividadEconomica", "");
                jsonSalida.put("tipoCatContribuyente", "");
                jsonSalida.put("giro", jsonEntrada.getString("giroComercial"));
                jsonSalida.put("codicionPago", "");
                jsonSalida.put("CCFAnterior", "");
                jsonSalida.put("vtaACuentaDe", jsonEntrada.getString("ventaACuenta"));
                jsonSalida.put("notaRemision", "");
                jsonSalida.put("noFecha", "");
                jsonSalida.put("saldoCapital", "");
                detalle.put("descripcion", lineaOnjeto.getString("concepto"));
                detalle.put("precioUnitario", lineaOnjeto.getString("precioUnitario"));
                detalle.put("ventasNoSujetas", jsonEntrada.getString("valorVentasNoSujetas"));
                detalle.put("ivaItem", jsonEntrada.getString("valorIva"));
                detalle.put("delAl", "");
                detalle.put("exportaciones", "");
                detalle.put("numDocRel", jsonEntrada.getString("numComprobante"));
                jsonSalida.put("codTributo", "");
                tributosArray.put("");
                unidadMedidaArray.put("");
                jsonSalida.put("uniMedidaCodigo", "");
                detalle.put("ventasExentas", lineaOnjeto.getString("ventasExentas"));
                detalle.put("fecha", jsonEntrada.getString("fecVenAviso"));
                detalle.put("tipoItem", "");
                detalle.put("tipoDteRel", "");
                detalle.put("codigoRetencionMH", "");
                detalle.put("cantidad", lineaOnjeto.getString("cantidad"));
                detalle.put("ventasGravadas", jsonEntrada.getString("valorTotalComp"));
                detalle.put("ivaRetenido", "");
                detalle.put("descuento", "");
                detalle.put("descuentoItem", "");
                detalle.put("otroMonNoAfec", "");
                detalle.put("unidadMedida", unidadMedidaArray);
                detalle.put("tributos", tributosArray);
                detalleArray.put(detalle);
                jsonSalida.put("montoLetras", jsonEntrada.getString("valorComprobanteLetras"));
                jsonSalida.put("sumas", jsonEntrada.getString("sumaAfectada"));
                jsonSalida.put("subTotalVentasExentas", lineaOnjeto.getString("ventasExentas"));
                jsonSalida.put("subTotalVentasNoSujetas", lineaOnjeto.getString("ventasNoSujetas"));
                jsonSalida.put("subTotalVentasGravadas", jsonEntrada.getString("sumaAfectada"));
                jsonSalida.put("ventasGravada", jsonEntrada.getString("sumaAfectada"));
                jsonSalida.put("iva", "");
                jsonSalida.put("renta", jsonEntrada.getString("valorRetencion"));
                jsonSalida.put("impuesto", "");
                jsonSalida.put("ventasExenta", lineaOnjeto.getString("ventasExentas"));
                jsonSalida.put("ventasNoSujeta", lineaOnjeto.getString("ventasNoSujetas"));
                arTributos.put("codigoTributo", "");
                arTributos.put("descripcionTributo", "");
                arTributos.put("valorTributo", "");
                arTributosArray.put(arTributos);
                jsonSalida.put("descuentos", "");
                jsonSalida.put("abonos", "");
                jsonSalida.put("cantidadTotal", lineaOnjeto.getString("cantidad"));
                jsonSalida.put("ventaTotal", jsonEntrada.getString("subTotal"));
                jsonSalida.put("ventasGravadas13", "");
                jsonSalida.put("ventasGravadas0", "");
                jsonSalida.put("ventasNoGravadas", "");
                jsonSalida.put("ivaPercibido1", "");
                jsonSalida.put("ivaPercibido2", "");
                jsonSalida.put("ivaRetenido1", "");
                jsonSalida.put("ivaRetenido13", "");
                jsonSalida.put("montGDescVentNoSujetas", "");
                jsonSalida.put("montGDescVentExentas", "");
                jsonSalida.put("montGDescVentGrav", "");
                jsonSalida.put("totOtroMonNoAfec", "");
                jsonSalida.put("totalAPagar", jsonEntrada.getString("valorTotalComp"));
                jsonSalida.put("seguro", "");
                jsonSalida.put("flete", "");
                jsonSalida.put("contribucionSeguridad", "");
                jsonSalida.put("fovial", "");
                jsonSalida.put("cotrans", "");
                jsonSalida.put("contribucionTurismo5", "");
                jsonSalida.put("contribucionTurismo7", "");
                jsonSalida.put("impuestoEspecifico", "");
                jsonSalida.put("cesc", "");
                jsonSalida.put("campo1", "");
                jsonSalida.put("campo2", "");
                jsonSalida.put("campo3", "");
                jsonSalida.put("campo4", "");
                jsonSalida.put("campoExtFE", "");
                jsonSalida.put("tipoItemExpor", "");
                jsonSalida.put("codSucE", "");
                jsonSalida.put("emailE", "");
                jsonSalida.put("codPais", "");
                jsonSalida.put("observacionesDte", "");
                jsonSalida.put("nombrePais", "");
                jsonSalida.put("fechaHoraGeneracion", "");
                jsonSalida.put("tipoPersona", "");
                jsonSalida.put("numControl", "");
                jsonSalida.put("codGeneracion", "");
                jsonSalida.put("telsucE", "");
                jsonSalida.put("selloGeneracion", "");
                jsonSalida.put("formatodocumento", "");
                jsonSalida.put("resolucion", "");
                jsonSalida.put("resInicio", jsonEntrada.getString("numIniAutorizadoMH"));
                jsonSalida.put("resFin", jsonEntrada.getString("numFinAutorizadoMH"));
                jsonSalida.put("resFecha", jsonEntrada.getString("fecAutorizacionRes"));
                jsonSalida.put("serie", jsonEntrada.getString("serie"));
                jsonSalida.put("otrosDocIdent", "");
                jsonSalida.put("otrosDocDescri", "");
                jsonSalida.put("ventCterNit", "");
                jsonSalida.put("ventCterNombre", "");
                jsonSalida.put("docRelTipo", "");
                jsonSalida.put("docRelNum", "");
                jsonSalida.put("docRelFecha", "");
                jsonSalida.put("formaPago", jsonEntrada.getString("formaPago"));
                jsonSalida.put("plazo", jsonEntrada.getString("numPagos"));
                jsonSalida.put("nomConductor", "");
                jsonSalida.put("numIdenConductor", "");
                jsonSalida.put("modTransp", "");
                jsonSalida.put("numIdTransp", "");
                jsonSalida.put("responsableEmisor", "");
                jsonSalida.put("numDocEmisor", "");
                jsonSalida.put("responsableReceptor", "");
                jsonSalida.put("numDocReceptor", "");
                jsonSalida.put("mostrarTributo", "");
                jsonSalida.put("numeroControl", "");
                jsonSalida.put("codigoGeneracion", "");
                jsonSalida.put("motivoContin", "");
                jsonSalida.put("nombreComercialCl", "");
                jsonSalida.put("codContingencia", "");
                jsonSalida.put("modeloFacturacion", "");
                jsonSalida.put("tipoTransmisión", "");
                jsonSalida.put("fInicioContin", "");
                jsonSalida.put("fFinContin", "");
                jsonSalida.put("horaIniContin", "");
                jsonSalida.put("horaFinContin", "");
                jsonSalida.put("detalle", detalleArray);
                jsonSalida.put("contactos", contactoArray);
                jsonSalida.put("arTributos", arTributosArray);
                fileWriter.write(jsonSalida.toString());
                fileWriter.flush();
                fileWriter.write(System.lineSeparator());
            }
            regis.setRutaJson(outputFilePath);
            regis.setCreationDate(fechaActualFormato);
            regis.setCreationTime(horaActualFormato);
            regis.setEstado(1);
            dr.insertRegistro(regis);
            
        } catch (Exception ex) {
            Logger.getLogger(ConsumoApi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
