
package com.modelo;

/**
 *
 * @author josue
 */
public class faturaConsumidorFinal {
    private int idFacturaConsumidorFinal;
    private String nit;
    private String nrc;
    private int idDepartamentoEmisor;
    private int idMunicipioEmisor;
    private String direccionEmisor;
    private String fechaEnvio;
    private String fechaEmision;
    private String terminal;
    private int numFactura;
    private int correlativoInterno;
    private int numeroTransaccion;
    private int codigoUsuario;
    private String nombreUsuario;
    private String correoUsuario;
    private String cajaSuc;
    private String tipoDocumento;
    private String pdv;
    private String nitCliente;
    private String duiCliente;
    private String nrcCliente;
    private int codigoCliente;
    private String nombreCliente;
    private String direccionCliente;
    private String departamento;
    private String municipio;
    private String telefono;
    private String email;
    private String sms;
    private String whatsapp;
    private int idDepartamentoReceptor;
    private int idMunicipioReceptor;
    private int codigoActividadEconomica;
    private String tipoCatContribuyente;
    private String giro;
    private int codicionPago;
    private String CCFAnterior;
    private String vtaACuentaDe;
    private String notaRemision;
    private String noFecha;
    private double saldoCapital;
    private String descripcion;
    private double precioUnitario;
    private double ventasNoSujetas;
    private double ivaItem;
    private double delAl;
    private int exportaciones;
    private int numDocRel;
    private int codTributo;
    private double tributos;
    private int uniMedidaCodigo;
    private double ventasExentas;
    private String fecha;
    private int tipoItem;
    private int tipoDteRel;
    private int codigoRetencionMH;
    private int cantidad;
    private int ventasGravadas;
    private double ivaRetenido;
    private double descuento;
    private int descuentoItem;
    private double otroMonNoAfec;
    private String montoLetras;
    private double sumas;
    private double subTotalVentasExentas;
    private double subTotalVentasNoSujetas;
    private double subTotalVentasGravadas;
    private double ventasGravada;
    private double iva;
    private double renta;
    private double impuesto;
    private double ventasExenta;
    private double ventasNoSujeta;
    private double codigoTributo;
    private int codigoTributos;
    private String descripcionTributo;
    private double valorTributo;
    private double descuentos;
    private double abonos;
    private int cantidadTotal;
    private double ventaTotal;
    private double ventasGravadas13;
    private double ventasGravadas0;
    private double ventasNoGravadas;
    private double ivaPercibido1;
    private double ivaPercibido2;
    private double ivaRetenido1;
    private double ivaRetenido13;
    private double montGDescVentNoSujetas;
    private double montGDescVentExentas;
    private double montGDescVentGrav;
    private double totOtroMonNoAfec;
    private double totalAPagar;
    private double seguro;
    private double flete;
    private double contribucionSeguridad;
    private double fovial;
    private double cotrans;
    private double contribucionTurismo5;
    private double contribucionTurismo7;
    private double impuestoEspecifico;
    private double cesc;
    private String campo1;
    private String campo3;
    private String campo2;
    private String campo4;
    private String campoExtFE;
    private String tipoItemExpor;
    private String codSucE;
    private String emailE;
    private String codPais;
    private String observacionesDte;
    private String nombrePais;
    private String fechaHoraGeneracion;
    private String tipoPersona;
    private String numControl;
    private String codGeneracion;
    private String telsucE;
    private String selloGeneracion;
    private String formatodocumento;
    private String resolucion;
    private String resInicio;
    private String resFin;
    private String resFecha;
    private String serie;
    private String otrosDocIdent;
    private String otrosDocDescri;
    private String ventCterNit;
    private String ventCterNombre;
    private String docRelTipo;
    private String docRelNum;
    private String docRelFecha;
    private String formaPago;
    private String plazo;
    private String nomConductor;
    private String numIdenConductor;
    private String modTransp;
    private String numIdTransp;
    private String responsableEmisor;
    private String numDocEmisor;
    private String responsableReceptor;
    private String numDocReceptor;
    private String mostrarTributo;
    private String numeroControl;
    private String codigoGeneracion;
    private String motivoContin;
    private String nombreComercialCl;
    private String codContingencia;
    private String modeloFacturacion;
    private String tipoTransmisión;
    private String fInicioContin;
    private String fFinContin;
    private String horaIniContin;
    private String horaFinContin;
    private int estado;

