import java.awt.*;
public class Regestration{
public static void main(String[] args){
Frame f = new Frame();
Button btn = new Button("ok");
btn.setBounds(30,50,10,20);
Button btn1 = new Button("Cancel");
btn1.setBounds(10,10,10,20);
f.add(btn);
f.add(btn1);
f.setSize(1000,1000);
f.setTitle("Welcome");
f.setVisible(true);
}
}