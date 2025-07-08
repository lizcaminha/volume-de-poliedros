// ainda não testei pra ver se compila, vamos terminar todas as funcionalidades primeiro.
import java.util.Scanner;
public class grupo2atividade4{
    public static void main(){
        Scanner leia = new Scanner(System.in);
        //aqui vai ficar a interação com o usuário, e todos os metodos serão chamados aqui.
        /*TODO:
            declarar variáveis
            interacao com usuário
            criar as instancias de objeto
            etc...
        */
        int opcao;
       switch (opcao){ //escolha de formas!
        case 1:
            System.out.println("Forma escolhida: Prisma");
            //fazer subescolha de prismas...?
            Prisma poliedro = new Prisma(); // apenas criar o poliedro já com a base. essa linha está errada.
            System.out.println("Qual é a altura do prisma?");
            leia.nextInt(poliedro.altura);
        break;
       }
    }
}
public class Prisma{
    int altura;
    public static double volumePrisma(int altura, int areaBase){
        double volume;
        volume=(double)altura*areaBase;
        return volume;
    }
}
class prismaBaseQuadrada extends Prisma{
    int lado1, lado2;
    public int areaBase(){
        int area;
        area=lado1*lado2;
        return area;
    }
}
