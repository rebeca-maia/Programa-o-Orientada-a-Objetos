package Robô;

public class Robot {
    private String name;
    private double speed; //Velocidade em metros por segundo
    private double maxSpeed;
    private double temperature; // Temperatura em Farenheit
    private int power;
    private Status s;
   
    @Override
    public String toString(){
        return "Nome: "+this.name+" Velocidade: "+this.speed+" Velocidade Máxima: "+this.maxSpeed+
                " Temperatura: "+this.temperature+" Bateria: "+this.power+ "Status: "+this.s;
    }
    
    public void show(){
        System.out.println(toString());    
    }
    
    public void stop(){
        speed = 0;
        System.out.println(Status.STOPPED.toString());
        if(temperature>=10.0){
            temperature -=10.0;
        }
    }
    
    public void speedUp(int velocidade){
        if(speed + velocidade < maxSpeed){
            speed += velocidade;
            System.out.println(Status.MOVING.toString());
       }
    }
    
    public void speedUp(){
        if((speed * 1.1) <= maxSpeed){
            speed *=  1.1;   
        }
    }
    
    public void speedDown(int vel){
        if(speed - vel >= 0){
            speed -=vel;
        }else{
            System.out.println("Velocidade menor que zero.");
        }
    }
    
    public void breaking(){
        speed*=0.9;
    }
    
    public void standBy(){
        speed = 0;
        temperature = 0;
        
    }
    
    public void exploring(){
        if(s.equals(4)){
            
            temperature+=20;
        }
            
    }
    
    public void stop(){
        speed = 0;
    }
    
    
    
    
    
    
    
    
    
    
    
    public Robot(){
        super();
    }
    
    public Robot(String name, double speed, double maxSpeed, double temperature, int power) {
        this.name = name;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.temperature = temperature;
        this.power = power;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null){
            this.name = name;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if(speed >= 0.0){
            this.speed = speed;
        }
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if(maxSpeed>0){
            this.maxSpeed = maxSpeed;
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if(temperature>0.0){
            this.temperature = temperature;
        }
    }

    public double getPower() {
        return power;
    }

    public void setPower(int power) {
        if(power>=0.0){
            this.power = power;
        }
    }
    
    private Status s(){
        return s;
    }
    
    private void setS(Status s){
        this.s=s;
    }
}
