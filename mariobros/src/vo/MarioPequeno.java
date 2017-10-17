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
public class MarioPequeno implements EstadoMario {

    @Override
    public EstadoMario pegarFlor() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        System.out.println("Mario em chamas");
        
        return new MarioFogo();
    }

    @Override
    public EstadoMario pegarCogumelo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        System.out.println("Mario Grande");
        
        return new MarioGrande();
    }

    @Override
    public EstadoMario pegarPena() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Mario com Capa");
        
        return new MarioComCapa();
    }

    @Override
    public EstadoMario levarDano() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Mario Morto - Game Over");
        
        return new MarioMorto();
    }
    
}
