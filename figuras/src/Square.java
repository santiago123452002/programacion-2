public  class Square  extends Shape{
    private int width=0;
    

    public int getHeight() {
        return width;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int newWidth){
      width = newWidth;  
      
    }
    public void setheight(int newheight){
         
        width= newheight;

      }
      
      public Square(int newWidth){//este es el metodo constructor que llama en test 2
        setWidth(newWidth);
      }
    
      


    @Override
    public float getArea() {
      return getWidth()*getWidth();
    }
    @Override
    public float getPerimeter(){
      return 2*(getWidth()+getHeight());
    }
}
