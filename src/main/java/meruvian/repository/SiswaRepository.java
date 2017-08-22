package meruvian.repository;
import java.util.List;

import meruvian.entity.Siswa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiswaRepository extends CrudRepository<Siswa, Long> {
	Siswa findByNis(long nis);

	@Query("SELECT s FROM Siswa s WHERE s.nama LIKE %?1%")
	List<Siswa> findByNama(String nama);
}