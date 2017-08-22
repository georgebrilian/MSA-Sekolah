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

import meruvian.entity.Kelas;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Path("/kelas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(value = "/kelas")
public interface KelasService {
	@GET
	@Path("/{nomor}")
	@ApiOperation(value ="Find Kelas By NOMOR", response = Kelas.class)
	Kelas getKelasByNomor(@PathParam("nomor") @ApiParam("Kelas Nomor") long nomor);
	
	@GET
	@ApiOperation(value ="Find Kelas By Nama", response = Kelas.class)
	List<Kelas>findKelasByNama(@QueryParam("nama") @DefaultValue("") String nama);
	
	@POST
	@ApiOperation(value ="Save Kelas", response = Kelas.class)
	Kelas saveKelas(Kelas kelas);
	
	@PUT
	@Path("/{nomor}")
	@ApiOperation(value ="Update Kelas", response = Kelas.class)
	Kelas updateKelas(@PathParam("nomor") @ApiParam("Kelas Nomor") long nomor, Kelas kelas);
	
	@DELETE
	@Path("/{nomor}")
	@ApiOperation(value ="Delete Kelas", response = Kelas.class)
	void deleteKelas(@PathParam("nomor") @ApiParam("Kelas Nomor") long nomor);
}