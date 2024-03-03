package com.example.fxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelloController {

    @FXML
    private TextField Username;

    @FXML
    private PasswordField User_password;


    @FXML
    private TextField behaviour;

    @FXML
    private TextField d_name;

    @FXML
    private TextField gender;

    @FXML
    private TextField size;

    @FXML
    private TextField accno;

    @FXML
    private TextField phno;

    @FXML
    private TextField user;

    @FXML
    private TextField amount;


    @FXML
    private Label invalidlogin;

    @FXML
    void onHelloButtonClick(ActionEvent event) throws IOException, SQLException {

        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Homepage.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());


        String user_name = Username.getText();
        String Password = User_password.getText();

        String query = "Select *from user where Username = ? and User_password = ? ";

        if (user_name.isEmpty() && Password.isEmpty()){
            invalidlogin.setText("Invalid login");
        }
        else if (user_name.isEmpty() || Password.isEmpty()) {
            invalidlogin.setText("Enter username and password");
        }
        else{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectfx", "root","Kamali_445");
            String sql = "insert into User values (?,?)";
            PreparedStatement statement1 = connection.prepareStatement(sql);
            statement1.setString(1,user_name);
            statement1.setString(2,Password);
            statement1.execute();

            Stage stage = new Stage();
            stage.setTitle("Pet_Adoption_System");
            stage.setScene(firstscene);
            stage.show();

            System.out.println("Inserted successfully");
        }

    }



    public void on_dog_click(ActionEvent actionEvent) throws IOException, SQLException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Dogpage.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());

        Stage stage = new Stage();
        stage.setTitle("Dogpage");
        stage.setScene(firstscene);

        stage.show();
    }

    public void on_cat_click(ActionEvent actionEvent) throws IOException, SQLException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Catpage.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());

        Stage stage = new Stage();
        stage.setTitle("Catpage");
        stage.setScene(firstscene);

        stage.show();
    }
    public void send_to_main(ActionEvent actionEvent) throws IOException, SQLException {

        String name = d_name.getText();
        String Gender = gender.getText();
        String Size = size.getText();
        String Behaviour = behaviour.getText();


        if(name.equals("Labrador")&& Gender.equals("Male") && Size.equals("Medium") && Behaviour.equals("Playful")){
            FXMLLoader loginfxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("labrador.fxml"));
            Scene firstscene1 = new Scene(loginfxmlLoader1.load());
            Stage stage = new Stage();
            stage.setTitle("Adopted");
            stage.setScene(firstscene1);
            stage.show();
        }
        if(name.equals("Doberman")&& Gender.equals("Male") && Size.equals("Medium") && Behaviour.equals("Chasing")){
            FXMLLoader loginfxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("doberman.fxml"));
            Scene firstscene1 = new Scene(loginfxmlLoader1.load());
            Stage stage = new Stage();
            stage.setTitle("Adopted");
            stage.setScene(firstscene1);
            stage.show();
        }
        if(name.equals("Rajapalayam")&& Gender.equals("Male") && Size.equals("Medium") && Behaviour.equals("Barking")){
            FXMLLoader loginfxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("rajapalayam.fxml"));
            Scene firstscene1 = new Scene(loginfxmlLoader1.load());
            Stage stage = new Stage();
            stage.setTitle("Adopted");
            stage.setScene(firstscene1);
            stage.show();
        }
        if(name.equals("Pomeranian")&& Gender.equals("Male") && Size.equals("Medium") && Behaviour.equals("Friendly")){
            FXMLLoader loginfxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("pomeranian.fxml"));
            Scene firstscene1 = new Scene(loginfxmlLoader1.load());
            Stage stage = new Stage();
            stage.setTitle("Adopted");
            stage.setScene(firstscene1);
            stage.show();
        }

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectfx", "root","Kamali_445");
        String sql = "insert into Dog values (?,?,?,?)";
        PreparedStatement statement1 = connection.prepareStatement(sql);
        statement1.setString(1,name);
        statement1.setString(2,Gender);
        statement1.setString(3,Size);
        statement1.setString(4,Behaviour);
        statement1.execute();
    }

    public void send_to_main1(ActionEvent actionEvent) throws IOException, SQLException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Catpage.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());

        String name = d_name.getText();
        String Gender = gender.getText();
        String Size = size.getText();
        String Behaviour = behaviour.getText();

        if(name.equals("Persian")&& Gender.equals("Female") && Size.equals("Medium") && Behaviour.equals("Relaxed")){
            FXMLLoader loginfxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("persian.fxml"));
            Scene firstscene1 = new Scene(loginfxmlLoader1.load());
            Stage stage = new Stage();
            stage.setTitle("Adopted");
            stage.setScene(firstscene1);
            stage.show();
        }
        if(name.equals("Siamese")&& Gender.equals("Female") && Size.equals("Small") && Behaviour.equals("Friendly")){
            FXMLLoader loginfxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("siamese.fxml"));
            Scene firstscene1 = new Scene(loginfxmlLoader1.load());
            Stage stage = new Stage();
            stage.setTitle("Adopted");
            stage.setScene(firstscene1);
            stage.show();
        }
        if(name.equals("Mainecoon")&& Gender.equals("Female") && Size.equals("Medium") && Behaviour.equals("Anxious")){
            FXMLLoader loginfxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("mainecoon.fxml"));
            Scene firstscene1 = new Scene(loginfxmlLoader1.load());
            Stage stage = new Stage();
            stage.setTitle("Adopted");
            stage.setScene(firstscene1);
            stage.show();
        }
        if(name.equals("Ragdoll")&& Gender.equals("Female") && Size.equals("Medium") && Behaviour.equals("Lovable")){
            FXMLLoader loginfxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("ragdoll.fxml"));
            Scene firstscene1 = new Scene(loginfxmlLoader1.load());
            Stage stage = new Stage();
            stage.setTitle("Adopted");
            stage.setScene(firstscene1);
            stage.show();
        }

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectfx", "root","Kamali_445");
        String sql = "insert into Cat values (?,?,?,?)";
        PreparedStatement statement1 = connection.prepareStatement(sql);
        statement1.setString(1,name);
        statement1.setString(2,Gender);
        statement1.setString(3,Size);
        statement1.setString(4,Behaviour);
        statement1.execute();
    }
    public void Lpay(ActionEvent actionEvent) throws IOException, SQLException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Payment.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Pet_Adoption_System");
        stage.setScene(firstscene);

        stage.show();
    }

    public void PAY(ActionEvent actionEvent) throws IOException, SQLException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Psuccess.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());

        Stage stage = new Stage();
        stage.setTitle("Pet_Adoption_System");
        stage.setScene(firstscene);

        stage.show();
    }

    public void gobacktologin(ActionEvent actionEvent) throws IOException, SQLException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login page.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());

        Stage stage = new Stage();
        stage.setTitle("Pet_Adoption_System");
        stage.setScene(firstscene);

        stage.show();
    }
    public void gobacktodog(ActionEvent actionEvent) throws IOException, SQLException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Dogpage.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());

        Stage stage = new Stage();
        stage.setTitle("Pet_Adoption_System");
        stage.setScene(firstscene);

        stage.show();
    }
    public void gobacktohome(ActionEvent actionEvent) throws IOException, SQLException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Homepage.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());

        Stage stage = new Stage();
        stage.setTitle("Pet_Adoption_System");
        stage.setScene(firstscene);

        stage.show();
    }

    public void gobacktocat(ActionEvent actionEvent) throws IOException, SQLException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Catpage.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());

        Stage stage = new Stage();
        stage.setTitle("Pet_Adoption_System");
        stage.setScene(firstscene);

        stage.show();
    }


}