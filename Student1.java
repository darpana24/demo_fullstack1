import java.io.*;
     class Student1
     {
        private int rno;
        private String name;
        private float per;
        public void getstu()
        {
           try
            {
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              System.out.println("enter rollno");
              rno=Integer.parseInt(br.readLine());
              System.out.println("enter name");
              name=br.readLine();
              System.out.println("enter per");
              per=Float.parseFloat(br.readLine());
          }
         catch(Exception e)
         {
            System.out.println("exp="+e);
          }
     }
     public void putstu()
     {
        System.out.println("rollno="+rno);
        System.out.println("Name="+name);
        System.out.println("Per="+per); 
      } 
   
}










