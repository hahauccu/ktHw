package MailBoxJava;



public  class MailBoxes {
    float length;
    float width;
    int height;

    public  boolean validate(float length, float width, int height)
    {
        System.out.println(length +" "+ this.length +" "+ width +" "+ this.width +" "+ height +" "+ this.height );
        return length <= this.length && width <= this.width && height <=this.height ;
    };
}

