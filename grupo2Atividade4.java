import java.util.Scanner;
import java.lang.Math;

public class Grupo2Atividade4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao, subOpcao;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma figura:");
            System.out.println("1 - Prisma");
            System.out.println("2 - Pirâmide");
            System.out.println("3 - Outros Sólidos");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha o tipo de prisma:");
                    System.out.println("1 - Retangular");
                    System.out.println("2 - Triangular");
                    System.out.println("3 - Cilíndrico");
                    System.out.println("4 - Pentagonal");
                    System.out.println("5 - Hexagonal");
                    System.out.print("Opção: ");
                    subOpcao = leia.nextInt();

                    System.out.print("Digite a altura do prisma: ");
                    int altura = leia.nextInt();

                    switch (subOpcao) {
                        case 1: // Retangular
                            System.out.print("Lado 1 da base: ");
                            int l1 = leia.nextInt();
                            System.out.print("Lado 2 da base: ");
                            int l2 = leia.nextInt();
                            prismaBaseRetangular pr1 = new prismaBaseRetangular();
                            int areaRet = pr1.baseQuadrado(l1, l2);
                            System.out.println("Volume: " + pr1.volumePrisma(altura, areaRet));
                            break;

                        case 2: // Triangular
                            System.out.print("Lado do triângulo equilátero: ");
                            int ladoTri = leia.nextInt();
                            prismaBaseTriangular pr2 = new prismaBaseTriangular();
                            double areaTri = pr2.baseTriangulo(ladoTri);
                            System.out.println("Volume: " + pr2.volumePrisma(altura, (int) areaTri));
                            break;

                        case 3: // Cilíndrico
                            System.out.print("Raio da base: ");
                            int raio = leia.nextInt();
                            prismaCilindro pr3 = new prismaCilindro();
                            double areaCirc = pr3.areaCirculo(raio);
                            System.out.println("Volume: " + pr3.volumePrisma(altura, (int) areaCirc));
                            break;

                        case 4: // Pentagonal
                            System.out.print("Lado da base: ");
                            int ladoPent = leia.nextInt();
                            prismaBasePentagonal pr4 = new prismaBasePentagonal();
                            double areaPent = pr4.areaPentagonal(ladoPent);
                            System.out.println("Volume: " + pr4.volumePrisma(altura, (int) areaPent));
                            break;

                        case 5: // Hexagonal
                            System.out.print("Lado da base: ");
                            int ladoHex = leia.nextInt();
                            prismaBaseHexagonal pr5 = new prismaBaseHexagonal();
                            double areaHex = pr5.areaHexagonal(ladoHex);
                            System.out.println("Volume: " + pr5.volumePrisma(altura, (int) areaHex));
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("\nEscolha o tipo de pirâmide:");
                    System.out.println("1 - Retangular");
                    System.out.println("2 - Triangular");
                    System.out.println("3 - Cilíndrica");
                    System.out.println("4 - Pentagonal");
                    System.out.println("5 - Hexagonal");
                    System.out.println("6 - Heptagonal");
                    System.out.print("Opção: ");
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
                            System.out.print("Digite o lado do octaedro: ");
                            int ladoOct = leia.nextInt();
                            Octaedro oct = new Octaedro();
                            oct.setLado(ladoOct);
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
}
