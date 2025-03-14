public class TesteReceita {
    public static void main(String[] args) {
        //Instanciar um objeto = Criar o Objeto
        Receita talharimSalmão = new Receita();
        talharimSalmão.nomedaReceita = " Talharim de Salmão";
        talharimSalmão.autor = " Juju Gerra";
        talharimSalmão.descrição = "Se você gosta da combinação de salmão e alcaparras, vai amar essa receita. Sofisticada e fácil de fazer, fica perfeita em qualquer ocasião. Só faz!!";
        talharimSalmão.dificuldade = "Fácil";
        talharimSalmão.porções = 6;
        talharimSalmão.tempo = 39;
        talharimSalmão.igredientes = "500 gramas de talharim\n" +
                "-500 gramas de cubos de salmão sem pele\n" +
                "-2 dentes de alho\n" +
                "-Azeite\n" +
                "-1 colher de sopa de manteiga\n" +
                "-300 gramas de creme de leite\n" +
                "-2 dentes de alho\n" +
                "Pimenta calabresa a gosto\n" +
                "Sal\n" +
                "Raspas de limão siciliano\n" +
                "Cebolinha";
        talharimSalmão.preparo =
                "1.Cozinhar a massa conforme o tempo da embalagem e água e sal.\n"+
                "2.Temperar os cubos de salmão com sal.\n" +
                "3.Em uma frigideira pré-aquecida, colocar o azeite e a manteiga, selar os cubos de salmão de todos os lados.\n" +
                "4.Colocar os dentes de alho picadinhos, as alcaparras, pimenta calabresa e misturar bem.\n" +
                "5.Adicionar o creme de leite, acertar o sal e cozinhar por dois minutos para apurar o molho.\n" +
                "6.Colocar o talharim direto no molho, adicionar uma concha da agua do cozimento e misturar delicadamente para não desmanchar o salmão.\n" +
                "7.Finalizar com as raspas de limão e a cebolinha.\n" +
                "8.Bom apetite!!!";
        talharimSalmão.exibirReceita();

    }
}