    public faturaConsumidorFinal() {
    }

    public faturaConsumidorFinal(int idFacturaConsumidorFinal, String nit, String nrc, int idDepartamentoEmisor, int idMunicipioEmisor, String direccionEmisor, String fechaEnvio, String fechaEmision, String terminal, int numFactura, int correlativoInterno, int numeroTransaccion, int codigoUsuario, String nombreUsuario, String correoUsuario, String cajaSuc, String tipoDocumento, String pdv, String nitCliente, String duiCliente, String nrcCliente, int codigoCliente, String nombreCliente, String direccionCliente, String departamento, String municipio, String telefono, String email, String sms, String whatsapp, int idDepartamentoReceptor, int idMunicipioReceptor, int codigoActividadEconomica, String tipoCatContribuyente, String giro, int codicionPago, String CCFAnterior, String vtaACuentaDe, String notaRemision, String noFecha, double saldoCapital, String descripcion, double precioUnitario, double ventasNoSujetas, double ivaItem, double delAl, int exportaciones, int numDocRel, int codTributo, double tributos, int uniMedidaCodigo, double ventasExentas, String fecha, int tipoItem, int tipoDteRel, int codigoRetencionMH, int cantidad, int ventasGravadas, double ivaRetenido, double descuento, int descuentoItem, double otroMonNoAfec, String montoLetras, double sumas, double subTotalVentasExentas, double subTotalVentasNoSujetas, double subTotalVentasGravadas, double ventasGravada, double iva, double renta, double impuesto, double ventasExenta, double ventasNoSujeta, double codigoTributo, int codigoTributos, String descripcionTributo, double valorTributo, double descuentos, double abonos, int cantidadTotal, double ventaTotal, double ventasGravadas13, double ventasGravadas0, double ventasNoGravadas, double ivaPercibido1, double ivaPercibido2, double ivaRetenido1, double ivaRetenido13, double montGDescVentNoSujetas, double montGDescVentExentas, double montGDescVentGrav, double totOtroMonNoAfec, double totalAPagar, double seguro, double flete, double contribucionSeguridad, double fovial, double cotrans, double contribucionTurismo5, double contribucionTurismo7, double impuestoEspecifico, double cesc, String campo1, String campo3, String campo2, String campo4, String campoExtFE, String tipoItemExpor, String codSucE, String emailE, String codPais, String observacionesDte, String nombrePais, String fechaHoraGeneracion, String tipoPersona, String numControl, String codGeneracion, String telsucE, String selloGeneracion, String formatodocumento, String resolucion, String resInicio, String resFin, String resFecha, String serie, String otrosDocIdent, String otrosDocDescri, String ventCterNit, String ventCterNombre, String docRelTipo, String docRelNum, String docRelFecha, String formaPago, String plazo, String nomConductor, String numIdenConductor, String modTransp, String numIdTransp, String responsableEmisor, String numDocEmisor, String responsableReceptor, String numDocReceptor, String mostrarTributo, String numeroControl, String codigoGeneracion, String motivoContin, String nombreComercialCl, String codContingencia, String modeloFacturacion, String tipoTransmisión, String fInicioContin, String fFinContin, String horaIniContin, String horaFinContin, int estado) {
        this.idFacturaConsumidorFinal = idFacturaConsumidorFinal;
        this.nit = nit;
        this.nrc = nrc;
        this.idDepartamentoEmisor = idDepartamentoEmisor;
        this.idMunicipioEmisor = idMunicipioEmisor;
        this.direccionEmisor = direccionEmisor;
        this.fechaEnvio = fechaEnvio;
        this.fechaEmision = fechaEmision;
        this.terminal = terminal;
        this.numFactura = numFactura;
        this.correlativoInterno = correlativoInterno;
        this.numeroTransaccion = numeroTransaccion;
        this.codigoUsuario = codigoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.cajaSuc = cajaSuc;
        this.tipoDocumento = tipoDocumento;
        this.pdv = pdv;
        this.nitCliente = nitCliente;
        this.duiCliente = duiCliente;
        this.nrcCliente = nrcCliente;
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.departamento = departamento;
        this.municipio = municipio;
        this.telefono = telefono;
        this.email = email;
        this.sms = sms;
        this.whatsapp = whatsapp;
        this.idDepartamentoReceptor = idDepartamentoReceptor;
        this.idMunicipioReceptor = idMunicipioReceptor;
        this.codigoActividadEconomica = codigoActividadEconomica;
        this.tipoCatContribuyente = tipoCatContribuyente;
        this.giro = giro;
        this.codicionPago = codicionPago;
        this.CCFAnterior = CCFAnterior;
        this.vtaACuentaDe = vtaACuentaDe;
        this.notaRemision = notaRemision;
        this.noFecha = noFecha;
        this.saldoCapital = saldoCapital;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.ventasNoSujetas = ventasNoSujetas;
        this.ivaItem = ivaItem;
        this.delAl = delAl;
        this.exportaciones = exportaciones;
        this.numDocRel = numDocRel;
        this.codTributo = codTributo;
        this.tributos = tributos;
        this.uniMedidaCodigo = uniMedidaCodigo;
        this.ventasExentas = ventasExentas;
        this.fecha = fecha;
        this.tipoItem = tipoItem;
        this.tipoDteRel = tipoDteRel;
        this.codigoRetencionMH = codigoRetencionMH;
        this.cantidad = cantidad;
        this.ventasGravadas = ventasGravadas;
        this.ivaRetenido = ivaRetenido;
        this.descuento = descuento;
        this.descuentoItem = descuentoItem;
        this.otroMonNoAfec = otroMonNoAfec;
        this.montoLetras = montoLetras;
        this.sumas = sumas;
        this.subTotalVentasExentas = subTotalVentasExentas;
        this.subTotalVentasNoSujetas = subTotalVentasNoSujetas;
        this.subTotalVentasGravadas = subTotalVentasGravadas;
        this.ventasGravada = ventasGravada;
        this.iva = iva;
        this.renta = renta;
        this.impuesto = impuesto;
        this.ventasExenta = ventasExenta;
        this.ventasNoSujeta = ventasNoSujeta;
        this.codigoTributo = codigoTributo;
        this.codigoTributos = codigoTributos;
        this.descripcionTributo = descripcionTributo;
        this.valorTributo = valorTributo;
        this.descuentos = descuentos;
        this.abonos = abonos;
        this.cantidadTotal = cantidadTotal;
        this.ventaTotal = ventaTotal;
        this.ventasGravadas13 = ventasGravadas13;
        this.ventasGravadas0 = ventasGravadas0;
        this.ventasNoGravadas = ventasNoGravadas;
        this.ivaPercibido1 = ivaPercibido1;
        this.ivaPercibido2 = ivaPercibido2;
        this.ivaRetenido1 = ivaRetenido1;
        this.ivaRetenido13 = ivaRetenido13;
        this.montGDescVentNoSujetas = montGDescVentNoSujetas;
        this.montGDescVentExentas = montGDescVentExentas;
        this.montGDescVentGrav = montGDescVentGrav;
        this.totOtroMonNoAfec = totOtroMonNoAfec;
        this.totalAPagar = totalAPagar;
        this.seguro = seguro;
        this.flete = flete;
        this.contribucionSeguridad = contribucionSeguridad;
        this.fovial = fovial;
        this.cotrans = cotrans;
        this.contribucionTurismo5 = contribucionTurismo5;
        this.contribucionTurismo7 = contribucionTurismo7;
        this.impuestoEspecifico = impuestoEspecifico;
        this.cesc = cesc;
        this.campo1 = campo1;
        this.campo3 = campo3;
        this.campo2 = campo2;
        this.campo4 = campo4;
        this.campoExtFE = campoExtFE;
        this.tipoItemExpor = tipoItemExpor;
        this.codSucE = codSucE;
        this.emailE = emailE;
        this.codPais = codPais;
        this.observacionesDte = observacionesDte;
        this.nombrePais = nombrePais;
        this.fechaHoraGeneracion = fechaHoraGeneracion;
        this.tipoPersona = tipoPersona;
        this.numControl = numControl;
        this.codGeneracion = codGeneracion;
        this.telsucE = telsucE;
        this.selloGeneracion = selloGeneracion;
        this.formatodocumento = formatodocumento;
        this.resolucion = resolucion;
        this.resInicio = resInicio;
        this.resFin = resFin;
        this.resFecha = resFecha;
        this.serie = serie;
        this.otrosDocIdent = otrosDocIdent;
        this.otrosDocDescri = otrosDocDescri;
        this.ventCterNit = ventCterNit;
        this.ventCterNombre = ventCterNombre;
        this.docRelTipo = docRelTipo;
        this.docRelNum = docRelNum;
        this.docRelFecha = docRelFecha;
        this.formaPago = formaPago;
        this.plazo = plazo;
        this.nomConductor = nomConductor;
        this.numIdenConductor = numIdenConductor;
        this.modTransp = modTransp;
        this.numIdTransp = numIdTransp;
        this.responsableEmisor = responsableEmisor;
        this.numDocEmisor = numDocEmisor;
        this.responsableReceptor = responsableReceptor;
        this.numDocReceptor = numDocReceptor;
        this.mostrarTributo = mostrarTributo;
        this.numeroControl = numeroControl;
        this.codigoGeneracion = codigoGeneracion;
        this.motivoContin = motivoContin;
        this.nombreComercialCl = nombreComercialCl;
        this.codContingencia = codContingencia;
        this.modeloFacturacion = modeloFacturacion;
        this.tipoTransmisión = tipoTransmisión;
        this.fInicioContin = fInicioContin;
        this.fFinContin = fFinContin;
        this.horaIniContin = horaIniContin;
        this.horaFinContin = horaFinContin;
        this.estado = estado;
    }

