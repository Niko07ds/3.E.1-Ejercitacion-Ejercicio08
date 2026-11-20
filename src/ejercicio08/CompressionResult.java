package ejercicio08;

/**
 * Resultado de una compresión (simulada).
 */
public class CompressionResult {

    private final String outputName;
    private final int originalSizeKb;
    private final int compressedSizeKb;

    public CompressionResult(String outputName, int originalSizeKb, int compressedSizeKb) {
        this.outputName = outputName;
        this.originalSizeKb = originalSizeKb;
        this.compressedSizeKb = compressedSizeKb;
    }

    public void print() {
        System.out.println("  Archivo generado: " + outputName);
        System.out.println("  Tamaño original: " + originalSizeKb + " KB -> comprimido: "
                + compressedSizeKb + " KB");
    }
}
