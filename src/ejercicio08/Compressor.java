package ejercicio08;

/**
 * Producto: interfaz común de todos los compresores.
 */
public interface Compressor {

    CompressionResult compress(String fileName, int sizeKb);

    String getFormatName();
}
