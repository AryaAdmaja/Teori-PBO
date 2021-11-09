package Tugas2;

public class Manusia {

    public void nyalakanPerangkat(Elektronik perangkat){
        if(perangkat instanceof TelevisiJadul){
            System.out.println("Nyalakan Televisi Jadul Dengan Input : " + ((TelevisiJadul)perangkat).getModelInput());
            System.out.println("Voltase Televisi : " + perangkat.getVoltase());
        }
        else if (perangkat instanceof TelevisiModern){
            System.out.println("Nyalakan Televisi Modern Dengan Input : " + ((TelevisiModern)perangkat).getModelInput());
            System.out.println("Voltase Televisi : " + perangkat.getVoltase());           
        }
    }
}
