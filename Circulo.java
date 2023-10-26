class Circulo extends FiguraGeometrica {
    private double radio;

    /**
     * Constructor de la clase Círculo.
     *
     * @param nombre nombre del círculo
     * @param color color del círculo
     * @param radio radio del círculo
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    /**
     * Método para obtener el área específica del círculo.
     *
     * @return área del círculo
     * @implNote Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Método para obtener el perímetro específico del círculo.
     *
     * @return perímetro del círculo
     * @implNote Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}
