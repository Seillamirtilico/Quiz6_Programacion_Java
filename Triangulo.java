class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    /**
     * Constructor de la clase Triángulo.
     *
     * @param nombre nombre del triángulo
     * @param color color del triángulo
     * @param base base del triángulo
     * @param altura altura del triángulo
     */
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método para obtener el área específica del triángulo.
     *
     * @return área del triángulo
     * @implNote Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return 0.5 * base * altura;
    }

    /**
     * Método para obtener el perímetro específico del triángulo.
     *
     * @return perímetro del triángulo
     * @implNote Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}
