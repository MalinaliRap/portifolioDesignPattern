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
public class MarioMorto implements EstadoMario{

    @Override
    public EstadoMario pegarFlor() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return notificacaoMorte();
    }

    @Override
    public EstadoMario pegarCogumelo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return notificacaoMorte();
    }

    @Override
    public EstadoMario pegarPena() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return notificacaoMorte();
    }

    @Override
    public EstadoMario levarDano() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return notificacaoMorte();
    }

    private EstadoMario notificacaoMorte() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Mario esta morto!");
        
        return this;
    }
    
}
