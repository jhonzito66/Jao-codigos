import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int opt;

        do {
            System.out.println("\n-------CALCULADORA DE FORMAS-------");
            System.out.println("      1- ABRIR A CALCULADORA.      ");
            System.out.println("              2- SAIR.             ");
            System.out.println("-----------------------------------\n");
            opt = scn.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("\n-------CALCULADORA DE FORMAS-------");
                    System.out.println("           1- TRIÂNGULO.           ");
                    System.out.println("           2- QUADRADO.            ");
                    System.out.println("           3- RETÂNGULO.           ");
                    System.out.println("           4- HEXÁGONO.           ");
                    System.out.println("           5- CÍRCULO.            ");
                    System.out.println("-----------------------------------\n");
                    System.out.printf("ESCOLHA UMA OPÇÃO = ");
                    int opc = scn.nextInt();

                    switch (opc) {
                        case 1:
                            triangulo();
                            break;

                        case 2:
                            quadrado();
                            break;

                        case 3:
                            retangulo();
                            break;

                        case 4:
                            hexagono();
                            break;

                        case 5:
                            circulo();
                            break;

                        default:
                            System.out.println("INVÁLIDO!!!");
                            break;

                    }
                    break;

                case 2:
                    System.out.println("SAINDO....");
                    break;

                default:
                    System.out.println("INVÁLIDO!!!");
                    break;

            }
        } while (opt != 2);
    }

    public static void triangulo() {
        Scanner scn = new Scanner(System.in);
        System.out.println("-----------------------------------\n");
        System.out.println("VOCÊ ESCOLHEU TRIÂNGULO.");
        System.out.printf("\nDIGITE A ALTURA DO TRIÂNGULO = ");
        double altura = scn.nextDouble();
        System.out.printf("\nDIGITE A BASE DO TRIÂNGULO = ");
        double base = scn.nextDouble();
        System.out.printf("\nDIGITE A ÂNGULO DO TRIÂNGULO = ");
        double angulo = scn.nextDouble();

        Triangulo nt = new Triangulo(altura, base, angulo);

        System.out.println("\nESCOLHA O CALCULO DESEJADO: ");
        System.out.println("1. CALCULAR ÁREA CLÁSSICA.");
        System.out.println("2. CALCULAR ÁREA USANDO ÂNGULO.");
        System.out.println("3. CALCULAR PERÍMETRO.");
        System.out.println("4. CALCULAR HIPOTENUSA.");
        int opc = scn.nextInt();

        if (opc == 1) {
            double area = nt.calcularArea();
            nt.exibirInfo();
            System.out.println("AREA  = " + area);
            System.out.println();
            System.out.println("-----------------------------------\n");
        } else if (opc == 2) {
            double area = nt.calcularAreaAngulo();
            nt.exibirInfo();
            System.out.println("AREA  = " + area);
            System.out.println();
            System.out.println("-----------------------------------\n");
        } else if (opc == 3) {
            double perimetro = nt.calcularPerimetro();
            nt.exibirInfo();
            System.out.println("PERÍMETRO = " + perimetro);
            System.out.println();
            System.out.println("-----------------------------------\n");
        } else if (opc == 4) {
            double h = nt.calcularHipotenura();
            nt.exibirInfo();
            System.out.println("HIPOTENUSA = " + h);
            System.out.println();
            System.out.println("-----------------------------------\n");
        }
    }

    public static void circulo() {
        Scanner scn = new Scanner(System.in);

        System.out.println();
        System.out.println("-----------------------------------\n");
        System.out.println("VOCÊ ESCOLHEU O CÍRCULO.");
        System.out.printf("DIGITE O RAIO DO CÍRCULO = ");
        double raio = scn.nextDouble();

        Circulo nc = new Circulo(0, 0, raio);

        System.out.println("\nESCOLHA O CÁLCULO DESEJADO : ");
        System.out.println("1. CALCULAR ÁREA.");
        System.out.println("2. CALCULAR PERÍMETRO.");
        int opc = scn.nextInt();

        if (opc == 1) {
            double area = nc.calcularArea();
            nc.exibirInfo();
            System.out.println("AREA  = " + area);
            System.out.println();
            System.out.println("-----------------------------------\n");
        } else if (opc == 2) {
            double perimetro = nc.calcularPerimetro();
            nc.exibirInfo();
            System.out.println("PERÍMETRO  = " + perimetro);
            System.out.println();
            System.out.println("-----------------------------------\n");
        }

    }

    public static void quadrado() {
        Scanner scn = new Scanner(System.in);

        System.out.println();
        System.out.println("-----------------------------------\n");
        System.out.println("VOCÊ ESCOLHEU O QUADRADO.");
        System.out.printf("DIGITE A ALTURA DO QUADRADO = ");
        double altura = scn.nextDouble();
        System.out.printf("DIGITE A BASE DO QUADRADO = ");
        double base = scn.nextDouble();
        if (base != altura) {
            System.out.println("INVÁLIDO!!!(base diferente de altura)");
        } else {
            Quadrado nq = new Quadrado(altura, base);

            System.out.println("\nESCOLHA O CÁLCULO DESEJADO : ");
            System.out.println("1. CALCULAR ÁREA.");
            System.out.println("2. CALCULAR PERÍMETRO.");
            int opc = scn.nextInt();

            if (opc == 1) {
                double area = nq.calcularArea();
                nq.exibirInfo();
                System.out.println("AREA  = " + area);
                System.out.println();
                System.out.println("-----------------------------------\n");
            } else if (opc == 2) {
                double perimetro = nq.calcularPerimetro();
                nq.exibirInfo();
                System.out.println("PERÍMETRO  = " + perimetro);
                System.out.println();
                System.out.println("-----------------------------------\n");
            }
        }
    }

    public static void retangulo() {
        Scanner scn = new Scanner(System.in);

        System.out.println();
        System.out.println("-----------------------------------\n");
        System.out.println("VOCÊ ESCOLHEU O RETÂNGULO.");
        System.out.printf("DIGITE A ALTURA DO RETÂNGULO = ");
        double altura = scn.nextDouble();
        System.out.printf("DIGITE A BASE DO RETÂNGULO = ");
        double base = scn.nextDouble();

        Retangulo nr = new Retangulo(altura, base);

        System.out.println("\nESCOLHA O CÁLCULO DESEJADO : ");
        System.out.println("1. CALCULAR ÁREA.");
        System.out.println("2. CALCULAR PERÍMETRO.");
        int opc = scn.nextInt();

        if (opc == 1) {
            double area = nr.calcularArea();
            nr.exibirInfo();
            System.out.println("AREA  = " + area);
            System.out.println();
            System.out.println("-----------------------------------\n");
        } else if (opc == 2) {
            double perimetro = nr.calcularPerimetro();
            nr.exibirInfo();
            System.out.println("PERÍMETRO  = " + perimetro);
            System.out.println();
            System.out.println("-----------------------------------\n");
        }
    }

    public static void hexagono() {
        Scanner scn = new Scanner(System.in);

        System.out.println();
        System.out.println("-----------------------------------\n");
        System.out.println("VOCÊ ESCOLHEU O HEXÁGONO.");
        System.out.printf("DIGITE A ALTURA DO HEXÁGONO = ");
        double altura = scn.nextDouble();
        System.out.printf("DIGITE A BASE DO HEXÁGONO = ");
        double base = scn.nextDouble();

        Hexagono nh = new Hexagono(altura, base);

        System.out.println("\nESCOLHA O CÁLCULO DESEJADO : ");
        System.out.println("1. CALCULAR ÁREA.");
        System.out.println("2. CALCULAR PERÍMETRO.");
        int opc = scn.nextInt();

        if (opc == 1) {
            double area = nh.calcularArea();
            nh.exibirInfo();
            System.out.println("AREA = " + area);
            System.out.println();
            System.out.println("-----------------------------------\n");
        } else if (opc == 2) {
            double perimetro = nh.calcularPerimetro();
            nh.exibirInfo();
            System.out.println("PERÍMETRO = " + perimetro);
            System.out.println();
            System.out.println("-----------------------------------\n");
        }
    }

}