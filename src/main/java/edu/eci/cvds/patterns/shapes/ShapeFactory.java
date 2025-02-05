package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory{
    public ShapeFactory(){
        
    }

    public static Shape create(RegularShapeType regularShapeType){

        switch (regularShapeType) {
            case Triangle:
                Triangle triangle = new Triangle();
                return triangle;

            case Hexagon:
                Hexagon hexagon = new Hexagon();
                return hexagon;

            case Quadrilateral:
                Quadrilateral quadrilateral = new Quadrilateral();
                return quadrilateral;

            case Pentagon:
                Pentagon pentagon = new Pentagon();
                return pentagon;

            default:
                return null;
            
        }

    }

}
