import java.util.Scanner;
import java.lang.Math;

public class grupo2Atividade4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao, subOpcao;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma figura: \n1 - Prisma \n 2 - Pirâmide \n3 - Outros sólidos \n0 - Sair \nOpção:  \n");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha o formato da base: \n1 - Retangular \n 2 - Triangular \n3 - Circular \n4 - Pentagonal \n5 - Hexagonal \nOpção:  \n");
                    subOpcao = leia.nextInt();

                    System.out.print("Digite a altura do prisma: ");
                    int altura = leia.nextInt();

                    double area, volume;

                    switch (subOpcao) {
                        case 1: // Retangular
                            prismaBaseRetangular pr1 = new prismaBaseRetangular();
                            System.out.print("Lado 1 da base: ");
                            pr1.lado = leia.nextInt();
                            System.out.print("Lado 2 da base: ");
                            pr1.lado2 = leia.nextInt();
                            area = pr1.baseQuadrado();
                            System.out.println("Volume: " + pr1.volumePrisma(altura, area));
                            break;

                        case 2: // Triangular
                            prismaBaseTriangular pr2 = new prismaBaseTriangular();
                            System.out.print("Lado do triângulo equilátero: ");
                            pr2.lado = leia.nextInt();
                            area = pr2.baseTriangulo();
                            System.out.println("Volume: " + pr2.volumePrisma(altura, area));
                            break;

                        case 3: // Cilíndrico
                            prismaCilindro pr3 = new prismaCilindro();
                            System.out.print("Raio da base: ");
                            pr3.raio = leia.nextInt();
                            area = pr3.baseCirculo();
                            System.out.println("Volume: " + pr3.volumePrisma(altura, area));
                            break;

                        case 4: // Pentagonal
                            prismaBasePentagonal pr4 = new prismaBasePentagonal();
                            System.out.print("Lado da base: ");
                            pr4.lado = leia.nextInt();
                            area = pr4.areaPentagonal();
                            System.out.println("Volume: " + pr4.volumePrisma(altura, area));
                            break;

                        case 5: // Hexagonal
                            prismaBaseHexagonal pr5 = new prismaBaseHexagonal();
                            System.out.print("Lado da base: ");
                            pr5.lado = leia.nextInt();
                            area = pr5.areaHexagonal();
                            System.out.println("Volume: " + pr5.volumePrisma(altura, area));
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("\nEscolha o formato da base: \n1 - Retangular \n 2 - Triangular \n3 - Circular \n4 - Pentagonal \n5 - Hexagonal \n5 - Heptagonal \nOpção:  \n");
                    subOpcao = leia.nextInt();

                    System.out.print("Digite a altura da pirâmide: ");
                    int alturaP = leia.nextInt();

                    switch (subOpcao) {
                        case 1:
                            System.out.print("Lado 1 da base: ");
                            int l1 = leia.nextInt();
                            System.out.print("Lado 2 da base: ");
                            int l2 = leia.nextInt();
                            piramideBaseRetangular pi1 = new piramideBaseRetangular();
                            int areaRet = pi1.baseQuadrado(l1, l2);
                            System.out.println("Volume: " + pi1.volumePiramide(alturaP, areaRet));
                            break;

                        case 2:
                            System.out.print("Lado do triângulo equilátero: ");
                            int ladoTri = leia.nextInt();
                            piramideBaseTriangular pi2 = new piramideBaseTriangular();
                            double areaTri = pi2.baseTriangulo(ladoTri);
                            System.out.println("Volume: " + pi2.volumePiramide(alturaP, (int) areaTri));
                            break;

                        case 3:
                            System.out.print("Raio da base: ");
                            int raio = leia.nextInt();
                            piramideCilindro pi3 = new piramideCilindro();
                            double areaCirc = pi3.baseCirculo(raio);
                            System.out.println("Volume: " + pi3.volumePiramide(alturaP, (int) areaCirc));
                            break;

                        case 4:
                            System.out.print("Lado da base: ");
                            int ladoPent = leia.nextInt();
                            piramideBasePentagonal pi4 = new piramideBasePentagonal();
                            double areaPent = pi4.areaPentagonal(ladoPent);
                            System.out.println("Volume: " + pi4.volumePiramide(alturaP, (int) areaPent));
                            break;

                        case 5:
                            System.out.print("Lado da base: ");
                            int ladoHex = leia.nextInt();
                            piramideBaseHexagonal pi5 = new piramideBaseHexagonal();
                            double areaHex = pi5.areaHexagonal(ladoHex);
                            System.out.println("Volume: " + pi5.volumePiramide(alturaP, (int) areaHex));
                            break;

                        case 6:
                            System.out.print("Lado da base: ");
                            int ladoHept = leia.nextInt();
                            piramideBaseHeptagonal pi6 = new piramideBaseHeptagonal();
                            double areaHept = pi6.areaHeptagonal(ladoHept);
                            System.out.println("Volume: " + pi6.volumePiramide(alturaP, (int) areaHept));
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    System.out.println("\nEscolha o sólido:");
                    System.out.println("1 - Esfera");
                    System.out.println("2 - Octaedro");
                    System.out.print("Opção: ");
                    subOpcao = leia.nextInt();

                    switch (subOpcao) {
                        case 1: // Esfera
                            System.out.print("Digite o raio da esfera: ");
                            int raioEsfera = leia.nextInt();
                            Esfera esfera = new Esfera();
                            esfera.setRaio(raioEsfera);
                            System.out.println("Volume da esfera: " + esfera.volumeEsfera());
                            break;

                        case 2: // Octaedro
                            Octaedro oct = new Octaedro();
                            System.out.print("Digite o lado do octaedro: ");
                            oct.lado = leia.nextInt();
                            System.out.println("Volume do octaedro: " + oct.volumeOctaedro());
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 0:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        leia.close();
        System.out.println("Programa encerrado.");
    }
    public static class Prisma{
            int altura, ladoraio;
            public double volumePrisma(int altura, double areaBase){
                double volume;
                volume=(double)altura*areaBase;
                return volume;
        }
    }
    public static class prismaBaseRetangular extends Prisma{
            int lado2;
            public double baseQuadrado(int ladoraio, int lado2){
                int area;
                area = ladoraio * lado2;
                return area;
        }
    }

    public static class prismaBaseTriangular extends Prisma{
        public double baseTriangulo(int ladoraio){
            double area;
            area = (Math.pow((double)ladoraio, 2)*Math.sqrt(3))/4;
            return area;
        }
    }

    public static class prismaCilindro extends Prisma{
        public double baseCirculo(int lado){
            int area;
            area = 3.141592 * (Math.pow(lado, 2));
            return area;
        }
    }

    public static class prismaBasePentagonal extends Prisma{
        int lado;
        public double areaPentagonal(int lado){
            double area, apotema;
            apotema = lado / (2 * 0.72654);
            area = ((lado*5)*apotema)/2;
        }
    }

    public static class prismaBaseHexagonal extends Prisma{
        int lado;
        public double areaHexagonal(int lado){
            double area, apotema;
            apotema = lado / (2 * 1.7320);
            area = ((lado*5)*apotema)/2;
        }
    }

    public static class Esfera{
        int raio;
        public double volumeEsfera(int raio){
            double volume;
            volume = 4/3*(3.141592*Math.pow(raio, 3));
            return volume;
        }
    }

    public static class Octaedro{
        int lado;
        public double volumeOctaedro(int lado){
            double volume;
            volume = (15+7*Math.sqrt(5))*Math.pow(lado, 3)/4;
            return volume;
        }
    } 

    public static class Piramide{
            int altura, ladoraio;
            public double volumePiramide(int altura, double areaBase){
                double volume;
                volume=(double)(altura*areaBase)/3;
                return volume;
        }
    }
    public static class piramideBaseRetangular extends Piramide{
            int lado2;
            public int baseQuadrado(int ladoraio, int lado2){
                int area;
                area = ladoraio * lado2;
                return area;
        }
    }
    
    public static class piramideBasePentagonal extends Piramide{
        int lado;
        public double areaHexagonal(int lado){
            double area, apotema;
            apotema = lado / (2 * 0.72654);
            area = ((lado*5)*apotema)/2;
        }
    }

    public static class piramideBaseHexagonal extends Piramide{
        int lado;
        public double areaHexagonal(int lado){
            double area, apotema;
            apotema = lado / (2 * 1.7320);
            area = ((lado*5)*apotema)/2;
        }
    }

    public static class piramideBaseHeptagonal extends Piramide{
        int lado;
        public double areaHeptagonal(int lado){
            double area, apotema;
            apotema = lado / (2 * 0.48157);
            area = ((lado*5)*apotema)/2;
        }
    }

    public static class piramideBaseTriangular extends Piramide{
        public double baseTriangulo(int ladoraio){
            double area;
            area = (Math.pow((double)ladoraio, 2)*Math.sqrt(3))/4;
            return area;
        }
    }

    public static class piramideCilindro extends Piramide{
        public double baseCirculo(int lado){
            double area;
            area = 3.141592 * (Math.pow((double)lado, 2));
            return area;
        }
    }
}
