package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory{

    static Shape shape = null;

    public static Shape create(RegularShapeType type){

        switch(type){
            case Triangle:{
                shape = new Triangle();
                break;
            }
            case Quadrilateral:{
                shape = new Quadrilateral();
                break;
            }
            case Pentagon:{
                shape = new Pentagon();
                break;
            }
            case Hexagon:{
                shape = new Hexagon();
                break;
            }
        }
    return shape;
    }
}