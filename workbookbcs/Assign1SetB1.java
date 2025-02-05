/*create java application to store city names and their STD codes using an appropriate collection.
The GUI should allow the following operations
1)Add a new city and its code(No duplicates)
2)Remove a city from collection
3)Search for a cityname and display the code
*/

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
class Assign1SetB1 extends JFrame implements ActionListener
{
 
  JTextField txcityname=new JTextField(20);
   JTextField txcitynamerem=new JTextField(20);
   JTextField txcitynameser=new JTextField(20);
  JTextField txcode=new JTextField(20);
  JButton badd=new JButton("Add");
  JButton bremove=new JButton("Remove");
   JButton bsearch=new JButton("Search");
 DefaultListModel model=new DefaultListModel();   
JList ls=new JList(model);
HashMap<String,Integer> obj=new HashMap<String,Integer>();
String cityname,stdcode;
public Assign1SetB1()
 {
   JScrollPane js=new JScrollPane(ls);   
  JPanel p1=new JPanel();
  p1.setLayout(new GridLayout(1,2));
  p1.add(txcityname);
  p1.add(txcode);
  JPanel p3=new JPanel();
  p3.setLayout(new GridLayout(2,2));
  p3.add(txcitynamerem);
   p3.add(txcitynameser);
   p3.add(bremove);
   p3.add(bsearch);
  JPanel p2=new JPanel();
  p2.setLayout(new GridLayout(1,1));
  p2.add(badd);
   setLayout(null);
   js.setBounds(100,100,100,200);
  add(js);
  p1.setBounds(210,100,200,30);
  add(p1);
   p2.setBounds(300,140,70,30);
   add(p2);
   p3.setBounds(210,180,200,70);
   add(p3);
   badd.addActionListener(this);
   bremove.addActionListener(this);
   bsearch.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  {
      if(e.getSource()==badd)
       {
          cityname=txcityname.getText();
          stdcode=txcode.getText();
           obj.put(cityname,new Integer(stdcode));
         model.clear();
           for(Map.Entry<String,Integer> m:obj.entrySet())
            model.addElement(m);
        }
       else if(e.getSource()==bremove)
       {
            cityname=txcitynamerem.getText();
            obj.remove(cityname);
           model.clear();
           for(Map.Entry<String,Integer> m:obj.entrySet())
            model.addElement(m);
        }
       else if(e.getSource()==bsearch)
       {
               cityname=txcitynameser.getText();
               stdcode=""+obj.get(cityname);
               txcityname.setText(cityname);
               txcode.setText(stdcode);
         }
  }
  public static void main(String args[])
  {
    Assign1SetB1 obj=new Assign1SetB1();
    obj.setVisible(true);
    obj.setSize(500,500);
   }
}

 