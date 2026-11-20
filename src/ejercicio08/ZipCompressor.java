package ejercicio08;

public class ZipCompressor implements Compressor {

    @Override
    public CompressionResult compress(String fileName, int sizeKb) {
        System.out.println("  Comprimiendo con ZIP (compresión Deflate)...");
        return new CompressionResult(fileName + ".zip", sizeKb, sizeKb * 60 / 100);
    }

    @Override
    public String getFormatName() {
        return "ZIP";
    }
}
