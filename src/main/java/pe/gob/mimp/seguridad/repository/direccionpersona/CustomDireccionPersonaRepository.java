/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.repository.direccionpersona;

import java.util.List;
import pe.gob.mimp.seguridad.model.DireccionPersona;
import pe.gob.mimp.seguridad.model.Persona;

/**
 *
 * @author Omar
 */
public interface CustomDireccionPersonaRepository {

    List<DireccionPersona> obtenerDirecciones(Persona persona) throws Exception;
}
