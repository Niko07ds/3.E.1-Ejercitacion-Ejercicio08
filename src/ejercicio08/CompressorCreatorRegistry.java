package ejercicio08;

import java.util.EnumMap;
import java.util.Map;

/**
 * Responsabilidad única: seleccionar el creador según el formato.
 * Reemplaza los bloques condicionales del código heredado.
 */
public class CompressorCreatorRegistry {

    private final Map<CompressionFormat, CompressorCreator> creators = new EnumMap<>(CompressionFormat.class);

    public CompressorCreatorRegistry() {
        creators.put(CompressionFormat.ZIP, new ZipCompressorCreator());
        creators.put(CompressionFormat.TAR, new TarCompressorCreator());
        creators.put(CompressionFormat.GZ, new GzCompressorCreator());
    }

    public CompressorCreator getCreator(CompressionFormat format) {
        CompressorCreator creator = creators.get(format);
        if (creator == null) {
            throw new IllegalArgumentException("No hay creador registrado para: " + format);
        }
        return creator;
    }
}
