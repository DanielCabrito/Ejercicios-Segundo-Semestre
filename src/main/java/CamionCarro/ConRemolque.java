/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CamionCarro;

/**
 *
 * @author carri
 */
public class ConRemolque extends RemolqueCamion {
    
    
    
    private float KmAcelerar2;
    private float puertas2;
    private int num;
   private  float KmAcelerar3;
    private float kmAcelerarTotal;

    public ConRemolque(float KmAcelerar2, float puertas2, int num, float KmAcelerar3, float kmAcelerarTotal) {
        this.KmAcelerar2 = KmAcelerar2;
        this.puertas2 = puertas2;
        this.num = num;
        this.KmAcelerar3 = KmAcelerar3;
        this.kmAcelerarTotal = kmAcelerarTotal;
    }

    public float getKmAcelerar2() {
        return KmAcelerar2;
    }

    public void setKmAcelerar2(float KmAcelerar2) {
        this.KmAcelerar2 = KmAcelerar2;
    }

    public float getPuertas2() {
        return puertas2;
    }

    public void setPuertas2(float puertas2) {
        this.puertas2 = puertas2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getKmAcelerar3() {
        return KmAcelerar3;
    }

    public void setKmAcelerar3(float KmAcelerar3) {
        this.KmAcelerar3 = KmAcelerar3;
    }

    public float getKmAcelerarTotal() {
        return kmAcelerarTotal;
    }

    public void setKmAcelerarTotal(float kmAcelerarTotal) {
        this.kmAcelerarTotal = kmAcelerarTotal;
    }
    

    public String remolquito (){
        return switch (num) {
            case 1 -> "tu camion lleva remolque";
            case 2 -> "tu camion no lleva remolque";
            default -> "opcion no valida";
        };
        
}
    public String newVelocidad (){
         kmAcelerarTotal = KmAcelerar2 + KmAcelerar3;
        return "tu velocidad es " + kmAcelerarTotal;
    }
    public String ConRemolque (){
        if (kmAcelerarTotal>100 && num == 1){
            return "cuidado vas a exceso de velocidad";
        }else 
            return "buena velocidad";
        
    }

    @Override
    public String toString() {
        return "Informacion Del Camion" + "\nKmAcelerar=" + KmAcelerar2 + "\npuertas=" + puertas2 + " \nKmAcelerar=" + KmAcelerar3 + "\n kmAcelerarTotal=" + kmAcelerarTotal + '}';
    }
    
    }
 
    