    public int getIdFacturaConsumidorFinal() {
        return idFacturaConsumidorFinal;
    }

    public void setIdFacturaConsumidorFinal(int idFacturaConsumidorFinal) {
        this.idFacturaConsumidorFinal = idFacturaConsumidorFinal;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public int getIdDepartamentoEmisor() {
        return idDepartamentoEmisor;
    }

    public void setIdDepartamentoEmisor(int idDepartamentoEmisor) {
        this.idDepartamentoEmisor = idDepartamentoEmisor;
    }

    public int getIdMunicipioEmisor() {
        return idMunicipioEmisor;
    }

    public void setIdMunicipioEmisor(int idMunicipioEmisor) {
        this.idMunicipioEmisor = idMunicipioEmisor;
    }

    public String getDireccionEmisor() {
        return direccionEmisor;
    }

    public void setDireccionEmisor(String direccionEmisor) {
        this.direccionEmisor = direccionEmisor;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public int getCorrelativoInterno() {
        return correlativoInterno;
    }

    public void setCorrelativoInterno(int correlativoInterno) {
        this.correlativoInterno = correlativoInterno;
    }

    public int getNumeroTransaccion() {
        return numeroTransaccion;
    }

    public void setNumeroTransaccion(int numeroTransaccion) {
        this.numeroTransaccion = numeroTransaccion;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getCajaSuc() {
        return cajaSuc;
    }

    public void setCajaSuc(String cajaSuc) {
        this.cajaSuc = cajaSuc;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getPdv() {
        return pdv;
    }

    public void setPdv(String pdv) {
        this.pdv = pdv;
    }

    public String getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }

    public String getDuiCliente() {
        return duiCliente;
    }

    public void setDuiCliente(String duiCliente) {
        this.duiCliente = duiCliente;
    }

    public String getNrcCliente() {
        return nrcCliente;
    }

    public void setNrcCliente(String nrcCliente) {
        this.nrcCliente = nrcCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public int getIdDepartamentoReceptor() {
        return idDepartamentoReceptor;
    }

    public void setIdDepartamentoReceptor(int idDepartamentoReceptor) {
        this.idDepartamentoReceptor = idDepartamentoReceptor;
    }

    public int getIdMunicipioReceptor() {
        return idMunicipioReceptor;
    }

    public void setIdMunicipioReceptor(int idMunicipioReceptor) {
        this.idMunicipioReceptor = idMunicipioReceptor;
    }

    public int getCodigoActividadEconomica() {
        return codigoActividadEconomica;
    }

    public void setCodigoActividadEconomica(int codigoActividadEconomica) {
        this.codigoActividadEconomica = codigoActividadEconomica;
    }

    public String getTipoCatContribuyente() {
        return tipoCatContribuyente;
    }

    public void setTipoCatContribuyente(String tipoCatContribuyente) {
        this.tipoCatContribuyente = tipoCatContribuyente;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getCodicionPago() {
        return codicionPago;
    }

    public void setCodicionPago(int codicionPago) {
        this.codicionPago = codicionPago;
    }

    public String getCCFAnterior() {
        return CCFAnterior;
    }

    public void setCCFAnterior(String CCFAnterior) {
        this.CCFAnterior = CCFAnterior;
    }

    public String getVtaACuentaDe() {
        return vtaACuentaDe;
    }

    public void setVtaACuentaDe(String vtaACuentaDe) {
        this.vtaACuentaDe = vtaACuentaDe;
    }

    public String getNotaRemision() {
        return notaRemision;
    }

    public void setNotaRemision(String notaRemision) {
        this.notaRemision = notaRemision;
    }

    public String getNoFecha() {
        return noFecha;
    }

    public void setNoFecha(String noFecha) {
        this.noFecha = noFecha;
    }

    public double getSaldoCapital() {
        return saldoCapital;
    }

    public void setSaldoCapital(double saldoCapital) {
        this.saldoCapital = saldoCapital;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getVentasNoSujetas() {
        return ventasNoSujetas;
    }

    public void setVentasNoSujetas(double ventasNoSujetas) {
        this.ventasNoSujetas = ventasNoSujetas;
    }

    public double getIvaItem() {
        return ivaItem;
    }

    public void setIvaItem(double ivaItem) {
        this.ivaItem = ivaItem;
    }

    public double getDelAl() {
        return delAl;
    }

    public void setDelAl(double delAl) {
        this.delAl = delAl;
    }

    public int getExportaciones() {
        return exportaciones;
    }

    public void setExportaciones(int exportaciones) {
        this.exportaciones = exportaciones;
    }

    public int getNumDocRel() {
        return numDocRel;
    }

    public void setNumDocRel(int numDocRel) {
        this.numDocRel = numDocRel;
    }

    public int getCodTributo() {
        return codTributo;
    }

    public void setCodTributo(int codTributo) {
        this.codTributo = codTributo;
    }

    public double getTributos() {
        return tributos;
    }

    public void setTributos(double tributos) {
        this.tributos = tributos;
    }

    public int getUniMedidaCodigo() {
        return uniMedidaCodigo;
    }

    public void setUniMedidaCodigo(int uniMedidaCodigo) {
        this.uniMedidaCodigo = uniMedidaCodigo;
    }

    public double getVentasExentas() {
        return ventasExentas;
    }

    public void setVentasExentas(double ventasExentas) {
        this.ventasExentas = ventasExentas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(int tipoItem) {
        this.tipoItem = tipoItem;
    }

    public int getTipoDteRel() {
        return tipoDteRel;
    }

    public void setTipoDteRel(int tipoDteRel) {
        this.tipoDteRel = tipoDteRel;
    }

    public int getCodigoRetencionMH() {
        return codigoRetencionMH;
    }

    public void setCodigoRetencionMH(int codigoRetencionMH) {
        this.codigoRetencionMH = codigoRetencionMH;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getVentasGravadas() {
        return ventasGravadas;
    }

    public void setVentasGravadas(int ventasGravadas) {
        this.ventasGravadas = ventasGravadas;
    }

    public double getIvaRetenido() {
        return ivaRetenido;
    }

    public void setIvaRetenido(double ivaRetenido) {
        this.ivaRetenido = ivaRetenido;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getDescuentoItem() {
        return descuentoItem;
    }

    public void setDescuentoItem(int descuentoItem) {
        this.descuentoItem = descuentoItem;
    }

    public double getOtroMonNoAfec() {
        return otroMonNoAfec;
    }

    public void setOtroMonNoAfec(double otroMonNoAfec) {
        this.otroMonNoAfec = otroMonNoAfec;
    }

    public String getMontoLetras() {
        return montoLetras;
    }

    public void setMontoLetras(String montoLetras) {
        this.montoLetras = montoLetras;
    }

    public double getSumas() {
        return sumas;
    }

    public void setSumas(double sumas) {
        this.sumas = sumas;
    }

    public double getSubTotalVentasExentas() {
        return subTotalVentasExentas;
    }

    public void setSubTotalVentasExentas(double subTotalVentasExentas) {
        this.subTotalVentasExentas = subTotalVentasExentas;
    }

    public double getSubTotalVentasNoSujetas() {
        return subTotalVentasNoSujetas;
    }

    public void setSubTotalVentasNoSujetas(double subTotalVentasNoSujetas) {
        this.subTotalVentasNoSujetas = subTotalVentasNoSujetas;
    }

    public double getSubTotalVentasGravadas() {
        return subTotalVentasGravadas;
    }

    public void setSubTotalVentasGravadas(double subTotalVentasGravadas) {
        this.subTotalVentasGravadas = subTotalVentasGravadas;
    }

    public double getVentasGravada() {
        return ventasGravada;
    }

    public void setVentasGravada(double ventasGravada) {
        this.ventasGravada = ventasGravada;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getVentasExenta() {
        return ventasExenta;
    }

    public void setVentasExenta(double ventasExenta) {
        this.ventasExenta = ventasExenta;
    }

    public double getVentasNoSujeta() {
        return ventasNoSujeta;
    }

    public void setVentasNoSujeta(double ventasNoSujeta) {
        this.ventasNoSujeta = ventasNoSujeta;
    }

    public double getCodigoTributo() {
        return codigoTributo;
    }

    public void setCodigoTributo(double codigoTributo) {
        this.codigoTributo = codigoTributo;
    }

    public int getCodigoTributos() {
        return codigoTributos;
    }

    public void setCodigoTributos(int codigoTributos) {
        this.codigoTributos = codigoTributos;
    }

    public String getDescripcionTributo() {
        return descripcionTributo;
    }

    public void setDescripcionTributo(String descripcionTributo) {
        this.descripcionTributo = descripcionTributo;
    }

    public double getValorTributo() {
        return valorTributo;
    }

    public void setValorTributo(double valorTributo) {
        this.valorTributo = valorTributo;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getAbonos() {
        return abonos;
    }

    public void setAbonos(double abonos) {
        this.abonos = abonos;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public double getVentaTotal() {
        return ventaTotal;
    }

    public void setVentaTotal(double ventaTotal) {
        this.ventaTotal = ventaTotal;
    }

    public double getVentasGravadas13() {
        return ventasGravadas13;
    }

    public void setVentasGravadas13(double ventasGravadas13) {
        this.ventasGravadas13 = ventasGravadas13;
    }

    public double getVentasGravadas0() {
        return ventasGravadas0;
    }

    public void setVentasGravadas0(double ventasGravadas0) {
        this.ventasGravadas0 = ventasGravadas0;
    }

    public double getVentasNoGravadas() {
        return ventasNoGravadas;
    }

    public void setVentasNoGravadas(double ventasNoGravadas) {
        this.ventasNoGravadas = ventasNoGravadas;
    }

    public double getIvaPercibido1() {
        return ivaPercibido1;
    }

    public void setIvaPercibido1(double ivaPercibido1) {
        this.ivaPercibido1 = ivaPercibido1;
    }

    public double getIvaPercibido2() {
        return ivaPercibido2;
    }

    public void setIvaPercibido2(double ivaPercibido2) {
        this.ivaPercibido2 = ivaPercibido2;
    }

    public double getIvaRetenido1() {
        return ivaRetenido1;
    }

    public void setIvaRetenido1(double ivaRetenido1) {
        this.ivaRetenido1 = ivaRetenido1;
    }

    public double getIvaRetenido13() {
        return ivaRetenido13;
    }

    public void setIvaRetenido13(double ivaRetenido13) {
        this.ivaRetenido13 = ivaRetenido13;
    }

    public double getMontGDescVentNoSujetas() {
        return montGDescVentNoSujetas;
    }

    public void setMontGDescVentNoSujetas(double montGDescVentNoSujetas) {
        this.montGDescVentNoSujetas = montGDescVentNoSujetas;
    }

    public double getMontGDescVentExentas() {
        return montGDescVentExentas;
    }

    public void setMontGDescVentExentas(double montGDescVentExentas) {
        this.montGDescVentExentas = montGDescVentExentas;
    }

    public double getMontGDescVentGrav() {
        return montGDescVentGrav;
    }

    public void setMontGDescVentGrav(double montGDescVentGrav) {
        this.montGDescVentGrav = montGDescVentGrav;
    }

    public double getTotOtroMonNoAfec() {
        return totOtroMonNoAfec;
    }

    public void setTotOtroMonNoAfec(double totOtroMonNoAfec) {
        this.totOtroMonNoAfec = totOtroMonNoAfec;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getFlete() {
        return flete;
    }

    public void setFlete(double flete) {
        this.flete = flete;
    }

    public double getContribucionSeguridad() {
        return contribucionSeguridad;
    }

    public void setContribucionSeguridad(double contribucionSeguridad) {
        this.contribucionSeguridad = contribucionSeguridad;
    }

    public double getFovial() {
        return fovial;
    }

    public void setFovial(double fovial) {
        this.fovial = fovial;
    }

    public double getCotrans() {
        return cotrans;
    }

    public void setCotrans(double cotrans) {
        this.cotrans = cotrans;
    }

    public double getContribucionTurismo5() {
        return contribucionTurismo5;
    }

    public void setContribucionTurismo5(double contribucionTurismo5) {
        this.contribucionTurismo5 = contribucionTurismo5;
    }

    public double getContribucionTurismo7() {
        return contribucionTurismo7;
    }

    public void setContribucionTurismo7(double contribucionTurismo7) {
        this.contribucionTurismo7 = contribucionTurismo7;
    }

    public double getImpuestoEspecifico() {
        return impuestoEspecifico;
    }

    public void setImpuestoEspecifico(double impuestoEspecifico) {
        this.impuestoEspecifico = impuestoEspecifico;
    }

    public double getCesc() {
        return cesc;
    }

    public void setCesc(double cesc) {
        this.cesc = cesc;
    }

    public String getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public String getCampo3() {
        return campo3;
    }

    public void setCampo3(String campo3) {
        this.campo3 = campo3;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }

    public String getCampo4() {
        return campo4;
    }

    public void setCampo4(String campo4) {
        this.campo4 = campo4;
    }

    public String getCampoExtFE() {
        return campoExtFE;
    }

    public void setCampoExtFE(String campoExtFE) {
        this.campoExtFE = campoExtFE;
    }

    public String getTipoItemExpor() {
        return tipoItemExpor;
    }

    public void setTipoItemExpor(String tipoItemExpor) {
        this.tipoItemExpor = tipoItemExpor;
    }

    public String getCodSucE() {
        return codSucE;
    }

    public void setCodSucE(String codSucE) {
        this.codSucE = codSucE;
    }

    public String getEmailE() {
        return emailE;
    }

    public void setEmailE(String emailE) {
        this.emailE = emailE;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public String getObservacionesDte() {
        return observacionesDte;
    }

    public void setObservacionesDte(String observacionesDte) {
        this.observacionesDte = observacionesDte;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getFechaHoraGeneracion() {
        return fechaHoraGeneracion;
    }

    public void setFechaHoraGeneracion(String fechaHoraGeneracion) {
        this.fechaHoraGeneracion = fechaHoraGeneracion;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getCodGeneracion() {
        return codGeneracion;
    }

    public void setCodGeneracion(String codGeneracion) {
        this.codGeneracion = codGeneracion;
    }

    public String getTelsucE() {
        return telsucE;
    }

    public void setTelsucE(String telsucE) {
        this.telsucE = telsucE;
    }

    public String getSelloGeneracion() {
        return selloGeneracion;
    }

    public void setSelloGeneracion(String selloGeneracion) {
        this.selloGeneracion = selloGeneracion;
    }

    public String getFormatodocumento() {
        return formatodocumento;
    }

    public void setFormatodocumento(String formatodocumento) {
        this.formatodocumento = formatodocumento;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getResInicio() {
        return resInicio;
    }

    public void setResInicio(String resInicio) {
        this.resInicio = resInicio;
    }

    public String getResFin() {
        return resFin;
    }

    public void setResFin(String resFin) {
        this.resFin = resFin;
    }

    public String getResFecha() {
        return resFecha;
    }

    public void setResFecha(String resFecha) {
        this.resFecha = resFecha;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getOtrosDocIdent() {
        return otrosDocIdent;
    }

    public void setOtrosDocIdent(String otrosDocIdent) {
        this.otrosDocIdent = otrosDocIdent;
    }

    public String getOtrosDocDescri() {
        return otrosDocDescri;
    }

    public void setOtrosDocDescri(String otrosDocDescri) {
        this.otrosDocDescri = otrosDocDescri;
    }

    public String getVentCterNit() {
        return ventCterNit;
    }

    public void setVentCterNit(String ventCterNit) {
        this.ventCterNit = ventCterNit;
    }

    public String getVentCterNombre() {
        return ventCterNombre;
    }

    public void setVentCterNombre(String ventCterNombre) {
        this.ventCterNombre = ventCterNombre;
    }

    public String getDocRelTipo() {
        return docRelTipo;
    }

    public void setDocRelTipo(String docRelTipo) {
        this.docRelTipo = docRelTipo;
    }

    public String getDocRelNum() {
        return docRelNum;
    }

    public void setDocRelNum(String docRelNum) {
        this.docRelNum = docRelNum;
    }

    public String getDocRelFecha() {
        return docRelFecha;
    }

    public void setDocRelFecha(String docRelFecha) {
        this.docRelFecha = docRelFecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public String getNomConductor() {
        return nomConductor;
    }

    public void setNomConductor(String nomConductor) {
        this.nomConductor = nomConductor;
    }

    public String getNumIdenConductor() {
        return numIdenConductor;
    }

    public void setNumIdenConductor(String numIdenConductor) {
        this.numIdenConductor = numIdenConductor;
    }

    public String getModTransp() {
        return modTransp;
    }

    public void setModTransp(String modTransp) {
        this.modTransp = modTransp;
    }

    public String getNumIdTransp() {
        return numIdTransp;
    }

    public void setNumIdTransp(String numIdTransp) {
        this.numIdTransp = numIdTransp;
    }

    public String getResponsableEmisor() {
        return responsableEmisor;
    }

    public void setResponsableEmisor(String responsableEmisor) {
        this.responsableEmisor = responsableEmisor;
    }

    public String getNumDocEmisor() {
        return numDocEmisor;
    }

    public void setNumDocEmisor(String numDocEmisor) {
        this.numDocEmisor = numDocEmisor;
    }

    public String getResponsableReceptor() {
        return responsableReceptor;
    }

    public void setResponsableReceptor(String responsableReceptor) {
        this.responsableReceptor = responsableReceptor;
    }

    public String getNumDocReceptor() {
        return numDocReceptor;
    }

    public void setNumDocReceptor(String numDocReceptor) {
        this.numDocReceptor = numDocReceptor;
    }

    public String getMostrarTributo() {
        return mostrarTributo;
    }

    public void setMostrarTributo(String mostrarTributo) {
        this.mostrarTributo = mostrarTributo;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getCodigoGeneracion() {
        return codigoGeneracion;
    }

    public void setCodigoGeneracion(String codigoGeneracion) {
        this.codigoGeneracion = codigoGeneracion;
    }

    public String getMotivoContin() {
        return motivoContin;
    }

    public void setMotivoContin(String motivoContin) {
        this.motivoContin = motivoContin;
    }

    public String getNombreComercialCl() {
        return nombreComercialCl;
    }

    public void setNombreComercialCl(String nombreComercialCl) {
        this.nombreComercialCl = nombreComercialCl;
    }

    public String getCodContingencia() {
        return codContingencia;
    }

    public void setCodContingencia(String codContingencia) {
        this.codContingencia = codContingencia;
    }

    public String getModeloFacturacion() {
        return modeloFacturacion;
    }

    public void setModeloFacturacion(String modeloFacturacion) {
        this.modeloFacturacion = modeloFacturacion;
    }

    public String getTipoTransmisión() {
        return tipoTransmisión;
    }

    public void setTipoTransmisión(String tipoTransmisión) {
        this.tipoTransmisión = tipoTransmisión;
    }

    public String getfInicioContin() {
        return fInicioContin;
    }

    public void setfInicioContin(String fInicioContin) {
        this.fInicioContin = fInicioContin;
    }

    public String getfFinContin() {
        return fFinContin;
    }

    public void setfFinContin(String fFinContin) {
        this.fFinContin = fFinContin;
    }

    public String getHoraIniContin() {
        return horaIniContin;
    }

    public void setHoraIniContin(String horaIniContin) {
        this.horaIniContin = horaIniContin;
    }

    public String getHoraFinContin() {
        return horaFinContin;
    }

    public void setHoraFinContin(String horaFinContin) {
        this.horaFinContin = horaFinContin;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    

}
