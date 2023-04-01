/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioUnoExamen;

/**
 *
 * @author carri
 */
public class AlumnoContructor {
    private float cal1 ;
    private float cal2 ;
    private float cal3 ;
    private float cal4 ;
    private float cal5 ;

    public AlumnoContructor() {
    }

    public AlumnoContructor(float cal1, float cal2, float cal3, float cal4, float cal5) {
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
        this.cal4 = cal4;
        this.cal5 = cal5;
    }

    public float getCal1() {
        return cal1;
    }

    public void setCal1(float cal1) {
        this.cal1 = cal1;
    }

    public float getCal2() {
        return cal2;
    }

    public void setCal2(float cal2) {
        this.cal2 = cal2;
    }

    public float getCal3() {
        return cal3;
    }

    public void setCal3(float cal3) {
        this.cal3 = cal3;
    }

    public float getCal4() {
        return cal4;
    }

    public void setCal4(float cal4) {
        this.cal4 = cal4;
    }

    public float getCal5() {
        return cal5;
    }

    public void setCal5(float cal5) {
        this.cal5 = cal5;
    }

    @Override
    public String toString() {
        return "AlumnoContructor{" + "cal1=" + cal1 + ", cal2=" + cal2 + ", cal3=" + cal3 + ", cal4=" + cal4 + ", cal5=" + cal5 + '}';
    }
   
    public String calcularPromedio (){
        float prom = (cal1+  cal2+ cal3 + cal4+  cal5)/5;
        
        if ( prom>=70){
            return "tu promedio es " + prom + " es aprobatorio";
        }else{
            return "tu promedio es " + prom + " es reprobatorio";
        }
    }
    
    
}
