import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        var colecao = new Colecao ("A lenda do dragão branco de olhos azuis" +
                "(LC01 Edição do 25# Aniversário)\n",null,new ArrayList<>());


        System.out.println(colecao.getPrecoTotal());
        colecao.addCarta(new Carta(28,"Dragão de Três Chifres\n",8,"Um dragão corno indigno com três chifres brotando" +
                "da sua cabeça",1.25));

        System.out.println(colecao.getPrecoTotal());
        colecao.addCarta(new Carta(43,"Dragão Branco de Olhos Azuis\n",8,"Este dragão lendário é uma poderosa máquina de destruição. Praticamente invencível," +
                "muito poucos enfrentaram esta magnifica criatura e viveram para contar a história",400.25));

        System.out.println(colecao.getPrecoTotal());
        colecao.addCarta(new Carta(12,"Mago Negro\n",8,"O mago definitivo em termos de ataque e defesas",395.25));

        System.out.println(colecao.getPrecoTotal());
        System.out.println(colecao);

    }
}