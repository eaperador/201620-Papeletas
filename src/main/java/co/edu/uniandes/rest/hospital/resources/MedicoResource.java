/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.rest.hospital.resources;

import co.edu.uniandes.rest.hospital.dtos.MedicoDTO;
import co.edu.uniandes.rest.hospital.exceptions.MedicoException;
import co.edu.uniandes.rest.hospital.mocks.MedicoMock;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Nicolas
 */
@Path("consultorio")
@Produces("application/json")
public class MedicoResource {
    
    
    /**
     * Clase MedicoMock
     */
    private MedicoMock medico;
    
    /**
     * Metodo que optiene la lista de todos los medicos
     */
    
    @GET
    public List<MedicoDTO> getMedicos() throws MedicoException
    {
     return medico.getMedico();
    }
    /**
     * Retorna un medico dado su ID
     * @param id id del medico buscado
     * @return medico con el id especificado
     * @throws MedicoException cuando no existe un medico con el id
     */
    @GET
    @Path("{id: \\d+}")
    public MedicoDTO getMedicoID(@PathParam("id")Long id)throws MedicoException
    {
        return medico.getMedID(id);
    }
    
    /**
     * Crea un nuevo medico
     * @param medi medico a agregar
     * @return medico agregado
     * @throws MedicoException cuando ya existe un medico con el id dado 
     */
    @POST
    public MedicoDTO createMedico(MedicoDTO medi)throws MedicoException
    {
     return medico.createMedico(medi);
    }
    
    
    /**
     * Borra un medico
     * @param medicoN medico a borrar
     * @throws MedicoException si no existe el medico que se quiere eliminar
     */
    @DELETE
    @Path("{id: \\d+}")
    public void deleteMedico(Long id) throws MedicoException
    {
         medico.deleteMedico(id);
    }
    
    /**
     * Actualiza un medico dado su id
     * @param medicoN Medico con los nuevos datos
     * @return medico actualizado
     */
    @PUT
    @Path ("{id: \\d+}")
    public MedicoDTO updateMedico(MedicoDTO medicoN) throws MedicoException
    {
        return medico.updateMedico(medicoN);
    }

    
    
    
    
    
}