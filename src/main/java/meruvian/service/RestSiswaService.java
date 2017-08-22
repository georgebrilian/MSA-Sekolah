package meruvian.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import meruvian.entity.Siswa;
import meruvian.repository.SiswaRepository;

@Service
@Transactional(readOnly = true)
public class RestSiswaService implements SiswaService{
	@Inject
	private SiswaRepository siswaRepository;
	
	public Siswa getSiswaByNis(long nis) {
		// TODO Auto-generated method stub
		return siswaRepository.findByNis(nis);
	}

	public List<Siswa> findSiswaByNama(String nama) {
		// TODO Auto-generated method stub
		return siswaRepository.findByNama(nama);
	}

	@Transactional
	public Siswa saveSiswa(Siswa siswa) {
		// TODO Auto-generated method stub
		siswa.setNis(0);
		return siswaRepository.save(siswa);
	}

	@Transactional
	public Siswa updateSiswa(long nis, Siswa siswa) {
		// TODO Auto-generated method stub
		Siswa ori = getSiswaByNis(siswa.getNis());
		if (ori != null){
			ori.setNama(siswa.getNama());
			ori.setJenis_kelamin(siswa.getJenis_kelamin());
			ori.setJurusan(siswa.getJurusan());
			ori.setKelas(siswa.getKelas());
		}
		return ori;
	}

	@Transactional
	public void deleteSiswa(long nis) {
		// TODO Auto-generated method stub
		siswaRepository.delete(nis);
		
	}

}
