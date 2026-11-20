package ejercicio08;

/**
 * Responsabilidad única: comprimir archivos.
 * Recibe el creador por su clase abstracta y no conoce ningún compresor concreto.
 */
public class CompressionService {

    private final CompressorCreator creator;

    public CompressionService(CompressorCreator creator) {
        this.creator = creator;
    }

    public void compressFile(String fileName, int sizeKb) {
        Compressor compressor = creator.createCompressor();
        System.out.println("Formato elegido: " + compressor.getFormatName());
        CompressionResult result = compressor.compress(fileName, sizeKb);
        result.print();
    }
}
