package com.api.igdb.utils

private const val IGDB_IMAGE_URL = "https://images.igdb.com/igdb/image/upload/"

/**
 * The image builder function builds image urls
 *
 * @property imageID The image ID from the IGDB API
 * @property size The size of the image
 * @property imageType The file type of the image, default PNG
 * @return The complete image url in string
 */
fun imageBuilder(imageID: String, size: ImageSize, imageType: ImageType = ImageType.PNG): String {
    return "$IGDB_IMAGE_URL${size.tSize}/$imageID.${imageType.type}"
}
