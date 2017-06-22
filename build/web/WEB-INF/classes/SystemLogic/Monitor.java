/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemLogic;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shihab
 */
public class Monitor implements Runnable {

    private Integer timestamp;
    public ArrayList<GarbageBin> bins;
    public ArrayList<Employee> employees;
    private double garbageLevel;

    public Monitor() {
        garbageLevel = 66.6;
        bins = new ArrayList<GarbageBin>();
        employees = new ArrayList<Employee>();
        GarbageBin gtemp = new GarbageBin();
        Employee etemp = new Employee();
        for (int i=0; i<gtemp.numberOfBins().intValue(); i++){
            bins.add(new GarbageBin());
            bins.get(i).viewBin(i+1);
        } 
        for (int i=0; i<etemp.numberOfEmployees().intValue(); i++){
            employees.add(new Employee());
            employees.get(i).viewEmployee(i+1);
        }
    }

    public void addBin(GarbageBin bin) {
        bins.add(bin);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void run() {
        for (int i = 0; i < bins.size(); i++) {
            if (bins.get(i).getGarbageLevel() > garbageLevel) {
                notifyAllEmployeesGarbageLevel(bins.get(i));
                System.out.println(bins.get(i).getID() + "," + bins.get(i).getPercentage());
            }
            // code for timestamp calls notifyAllEmployeesBinOffline()
        }
        for (int i=0; i<employees.size(); i++){
            employees.get(i).updateEmpList();
        }
        //System.out.println(bins.size());
    }

    private void notifyAllEmployeesGarbageLevel(GarbageBin g) {
        for (int i = 0; i < employees.size(); i++) {
            Notification notification = new Notification(employees.get(i));
            notification.notifyGarbageFull(g);
        }
    }

    private void notifyAllEmployeesBinOffline() {
        for (int i = 0; i < employees.size(); i++) {
            Notification notification = new Notification(employees.get(i));
            notification.notifyBinOffline();
        }
    }
}
