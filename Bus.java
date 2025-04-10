public class Bus {
     private int busno;
     private boolean ac;
    private int capacity;
    Bus(int busno,boolean ac,int capacity)
    {
        this.busno=busno;
        this.ac=ac;
        this.capacity=capacity;
    }
    public int getbusno()
    {
        return busno;
    }
    public  int getcapacity()
    {
        return capacity;
    }
    public void setcapacity(int cap)
    {
        capacity=cap;
    }
    public boolean isac()
    {
       return ac;
    }
    public void display()
    {
        System.out.println("bussno:"+busno+" "+"ac:"+ac+" "+"total_capacity:"+capacity);
    }
    
}
