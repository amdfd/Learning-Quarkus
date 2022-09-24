package dev.amandafalcao;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/frutas")
public class FrutasResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruta> list() {
        return Fruta.listAll(); // O PanacheEntity já traz o método de listAll() pronto
    }
    
    @POST
    @Transactional
    public void novaFruta() {
       Fruta fruta =  new Fruta();
       fruta.nome = "Maçã";
       fruta.qtd = 5;
       fruta.persist();
    }
}