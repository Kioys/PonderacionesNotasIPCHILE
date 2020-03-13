/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Mati
 */
public class Ponderaciones
{

    private double[] notas = new double[9];
    private boolean daExamen;
    private double notaPresentacion;
    private double notaFinal;

    public Ponderaciones(double[] notasEstructura, boolean daEx)
    {

        notas = notasEstructura;
        daExamen = daEx;

    }

    public double[] Ponderar32()
    {
        double[] resultados = new double[2];
        notaPresentacion
                = notas[0] * (0.10)
                + notas[1] * (0.20)
                + notas[2] * (0.30)
                + notas[3] * (0.00)
                + notas[4] * (0.20)
                + notas[5] * (0.20)
                + notas[6] * (0.00)
                + notas[7] * (0.00)
                + notas[8] * (0.00);

        if (daExamen)
        {

            notaFinal
                    = notas[0] * (0.07)
                    + notas[1] * (0.14)
                    + notas[2] * (0.21)
                    + notas[3] * (0.00)
                    + notas[4] * (0.14)
                    + notas[5] * (0.14)
                    + notas[6] * (0.00)
                    + notas[7] * (0.00)
                    + notas[8] * (0.30);

        }
        else
        {

            notaFinal = notaPresentacion;

        }

        resultados[0] = notaPresentacion;
        resultados[1] = notaFinal;

        return resultados;

    }

    public double[] Ponderar64Y96()
    {
        double[] resultados = new double[2];
        notaPresentacion
                = notas[0] * (0.10)
                + notas[1] * (0.20)
                + notas[2] * (0.30)
                + notas[3] * (0.00)
                + notas[4] * (0.10)
                + notas[5] * (0.10)
                + notas[6] * (0.20)
                + notas[7] * (0.00)
                + notas[8] * (0.00);

        if (daExamen)
        {

            notaFinal
                    = notas[0] * (0.07)
                    + notas[1] * (0.14)
                    + notas[2] * (0.21)
                    + notas[3] * (0.00)
                    + notas[4] * (0.07)
                    + notas[5] * (0.07)
                    + notas[6] * (0.14)
                    + notas[7] * (0.00)
                    + notas[8] * (0.30);

        }
        else
        {

            notaFinal = notaPresentacion;

        }

        resultados[0] = notaPresentacion;
        resultados[1] = notaFinal;

        return resultados;

    }

    public double[] Ponderar128()
    {
        double[] resultados = new double[2];
        notaPresentacion
                = notas[0] * (0.10)
                + notas[1] * (0.15)
                + notas[2] * (0.25)
                + notas[3] * (0.25)
                + notas[4] * (0.05)
                + notas[5] * (0.05)
                + notas[6] * (0.05)
                + notas[7] * (0.10)
                + notas[8] * (0.00);

        if (daExamen)
        {

            notaFinal
                    = notas[0] * (0.07)
                    + notas[1] * (0.105)
                    + notas[2] * (0.175)
                    + notas[3] * (0.175)
                    + notas[4] * (0.035)
                    + notas[5] * (0.035)
                    + notas[6] * (0.035)
                    + notas[7] * (0.075)
                    + notas[8] * (0.30);

        }
        else
        {

            notaFinal = notaPresentacion;

        }

        resultados[0] = notaPresentacion;
        resultados[1] = notaFinal;

        return resultados;

    }

}
