package main.lesson5_tasks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.Task;

@NoArgsConstructor
public class EasyVector implements Task {

    private final Vector firstVector = Vector.createRandomVector(500);
    private final Vector secondVector = Vector.createRandomVector(500);

    public static void main( final String[] args){
        Vector firstVector = Vector.createRandomVector(500);
        System.out.println("firstVector is "+firstVector);
        System.out.println("firstVector.getLength is "+String.valueOf(firstVector.getLength()));

        Vector secondVector = Vector.createRandomVector(500);
        System.out.println("secondVector is "+secondVector);
        System.out.println("secondVector.getLength is "+String.valueOf(secondVector.getLength()));

        System.out.println("firstVector.getScalarProduct(secondVector) is "+String.valueOf(firstVector.getScalarProduct(secondVector)));
        System.out.println("firstVector.getVectorProduct(secondVector) is "+String.valueOf(firstVector.getVectorProduct(secondVector)));
        System.out.println("firstVector.getAngle(secondVector) is "+String.valueOf(firstVector.getAngle(secondVector)));
        System.out.println("firstVector.getAddition(secondVector) is "+String.valueOf(firstVector.getAddition(secondVector)));
        System.out.println("firstVector.getDifference(secondVector) is "+String.valueOf(firstVector.getDifference(secondVector)));
    }

    @Override
    public void runTask() {}

    @Override
    public String printResult() {
        StringBuilder result = new StringBuilder();
        result.append("firstVector is "+firstVector.toString()+"\n")
            .append("firstVector.getLength is "+String.valueOf(firstVector.getLength())+"\n")
            .append("secondVector is "+secondVector.toString()+"\n")
            .append("secondVector.getLength is "+String.valueOf(secondVector.getLength())+"\n")
            .append("firstVector.getScalarProduct(secondVector) is "+String.valueOf(firstVector.getScalarProduct(secondVector))+"\n")
            .append("firstVector.getVectorProduct(secondVector) is "+String.valueOf(firstVector.getVectorProduct(secondVector))+"\n")
            .append("firstVector.getAngle(secondVector) is "+String.valueOf(firstVector.getAngle(secondVector))+"\n")
            .append("firstVector.getAddition(secondVector) is "+String.valueOf(firstVector.getAddition(secondVector))+"\n")
            .append("firstVector.getDifference(secondVector) is "+String.valueOf(firstVector.getDifference(secondVector))+"\n");
        return result.toString();
    }
}

@Data
@AllArgsConstructor
class Vector {

    private final int x;
    private final int y;
    private final int z;

    public double getLength(){
        double tempDouble = Math.pow(getX(),2) + Math.pow(getY(),2) + Math.pow(getZ(),2);
        if (tempDouble > 0) {
            return Math.sqrt(tempDouble);
        } else {
            throw new ArithmeticException("Деление на ноль!");
        }
    }

    public double getScalarProduct(Vector vector){
        return this.getX()*vector.getX() + this.getY()*vector.getY() + this.getZ()*vector.getZ();
    }

    public Vector getVectorProduct(Vector vector){
        return new Vector(
                this.getY()*vector.getZ() - this.getZ()*vector.getY(),
                this.getZ()*vector.getX() - this.getX()*vector.getZ(),
                this.getX()*vector.getY() - this.getY()*vector.getX()
        );
    }

    public double getAngle(Vector vector){
        return getScalarProduct(vector)/(Math.abs(this.getLength()) + Math.abs(vector.getLength()));
    }

    public Vector getAddition(Vector vector){
        return new Vector(
                this.getX() + vector.getX(),
                this.getY() + vector.getY(),
                this.getZ() + vector.getZ()
        );
    }

    public Vector getDifference(Vector vector){
        return new Vector(
                this.getX() - vector.getX(),
                this.getY() - vector.getY(),
                this.getZ() - vector.getZ()
        );
    }

    public static Vector createRandomVector(int N){
        return new Vector(
                (int) Math.round(Math.random()*N),
                (int) Math.round(Math.random()*N),
                (int) Math.round(Math.random()*N)
        );
    }
}