/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author a1372920
 */
public class Mario implements EstadoMario{
     private EstadoMario estado;
    
    public  Mario(){
        
        this.estado = new MarioPequeno();
    }
    
    @Override
    public EstadoMario pegarFlor() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        final EstadoMario estado = this.estado.pegarFlor();
        
        atualizarEstado(estado);
        
        return estado;
    }

    @Override
    public EstadoMario pegarCogumelo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        final EstadoMario estado = this.estado.pegarCogumelo();
        
        atualizarEstado(estado);
        
        return estado;
    }

    @Override
    public EstadoMario pegarPena() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        final EstadoMario estado = this.estado.pegarPena();
        
        atualizarEstado(estado);
        
         return estado;
    }

    @Override
    public EstadoMario levarDano() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        final EstadoMario estado = this.estado.levarDano();
        
        atualizarEstado(estado);
        
        return estado;
    }
  
    
    public void atualizarEstado(EstadoMario novoEstado){
        this.estado = novoEstado;
    }
}
