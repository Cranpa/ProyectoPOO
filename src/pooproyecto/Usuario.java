/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproyecto;



/**
 *
 * @author usuario
 */
public class Usuario {
    private String nombre;
    private TipoDocumento documento;
    private int nroIdentificacion;
    private int telefono;
    private String fechaNacimento;
    private String usuario;
    private String contraseña;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the documento
     */
    public TipoDocumento getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(TipoDocumento documento) {
        this.documento = documento;
    }

    /**
     * @return the nroIdentificacion
     */
    public int getNroIdentificacion() {
        return nroIdentificacion;
    }

    /**
     * @param nroIdentificacion the nroIdentificacion to set
     */
    public void setNroIdentificacion(int nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the fechaNacimento
     */
    public String getFechaNacimento() {
        return fechaNacimento;
    }

    /**
     * @param fechaNacimento the fechaNacimento to set
     */
    public void setFechaNacimento(String fechaNacimento) {
        this.fechaNacimento = fechaNacimento;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   
    
    
    
}
