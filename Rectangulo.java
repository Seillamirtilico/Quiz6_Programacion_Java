class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    /**
     * Constructor de la clase Rectángulo.
     *
     * @param nombre nombre del rectángulo
     * @param color color del rectángulo
     * @param lado1 lado 1 del rectángulo
     * @param lado2 lado 2 del rectángulo
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Método para obtener el área específica del rectángulo.
     *
     * @return área del rectángulo
     * @implNote Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return lado1 * lado2;
    }

    /**
     * Método para obtener el perímetro específico del rectángulo.
     *
     * @return perímetro del rectángulo
     * @implNote Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}
