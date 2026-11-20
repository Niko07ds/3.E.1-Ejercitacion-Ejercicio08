package ejercicio08;

public class GzCompressorCreator extends CompressorCreator {

    @Override
    public Compressor createCompressor() {
        return new GzCompressor();
    }
}
