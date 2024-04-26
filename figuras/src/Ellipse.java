public  class Ellipse extends Circle{
    private int radius2= 0;

    public Ellipse(int newRadius1, int newRadius2){
        super(newRadius1);
        setRadius2(newRadius2);
    }

    public int getRadius2() {
        return radius2;
    }
    public void setRadius2(int newRadius2) {
        radius2=newRadius2;             
    }
    @Override
    public float getArea() {
       return (float) Math.PI * (getRadius()*getRadius2());
    }
    @Override
    public float getPerimeter(){
        var a= getRadius();
        var b=getRadius2();
        return (float) (2 * Math.PI *Math.sqrt((Math.pow(getRadius(),2) +Math.pow(getRadius2(), 2))/2));
    }
}