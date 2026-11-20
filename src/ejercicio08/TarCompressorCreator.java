package ejercicio08;

public class TarCompressorCreator extends CompressorCreator {

    @Override
    public Compressor createCompressor() {
        return new TarCompressor();
    }
}
