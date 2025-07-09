// ainda não testei pra ver se compila, vamos terminar todas as funcionalidades primeiro.
import java.util.Scanner;
import java.lang.Math;
public class grupo2Atividade4{
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
            System.out.println("Qual é a altura do prisma?");
            leia.nextInt(poliedro.altura);
        break;
        case 2:
            
        break;
       }
    }
    public class Prisma{
            int altura, ladoraio;
            public double volumePrisma(int altura, int areaBase){
                double volume;
                volume=(double)altura*areaBase;
                return volume;
        }
    }
    class prismaBaseRetangular extends Prisma{
            int lado2;
            public int baseQuadrado(int ladoraio, int lado2){
                int area;
                area = ladoraio * lado2;
                return area;
        }
    }

    public class prismaBaseTriangular extends Prisma{
        public double baseTriangulo(int ladoraio){
            double area;
            area = (math.pow((double)ladoraio, 2));
            return area;
        }
    }
    
    public class prismaCilindro extends Prisma{
        public int baseCirculo(int lado){
            int area;
            area = lado;
            return area;
        }
    }
    
    public class prismaBasesMaiores extends Prisma{
        int n_lados;
    }
    
    public class prismaBasePentagonal extends prismaBasesMaiores{
    
    }
}
