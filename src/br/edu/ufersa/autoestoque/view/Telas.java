package br.edu.ufersa.autoestoque.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Telas extends Application{
  private static Stage primaryStage;

  public static Stage getPrimaryStage() {
    return primaryStage;
  }

  public static void setPrimaryStage(Stage primaryStage) {
    Telas.primaryStage = primaryStage;
  }
  public static void main(String[] args){
    launch();
  }
  public void start(Stage primaryStage) throws Exception {
    setPrimaryStage(primaryStage);
    primaryStage.setTitle("SCEPTIC");
    primaryStage.show();
    //telaLogin();
    telaInicio();
    //telaCadastroEquipamento();
    //telaCadastroLocal();
    //telaCadastroFuncionario();
    //telaCadastroCliente();
    //telaListarCliente();
    //telaListarEquipamento();
    //telaListarLocal();
    //telaListarCompra();
    //atualizarLocal();
    //telaListarFuncionario();
  }

  public static void telaLogin() throws Exception{
    Parent root = FXMLLoader.load(Telas.class.getResource("VE/TelaDeLogin.fxml"));
    Scene cena = new Scene(root);
    primaryStage.setScene(cena);
  }
  public static void telaInicio() throws Exception {
    Parent root = FXMLLoader.load(Telas.class.getResource("VE/TelaInicio.fxml"));
    Scene cena = new Scene(root);
    primaryStage.setScene(cena);
  };
  public static void telaEquipamento() throws Exception {
    Parent root = FXMLLoader.load(Telas.class.getResource("VE/TelaEquipamento.fxml"));
    Scene cena = new Scene(root);
    primaryStage.setScene(cena);
  };
  public static void telaListarCompra() throws Exception{
    Parent root = FXMLLoader.load(Telas.class.getResource("VE/TelaCompra.fxml"));
    Scene cena = new Scene(root);
    primaryStage.setScene(cena);
  }
  public static void telaListarResponsaveis() throws Exception{
    Parent root = FXMLLoader.load(Telas.class.getResource("VE/TelaResponsavel.fxml"));
    Scene cena = new Scene(root);
    primaryStage.setScene(cena);
  }
  public static void telaRelatorio() throws Exception{
    Parent root = FXMLLoader.load(Telas.class.getResource("VE/TelaRelatorioVendas.fxml"));
    Scene cena = new Scene(root);
    primaryStage.setScene(cena);
  }

}