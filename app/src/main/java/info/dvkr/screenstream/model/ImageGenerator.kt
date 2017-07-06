package info.dvkr.screenstream.model


interface ImageGenerator {
    companion object {
        // Constants for ImageGenerator status
        const val IMAGE_GENERATOR_ERROR_WRONG_IMAGE_FORMAT = "IMAGE_GENERATOR_ERROR_WRONG_IMAGE_FORMAT"
    }

    fun stop()
}