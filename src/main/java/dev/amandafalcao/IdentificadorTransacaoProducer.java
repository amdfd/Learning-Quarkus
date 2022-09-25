package dev.amandafalcao;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

import io.quarkus.arc.DefaultBean;
import io.quarkus.arc.profile.IfBuildProfile;

public class IdentificadorTransacaoProducer {
	
    @Produces
    @DefaultBean
    @RequestScoped
    public IdentificadorTransacao produceTeste() {
        return new IdentificadorTransacao("Teste-");
    }
    
    @Produces
    @IfBuildProfile("prod") //Identifica o perfil
    @RequestScoped
    public IdentificadorTransacao produceProd() {
        return new IdentificadorTransacao("Prod-");
    }

}
