import java.util.Scanner;
import java.lang.Math;

public class grupo2Atividade4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao, subOpcao;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma figura: \n1 - Prisma \n2 - Pirâmide \n3 - Outros sólidos \n0 - Sair \nOpção:  ");
            opcao = leia.nextInt();
            double area, volume;
            int lado;

            switch (opcao) {
                case 1://inclui todos os prismas
                    System.out.println("\nEscolha o formato da base: \n1 - Retangular \n2 - Triangular \n3 - Circular \n4 - Pentagonal \n5 - Hexagonal \nOpção:  ");
                    subOpcao = leia.nextInt();

                    System.out.print("Digite a altura do prisma: ");
                    int altura = leia.nextInt();

                    switch (subOpcao) {
                        case 1: // Retangular
                            PrismaBaseRetangular pr1 = new PrismaBaseRetangular();
                            System.out.print("Lado 1 da base: ");
                            lado = leia.nextInt();
                            System.out.print("Lado 2 da base: ");
                            int lado2 = leia.nextInt();
                            area = pr1.baseQuadrada(lado, lado2);
                            volume = pr1.volumePrisma(altura, area);
                            System.out.println("Volume: " + volume + "\nÁrea da Base: " + area);
                            break;

                        case 2: // Triangular
                            PrismaBaseTriangular pr2 = new PrismaBaseTriangular();
                            System.out.print("Lado do triângulo equilátero: ");
                            lado = leia.nextInt();
                            area = pr2.baseTriangular(lado);
                            volume = pr2.volumePrisma(altura, area);
                            System.out.println("Volume: " + volume + "\nÁrea da Base: " + area);
                            break;

                        case 3: // Cilíndrico
                            PrismaCilindro pr3 = new PrismaCilindro();
                            System.out.print("Raio da base: ");
                            lado = leia.nextInt();
                            area = pr3.baseCirculo(lado);
                            volume = pr3.volumePrisma(altura, area);
                            System.out.println("Volume: " + volume + "\nÁrea da Base: " + area);
                            break;

                        case 4: // Pentagonal
                            PrismaBasePentagonal pr4 = new PrismaBasePentagonal();
                            System.out.print("Lado da base: ");
                            lado = leia.nextInt();
                            area = pr4.areaPentagonal(lado);
                            volume = pr4.volumePrisma(altura, area);
                            System.out.println("Volume: " + volume + "\nÁrea da Base: " + area);
                            break;

                        case 5: // Hexagonal
                            PrismaBaseHexagonal pr5 = new PrismaBaseHexagonal();
                            System.out.print("Lado da base: ");
                            lado = leia.nextInt();
                            area = pr5.areaHexagonal(lado);
                            volume = pr5.volumePrisma(altura, area);
                            System.out.println("Volume: " + volume + "\nÁrea da Base: " + area);
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:// inclui todas as pirâmides
                    System.out.println("\nEscolha o formato da base: \n1 - Retangular \n2 - Triangular \n3 - Circular \n4 - Pentagonal \n5 - Hexagonal \n6 - Heptagonal \nOpção:  ");
                    subOpcao = leia.nextInt();

                    System.out.print("Digite a altura da pirâmide: ");
                    int alturaP = leia.nextInt();

                    switch (subOpcao) {
                        case 1:
                            PiramideBaseRetangular pi1 = new PiramideBaseRetangular();
                            System.out.print("Lado 1 da base: ");
                            lado = leia.nextInt();
                            System.out.print("Lado 2 da base: ");
                            int l2 = leia.nextInt();
                            area = pi1.baseQuadrada(lado, l2);
                            volume = pi1.volumePiramide(alturaP, area);
                            System.out.println("Volume: " + volume + "\nÁrea da Base: " + area);
                            break;

                        case 2:
                            PiramideBaseTriangular pi2 = new PiramideBaseTriangular();
                            System.out.print("Lado do triângulo equilátero: ");
                            lado = leia.nextInt();
                            area = pi2.baseTriangular(lado);
                            volume = pi2.volumePiramide(alturaP, area);
                            System.out.println("Volume: " + volume + "\nÁrea da Base: " + area);
                            break;

                        case 3:
                            PiramideCilindro pi3 = new PiramideCilindro();
                            System.out.print("Raio da base: ");
                            int raio = leia.nextInt();
                            area = pi3.baseCirculo(raio);
                            volume = pi3.volumePiramide(alturaP, area);
                            System.out.println("Volume: " + volume + "\nÁrea da Base: " + area);
                            break;

                        case 4:
                            PiramideBasePentagonal pi4 = new PiramideBasePentagonal();
                            System.out.print("Lado da base: ");
                            lado = leia.nextInt();
                            area = pi4.areaPentagonal(lado);
                            volume = pi4.volumePiramide(alturaP, area);
                            System.out.println("Volume: " + volume + "\nÁrea da Base: " + area);
                            break;

                        case 5:
                            System.out.print("Lado da base: ");
                            lado = leia.nextInt();
                            PiramideBaseHexagonal pi5 = new PiramideBaseHexagonal();
                            area = pi5.areaHexagonal(lado);
                            volume = pi5.volumePiramide(alturaP, area);
                            System.out.println("Volume: " + volume + "\nÁrea da Base: " + area);
                            break;

                        case 6:
                            System.out.print("Lado da base: ");
                            lado = leia.nextInt();
                            PiramideBaseHeptagonal pi6 = new PiramideBaseHeptagonal();
                            area = pi6.areaHeptagonal(lado);
                            volume = pi6.volumePiramide(alturaP, area);
                            System.out.println("Volume: " + volume + "\nÁrea da Base: " + area);
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 3:
                    System.out.println("\nEscolha o sólido: \n1 - Esfera \n2 - Octaedro \nOpção: ");
                    subOpcao = leia.nextInt();

                    switch (subOpcao) {
                        case 1: // Esfera
                            System.out.print("Digite o raio da esfera: ");
                            int raioEsfera = leia.nextInt();
                            Esfera esfera = new Esfera();
                            volume = esfera.volumeEsfera(raioEsfera);
                            System.out.println("Volume da esfera: " + volume);
                            break;

                        case 2: // Octaedro
                            Octaedro oct = new Octaedro();
                            System.out.print("Digite o lado do octaedro: ");
                            lado = leia.nextInt();
                            volume = oct.volumeOctaedro(lado);
                            System.out.println("Volume do octaedro: " + volume);
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

    // Classes de prismas
    public static class Prisma {
        public double volumePrisma(int altura, double areaBase) {
            return altura * areaBase;
        }
    }

    public static class PrismaBaseRetangular extends Prisma {
        public double baseQuadrada(int lado1, int lado2) {
            return lado1 * lado2;
        }
    }

    public static class PrismaBaseTriangular extends Prisma {
        public double baseTriangular(int lado) {
            return (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
        }
    }

    public static class PrismaCilindro extends Prisma {
        public double baseCirculo(int raio) {
            return Math.PI * Math.pow(raio, 2);
        }
    }

    public static class PrismaBasePentagonal extends Prisma {
        public double areaPentagonal(int lado) {
            double apotema = lado / (2 * 0.72654);
            return (5 * lado * apotema) / 2;
        }
    }

    public static class PrismaBaseHexagonal extends Prisma {
        public double areaHexagonal(int lado) {
            double area = (3*Math.pow(lado, 2.0)*Math.sqrt(3.0))/2;
            return area;
        }
    }

    // Classes de pirâmides
    public static class Piramide {
        public double volumePiramide(int altura, double areaBase) {
            return (altura * areaBase) / 3;
        }
    }

    public static class PiramideBaseRetangular extends Piramide {
        public double baseQuadrada(int lado1, int lado2) {
            return lado1 * lado2;
        }
    }

    public static class PiramideBaseTriangular extends Piramide {
        public double baseTriangular(int lado) {
            return (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
        }
    }

    public static class PiramideCilindro extends Piramide {
        public double baseCirculo(int raio) {
            return Math.PI * Math.pow(raio, 2);
        }
    }

    public static class PiramideBasePentagonal extends Piramide {
        public double areaPentagonal(int lado) {
            double apotema = lado / (2 * 0.72654);
            return (5 * lado * apotema) / 2;
        }
    }

    public static class PiramideBaseHexagonal extends Piramide {
        public double areaHexagonal(int lado) {
            
            double area = (3*Math.pow(lado, 2.0)*Math.sqrt(3.0))/2;
            return area;
        }
    }

    public static class PiramideBaseHeptagonal extends Piramide {
        public double areaHeptagonal(int lado) {
            double cotan = 1.0/Math.tan(Math.PI/7.0);
            double area = ((7*Math.pow(lado, 2))/4.0)*cotan;
            return area;
        }
    }

    // Classes de outros sólidos
    public static class Esfera {
        public double volumeEsfera(int raio) {
            return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        }
    }

    public static class Octaedro {
        public double volumeOctaedro(int lado) {
            double vol;
            vol = (Math.sqrt(2.0)/3)*Math.pow(lado, 3.0);
            return vol;
        }
    }
}
