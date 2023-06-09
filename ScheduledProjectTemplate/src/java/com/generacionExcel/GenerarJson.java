package com.generacionExcel;

import com.controllers.FacturaController;
import com.dao.DaoCreditoFiscal;
import com.dao.DaoFaturaConsumidorFinal;
import com.modelo.creditoFiscal;
import com.modelo.faturaConsumidorFinal;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author josue
 */
public class GenerarJson {

    DaoCreditoFiscal daoCreditoFiscal = new DaoCreditoFiscal();
    DaoFaturaConsumidorFinal daoFaturaConsumidorFinal = new DaoFaturaConsumidorFinal();
    LocalDateTime fechaActual = LocalDateTime.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("SSS");
    String fechaActualFormato = fechaActual.format(formato);

    public void generarJsonCreditoFiscal() throws FileNotFoundException, IOException {
        String outputFilePath = "D:\\Users\\corre\\Escritorio\\Trabajo\\creditoFiscal " + fechaActualFormato + ".json";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (creditoFiscal fiscal : daoCreditoFiscal.getCreditoFiscal()) {
                JSONObject json = new JSONObject();
                JSONObject detalle = new JSONObject();
                JSONArray detalleArray = new JSONArray();
                JSONObject contacto = new JSONObject();
                JSONArray contactoArray = new JSONArray();
                JSONObject arTributos = new JSONObject();
                JSONArray arTributosArray = new JSONArray();
                if (fiscal.getEstado() == 0) {
                    json.put("idFacturaConsumidorFinal", fiscal.getIdCreditoFiscal());
                    json.put("nit", fiscal.getNit());
                    json.put("nrc", fiscal.getNrc());
                    json.put("idDepartamentoEmisor", fiscal.getIdDepartamentoEmisor());
                    json.put("idMunicipioEmisor", fiscal.getIdMunicipioEmisor());
                    json.put("direccionEmisor", fiscal.getDireccionEmisor());
                    json.put("fechaEnvio", fiscal.getFechaEnvio());
                    json.put("fechaEmision", fiscal.getFechaEmision());
                    json.put("terminal", fiscal.getTerminal());
                    json.put("numFactura", fiscal.getNumFactura());
                    json.put("correlativoInterno", fiscal.getCorrelativoInterno());
                    json.put("numeroTransaccion", fiscal.getNumeroTransaccion());
                    json.put("codigoUsuario", fiscal.getCodigoUsuario());
                    json.put("nombreUsuario", fiscal.getNombreUsuario());
                    json.put("correoUsuario", fiscal.getCorreoUsuario());
                    json.put("cajaSuc", fiscal.getCajaSuc());
                    json.put("tipoDocumento", fiscal.getTipoDocumento());
                    json.put("pdv", fiscal.getPdv());
                    json.put("nitCliente", fiscal.getNitCliente());
                    json.put("duiCliente", fiscal.getDuiCliente());
                    json.put("nrcCliente", fiscal.getNrcCliente());
                    json.put("codigoCliente", fiscal.getCodigoCliente());
                    json.put("nombreCliente", fiscal.getNombreCliente());
                    json.put("direccionCliente", fiscal.getDireccionCliente());
                    json.put("departamento", fiscal.getDepartamento());
                    json.put("municipio", fiscal.getMunicipio());
                    contacto.put("telefono", fiscal.getTelefono());
                    contacto.put("email", fiscal.getEmail());
                    contacto.put("sms", fiscal.getSms());
                    contacto.put("whatsapp", fiscal.getWhatsapp());
                    contactoArray.put(contacto);
                    json.put("idDepartamentoReceptor", fiscal.getIdDepartamentoReceptor());
                    json.put("idMunicipioReceptor", fiscal.getIdMunicipioReceptor());
                    json.put("codigoActividadEconomica", fiscal.getCodigoActividadEconomica());
                    json.put("tipoCatContribuyente", fiscal.getTipoCatContribuyente());
                    json.put("giro", fiscal.getGiro());
                    json.put("codicionPago", fiscal.getCodicionPago());
                    json.put("CCFAnterior", fiscal.getCCFAnterior());
                    json.put("vtaACuentaDe", fiscal.getVtaACuentaDe());
                    json.put("notaRemision", fiscal.getNotaRemision());
                    json.put("noFecha", fiscal.getNoFecha());
                    json.put("saldoCapital", fiscal.getSaldoCapital());
                    detalle.put("descripcion", fiscal.getDescripcion());
                    detalle.put("precioUnitario", fiscal.getPrecioUnitario());
                    detalle.put("ventasNoSujetas", fiscal.getVentasNoSujetas());
                    detalle.put("ivaItem", fiscal.getIvaItem());
                    detalle.put("delAl", fiscal.getDelAl());
                    detalle.put("exportaciones", fiscal.getExportaciones());
                    detalle.put("numDocRel", fiscal.getNumDocRel());
                    json.put("codTributo", fiscal.getCodTributo());
                    json.put("tributos", fiscal.getTributos());
                    json.put("uniMedidaCodigo", fiscal.getUniMedidaCodigo());
                    detalle.put("ventasExentas", fiscal.getVentasExentas());
                    detalle.put("fecha", fiscal.getFecha());
                    detalle.put("tipoItem", fiscal.getTipoItem());
                    detalle.put("tipoDteRel", fiscal.getTipoDteRel());
                    detalle.put("codigoRetencionMH", fiscal.getCodigoRetencionMH());
                    detalle.put("cantidad", fiscal.getCantidad());
                    detalle.put("ventasGravadas", fiscal.getVentasGravadas());
                    detalle.put("ivaRetenido", fiscal.getIvaRetenido());
                    detalle.put("descuento", fiscal.getDescuento());
                    detalle.put("descuentoItem", fiscal.getDescuentoItem());
                    detalle.put("otroMonNoAfec", fiscal.getOtroMonNoAfec());
                    detalleArray.put(detalle);
                    json.put("montoLetras", fiscal.getMontoLetras());
                    json.put("sumas", fiscal.getSumas());
                    json.put("subTotalVentasExentas", fiscal.getSubTotalVentasExentas());
                    json.put("subTotalVentasNoSujetas", fiscal.getSubTotalVentasNoSujetas());
                    json.put("subTotalVentasGravadas", fiscal.getSubTotalVentasGravadas());
                    json.put("ventasGravada", fiscal.getVentasGravada());
                    json.put("iva", fiscal.getIva());
                    json.put("renta", fiscal.getRenta());
                    json.put("impuesto", fiscal.getImpuesto());
                    json.put("ventasExenta", fiscal.getVentasExenta());
                    json.put("ventasNoSujeta", fiscal.getVentasNoSujeta());
                    json.put("codigoTributo", fiscal.getTotalExportaciones());
                    arTributos.put("codigoTributos", fiscal.getCodigoTributos());
                    arTributos.put("descripcionTributo", fiscal.getDescripcionTributo());
                    arTributos.put("valorTributo", fiscal.getValorTributo());
                    arTributosArray.put(arTributos);
                    json.put("descuentos", fiscal.getDescuentos());
                    json.put("abonos", fiscal.getAbonos());
                    json.put("cantidadTotal", fiscal.getCantidadTotal());
                    json.put("ventaTotal", fiscal.getVentaTotal());
                    json.put("ventasGravadas13", fiscal.getVentasGravadas13());
                    json.put("ventasGravadas0", fiscal.getVentasGravadas0());
                    json.put("ventasNoGravadas", fiscal.getVentasNoGravadas());
                    json.put("ivaPercibido1", fiscal.getIvaPercibido1());
                    json.put("ivaPercibido2", fiscal.getIvaPercibido2());
                    json.put("ivaRetenido1", fiscal.getIvaRetenido1());
                    json.put("ivaRetenido13", fiscal.getIvaRetenido13());
                    json.put("montGDescVentNoSujetas", fiscal.getMontGDescVentNoSujetas());
                    json.put("montGDescVentExentas", fiscal.getMontGDescVentExentas());
                    json.put("montGDescVentGrav", fiscal.getMontGDescVentGrav());
                    json.put("totOtroMonNoAfec", fiscal.getTotOtroMonNoAfec());
                    json.put("totalAPagar", fiscal.getTotalAPagar());
                    json.put("seguro", fiscal.getSeguro());
                    json.put("flete", fiscal.getFlete());
                    json.put("contribucionSeguridad", fiscal.getContribucionSeguridad());
                    json.put("fovial", fiscal.getFovial());
                    json.put("cotrans", fiscal.getCotrans());
                    json.put("contribucionTurismo5", fiscal.getContribucionTurismo5());
                    json.put("contribucionTurismo7", fiscal.getContribucionTurismo7());
                    json.put("impuestoEspecifico", fiscal.getImpuestoEspecifico());
                    json.put("cesc", fiscal.getCesc());
                    json.put("campo1", fiscal.getCampo1());
                    json.put("campo2", fiscal.getCampo2());
                    json.put("campo3", fiscal.getCampo3());
                    json.put("campo4", fiscal.getCampo4());
                    json.put("campoExtFE", fiscal.getCampoExtFE());
                    json.put("tipoItemExpor", fiscal.getTipoItemExpor());
                    json.put("codSucE", fiscal.getCodSucE());
                    json.put("emailE", fiscal.getEmailE());
                    json.put("codPais", fiscal.getCodPais());
                    json.put("observacionesDte", fiscal.getObservacionesDte());
                    json.put("nombrePais", fiscal.getNombrePais());
                    json.put("fechaHoraGeneracion", fiscal.getFechaHoraGeneracion());
                    json.put("tipoPersona", fiscal.getTipoPersona());
                    json.put("numControl", fiscal.getNumControl());
                    json.put("codGeneracion", fiscal.getCodGeneracion());
                    json.put("telsucE", fiscal.getTelsucE());
                    json.put("selloGeneracion", fiscal.getSelloGeneracion());
                    json.put("formatodocumento", fiscal.getFormatodocumento());
                    json.put("resolucion", fiscal.getResolucion());
                    json.put("resInicio", fiscal.getResInicio());
                    json.put("resFin", fiscal.getResFin());
                    json.put("resFecha", fiscal.getResFecha());
                    json.put("serie", fiscal.getSerie());
                    json.put("otrosDocIdent", fiscal.getOtrosDocIdent());
                    json.put("otrosDocDescri", fiscal.getOtrosDocDescri());
                    json.put("ventCterNit", fiscal.getVentCterNit());
                    json.put("ventCterNombre", fiscal.getVentCterNombre());
                    json.put("docRelTipo", fiscal.getDocRelTipo());
                    json.put("docRelNum", fiscal.getDocRelNum());
                    json.put("docRelFecha", fiscal.getDocRelFecha());
                    json.put("formaPago", fiscal.getFormaPago());
                    json.put("plazo", fiscal.getPlazo());
                    json.put("nomConductor", fiscal.getNomConductor());
                    json.put("numIdenConductor", fiscal.getNumIdenConductor());
                    json.put("modTransp", fiscal.getModTransp());
                    json.put("numIdTransp", fiscal.getNumIdTransp());
                    json.put("responsableEmisor", fiscal.getResponsableEmisor());
                    json.put("numDocEmisor", fiscal.getNumDocEmisor());
                    json.put("responsableReceptor", fiscal.getResponsableReceptor());
                    json.put("numDocReceptor", fiscal.getNumDocReceptor());
                    json.put("mostrarTributo", fiscal.getMostrarTributo());
                    json.put("numeroControl", fiscal.getNumeroControl());
                    json.put("codigoGeneracion", fiscal.getCodigoGeneracion());
                    json.put("motivoContin", fiscal.getMotivoContin());
                    json.put("nombreComercialCl", fiscal.getNombreComercialCl());
                    json.put("codContingencia", fiscal.getCodContingencia());
                    json.put("modeloFacturacion", fiscal.getModeloFacturacion());
                    json.put("tipoTransmisión", fiscal.getTipoTransmision());
                    json.put("fInicioContin", fiscal.getfInicioContin());
                    json.put("fFinContin", fiscal.getfFinContin());
                    json.put("horaIniContin", fiscal.getHoraIniContin());
                    json.put("horaFinContin", fiscal.getHoraFinContin());
                    json.put("detalle", detalleArray);
                    json.put("contactos", contactoArray);
                    json.put("arTributos", arTributosArray);
                    writer.write(json.toString());
                    writer.newLine();
                    daoCreditoFiscal.modificarEstadoCreditoFiscal(fiscal.getIdCreditoFiscal());

                }
            }

        } catch (Exception ex) {
            Logger.getLogger(FacturaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void generarJsonCosumidorFinal() throws FileNotFoundException, IOException {
        String outputFilePath1 = "D:\\Users\\corre\\Escritorio\\Trabajo\\faturaConsumidorFinal " + fechaActualFormato + ".json";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath1))) {
            for (faturaConsumidorFinal factConsurFinal : daoFaturaConsumidorFinal.getFaturaConsumidorFinal()) {
                JSONObject json = new JSONObject();
                JSONObject detalle = new JSONObject();
                JSONArray detalleArray = new JSONArray();
                JSONObject contacto = new JSONObject();
                JSONArray contactoArray = new JSONArray();
                JSONObject arTributos = new JSONObject();
                JSONArray arTributosArray = new JSONArray();
                if (factConsurFinal.getEstado() == 0) {
                    json.put("idFacturaConsumidorFinal", factConsurFinal.getIdFacturaConsumidorFinal());
                    json.put("nit", factConsurFinal.getNit());
                    json.put("nrc", factConsurFinal.getNrc());
                    json.put("idDepartamentoEmisor", factConsurFinal.getIdDepartamentoEmisor());
                    json.put("idMunicipioEmisor", factConsurFinal.getIdMunicipioEmisor());
                    json.put("direccionEmisor", factConsurFinal.getDireccionEmisor());
                    json.put("fechaEnvio", factConsurFinal.getFechaEnvio());
                    json.put("fechaEmision", factConsurFinal.getFechaEmision());
                    json.put("terminal", factConsurFinal.getTerminal());
                    json.put("numFactura", factConsurFinal.getNumFactura());
                    json.put("correlativoInterno", factConsurFinal.getCorrelativoInterno());
                    json.put("numeroTransaccion", factConsurFinal.getNumeroTransaccion());
                    json.put("codigoUsuario", factConsurFinal.getCodigoUsuario());
                    json.put("nombreUsuario", factConsurFinal.getNombreUsuario());
                    json.put("correoUsuario", factConsurFinal.getCorreoUsuario());
                    json.put("cajaSuc", factConsurFinal.getCajaSuc());
                    json.put("tipoDocumento", factConsurFinal.getTipoDocumento());
                    json.put("pdv", factConsurFinal.getPdv());
                    json.put("nitCliente", factConsurFinal.getNitCliente());
                    json.put("duiCliente", factConsurFinal.getDuiCliente());
                    json.put("nrcCliente", factConsurFinal.getNrcCliente());
                    json.put("codigoCliente", factConsurFinal.getCodigoCliente());
                    json.put("nombreCliente", factConsurFinal.getNombreCliente());
                    json.put("direccionCliente", factConsurFinal.getDireccionCliente());
                    json.put("departamento", factConsurFinal.getDepartamento());
                    json.put("municipio", factConsurFinal.getMunicipio());
                    contacto.put("telefono", factConsurFinal.getTelefono());
                    contacto.put("email", factConsurFinal.getEmail());
                    contacto.put("sms", factConsurFinal.getSms());
                    contacto.put("whatsapp", factConsurFinal.getWhatsapp());
                    contactoArray.put(contacto);
                    json.put("idDepartamentoReceptor", factConsurFinal.getIdDepartamentoReceptor());
                    json.put("idMunicipioReceptor", factConsurFinal.getIdMunicipioReceptor());
                    json.put("codigoActividadEconomica", factConsurFinal.getCodigoActividadEconomica());
                    json.put("tipoCatContribuyente", factConsurFinal.getTipoCatContribuyente());
                    json.put("giro", factConsurFinal.getGiro());
                    json.put("codicionPago", factConsurFinal.getCodicionPago());
                    json.put("CCFAnterior", factConsurFinal.getCCFAnterior());
                    json.put("vtaACuentaDe", factConsurFinal.getVtaACuentaDe());
                    json.put("notaRemision", factConsurFinal.getNotaRemision());
                    json.put("noFecha", factConsurFinal.getNoFecha());
                    json.put("saldoCapital", factConsurFinal.getSaldoCapital());
                    detalle.put("descripcion", factConsurFinal.getDescripcion());
                    detalle.put("precioUnitario", factConsurFinal.getPrecioUnitario());
                    detalle.put("ventasNoSujetas", factConsurFinal.getVentasNoSujetas());
                    detalle.put("ivaItem", factConsurFinal.getIvaItem());
                    detalle.put("delAl", factConsurFinal.getDelAl());
                    detalle.put("exportaciones", factConsurFinal.getExportaciones());
                    detalle.put("numDocRel", factConsurFinal.getNumDocRel());
                    json.put("codTributo", factConsurFinal.getCodTributo());
                    json.put("tributos", factConsurFinal.getTributos());
                    json.put("uniMedidaCodigo", factConsurFinal.getUniMedidaCodigo());
                    detalle.put("ventasExentas", factConsurFinal.getVentasExentas());
                    detalle.put("fecha", factConsurFinal.getFecha());
                    detalle.put("tipoItem", factConsurFinal.getTipoItem());
                    detalle.put("tipoDteRel", factConsurFinal.getTipoDteRel());
                    detalle.put("codigoRetencionMH", factConsurFinal.getCodigoRetencionMH());
                    detalle.put("cantidad", factConsurFinal.getCantidad());
                    detalle.put("ventasGravadas", factConsurFinal.getVentasGravadas());
                    detalle.put("ivaRetenido", factConsurFinal.getIvaRetenido());
                    detalle.put("descuento", factConsurFinal.getDescuento());
                    detalle.put("descuentoItem", factConsurFinal.getDescuentoItem());
                    detalle.put("otroMonNoAfec", factConsurFinal.getOtroMonNoAfec());
                    detalleArray.put(detalle);
                    json.put("montoLetras", factConsurFinal.getMontoLetras());
                    json.put("sumas", factConsurFinal.getSumas());
                    json.put("subTotalVentasExentas", factConsurFinal.getSubTotalVentasExentas());
                    json.put("subTotalVentasNoSujetas", factConsurFinal.getSubTotalVentasNoSujetas());
                    json.put("subTotalVentasGravadas", factConsurFinal.getSubTotalVentasGravadas());
                    json.put("ventasGravada", factConsurFinal.getVentasGravada());
                    json.put("iva", factConsurFinal.getIva());
                    json.put("renta", factConsurFinal.getRenta());
                    json.put("impuesto", factConsurFinal.getImpuesto());
                    json.put("ventasExenta", factConsurFinal.getVentasExenta());
                    json.put("ventasNoSujeta", factConsurFinal.getVentasNoSujeta());
                    json.put("codigoTributo", factConsurFinal.getCodigoTributo());
                    arTributos.put("codigoTributos", factConsurFinal.getCodigoTributos());
                    arTributos.put("descripcionTributo", factConsurFinal.getDescripcionTributo());
                    arTributos.put("valorTributo", factConsurFinal.getValorTributo());
                    arTributosArray.put(arTributos);
                    json.put("descuentos", factConsurFinal.getDescuentos());
                    json.put("abonos", factConsurFinal.getAbonos());
                    json.put("cantidadTotal", factConsurFinal.getCantidadTotal());
                    json.put("ventaTotal", factConsurFinal.getVentaTotal());
                    json.put("ventasGravadas13", factConsurFinal.getVentasGravadas13());
                    json.put("ventasGravadas0", factConsurFinal.getVentasGravadas0());
                    json.put("ventasNoGravadas", factConsurFinal.getVentasNoGravadas());
                    json.put("ivaPercibido1", factConsurFinal.getIvaPercibido1());
                    json.put("ivaPercibido2", factConsurFinal.getIvaPercibido2());
                    json.put("ivaRetenido1", factConsurFinal.getIvaRetenido1());
                    json.put("ivaRetenido13", factConsurFinal.getIvaRetenido13());
                    json.put("montGDescVentNoSujetas", factConsurFinal.getMontGDescVentNoSujetas());
                    json.put("montGDescVentExentas", factConsurFinal.getMontGDescVentExentas());
                    json.put("montGDescVentGrav", factConsurFinal.getMontGDescVentGrav());
                    json.put("totOtroMonNoAfec", factConsurFinal.getTotOtroMonNoAfec());
                    json.put("totalAPagar", factConsurFinal.getTotalAPagar());
                    json.put("seguro", factConsurFinal.getSeguro());
                    json.put("flete", factConsurFinal.getFlete());
                    json.put("contribucionSeguridad", factConsurFinal.getContribucionSeguridad());
                    json.put("fovial", factConsurFinal.getFovial());
                    json.put("cotrans", factConsurFinal.getCotrans());
                    json.put("contribucionTurismo5", factConsurFinal.getContribucionTurismo5());
                    json.put("contribucionTurismo7", factConsurFinal.getContribucionTurismo7());
                    json.put("impuestoEspecifico", factConsurFinal.getImpuestoEspecifico());
                    json.put("cesc", factConsurFinal.getCesc());
                    json.put("campo1", factConsurFinal.getCampo1());
                    json.put("campo2", factConsurFinal.getCampo2());
                    json.put("campo3", factConsurFinal.getCampo3());
                    json.put("campo4", factConsurFinal.getCampo4());
                    json.put("campoExtFE", factConsurFinal.getCampoExtFE());
                    json.put("tipoItemExpor", factConsurFinal.getTipoItemExpor());
                    json.put("codSucE", factConsurFinal.getCodSucE());
                    json.put("emailE", factConsurFinal.getEmailE());
                    json.put("codPais", factConsurFinal.getCodPais());
                    json.put("observacionesDte", factConsurFinal.getObservacionesDte());
                    json.put("nombrePais", factConsurFinal.getNombrePais());
                    json.put("fechaHoraGeneracion", factConsurFinal.getFechaHoraGeneracion());
                    json.put("tipoPersona", factConsurFinal.getTipoPersona());
                    json.put("numControl", factConsurFinal.getNumControl());
                    json.put("codGeneracion", factConsurFinal.getCodGeneracion());
                    json.put("telsucE", factConsurFinal.getTelsucE());
                    json.put("selloGeneracion", factConsurFinal.getSelloGeneracion());
                    json.put("formatodocumento", factConsurFinal.getFormatodocumento());
                    json.put("resolucion", factConsurFinal.getResolucion());
                    json.put("resInicio", factConsurFinal.getResInicio());
                    json.put("resFin", factConsurFinal.getResFin());
                    json.put("resFecha", factConsurFinal.getResFecha());
                    json.put("serie", factConsurFinal.getSerie());
                    json.put("otrosDocIdent", factConsurFinal.getOtrosDocIdent());
                    json.put("otrosDocDescri", factConsurFinal.getOtrosDocDescri());
                    json.put("ventCterNit", factConsurFinal.getVentCterNit());
                    json.put("ventCterNombre", factConsurFinal.getVentCterNombre());
                    json.put("docRelTipo", factConsurFinal.getDocRelTipo());
                    json.put("docRelNum", factConsurFinal.getDocRelNum());
                    json.put("docRelFecha", factConsurFinal.getDocRelFecha());
                    json.put("formaPago", factConsurFinal.getFormaPago());
                    json.put("plazo", factConsurFinal.getPlazo());
                    json.put("nomConductor", factConsurFinal.getNomConductor());
                    json.put("numIdenConductor", factConsurFinal.getNumIdenConductor());
                    json.put("modTransp", factConsurFinal.getModTransp());
                    json.put("numIdTransp", factConsurFinal.getNumIdTransp());
                    json.put("responsableEmisor", factConsurFinal.getResponsableEmisor());
                    json.put("numDocEmisor", factConsurFinal.getNumDocEmisor());
                    json.put("responsableReceptor", factConsurFinal.getResponsableReceptor());
                    json.put("numDocReceptor", factConsurFinal.getNumDocReceptor());
                    json.put("mostrarTributo", factConsurFinal.getMostrarTributo());
                    json.put("numeroControl", factConsurFinal.getNumeroControl());
                    json.put("codigoGeneracion", factConsurFinal.getCodigoGeneracion());
                    json.put("motivoContin", factConsurFinal.getMotivoContin());
                    json.put("nombreComercialCl", factConsurFinal.getNombreComercialCl());
                    json.put("codContingencia", factConsurFinal.getCodContingencia());
                    json.put("modeloFacturacion", factConsurFinal.getModeloFacturacion());
                    json.put("tipoTransmisión", factConsurFinal.getTipoTransmisión());
                    json.put("fInicioContin", factConsurFinal.getfInicioContin());
                    json.put("fFinContin", factConsurFinal.getfFinContin());
                    json.put("horaIniContin", factConsurFinal.getHoraIniContin());
                    json.put("horaFinContin", factConsurFinal.getHoraFinContin());
                    json.put("detalle", detalleArray);
                    json.put("contactos", contactoArray);
                    json.put("arTributos", arTributosArray);
                    writer.write(json.toString());
                    writer.newLine();
                    daoFaturaConsumidorFinal.modificarEstadoFacturaConsumidorFinal(factConsurFinal.getIdFacturaConsumidorFinal());

                }
            }

        } catch (Exception ex) {
            Logger.getLogger(FacturaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
