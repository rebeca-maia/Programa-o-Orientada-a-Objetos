package Robô;

public enum Status {
    STANDBY(1), MOVING(2), EXPLORING(3), STOPPED(4), RETURNINGHOME(5);
  
    private final int estado;
    
    
    Status(int estado){
        this.estado=estado;
        
}
    
    private int getEstado(){
        return estado;
    }
}
