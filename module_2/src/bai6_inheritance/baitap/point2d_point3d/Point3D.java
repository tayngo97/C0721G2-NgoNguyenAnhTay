package bai6_inheritance.baitap.point2d_point3d;

public class Point3D extends Point2D {
    public float z ;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        this.z=z;
    }

    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = getZ();
        return arr ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + getZ() +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
