import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros() {
        Calculadora divisao = new Calculadora();
        divisao.valor1 = 12;
        divisao.valor2 = 6;
        int valorEsperado = 2;

        int valorCalculado = divisao.Divisao();


        Assert.assertEquals(valorCalculado, valorEsperado, 0.01);
        System.out.println(valorCalculado);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes() {
        Calculadora pontos = new Calculadora();
        pontos.valor1 = (int) 2.6;
        pontos.valor2 = (int) 5.5;
        double valorEsperado = 0.0;

        double valorCalculado = pontos.Pontos();

        Assert.assertEquals(valorCalculado, valorEsperado, 0.01);
        System.out.println(valorCalculado);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros() {
        Calculadora multiplicacao = new Calculadora();
        multiplicacao.valor1 = 33;
        multiplicacao.valor2 = 5;
        int valorEsperado = 165;

        int valorCalculado = multiplicacao.Multiplicacao();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
        System.out.println(valorCalculado);
    }

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros() {
        Calculadora calculadora = new Calculadora();
        calculadora.valor1 = 50;
        calculadora.valor2 = 50;
        int valorEsperado = 100;

        int valorCalculado = calculadora.soma();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
        System.out.println(valorCalculado);
    }
}
