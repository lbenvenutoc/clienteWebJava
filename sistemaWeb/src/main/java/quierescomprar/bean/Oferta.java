package quierescomprar.bean;

// Generated 08/07/2012 01:07:49 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;



public class Oferta implements java.io.Serializable {

	private Integer codOfe;
	private Producto producto;
	private Date fecIniOfe;
	private Date fecFinOfe;
	private Double porOfe;
	private String flgAct;
	
	

	public Oferta() {
	}

	public Oferta(Producto producto) {
		this.producto = producto;
	}

	
	public Oferta(Producto producto, Date fecIniOfe, Date fecFinOfe,
			Double porOfe, String flgAct) {
		this.producto = producto;
		this.fecIniOfe = fecIniOfe;
		this.fecFinOfe = fecFinOfe;
		this.porOfe = porOfe;
		this.flgAct=flgAct;
	}


	public Integer getCodOfe() {
		return this.codOfe;
	}

	public void setCodOfe(Integer codOfe) {
		this.codOfe = codOfe;
	}

	
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public Date getFecIniOfe() {
		return this.fecIniOfe;
	}

	public void setFecIniOfe(Date fecIniOfe) {
		this.fecIniOfe = fecIniOfe;
	}


	public Date getFecFinOfe() {
		return this.fecFinOfe;
	}

	public void setFecFinOfe(Date fecFinOfe) {
		this.fecFinOfe = fecFinOfe;
	}

	
	public Double getPorOfe() {
		return this.porOfe;
	}

	public void setPorOfe(Double porOfe) {
		this.porOfe = porOfe;
	}
	
	
	
	public String getFlgAct() {
		return flgAct;
	}

	public void setFlgAct(String flgAct) {
		this.flgAct = flgAct;
	}

}
