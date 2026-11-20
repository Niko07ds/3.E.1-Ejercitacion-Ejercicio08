package ejercicio08;

public class GzCompressor implements Compressor {

    @Override
    public CompressionResult compress(String fileName, int sizeKb) {
        System.out.println("  Comprimiendo con GZ (algoritmo Gzip)...");
        return new CompressionResult(fileName + ".gz", sizeKb, sizeKb * 50 / 100);
    }

    @Override
    public String getFormatName() {
        return "GZ";
    }
}
