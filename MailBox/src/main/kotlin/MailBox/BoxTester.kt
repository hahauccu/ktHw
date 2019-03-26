package MailBox

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    var length:Float;
    var width:Float;
    var heigth:Int;
    println("Please enter length: ");
    length =scanner.nextFloat();
    println("Please enter width: ");
    width =scanner.nextFloat();
    println("Please enter heigth: ");
    heigth =scanner.nextInt();

    var  b3 = Box3();
    var  b5 = Box5();
    if(b3.validate(length,heigth,width))
    {
        println("box3 is fine");
    }
    else if(b5.validate(length,heigth,width))
    {
        println("box5 is fine");
    }
    else
    {
        println("you need a bigger box");
    }


}

open  class MailBoxes()
{
  companion object {
      var length=0;
      var width =0
      var height =0
  }
    open fun validate(lengthInput: Float, heightInput: Int, widthInput: Float) :Boolean {
      return lengthInput <= length && heightInput<= height && widthInput<= width;
    }
}

class Box5():MailBoxes()
{
    companion object {
        var length=39.5f;
        var width=27.5f;
        var height =23;

    }

    override fun  validate(lengthInput: Float, heightInput: Int, widthInput: Float) :Boolean {
        return lengthInput <= length && heightInput<= height && widthInput<= width;
    }
}


class Box3():MailBoxes()
{
    companion object {
        var length=23;
        var width=13;
        var height =14;
    }

    override fun  validate(lengthInput: Float, heightInput: Int, widthInput: Float) :Boolean {
        return lengthInput <= length && heightInput<= height && widthInput<= width;
    }
}