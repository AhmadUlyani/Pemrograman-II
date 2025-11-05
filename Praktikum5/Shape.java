package Praktikum5;

public abstract class Shape {
    protected String shapeName;
    public Shape(String name){
        this.shapeName = name;
    }

    public abstract Double area();

    public String toString(){
        return this.shapeName;
    }
}