package meruvian.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import meruvian.entity.Siswa;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Path("/siswa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(value = "/siswa")
public interface SiswaService {
	@GET
	@Path("/{nis}")
	@ApiOperation(value = "Find siswa by NIS", response = Siswa.class)
	Siswa getSiswaByNis(@PathParam("nis") @ApiParam("Siswa NIS") long nis);

	@GET
	@ApiOperation(value = "Find siswa", response = Siswa.class, responseContainer = "List")
	List<Siswa> findSiswaByNama(@QueryParam("nama") @DefaultValue("") String nama);

	@POST
	@ApiOperation(value = "Save siswa", response = Siswa.class)
	Siswa saveSiswa(Siswa siswa);

	@PUT
	@Path("/{nis}")
	@ApiOperation(value = "Update siswa", response = Siswa.class)
	Siswa updateSiswa(@PathParam("nis") @ApiParam("Siswa NIS") long nis, Siswa siswa);

	@DELETE
	@Path("/{nis}")
	@ApiOperation(value = "Delete siswa")
	void deleteSiswa(@PathParam("nis") @ApiParam("Siswa NIS") long nis);
}
