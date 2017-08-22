package meruvian.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
@Entity
@Table(name = "siswa")
public class Siswa {
	private long nis;
	private String nama;
	private String jurusan;
	private String jenis_kelamin;
	private Kelas kelas;

	@ApiModelProperty
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getNis() {
		return nis;
	}

	public void setNis(long nis) {
		this.nis = nis;
	}

	@ApiModelProperty(value = "Siswa Nama", required = true)
	@Column(nullable = false)
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	@ApiModelProperty(value = "Siswa Jurusan", required = true)
	@Column(nullable = false)
	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	@ApiModelProperty(value = "Siswa Kelamin", required = true)
	@Column(nullable = false)
	public String getJenis_kelamin() {
		return jenis_kelamin;
	}

	public void setJenis_kelamin(String jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}

	@ApiModelProperty(value = "Kelas dari Ruangan")
	@ManyToOne
	@JoinColumn(name = "ruangan_nomor")
	public Kelas getKelas() {
		return kelas;
	}

	public void setKelas(Kelas kelas) {
		this.kelas = kelas;
	}

}