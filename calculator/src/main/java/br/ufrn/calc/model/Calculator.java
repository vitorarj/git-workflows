/*
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 *
 * calc_centralized
 * br.ufrn.calc.model
 * Calculator
 * 10/11/20
 */
package br.ufrn.calc.model;

/**
 * Implementation of a calculator
 *
 * Jadson Santos - jadsonjs@gmail.com
 */
public class Calculator {

    /**
     * IMPLEMENTE ESSE MÉTODO 1
     *
     * Implementação Sugerida: return a+b;
     * @param a
     * @param b
     * @return
     */
    public int sum(int a, int b) { return 0; }

    /**
     * IMPLEMENTE ESSE MÉTODO 2
     *
     * Implementação Sugerida: return a-b;
     * @param a
     * @param b
     * @return
     */
    public int sub(int a, int b) { return 0; }

    /**
     * IMPLEMENTE ESSE MÉTODO 3
     *
     * Implementação Sugerida: return a+*b;
     * @param a
     * @param b
     * @return
     */
    public int mult(int a, int b) { return 0; }

    /**
     * CORRIJA ESSE MÉTODO EM COMMITS SEPARADOS
     *
     * Correção Sugerida:
     *
     * if(b == 0)
     *     throw new IllegalArgumentException("Can not divide by zero");
     * return a/b;
     *
     * Fazer em 3 etapas, cada correção, um commit diferente.
     *
     * Primeiro:  trocar return a%b;  por return a/b;
     *
     * Depois: adicionar no início do método:
     *
     * if(b == 0)
     *    throw new IllegalArgumentException("Can not divide bai zero");
     *
     * Por Último: corrigir o texto para:
     *
     * if(b == 0)
     *      throw new IllegalArgumentException("Can not divide by zero");
     *
     * @param a
     * @param b
     * @return
     */
    public int div(int a, int b) {
        return a%b;
    }

    /**
     * IMPLEMENTE ESSE MÉTODO 4
     *
     * Implementação Sugerida: return Math.pow(a, b);
     * @param a
     * @param b
     * @return
     */
    public double pow(double a, double b) { return 0; }

    /**
     * IMPLEMENTE ESSE MÉTODO 5
     *
     * Implementação Sugerida:
     *
     * if(a < 0)
     *           throw new IllegalArgumentException("There is no square root of negative number");
     *
     * return Math.sqrt(a);
     *
     * @param a
     * @return
     */
    public double square(double a) { return 0; }

    /**
     * IMPLEMENTE ESSE MÉTODO 6
     *
     * Implementação Sugerida: return Math.exp(a);
     * @param a
     * @return
     */
    public double exp(double a) { return 0; }

    /**
     * IMPLEMENTE ESSE MÉTODO 7
     *
     * Implementação Sugerida: return Math.log(a);
     * @param a
     * @return
     */
    public double log(double a) { return 0; }


}
