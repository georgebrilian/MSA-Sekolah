package meruvian.repository;
import java.util.List;

import meruvian.entity.Kelas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KelasRepository extends CrudRepository<Kelas, Long> {
	Kelas findByNomor(long nomor);

	@Query("SELECT k FROM Kelas k WHERE k.nama LIKE %?1%")
	List<Kelas> findByNama(String nama);
}
