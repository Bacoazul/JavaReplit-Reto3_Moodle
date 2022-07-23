class Main {
  public static void main(String[] args) {
    Tripulante John = new Tripulante("John Doe", "1037654354", "123456789", "john.doe@udea.edu.co", "Soy una persona con muchas ganas de apender", 5);
    Formador Jane = new Formador("3D", "jane Di", "1038654355", "987654321", "jane.di@udea.edu.co", "Me apasiona enseñar");

    John.resolverReto(1);
    John.resolverReto(2);
    John.resolverReto(3);

    for (int i = 0; i < 5; i++){
      Jane.calificar(John, i);
    }

    John.editarPerfil ("John Doe", "1037654354", "123456789", "john.doe@udea.edu.co", " Estoy muy feliz en este programa! ");
Jane.editarPerfil ("Jane de Maria Di", "1038654355", "987654321", "jane.di@udea.edu.co", " Enamorada de la vida! ") ;

    System.out.println("-----------------------");
    System.out.println(John);
    System.out.println("-----------------------");
    System.out.println("-----------------------");
    System.out.println(Jane);
    System.out.println("-----------------------");
    
  }
}