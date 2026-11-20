package ejercicio08;

/**
 * Formatos de compresión soportados.
 */
public enum CompressionFormat {
    ZIP,
    TAR,
    GZ;

    // Convierte el texto ingresado por el usuario en un formato conocido
    public static CompressionFormat fromText(String text) {
        for (CompressionFormat format : values()) {
            if (format.name().equalsIgnoreCase(text)) {
                return format;
            }
        }
        throw new IllegalArgumentException("Formato de compresión no soportado: " + text);
    }
}
