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
     * EVOLUÇÃO 1
     * IMPLEMENTE ESSE MÉTODO
     *
     * Implementação Sugerida: return a+b;
     * @param a
     * @param b
     * @return
     */
    public int sum(int a, int b) { return 0; }



    /**
     * EVOLUÇÃO 2
     * IMPLEMENTE ESSE MÉTODO
     *
     * Implementação Sugerida: return a-b;
     * @param a
     * @param b
     * @return
     */
    public int sub(int a, int b) { return 0; }




    /**
     * EVOLUÇÃO 3
     * IMPLEMENTE ESSE MÉTODO
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
     * Fazer em 2 etapas, cada correção, um commit diferente.
     *
     * Desenvolvedor 1:  apenas trocar return a%b;  por return a/b;
     *
     * Desenvolvedor 2: adicionar a correção completa:
     *
     * if(b == 0)
     *    throw new IllegalArgumentException("Can not divide by zero");
     * return a/b;
     *
     * @param a
     * @param b
     * @return
     */
    public int div(int a, int b) {
        return a%b;
    }





    /**
     * EVOLUÇÃO 4
     * IMPLEMENTE ESSE MÉTODO
     *
     * Implementação Sugerida: return Math.pow(a, b);
     * @param a
     * @param b
     * @return
     */
    public double pow(double a, double b) { return 0; }






    /**
     * CORRIJA ESSE MÉTODO EM COMMITS SEPARADOS
     *
     * Implementação Sugerida:
     *
     * if(a < 0)
     *     throw new IllegalArgumentException("There is no square root of negative number");
     *
     * return Math.sqrt(a);
     *
     * Fazer em 2 etapas, cada correção, um commit diferente.
     *
     * Desenvolvedor 1:  trocar return Math.abs(a);  por return Math.sqrt(a);
     *
     * Desenvolvedor 2: adicionar a correção completa:
     *
     * if(b == 0)
     *    throw new IllegalArgumentException("There is no square root of negative number");
     *  return Math.sqrt(a);
     *
     * @param a
     * @return
     */
    public double square(double a) {
        return Math.abs(a);
    }


}
