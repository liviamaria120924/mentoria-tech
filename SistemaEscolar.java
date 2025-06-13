import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];
        double[] mediasBimestres = new double[4];

        // Entrada das 8 notas (2 por bimestre)
        System.out.println("Digite as 8 notas do ano (2 por bimestre):");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais
        for (int i = 0; i < 4; i++) {
            int indice = i * 2;
            mediasBimestres[i] = (notas[indice] + notas[indice + 1]) / 2.0;
        }

        // Cálculo das médias semestrais
        double mediaSemestre1 = (mediasBimestres[0] + mediasBimestres[1]) / 2.0;
        double mediaSemestre2 = (mediasBimestres[2] + mediasBimestres[3]) / 2.0;

        // Média final
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2.0;

        // Exibição dos resultados
        System.out.println("\n--- Boletim ---");
        System.out.printf("1º Bimestre: %.1f\n", mediasBimestres[0]);
        System.out.printf("2º Bimestre: %.1f\n", mediasBimestres[1]);
        System.out.printf("1º Semestre: %.1f\n", mediaSemestre1);
        System.out.println("----------------------");
        System.out.printf("3º Bimestre: %.1f\n", mediasBimestres[2]);
        System.out.printf("4º Bimestre: %.1f\n", mediasBimestres[3]);
        System.out.printf("2º Semestre: %.1f\n", mediaSemestre2);
        System.out.println("----------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        scanner.close();
    }
}