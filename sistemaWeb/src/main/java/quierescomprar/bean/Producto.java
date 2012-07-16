package quierescomprar.bean;

// Generated 08/07/2012 01:07:49 PM by Hibernate Tools 3.4.0.CR1


import java.util.Set;



public class Producto implements java.io.Serializable {

	private Integer codPro;
	private String desPro;
	private Double prePro;
	

	public Producto() {
	}

	public Producto(String desPro, Double prePro, Set<Oferta> ofertas) {
		this.desPro = desPro;
		this.prePro = prePro;
		
	}

	
	public Integer getCodPro() {
		return this.codPro;
	}

	public void setCodPro(Integer codPro) {
		this.codPro = codPro;
	}

	
	public String getDesPro() {
		return this.desPro;
	}

	public void setDesPro(String desPro) {
		this.desPro = desPro;
	}

	
	public Double getPrePro() {
		return this.prePro;
	}

	public void setPrePro(Double prePro) {
		this.prePro = prePro;
	}


}
