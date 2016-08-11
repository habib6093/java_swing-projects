import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import java.io.File;//for css //
import javafx.geometry.Pos; //for positioning//
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import java.sql.*;




public class login extends Application
{
	public static void main(String arg[])
	{
		launch(arg);
	}

    

    public void start(Stage stage_ob)
    {

          StackPane stackPane_ob=new StackPane();
          stackPane_ob.setAlignment(Pos.CENTER);

          Scene scene_ob=new Scene(stackPane_ob,1280,620);
          
           
           //..connect css file//
      	File f = new File("app.css");
       
        stackPane_ob.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));

        Text t=new Text("Wellcome to JourneyBy");
        PasswordField password = new PasswordField();
        TextField id=new TextField();
        Button login=new Button("Login");
        Button cancel=new Button("Cancel");
   
        id.setMaxSize(200,30);
        id.setPromptText("Enter ID");

        password.setMaxSize(200,30);
        password.setPromptText("Enter password");

        stackPane_ob.getChildren().add(t);
        stackPane_ob.getChildren().add(id);
        stackPane_ob.getChildren().add(password);
        stackPane_ob.getChildren().add(login);
        stackPane_ob.getChildren().add(cancel);

        login.setTranslateX(-30);
        login.setTranslateY(130);

        cancel.setTranslateX(60);
        cancel.setTranslateY(130);
        
    id.setTranslateX(10);
        id.setTranslateY(30);

      	password.setTranslateX(10);
        password.setTranslateY(75);

        t.setTranslateX(10);
        t.setTranslateY(-50);


        //set css ID....//

        t.setId("log_label");
        stackPane_ob.setId("login");



      //database connection....
          



        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	
           
           if(!id.getText().equals("")&&!password.getText().equals(""))
           {
           	   int x=data.databass(id.getText(),password.getText());
           	   if(x!=0)
           	   {  

           	   	  if(x==1)//1 owner
           	   	  {

           	   	  	System.out.println("owner");
                    owner obs=new owner();
                    obs.starts(stage_ob);
           	   	  	
           	   	  }
           	   	  else if(x==2)//2 super admin..
           	   	  {
           	   	  	System.out.println("super admin");
           	   	  }
           	   	  else if(x==3)//3 admin...
           	   	  {
           	   	  	System.out.println("admin");
           	   	  }

           	   }
           	   else
           	   {//System.out.println(text.getText()+""+password.getText());
           	   	System.out.println("wrong password or id....");
           	   		//System.out.println(text.getText()+"");
           	   //	System.out.println(password.getText()+"");
           	   }
           }

           else
           {
           	System.out.println("password or user_name is empty...");
           }


            }
        });
        




           stage_ob.setResizable(false);
           stage_ob.setScene(scene_ob);
           stage_ob.show();
    }


    //end of login class//// 
}


class data
{
	public static int databass(String id,String password)
	{   int x=0;
	    try{String JDBC_DRIVER="com.mysql.jdbc.Driver";
        String host="jdbc:mysql://localhost:3306/temp";
        String user_name="root";
        String pass="";
        Connection con=DriverManager.getConnection(host,user_name,pass);

         Statement stmt=null;
         ResultSet rs;
         stmt = con.createStatement();
         rs=stmt.executeQuery("select * from login");
       System.out.println("user Pressed:"+id);
       System.out.println("user Pressed:"+password);

      while(rs.next())
      {

        String ids=rs.getString("id");
        String passwords=rs.getString("password");
        System.out.println("databass has..:"+ids);
        System.out.println("databass has..:"+passwords);

        if(id.equals(ids)&&password.equals(passwords))
        	{ int mm=34;
            char c=(char)mm;
            x=rs.getInt("position");
            
            stmt.executeUpdate("insert into login_log values("+c+ids+c+",CURRENT_TIMESTAMP)");
            
        		break;}
      
      }

  }catch(Exception ex){}
    
    
    return x;
    }
}
