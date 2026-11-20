package ejercicio08;

public class TarCompressor implements Compressor {

    @Override
    public CompressionResult compress(String fileName, int sizeKb) {
        System.out.println("  Empaquetando con TAR (sin compresión)...");
        return new CompressionResult(fileName + ".tar", sizeKb, sizeKb);
    }

    @Override
    public String getFormatName() {
        return "TAR";
    }
}
