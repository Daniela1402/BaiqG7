/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiq.proyectoG7.facade;

import baiq.proyectoG7.entity.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "ProyectoBaiqG7PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    @Override
    public Usuario recuperarClave(String correoRecuperar) {
        
         try {
            Query qt = em.createQuery("SELECT p FROM Usuario p where p.correo= :correoRecuperar");
            qt.setParameter("correoRecuperar", correoRecuperar);
            return (Usuario) qt.getSingleResult();
        } catch (Exception e) {
            return new Usuario();
        }
    }
    
}
