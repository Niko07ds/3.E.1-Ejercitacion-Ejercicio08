package ejercicio08;

public class ZipCompressorCreator extends CompressorCreator {

    @Override
    public Compressor createCompressor() {
        return new ZipCompressor();
    }
}
