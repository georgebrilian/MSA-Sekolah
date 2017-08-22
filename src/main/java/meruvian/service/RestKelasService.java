package meruvian.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import meruvian.entity.Kelas;
import meruvian.repository.KelasRepository;

@Service
@Transactional(readOnly = true)
public class RestKelasService implements KelasService {

	@Autowired
	private KelasRepository kelasRepository;
	
	public Kelas getKelasByNomor(long nomor) {
		// TODO Auto-generated method stub
		return kelasRepository.findByNomor(nomor);
	}

	public List<Kelas> findKelasByNama(String nama) {
		// TODO Auto-generated method stub
		return kelasRepository.findByNama(nama);
	}

	@Transactional
	public Kelas saveKelas(Kelas kelas) {
		// TODO Auto-generated method stub
		kelas.setNomor(0);
		
		return kelasRepository.save(kelas);
	}

	@Transactional
	public Kelas updateKelas(long nomor, Kelas kelas) {
		// TODO Auto-generated method stub
		Kelas ori = getKelasByNomor(kelas.getNomor());
		if (ori !=null){
			ori.setNama(kelas.getNama());
		ori.setKapasitas(kelas.getKapasitas());
		}
		
		return null;
	}

	@Transactional
	public void deleteKelas(long nomor) {
		kelasRepository.delete(nomor);
		// TODO Auto-generated method stub

	}

}