package convertor;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class Calculator extends JFrame implements ActionListener {

    Font f1= new Font("Georgia",Font.ITALIC,25);

    JPanel f,ff;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    JTextField txf;
    static  double a=0,b=0, result=0;
    static int op=0;

    Calculator()
    {
        setSize(400,545);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("This Is claclaculator");

        setResizable(false);


        ImageIcon icon = new ImageIcon(new ImageIcon("C:\\Users\\Unique-pc\\Downloads\\veg\\calculator.png").getImage().getScaledInstance(10000,10000, Image.SCALE_SMOOTH));
        //ImageIcon icon = new ImageIcon(getClass().getResource("alu.jpg"));
        this.setIconImage(icon.getImage());

        txf = new JTextField();
        txf.setBounds(0,5,400,60);
        txf.setFont(f1);
        txf.setForeground(Color.BLACK);
        add(txf);

        f = new JPanel();
        f.setLayout(null);
        f.setBounds(0,70,250,430);
        f.setBackground(Color.WHITE);
        add(f);

        ff = new JPanel();
        ff.setLayout(null);
        ff.setBounds(250,70,150,430);
        ff.setBackground(Color.LIGHT_GRAY);
        add(ff);



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ImageIcon icon1 = new ImageIcon(new ImageIcon("F:\\JAVA6th\\Calculator\\src\\convertor\\image\\cross.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH));
        b1 = new JButton(icon1);
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        b1.addActionListener(this);

        ImageIcon icon2 = new ImageIcon(new ImageIcon("F:\\JAVA6th\\Calculator\\src\\convertor\\image\\back.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH));
        b2 = new JButton(icon2);
        b2.setForeground(Color.white);
        b2.setBackground(Color.WHITE);
        b2.addActionListener(this);

        ImageIcon icon4= new ImageIcon(new ImageIcon("F:\\JAVA6th\\Calculator\\src\\convertor\\image\\percent.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH));
        b3 = new JButton(icon4);
        b3.setForeground(Color.white);
        b3.setBackground(Color.WHITE);
        b3.addActionListener(this);

        b4 = new JButton("7");
        b4.setForeground(Color.white);
        b4.setBackground(Color.BLACK);
        b4.addActionListener(this);

        b5 = new JButton("8");
        b5.setForeground(Color.white);
        b5.setBackground(Color.BLACK);
        b5.addActionListener(this);

        b6 = new JButton("9");
        b6.setForeground(Color.white);
        b6.setBackground(Color.BLACK);
        b6.addActionListener(this);

        b7 = new JButton("4");
        b7.setForeground(Color.white);
        b7.setBackground(Color.BLACK);
        b7.addActionListener(this);

        b8 = new JButton("5");
        b8.setForeground(Color.white);
        b8.setBackground(Color.BLACK);
        b8.addActionListener(this);

        b9 = new JButton("6");
        b9.setForeground(Color.white);
        b9.setBackground(Color.BLACK);
        b9.addActionListener(this);

        b10 = new JButton("1");
        b10.setForeground(Color.white);
        b10.setBackground(Color.BLACK);
        b10.addActionListener(this);

        b11= new JButton("2");
        b11.setForeground(Color.white);
        b11.setBackground(Color.BLACK);
        b11.addActionListener(this);

        b12 = new JButton("3");
        b12.setForeground(Color.white);
        b12.setBackground(Color.BLACK);
        b12.addActionListener(this);

        ImageIcon icon8= new ImageIcon(new ImageIcon("F:\\JAVA6th\\Calculator\\src\\convertor\\image\\bhag.png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH));
        b13 = new JButton(icon8);
        b13.setForeground(Color.white);
        b13.setBackground(Color.WHITE);
        b13.addActionListener(this);

        ImageIcon icon7= new ImageIcon(new ImageIcon("F:\\JAVA6th\\Calculator\\src\\convertor\\image\\gun.png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH));
        b14 = new JButton(icon7);
        b14.setForeground(Color.white);
        b14.setBackground(Color.WHITE);
        b14.addActionListener(this);


        ImageIcon icon6= new ImageIcon(new ImageIcon("F:\\JAVA6th\\Calculator\\src\\convertor\\image\\biyog.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH));
        b15 = new JButton(icon6);
        b15.setForeground(Color.white);
        b15.setBackground(Color.WHITE);
        b15.addActionListener(this);


        ImageIcon icon5= new ImageIcon(new ImageIcon("F:\\JAVA6th\\Calculator\\src\\convertor\\image\\jog.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH));
        b16 = new JButton(icon5);
        b16.setForeground(Color.white);
        b16.setBackground(Color.WHITE);
        b16.addActionListener(this);

        ImageIcon icon3= new ImageIcon(new ImageIcon("F:\\JAVA6th\\Calculator\\src\\convertor\\image\\soman.png").getImage().getScaledInstance(30,50, Image.SCALE_SMOOTH));
        b17 = new JButton(icon3);
        b17.setForeground(Color.WHITE);
        b17.setBackground(Color.WHITE);
        b17.addActionListener(this);

        //  ImageIcon icon9= new ImageIcon(new ImageIcon("F:\JAVA6th\Calculator\src\convertor\image\\root.png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH));
        b18 = new JButton(".");
        b18.setForeground(Color.WHITE);
        b18.setBackground(Color.BLACK);
        b18.addActionListener(this);

        //  ImageIcon icon10= new ImageIcon(new ImageIcon("F:\JAVA6th\Calculator\src\convertor\image\\.jpg").getImage().getScaledInstance(130,90, Image.SCALE_SMOOTH));
        b19 = new JButton("0");
        b19.setForeground(Color.WHITE);
        b19.setBackground(Color.black);
        b19.addActionListener(this);

        ImageIcon icon10= new ImageIcon(new ImageIcon("F:\\JAVA6th\\JavaSwing\\src\\JavaSwing\\image\\g.jpg").getImage().getScaledInstance(120,90, Image.SCALE_SMOOTH));
        b20 = new JButton(icon10);



        f.setLayout(new GridLayout(5,6,1,15));
        ff.setLayout(new GridLayout(5,6,1,15));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        ff.add(b13);
        ff.add(b14);
        ff.add(b15);
        ff.add(b16);
        ff.add(b17);
        f.add(b18);
        f.add(b19);
        f.add(b20);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b19)
        {
            txf.setText(txf.getText()+"0");
        }

        else if(e.getSource()==b4)
        {
            txf.setText(txf.getText()+"7");
        }
        else  if (e.getSource()==b5)
        {
            txf.setText(txf.getText()+"8");
        }

        else if (e.getSource()==b6)
        {
            txf.setText(txf.getText()+"9");
        }
        else if (e.getSource()==b7)
        {
            txf.setText(txf.getText()+"4");
        }
        else if (e.getSource()==b8)
        {
            txf.setText(txf.getText()+"5");
        }
        else if (e.getSource()==b9)
        {
            txf.setText(txf.getText()+"6");
        }
        else if (e.getSource()==b10)
        {
            txf.setText(txf.getText()+"1");
        }
        else if (e.getSource()==b11)
        {
            txf.setText(txf.getText()+"2");
        }
        else if (e.getSource()==b12)
        {
            txf.setText(txf.getText()+"3");
        }
        else if (e.getSource()==b18)
        {
            txf.setText(txf.getText()+".");
        }

        ////////////////////////////////////////

        else if (e.getSource()==b1)
        {
            txf.setText(null);
        }

        if(e.getSource()==b16)
        {
            a=Double.parseDouble(txf.getText());
            op=1;
            txf.setText("");
        }
        if(e.getSource()==b15)
        {
            a=Double.parseDouble(txf.getText());
            op=2;
            txf.setText("");
        }
        if(e.getSource()==b14)
        {
            a=Double.parseDouble(txf.getText());
            op=3;
            txf.setText("");
        }
        if(e.getSource()==b13)
        {
            a=Double.parseDouble(txf.getText());
            op=4;
            txf.setText("");
        }
//        if(e.getSource()==b3)
//        {
//            a=Double.parseDouble(txf.getText());
//            op=5;
//            txf.setText("");
//        }

        if(e.getSource()==b17)
        {
            b=Double.parseDouble(txf.getText());
            switch (op) {
                case 1 -> result = a + b;
                case 2 -> result = a - b;
                case 3 -> result = a * b;
                case 4 -> result = a / b;
                //  case 5 -> result = (a*b)/100;

            }

            txf.setText(""+result);

        }

        else if(e.getSource()==b2)
        {
            String s=txf.getText();
            txf.setText("");
            for(int i =0; i<s.length()-1;i++)
            {
                txf.setText(txf.getText()+s.charAt(i));
            }
        }



    }
}

public class Main {

    public static void main(String[] args) {
        new Calculator();
    }
}
