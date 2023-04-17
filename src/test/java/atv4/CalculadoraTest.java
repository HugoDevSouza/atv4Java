package atv4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest extends Calculadora {

	@Test
	void somarDoisNumerosComSucesso() {
		// Arrange
		Calculadora calculadora = new Calculadora();

		// Act
		int resultado = calculadora.somarDoisNumeros(10, 5);

		// Assert
		assertEquals(15, resultado);
	}

	@Test
	void subtrairDoisNumerosComSucesso() {
		// Arrange
		Calculadora calculadora = new Calculadora();

		// Act
		int resultado = calculadora.subtrairDoisNumeros(10, 5);

		// Assert
		assertEquals(5, resultado);
	}

	@Test
	void multiplicarDoisNumerosComSucesso() {
		// Arrange
		Calculadora calculadora = new Calculadora();

		// Act
		int resultado = calculadora.multiplicarDoisNumeros(10, 5);

		// Assert
		assertEquals(50, resultado);
	}

	@Test
	void dividirDoisNumerosComSucesso() {
		// Arrange
		Calculadora calculadora = new Calculadora();

		// Act
		int resultado = calculadora.dividirDoisNumeros(10, 2);

		// Assert
		assertEquals(5, resultado);
	}

}
