/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemLogic;

/**
 *
 * @author Shihab
 */
public class Notification {
    private Employee e;
    
    public Notification (Employee employee){
        e = employee;
    }

    public void notifyGarbageFull(GarbageBin g){
        e.notifyBin(g);
    }

    public void notifyBinOffline() {
        
    }
}
