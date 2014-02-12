package RestfullTestServer.testserver.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import RestfullTestServer.dao.DataProvider;


@Path("/status")
public class Status {

	public static final String _VERSION = "0.0.01";

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Web Service</p>";
	}

	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion() {
		return DataProvider.getLauncherVersion();
	}
}
