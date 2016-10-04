/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.rest.hospital.dtos;

import java.util.Date;





/**
 *Objeto de transferencia de datos de Citas.
 * @author jc.useche10
 */
public class CitaDTO 
{
    //identificador de la cita
    private Long idCita;
    
    //fecha para la cual esta programada la cita
    private Date fecha;
    
    //tiempo de la cita
    private int duracion;
    
    //medico asiganado a la cita
    private MedicoDTO medico;
    
    //consultorio asignado a la cita
    private ConsultorioDTO consultorio;
   
    private PacienteDTO paciente;
    
    private Boolean citaTerminada;
    
    private Long idTurno;
     /**
     * Constructor. Crea una nueva cita.
     */
    public CitaDTO(long pIdCita, Date fecha, MedicoDTO medico, long pIdTurno) 
    {
        this.idCita = pIdCita;
        this.fecha = fecha;
        this.duracion = 0;
        this.medico = medico;
        this.consultorio = null;
        this.paciente = null;
        this.idTurno = pIdTurno;
        this.citaTerminada = false;
    }
    
    public CitaDTO()
    {
      
    }
    public Long getId()
    {
        return idCita;
    }
    public void setId(Long pIdCita)
    {
        this.idCita = pIdCita;
    }
    /**
    * obtiene la fecha para la cual esta programada la cita
    * @returnfecha
    */
    public Date getFecha()
    {
        return fecha;
    }
     /**
     * cambia la fecha de una cita
     * @param pNuevaFecha  nueva fecha para la cita
     */
    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }
    
    /**
     * obtiene la duracion que tuvo la cita
     * @return duracion
     */
    public int getDuracion()
    {
        return duracion;
    }
    /**
     * establece la duracion de una cita
     * @param pDuracion 
     */
    public void setDuracion(int pDuracion)
    {
        duracion = pDuracion;
    }
   
    public MedicoDTO getMedico()
    {
       return medico;
    }
    
    public void setMedico(MedicoDTO pMedico)
    {
        medico = pMedico;
    }
    
    public ConsultorioDTO getConsultorio()
    {
       return consultorio;
    }
 
    public void setConsultorio(ConsultorioDTO pConsultorio)
    {
        consultorio = pConsultorio;
    }
    
    public PacienteDTO getPaciente()
    {
        return paciente;
    }
    
    public void setPaciente(PacienteDTO pPaciente)
    {
        paciente = pPaciente;
    }
    
    public boolean getCitaTerminada()
    {
        return citaTerminada;
    }
    public void setCitaTerminada()
    {
        citaTerminada = !citaTerminada;
    }
    public Long getIdTurno()
    {
        return idTurno;
    }
    public void seIdTurno(long pIdTurno)
    {
        idTurno = pIdTurno;
    }
}