package meruvian.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
@Entity
@Table(name = "kelas")
public class Kelas {
	private long nomor;
	private String nama;
	private String kapasitas;


	@ApiModelProperty("Kelas NOMOR")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getNomor() {
		return nomor;
	}

	public void setNomor(long nomor) {
		this.nomor = nomor;
	}

	@ApiModelProperty(value ="Kelas Nama", required = true)
	@Column(nullable = false)
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	@ApiModelProperty(value = "Kelas Kapasitas", required = true)
	public String getKapasitas() {
		return kapasitas;
	}

	public void setKapasitas(String kapasitas) {
		this.kapasitas = kapasitas;
	}

}
