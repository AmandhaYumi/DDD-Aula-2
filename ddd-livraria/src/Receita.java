public class Receita {
    //Atributo tipo nomeAtributo;
    String nomedaReceita;
    String autor;
    String descrição;
    String dificuldade;
    int porções;
    int tempo;
    String igredientes;
    String preparo;

    public void exibirReceita(){
        System.out.println("Receita de" + nomedaReceita);
        System.out.println("-------------------------------");
        System.out.println("Publicado por: " + autor);
        System.out.println(descrição);
        System.out.println(dificuldade + "\t" + tempo + "\t" + porções);
        System.out.println("Ingredientes\n" + igredientes);
        System.out.println("Modo de Preparo\n" + preparo);
    }
}
