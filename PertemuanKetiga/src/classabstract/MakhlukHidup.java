/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classabstract;

/**
 *
 * @author Husain
 */
public abstract class MakhlukHidup {

    protected String nama;

    public MakhlukHidup(String nama) {
        this.nama = nama;
    }

    public abstract void bernafas();

    public abstract void bergerak();
}
