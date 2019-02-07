package br.com.webservice.resourses;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.webservice.model.domian.Produto;
import br.com.webservice.service.ProdutoService;
import javax.ws.rs.Consumes;

@Path("/produtos")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class ProdutoResourse {
  
       private ProdutoService service = new ProdutoService();
        
       @GET
       public List<Produto> getProdutos() {
             return service.getProdutos();
       }
        
       @GET
       @Path("{produtoId}")
       public Produto getProduto(@PathParam("produtoId") long id) {
             return service.getProduto(id);
       }
        
       @POST
       public Response save(Produto produto) {
              produto = service.saveProduto(produto);
              return Response.status(Response.Status.CREATED).entity(produto).build();
       }
        
       @PUT
       @Path("{produtoId}")
       public void update(@PathParam("produtoId") long id, Produto produto) {
             produto.setId(id);
             service.updateProduto(produto);
       }
        
       @DELETE
       @Path("{produtoId}")
       public void delete(@PathParam("produtoId") long id) {
             service.deleteProduto(id);
       }
}